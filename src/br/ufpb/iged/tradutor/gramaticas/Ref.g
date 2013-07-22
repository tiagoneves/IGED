tree grammar Ref;
options {
  tokenVocab = Jedi;
  ASTLabelType = TradutorAST;
  filter = true;
}

@header{

    package br.ufpb.iged.tradutor.parser;
    
    import br.ufpb.iged.tradutor.excecoes.SyntacticException;
    import br.ufpb.iged.tradutor.principal.Tradutor;
    import br.ufpb.iged.tradutor.simbolos.Escopo;
    import br.ufpb.iged.tradutor.simbolos.EscopoLocal;
    import br.ufpb.iged.tradutor.simbolos.Simbolo;
    import br.ufpb.iged.tradutor.simbolos.SimboloClasse;
    import br.ufpb.iged.tradutor.simbolos.SimboloMetodo;
    import br.ufpb.iged.tradutor.simbolos.SimboloTipoPrimitivo;
    import br.ufpb.iged.tradutor.simbolos.SimboloTipoReferencia;
    import br.ufpb.iged.tradutor.simbolos.SimboloVariavel;
    import br.ufpb.iged.tradutor.simbolos.TabelaSimbolos;
    import br.ufpb.iged.tradutor.simbolos.TradutorAST;
    
    import java.io.BufferedWriter;
    import java.io.File;
    import java.io.FileWriter;
    import java.io.IOException;
    
}

@members {
    TabelaSimbolos tabelaSimbolos;
    Escopo escopoAtual;
    SimboloClasse classeAtual;
    String tipoMetodo;
    String linha;
    SimboloMetodo metodoAtual;
    Tree toStore;
    boolean tipoRetornoVet = false;
    String nomeClasseAttrCampo;
    boolean estaticoAttrCampo = false;
    
    public Ref(CommonTreeNodeStream input, TabelaSimbolos tabelaSimbolos) {
        this(input);
        this.tabelaSimbolos = tabelaSimbolos;
        escopoAtual = tabelaSimbolos.global;
    }
    
    private void storeVar(SimboloVariavel simboloVariavel){
    
    	int num = simboloVariavel.getEndereco();	
	        
	String tipo = simboloVariavel.getTipo().getNome();
	        
	if (num >= 0 && num <= 3){
	        
	        if (tipo.equals("int"))
	        	Tradutor.buffer.append("istore_"+num+"\n");
		else
	        	Tradutor.buffer.append("astore_"+num+"\n");
	        
	} else {
	        	
	        if (tipo.equals("int"))
	        	Tradutor.buffer.append("istore "+num+"\n");
	        else
	        	Tradutor.buffer.append("astore "+num+"\n");
	        
	 }
    
    }
    
    private void loadVar(SimboloVariavel simboloVariavel){
    
    	int num = simboloVariavel.getEndereco();	
		        
	String tipo = simboloVariavel.getTipo().getNome();
			        
	if (num >= 0 && num <= 3){
			        
		if (tipo.equals("int"))
			Tradutor.buffer.append("iload_"+num+"\n");
		else
			Tradutor.buffer.append("aload_"+num+"\n");
			        
	} else {
			        	
		if (tipo.equals("int"))
			 Tradutor.buffer.append("iload "+num+"\n");
		else
			 Tradutor.buffer.append("aload "+num+"\n");
			        
	}
    
    
    }
    
    private void loadConst(String constante){
    
    	int num =  Integer.parseInt(constante);
			
	if (num >= 0 && num <= 5)
		Tradutor.buffer.append("iconst_"+num+"\n");
	else
		Tradutor.buffer.append("ldc "+num+"\n");
    
    }
    
    private boolean isInteger(String str) {
	    try {
	        Integer.parseInt(str);
	        return true;
	    } catch (NumberFormatException nfe) {}
	    return false;
     }
     
     private void percorrerSubArvore(TradutorAST raiz){
     
     	CommonTree tree = (CommonTree)Tradutor.tradutorAdaptor.dupTree(raiz);
        CommonTreeNodeStream nos = new CommonTreeNodeStream(Tradutor.tradutorAdaptor, tree);
        nos.setTokenStream(Tradutor.tokens);
        Ref ref = new Ref(nos, Tradutor.tabelaSimbolos);
        ref.downup(tree);
     
     }
    
}

topdown
    :   enterClass
    |   enterMethod
    |   enterConstructor
    |   enterParam
    |   enterField
    |   subDivEnter
    |   enterAtribuicao
    |   enterAttrVetor
    //|   enterNewObject
    |   enterNewObjectListaVarDeclAtribuicao
    ;

bottomup
    :   exitClass
    |   exitMethod
    |   exitConstructor
    |   exitParams
    |   listaVarDeclAtribuicao
    |   exitAtribuicao
    |   addMult
    //|   subDivExit
    |   acessoCampo
    |   vetorExpr
    |   chamadaMetodo
    |   chamadaMetodoSemParams
    |   exitAttrVetor
    ;

enterClass
    :   ^(CLASSE nome = ID (^(EXTENDS sup = ID))? .+)
        { 
             classeAtual = (SimboloClasse)$nome.simbolo; 
	     Tradutor.buffer = new StringBuffer();
	     Tradutor.buffer.append(".class "+classeAtual.getNome()+"\n");
	     
	     if (sup != null)
	       Tradutor.buffer.append(".super "+$sup.getText()+"\n");
	     
        }
    ;

exitClass
    :   CLASSE
        {
                try {
                        File file = new File("classesteste"); 
                        file.mkdir();
			FileWriter fw = new FileWriter("classesteste/"+classeAtual.getNome()+".j");
			BufferedWriter bw =  new BufferedWriter(fw);
			Tradutor.buffer.append(".end class");
			bw.write(Tradutor.buffer.toString());
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		};
		    
        }
    ;
    
enterMethod
    :  ^(METHOD_DECL st = .? tp = . ID vet = .? (^(parm = PARAMS .+))* ^(BLOCO .*))
        {
        	metodoAtual = (SimboloMetodo) $ID.simbolo;
	    
	    	tipoMetodo = $tp.getText();
	    	
	    	tipoRetornoVet = $vet != null && $vet.getText().equals("[]") && tipoMetodo.equals("int");
	    	
	    	if ($parm == null) {
	    	
	    		Tradutor.buffer.append(".method ");
	        
	                if (st != null)
	        	   Tradutor.buffer.append("static ");
	        
	                Tradutor.buffer.append( $ID.text + "()");
	                
	                if (tipoRetornoVet)
	                	Tradutor.buffer.append("[I;");
	                else if (tipoMetodo.equals("void"))
				Tradutor.buffer.append("V");
			else if (tipoMetodo.equals("int"))
				Tradutor.buffer.append("I");
			else
				Tradutor.buffer.append("L"+tipoMetodo+";");
			
			Tradutor.buffer.append(linha+"\n");
		
			Tradutor.buffer.append(".limit locals "+metodoAtual.getQuantidadeVariaveis()+"\n");
	    	
	    	} else {
	    	
	    	   linha = "";
	           linha += ".method ";
	        
	           if (st != null)
	        	linha += "static ";
	        
	           linha += $ID.text + "(";
	    	
	    	}
	    		   
	        
	        
        }
    ;
    
enterConstructor 
	:  ^(CONSTR_DECL ID (^(parm = PARAMS .+))* ^(BLOCO .*))
	 {
	        metodoAtual = (SimboloMetodo) $ID.simbolo;
	        
	        if ($parm == null) {
	    	
	    		Tradutor.buffer.append(".method ");
	        
	                Tradutor.buffer.append("<init>()");
	                
			Tradutor.buffer.append("V");
			
			Tradutor.buffer.append(linha+"\n");
		
			Tradutor.buffer.append(".limit locals "+metodoAtual.getQuantidadeVariaveis()+"\n");
	    	
	    	} else {
	    	
	    	   linha = "";
	           linha += ".method ";
	        
	           linha += "<init>(";
	           
	           tipoMetodo = "void"; 
	    	
	    	}
	    
	    	 
	    	
        }
       ;
        
exitMethod
    :   METHOD_DECL
        {
	        if (tipoMetodo.equals("void"))
			Tradutor.buffer.append("return\n");
		else if (tipoMetodo.equals("int"))
			Tradutor.buffer.append("ireturn\n");
		else
			Tradutor.buffer.append("areturn\n") ;
			
		Tradutor.buffer.append(".end method\n");
		  
        }
    ;

exitConstructor
    :   CONSTR_DECL
        {
        	Tradutor.buffer.append("return\n");		
		Tradutor.buffer.append(".end method\n");    
        }
    ;
    
enterParam 	
    :	^(PARAM tp = . ID vet = .?)
	{
	        if ($vet != null) {
	        	if ($tp.getText().equals("int"))
			   linha += "[I;";
		        else if ($tp.getText().equals("void"))
			   throw new SyntacticException("Line: "+$tp.getLine()+"the type of a parameter cannot be void");
		        else
			   linha += "[L"+$tp.getText()+";";
	        } else {
	        	
			if ($tp.getText().equals("int"))
				linha += "I";
			else if ($tp.getText().equals("void"))
				throw new SyntacticException("Line: "+$tp.getLine()+"the type of a parameter cannot be void");
			else
				linha += "L"+$tp.getText()+";";
		}
				
	}
        ;
        
exitParams
	: PARAMS
	{
		linha += ")";
		
		if (tipoRetornoVet)
			linha += "[;";
		else if (tipoMetodo.equals("void"))
			linha += "V";
		else if (tipoMetodo.equals("int"))
			linha += "I";
		else
			linha += "L"+tipoMetodo+";";
			
		Tradutor.buffer.append(linha+"\n");
		
		Tradutor.buffer.append(".limit locals "+metodoAtual.getQuantidadeVariaveis()+"\n");
		
		linha = "";
			
		
	}
	;
	
enterField
    :   ^(FIELD_DECL st = .? tp = . ID vet = .?)
        {
	        Tradutor.buffer.append(".field ");
	        
	        if ($st != null)
	        	Tradutor.buffer.append("static ");
	        
	        Tradutor.buffer.append($ID.text+ " ");
	        
	        if ($tp.getText().equals("int"))
			Tradutor.buffer.append("I");
		else if ($tp.getText().equals("void"))
			throw new SyntacticException("Line: "+$tp.getLine()+"the type of a field cannot be void");
		else
			Tradutor.buffer.append("L"+$tp.getText()+";");
			
		Tradutor.buffer.append("\n");
	        
	        
        }
    ;
     
listaVarDeclAtribuicao 
    :   ^(LISTA_VAR_DECL ^(VAR_DECL tp = . ID vet =.? ^(EXPR a = .)) .*)
        {
        
        	if (!$ID.visited){
        
	        	SimboloVariavel simboloVariavel;
	        	
	        	if ($a.escopo != null){
	        	
	        		simboloVariavel = (SimboloVariavel)$a.escopo.resolver($a.getText());
	        		
	        		loadVar(simboloVariavel);
	        	
	        	} else if (isInteger($a.getText()))
	        	
	        		loadConst($a.getText());
	        		
	        	
	        	simboloVariavel = (SimboloVariavel) $ID.simbolo;
	        	
		        storeVar(simboloVariavel);
		        
		        $ID.visited = true;
	        
	        }
	        	        
	        
        }
    ;
    
exitAtribuicao
	:	^(at = '=' a = . b = .)
	{
	
		if (!($a.hasAncestor(VECT_EXPR) || $a.hasAncestor(METHOD_CALL)) && !$at.visited){
		
			if ($a.getText().equals(".")){
		
				TradutorAST t = (TradutorAST)$a.getChildren().get(1);
				
				if (t.escopo != null){
				
					SimboloClasse sc = (SimboloClasse)tabelaSimbolos.global.resolver(nomeClasseAttrCampo);
				
					SimboloVariavel simboloVariavel = sc.resolverCampo(t.getText());
					
					String instr = "";
					
					if (estaticoAttrCampo)
						instr += "putstatic ";
					else
						instr += "putfield ";
						
					estaticoAttrCampo = false;
					
					instr += nomeClasseAttrCampo+"/" + ((TradutorAST)$a.getChildren().get(1)).getText() + " ";
					
					String tipo = simboloVariavel.getTipo().getNome();
					
					if (tipo.equals("int"))
						instr += "I";
					else if (tipo.equals("int[]"))
						instr += "[I;";
					else
						instr += "L"+tipo+";";
						
					Tradutor.buffer.append(instr + "\n");
					
				
				}
		
		        } else {
		
				SimboloVariavel simboloVariavel;
					
				if ($b.getText().equals("null"))
					Tradutor.buffer.append("aconst_null\n");
				else if ($b.escopo != null){			
					simboloVariavel = (SimboloVariavel) $b.escopo.resolver($b.getText());
					loadVar(simboloVariavel);
				} else if (isInteger($b.getText())) 
					loadConst($b.getText());
					
				if ($a.escopo != null){
					simboloVariavel = (SimboloVariavel)$a.escopo.resolver($a.getText());
					storeVar(simboloVariavel);
				}
				
				$at.visited = true;
			
			}
		
		}
		
	}
	;
	
addMult
	:       ^((op = '+' | op = '*') a = . b = .)
		{
		
			if (!($op.hasAncestor(VECT_EXPR) || $op.hasAncestor(METHOD_CALL)) && !$op.visited){
			
				SimboloVariavel simboloVariavel;
				
				if ($a.escopo != null){
					simboloVariavel = (SimboloVariavel) $a.escopo.resolver($a.getText());
					if (simboloVariavel != null)
						loadVar(simboloVariavel);
				} else if (isInteger($a.getText()))
					loadConst($a.getText());
				
				if ($b.escopo != null){
					simboloVariavel = (SimboloVariavel) $b.escopo.resolver($b.getText());
					if (simboloVariavel != null)
						loadVar(simboloVariavel);
				} else if (isInteger($b.getText()))
					loadConst($b.getText());
				
				if (op.getText().equals("+"))
					Tradutor.buffer.append("iadd\n");
				else
					Tradutor.buffer.append("imul\n");
					
			       Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");
			       
			       $op.visited = true;

				
			}
			
				
		}
	;
	
subDivEnter
	:	^((op = '-' | op = '/' | op = '%') a = . b = .)
		{
		
			if (!($op.hasAncestor(VECT_EXPR) || $op.hasAncestor(METHOD_CALL)) && !$op.visited){
				
			        SimboloVariavel simboloVariavel;
				
				if ($a.escopo != null){
					simboloVariavel = (SimboloVariavel) $a.escopo.resolver($a.getText());
					if (simboloVariavel != null)
						loadVar(simboloVariavel);
				} else if (isInteger($a.getText())){
					loadConst($a.getText());
				} else {
					percorrerSubArvore($a);
					$a.visited = true;
				}
					
			       Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");
			       
			       if ($b.escopo != null){
			
					simboloVariavel = (SimboloVariavel)$b.escopo.resolver($b.getText());
					
					loadVar(simboloVariavel);
					
					Tradutor.tipoAtual = simboloVariavel.getTipo();
				
				} else if (isInteger($b.getText())){
					
					loadConst($b.getText());
					
					Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");
				
				} else {
					percorrerSubArvore($b);
					$b.visited = true;
				}
					
				if (op.getText().equals("-"))
					Tradutor.buffer.append("isub\n");
				else if (op.getText().equals("/"))
					Tradutor.buffer.append("idiv\n");
				else
					Tradutor.buffer.append("irem\n");
					
				Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");


			       $op.visited = true;
				
			}
			
					
		}
	;
	
enterAtribuicao
	:	^(at = '=' a = .  b = . )
	
	{
	
		SimboloVariavel simboloVariavel;
		SimboloClasse simboloClasse;
	
		if ($b.getText().equals("new")){
		
			TradutorAST t = (TradutorAST)$b.getChildren().get(0);
		
			if (t.token.getType() == VECT_EXPR){
			
				TradutorAST expr = (TradutorAST) t.getChildren().get(1);
			
				if ($a.getText().equals(".")){
				
					if (((TradutorAST)$a.getChildren().get(0)).getText().equals(".")){
						percorrerSubArvore((TradutorAST)$a.getChildren().get(0));
						((TradutorAST)$a.getChildren().get(0)).visited = true;
						nomeClasseAttrCampo = Tradutor.tipoAtual.getNome();
					} else if (((TradutorAST)$a.getChildren().get(0)).escopo != null){				
						simboloVariavel = (SimboloVariavel)((TradutorAST)$a.getChildren().get(0)).escopo.resolver(((TradutorAST)$a.getChildren().get(0)).getText());
						loadVar(simboloVariavel);
						Tradutor.tipoAtual = simboloVariavel.getTipo();
						nomeClasseAttrCampo = simboloVariavel.getTipo().getNome();
					}
					
					if (((TradutorAST)expr.getChildren().get(0)).escopo != null){
						simboloVariavel = (SimboloVariavel) ((TradutorAST)expr.getChildren().get(0)).escopo.resolver(((TradutorAST)expr.getChildren().get(0)).getText());
						loadVar(simboloVariavel);
						Tradutor.tipoAtual = simboloVariavel.getTipo();
					} else if (isInteger(((TradutorAST)expr.getChildren().get(0)).getText())){
						loadConst(((TradutorAST)expr.getChildren().get(0)).getText());
						Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");
					} else {			
						percorrerSubArvore((TradutorAST)expr.getChildren().get(0));				
						((TradutorAST)expr.getChildren().get(0)).visited = true;			
					}
					
					Tradutor.buffer.append("newarray int\n");
					
					TradutorAST p = (TradutorAST)$a.getChildren().get(1);
					
					Tradutor.buffer.append("putfield "+nomeClasseAttrCampo+"/"+p.getText()+" ");
					
					simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(nomeClasseAttrCampo);
					
					simboloVariavel = (SimboloVariavel)simboloClasse.resolverCampo(p.getText());
					
					if (simboloVariavel.getTipo().getNome().equals("int"))
						Tradutor.buffer.append("I\n");
					else if (simboloVariavel.getTipo().getNome().equals("int[]"))
						Tradutor.buffer.append("[I;\n");
					else
						Tradutor.buffer.append("L"+simboloVariavel.getTipo().getNome()+";\n");
						
					Tradutor.tipoAtual = simboloVariavel.getTipo();
				
					$a.visited = true;
				
				} else if (((TradutorAST)$a).escopo != null){
				
					if (((TradutorAST)expr.getChildren().get(0)).escopo != null){
						simboloVariavel = (SimboloVariavel) ((TradutorAST)expr.getChildren().get(0)).escopo.resolver(((TradutorAST)expr.getChildren().get(0)).getText());
						loadVar(simboloVariavel);
						Tradutor.tipoAtual = simboloVariavel.getTipo();
					} else if (isInteger(((TradutorAST)expr.getChildren().get(0)).getText())){
						loadConst(((TradutorAST)expr.getChildren().get(0)).getText());
						Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");
					} else {			
						percorrerSubArvore((TradutorAST)expr.getChildren().get(0));				
						((TradutorAST)expr.getChildren().get(0)).visited = true;			
					}
					
					Tradutor.buffer.append("newarray int\n");
					
					simboloVariavel = (SimboloVariavel) ((TradutorAST)$a).escopo.resolver($a.getText());
					
					storeVar(simboloVariavel);
					
					Tradutor.tipoAtual = simboloVariavel.getTipo();
				
				}
			
			} else {
			
				String nomeNovaClasse;
			
				if ($a.getText().equals(".")) {
				
					if (((TradutorAST)$a.getChildren().get(0)).getText().equals(".")) {
					
						percorrerSubArvore((TradutorAST)$a.getChildren().get(0));
						
						((TradutorAST)$a.getChildren().get(0)).visited = true;
						
						nomeClasseAttrCampo = Tradutor.tipoAtual.getNome(); 
						
					
					} else if (((TradutorAST)$a.getChildren().get(0)).escopo != null){
					
						simboloVariavel = (SimboloVariavel)((TradutorAST)$a.getChildren().get(0)).escopo.resolver(((TradutorAST)$a.getChildren().get(0)).getText());
						
						loadVar(simboloVariavel);
						
						Tradutor.tipoAtual = simboloVariavel.getTipo();
						
						nomeClasseAttrCampo = Tradutor.tipoAtual.getNome();
					
					}
					
					nomeNovaClasse = ((TradutorAST)t.getChildren().get(0)).getText();
					
					Tradutor.buffer.append("new "+nomeNovaClasse+"\n");
					
					TradutorAST p = (TradutorAST)$a.getChildren().get(1);
					
					Tradutor.buffer.append("putfield "+nomeClasseAttrCampo+"/"+p.getText()+" ");
					
					simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(nomeClasseAttrCampo);
					
					simboloVariavel = (SimboloVariavel)simboloClasse.resolverCampo(p.getText());
					
					if (simboloVariavel.getTipo().getNome().equals("int"))
						Tradutor.buffer.append("I\n");
					else if (simboloVariavel.getTipo().getNome().equals("int[]"))
						Tradutor.buffer.append("[I;");
					else
						Tradutor.buffer.append("L"+simboloVariavel.getTipo().getNome()+";\n");
						
					Tradutor.tipoAtual = simboloVariavel.getTipo();
					
					if (((TradutorAST)$a.getChildren().get(0)).getText().equals(".")) {
					
						percorrerSubArvore((TradutorAST)$a.getChildren().get(0));
						
						((TradutorAST)$a.getChildren().get(0)).visited = true;
						
						nomeClasseAttrCampo = Tradutor.tipoAtual.getNome(); 
						
					
					} else if (((TradutorAST)$a.getChildren().get(0)).escopo != null){
					
						simboloVariavel = (SimboloVariavel)((TradutorAST)$a.getChildren().get(0)).escopo.resolver(((TradutorAST)$a.getChildren().get(0)).getText());
						
						loadVar(simboloVariavel);
						
						Tradutor.tipoAtual = simboloVariavel.getTipo();
						
						nomeClasseAttrCampo = Tradutor.tipoAtual.getNome();
					
					}
					
					TradutorAST g = (TradutorAST)$a.getChildren().get(1);
										
					Tradutor.buffer.append("getfield "+nomeClasseAttrCampo+"/"+g.getText()+" ");
					
					simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(nomeClasseAttrCampo);
					
					simboloVariavel = (SimboloVariavel)simboloClasse.resolverCampo(g.getText());
					
					if (simboloVariavel.getTipo().getNome().equals("int"))
						Tradutor.buffer.append("I\n");
					else if (simboloVariavel.getTipo().getNome().equals("int[]"))
						Tradutor.buffer.append("[I;\n");
					else
						Tradutor.buffer.append("L"+simboloVariavel.getTipo().getNome()+";\n");
						
					Tradutor.tipoAtual = simboloVariavel.getTipo();
					
					$a.visited = true;
				
				} else if ($a.escopo != null) {
				
					nomeNovaClasse = ((TradutorAST)t.getChildren().get(0)).getText();
					
					Tradutor.buffer.append("new "+nomeNovaClasse+"\n");
					
					simboloVariavel = (SimboloVariavel) $a.escopo.resolver($a.getText());
					
					storeVar(simboloVariavel);
					
					loadVar(simboloVariavel);
					
					Tradutor.tipoAtual = simboloVariavel.getTipo();
				
				}
			
			}
			
			t.visited = true;
			
			$at.visited = true;
		
		} else if ($a.getText().equals(".")){
		
				TradutorAST t = (TradutorAST)$a.getChildren().get(0);
				if (t.escopo != null){
					simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(t.getText());
					if (simboloClasse != null){
						nomeClasseAttrCampo = simboloClasse.getNome();
						estaticoAttrCampo = true; 
					} else {
						simboloVariavel = (SimboloVariavel)t.escopo.resolver(t.getText());
						loadVar(simboloVariavel);
						$a.visited = true;
						nomeClasseAttrCampo = simboloVariavel.getTipo().getNome();
					}
				} else {
					percorrerSubArvore(t);
					t.visited = true;
					nomeClasseAttrCampo = Tradutor.tipoAtual.getNome();
				}
				
				if ($b.escopo != null){
				
					simboloVariavel = (SimboloVariavel)$b.escopo.resolver($b.getText());
					
					loadVar(simboloVariavel);
					
					Tradutor.tipoAtual = simboloVariavel.getTipo();
				
				} else if (isInteger($b.getText())){
					
					loadConst($b.getText());
					
					Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");
				
				}
				
			  //$at.visited = true;
		
			}
		
		
		}
		
	;

enterAttrVetor
	:	^('=' ^(VECT_EXPR a = . ^(EXPR b = .)) c = .)
	{
	
		CommonTree tree;
		SimboloVariavel simboloVariavel;
				
		if ($a.escopo != null) {
			simboloVariavel = (SimboloVariavel) $a.escopo.resolver($a.getText());
			loadVar(simboloVariavel);						
		} else if ($a.getText().equals(".")){
			percorrerSubArvore($a);	
			$a.visited = true;
		}
				
		if ($b.escopo != null) {
			simboloVariavel = (SimboloVariavel) $b.escopo.resolver($b.getText());
			loadVar(simboloVariavel);	
		} else if (isInteger($b.getText()))
			loadConst($b.getText());
		else{				
			percorrerSubArvore($b);
			$b.visited = true;
		}
		
		if ($c.escopo != null){
			
			simboloVariavel = (SimboloVariavel)$c.escopo.resolver($c.getText());
				
			loadVar(simboloVariavel);
				
			Tradutor.tipoAtual = simboloVariavel.getTipo();
			
		} else if (isInteger($c.getText())){
				
			loadConst($c.getText());
				
			Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");
			
		}
		
		$a.visited = true;
		
		
		
	}
	;
	
/*enterNewObject
	:	^('=' a = . b = .)
	{
		
	}
	;*/
	
enterNewObjectListaVarDeclAtribuicao
	:	^(LISTA_VAR_DECL ^(VAR_DECL tp = . ID vet =.? ^(EXPR a = .)) .*)
	{
		if (!$ID.visited && $a.getText().equals("new")){
		
			SimboloVariavel simboloVariavel;
		
			TradutorAST t = (TradutorAST)$a.getChildren().get(0);
					
			if (t.token.getType() == VECT_EXPR){
			
				TradutorAST expr = (TradutorAST)t.getChildren().get(1);
				
				if (((TradutorAST)expr.getChildren().get(0)).escopo != null){
					simboloVariavel = (SimboloVariavel) ((TradutorAST)expr.getChildren().get(0)).escopo.resolver(((TradutorAST)expr.getChildren().get(0)).getText());
					loadVar(simboloVariavel);
					Tradutor.tipoAtual = simboloVariavel.getTipo();
				} else if (isInteger(((TradutorAST)expr.getChildren().get(0)).getText())){
					loadConst(((TradutorAST)expr.getChildren().get(0)).getText());
					Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");
				} else {			
					percorrerSubArvore((TradutorAST)expr.getChildren().get(0));				
					((TradutorAST)expr.getChildren().get(0)).visited = true;			
				}
					
				Tradutor.buffer.append("newarray int\n");
					
				simboloVariavel = (SimboloVariavel) $ID.escopo.resolver($ID.getText());
					
				storeVar(simboloVariavel);
				
				Tradutor.tipoAtual = simboloVariavel.getTipo();
				
			} else {
			
				Tradutor.buffer.append("new "+$tp.getText()+"\n");
			
				simboloVariavel = (SimboloVariavel)$ID.escopo.resolver($ID.text);
			
				storeVar(simboloVariavel);
				
				loadVar(simboloVariavel);
				
				Tradutor.tipoAtual = simboloVariavel.getTipo();
					
			}
			
			$ID.visited = true;
			
			t.visited = true;
				
		
		}
	}
	;
	
exitAttrVetor
	:	^('=' ^(VECT_EXPR . ^(EXPR .)) .)
	{
	
		Tradutor.buffer.append("iastore\n");
		
	}
	;
	
/*subDivExit
	:	 ^((op = '-' | op = '/' | op = '%') . b = .)
		{
		
			if (!($op.hasAncestor(VECT_EXPR) || $op.hasAncestor(METHOD_CALL)) && !op.visited){
		
				SimboloVariavel simboloVariavel;
			
				if ($b.escopo != null){
					simboloVariavel = (SimboloVariavel) $b.escopo.resolver($b.getText());
					if (simboloVariavel != null)
						loadVar(simboloVariavel);
				} else if (isInteger($b.getText()))
					loadConst($b.getText());
			
				if (op.getText().equals("-"))
					Tradutor.buffer.append("isub\n");
				else if (op.getText().equals("/"))
					Tradutor.buffer.append("idiv\n");
				else
					Tradutor.buffer.append("irem\n");
					
				Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");

				$op.visited = true;
				
			}
			
			
		}
	;*/
	
acessoCampo 
	:	^(p = '.' a = . b = . )
	{
		
			if (!($a.hasAncestor(VECT_EXPR) || $a.hasAncestor(METHOD_CALL)) && !$p.visited){
		
				/*SimboloClasse simboloClasse;
				String instrucao = "";
				
				if ($a.getText().equals(".")){
	            			simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(Tradutor.tipoAtual.getNome());
					instrucao += "getfield "+simboloClasse.getNome()+"/"+$b.getText();
					SimboloVariavel simboloVariavel = simboloClasse.resolverCampo($b.getText());
					if (simboloVariavel.getTipo().getNome().equals("int")){
						Tradutor.tipoAtual = simboloVariavel.getTipo();
						instrucao += " I";
					} else if (simboloVariavel.getTipo().getNome().equals("int[]")){
						Tradutor.tipoAtual = simboloVariavel.getTipo();
						instrucao += " [I;";
					} else {
						Tradutor.tipoAtual = simboloVariavel.getTipo();
						instrucao += " L"+simboloVariavel.getTipo().getNome()+";";
					}
				} else if ($b.getText().equals(".")){
	            			simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(Tradutor.tipoAtual.getNome());
					instrucao += "getfield "+simboloClasse.getNome()+"/"+$a.getText();
					SimboloVariavel simboloVariavel = simboloClasse.resolverCampo($a.getText());
					if (simboloVariavel.getTipo().getNome().equals("int")){
						Tradutor.tipoAtual = simboloVariavel.getTipo();
						instrucao += " I";
					} else if (simboloVariavel.getTipo().getNome().equals("int[]")){
						Tradutor.tipoAtual = simboloVariavel.getTipo();
						instrucao += " [I;";
					} else {
						Tradutor.tipoAtual = simboloVariavel.getTipo();
						instrucao += " L"+simboloVariavel.getTipo().getNome()+";";
					}
				} else if ($a.escopo != null && $b.escopo != null){
					simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver($a.getText());
					if (simboloClasse != null){
						instrucao += "getstatic "+simboloClasse.getNome()+"/"+$b.getText();
						SimboloVariavel simboloVariavel = simboloClasse.resolverCampo($b.getText());
						if (simboloVariavel.getTipo().getNome().equals("int")){
							Tradutor.tipoAtual = simboloVariavel.getTipo();
							instrucao += " I";
						} else if (simboloVariavel.getTipo().getNome().equals("int[]")){
							Tradutor.tipoAtual = simboloVariavel.getTipo();
							instrucao += " [I;";
						} else {
							Tradutor.tipoAtual = simboloVariavel.getTipo();
							instrucao += " L"+simboloVariavel.getTipo().getNome()+";";
						}
					} else {
						loadVar((SimboloVariavel)$a.escopo.resolver($a.getText()));
						simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver($a.escopo.resolver($a.getText()).getTipo().getNome());
						instrucao += "getfield "+simboloClasse.getNome()+"/"+$b.getText();
						SimboloVariavel simboloVariavel = simboloClasse.resolverCampo($b.getText());
						if (simboloVariavel.getTipo().getNome().equals("int")){
							Tradutor.tipoAtual = simboloVariavel.getTipo();
							instrucao += " I";
						} else if (simboloVariavel.getTipo().getNome().equals("int[]")){
							Tradutor.tipoAtual = simboloVariavel.getTipo();
							instrucao += " [I;";
						} else {
							Tradutor.tipoAtual = simboloVariavel.getTipo();
							instrucao += " L"+simboloVariavel.getTipo().getNome()+";";
						}
					}*/
					
					SimboloVariavel simboloVariavel;
					SimboloClasse simboloClasse;
					boolean estatico = false;
					
					if ($a.escopo != null){
					
						simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver($a.getText());
						
						if (simboloClasse != null){
						
							Tradutor.buffer.append("getstatic "+simboloClasse.getNome()+"/"+$b.getText()+" ");
							
							simboloVariavel = (SimboloVariavel) simboloClasse.resolverCampo($b.getText());
							
							if (simboloVariavel.getTipo().getNome().equals("int"))
								Tradutor.buffer.append("I\n");
							else if (simboloVariavel.getTipo().getNome().equals("int[]"))
								Tradutor.buffer.append("[I;\n");
							else
								Tradutor.buffer.append("L"+simboloVariavel.getTipo().getNome()+";\n");
								
							Tradutor.tipoAtual = simboloVariavel.getTipo();
							
							estatico = true;
						
						} else {
					
							simboloVariavel = (SimboloVariavel) $a.escopo.resolver($a.getText());
							
							loadVar(simboloVariavel);
							
							Tradutor.tipoAtual = simboloVariavel.getTipo();
						
						}
					
					}
					
					if ($b.escopo != null && !estatico){
					
						simboloClasse = (SimboloClasse) tabelaSimbolos.global.resolver(Tradutor.tipoAtual.getNome());
						
						simboloVariavel = (SimboloVariavel)simboloClasse.resolverCampo($b.getText());
						
						Tradutor.buffer.append("getfield "+simboloClasse.getNome()+"/"+$b.getText()+" ");
						
						if (simboloVariavel.getTipo().getNome().equals("int"))
							Tradutor.buffer.append("I\n");
						else if (simboloVariavel.getTipo().getNome().equals("int[]"))
							Tradutor.buffer.append("[I;\n");
						else
							Tradutor.buffer.append("L"+simboloVariavel.getTipo().getNome()+";\n");
							
						Tradutor.tipoAtual = simboloVariavel.getTipo();
					
					}
					
					$p.visited = true;				
					
				}
				
				//Tradutor.buffer.append(instrucao+"\n");
						
			
			}
		
	
	;
	
vetorExpr
	:	^(VECT_EXPR a = . ^(EXPR b = .))
		{
		
		if (!($VECT_EXPR.hasAncestor(VECT_EXPR) || $VECT_EXPR.hasAncestor(METHOD_CALL)) && !$VECT_EXPR.visited){
		
			if (!$a.visited) {
			
				CommonTree tree;
				SimboloVariavel simboloVariavel;
				
				if ($a.escopo != null) {
					simboloVariavel = (SimboloVariavel) $a.escopo.resolver($a.getText());
					loadVar(simboloVariavel);						
				} else if ($a.getText().equals(".")){
					percorrerSubArvore($a);	
					$a.visited = true;
				}
				
				if ($b.escopo != null) {
					simboloVariavel = (SimboloVariavel) $b.escopo.resolver($b.getText());
					loadVar(simboloVariavel);	
				} else if (isInteger($b.getText()))
					loadConst($b.getText());
				else{				
				        percorrerSubArvore($b);
				        $b.visited = true;
				}
				
				Tradutor.buffer.append("iaload\n");
				
				Tradutor.tipoAtual = new SimboloTipoReferencia("int");
				
				$a.visited = true;
				
			}
			
		}
		
		}
	;
	
chamadaMetodo
	:	^(METHOD_CALL a = . ^(LISTA_EXPR exprs += .+))
	{
		
		if (!($METHOD_CALL.hasAncestor(VECT_EXPR) || $METHOD_CALL.hasAncestor(METHOD_CALL)) && !$a.visited){
		
			SimboloVariavel simboloVariavel;
			SimboloMetodo simboloMetodo;
			SimboloClasse simboloClasse = null;
			String nomeMetodo;
			boolean chamadaEstatica = false;
			boolean metodoClasseAtual = false;
			
			if ($a.getText().equals(".")){
				nomeMetodo = ((Tree)$a.getChildren().get(1)).getText();
				if (((Tree)$a.getChildren().get(0)).getText().equals(".")){
					percorrerSubArvore((TradutorAST)$a.getChildren().get(0));
					((TradutorAST)$a.getChildren().get(0)).visited = true;
					simboloClasse = (SimboloClasse)Tradutor.tipoAtual;
				}else {
					Simbolo s = ((TradutorAST)$a.getChildren().get(0)).escopo.resolver(((Tree)$a.getChildren().get(0)).getText());
					if (s instanceof SimboloVariavel){
						simboloVariavel = (SimboloVariavel)s;
						loadVar(simboloVariavel);
						simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(simboloVariavel.getTipo().getNome());
					} else if (s instanceof SimboloClasse){
						simboloClasse = (SimboloClasse)s;
						chamadaEstatica = true;
					}

				}
			} else if ($METHOD_CALL.getParent().getText().equals("new")) {
				simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver($a.getText());
				nomeMetodo = $a.getText();
			} else {
				metodoClasseAtual = true;
				simboloClasse = classeAtual;
				nomeMetodo = $a.getText();
			}
			
			List<String> tiposParams = new ArrayList<String>();
			
			for (Object expr : list_exprs){
				TradutorAST p = (TradutorAST)((Tree)expr).getChild(0);
	            		if (p.escopo != null){
	            			SimboloVariavel v = (SimboloVariavel)p.escopo.resolver(p.getText());
	            			tiposParams.add(v.getTipo().getNome());
	            			loadVar(v);
	            		} else if (isInteger(p.getText())){
	            			tiposParams.add("int");
	            			loadConst(p.getText());
	            		} else {
	            			percorrerSubArvore((TradutorAST)expr);
	            			((TradutorAST)expr).visited = true;
	                		tiposParams.add(Tradutor.tipoAtual.getNome());
	            		}
			}
			
			String assinaturaMetodo = nomeMetodo+"("; 
			
			List<String> tiposParamsCopia = new ArrayList<String>();
			
			tiposParamsCopia.addAll(tiposParams);
			
			if (chamadaEstatica)
				assinaturaMetodo += tiposParamsCopia.remove(0);
			else
				assinaturaMetodo += simboloClasse.getNome();
			
			for(String tipoParam : tiposParamsCopia)
				assinaturaMetodo += ","+tipoParam;
			
			assinaturaMetodo += ")";
			
			System.out.println(assinaturaMetodo);
			
			simboloMetodo = simboloClasse.resolverMetodo(assinaturaMetodo);
			
			if (simboloMetodo == null){
				tiposParamsCopia = new ArrayList<String>();
				tiposParamsCopia.addAll(tiposParams);
				assinaturaMetodo = nomeMetodo+"(";
				assinaturaMetodo += tiposParamsCopia.remove(0);
				for(String tipoParam : tiposParamsCopia)
					assinaturaMetodo += ","+tiposParamsCopia; 
				assinaturaMetodo += ")";
				simboloMetodo = simboloClasse.resolverMetodo(assinaturaMetodo);
				if (simboloMetodo != null)
					chamadaEstatica = true;
				
			}
			
			String call = "";
			
			if (metodoClasseAtual && !simboloMetodo.isEstatico())
				Tradutor.buffer.append("aload_0\n");
			
			if (simboloMetodo.isEstatico())
				call += "invokestatic ";
			else if (simboloMetodo.getNome().equals(simboloClasse.getNome()))
				call += "invokespecial ";
			else
				call += "invokevirtual ";
			
			
			call += simboloClasse.getNome()+"/";
			
			if (simboloMetodo.getNome().equals(simboloClasse.getNome()))
				call += "<init>";
			else
				call += nomeMetodo;
				
			call += "(";
			
			for (String tipo : tiposParams){
			
				if(tipo.equals("int"))
					call += "I";
				else if (tipo.equals("int[]"))
					call += "[I;";
				else
					call += "L"+tipo+";";
			
			}
			
			call += ")";
			
			if (simboloMetodo.getTipo().getNome().equals("void"))
				call += "V";
			else if (simboloMetodo.getTipo().getNome().equals("int"))
				call += "I";
			else if (simboloMetodo.getTipo().getNome().equals("int[]"))
							call += "[I;";
			else
				call += "L"+simboloMetodo.getTipo().getNome()+";";
				
			Tradutor.buffer.append(call+"\n");
			
			$a.visited = true;
			
		
		}
	
	}
	;

chamadaMetodoSemParams
	:	^(METHOD_CALL a = .)
	{
		
		if (!($METHOD_CALL.hasAncestor(VECT_EXPR) || $METHOD_CALL.hasAncestor(METHOD_CALL)) && !$a.visited){
		
			SimboloVariavel simboloVariavel;
			SimboloMetodo simboloMetodo;
			SimboloClasse simboloClasse = null;
			String nomeMetodo;
			boolean chamadaEstatica = false;
			boolean metodoClasseAtual = false;
			
			if ($a.getText().equals(".")){
				nomeMetodo = ((Tree)$a.getChildren().get(1)).getText();
				if (((Tree)$a.getChildren().get(0)).getText().equals(".")){
					percorrerSubArvore((TradutorAST)$a.getChildren().get(0));
					((TradutorAST)$a.getChildren().get(0)).visited = true;
					simboloClasse = (SimboloClasse)Tradutor.tipoAtual;
				}else {
					Simbolo s = ((TradutorAST)$a.getChildren().get(0)).escopo.resolver(((Tree)$a.getChildren().get(0)).getText());
					if (s instanceof SimboloVariavel){
						simboloVariavel = (SimboloVariavel)s;
						loadVar(simboloVariavel);
						simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(simboloVariavel.getTipo().getNome());
					} else if (s instanceof SimboloClasse){
						simboloClasse = (SimboloClasse)s;
						chamadaEstatica = true;
					}
				}
				
			} else if ($METHOD_CALL.getParent().getText().equals("new")) {
				simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver($a.getText());
				nomeMetodo = $a.getText();
			} else {
				metodoClasseAtual = true;
				simboloClasse = classeAtual;
				nomeMetodo = $a.getText();
			}
			
			String assinaturaMetodo = nomeMetodo+"("; 
						
			if (!chamadaEstatica)
				assinaturaMetodo += simboloClasse.getNome();
			
						assinaturaMetodo += ")";
			
			System.out.println(assinaturaMetodo);
			
			simboloMetodo = simboloClasse.resolverMetodo(assinaturaMetodo);
			
			if (simboloMetodo == null){
				assinaturaMetodo = nomeMetodo+"()";
				simboloMetodo = simboloClasse.resolverMetodo(assinaturaMetodo);
				if (simboloMetodo != null)
					chamadaEstatica = true;			
			}
			
			if (metodoClasseAtual && !simboloMetodo.isEstatico())
				Tradutor.buffer.append("aload_0\n");
			
			String call = "";
			
			if (simboloMetodo.isEstatico())
				call += "invokestatic ";
			else if (simboloMetodo.getNome().equals(simboloClasse.getNome()))
				call += "invokespecial ";
			else
				call += "invokevirtual ";
			
			
			call += simboloClasse.getNome()+"/";
			
			if (simboloMetodo.getNome().equals(simboloClasse.getNome()))
				call += "<init>";
			else
				call += nomeMetodo;
				
			call += "()";		
			
			if (simboloMetodo.getTipo().getNome().equals("void"))
				call += "V";
			else if (simboloMetodo.getTipo().getNome().equals("int"))
				call += "I";
			else if (simboloMetodo.getTipo().getNome().equals("int[]"))
				call += "[I;";
			else
				call += "L"+simboloMetodo.getTipo().getNome()+";";
				
			Tradutor.buffer.append(call+"\n");
			
			$a.visited = true;
		
		}
	
		}
	;
