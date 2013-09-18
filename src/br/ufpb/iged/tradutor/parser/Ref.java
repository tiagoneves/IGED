// $ANTLR 3.4 C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g 2013-09-18 12:12:32


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
    


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Ref extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCO", "CLASSE", "COND_FOR", "CONSTR_DECL", "DOWHILE", "EXPR", "EXTENDS", "FIELD_DECL", "FOR", "ID", "IF", "INC_FOR", "INIT_FOR", "INT", "LETRA", "LISTA_EXPR", "LISTA_VAR_DECL", "METHOD_CALL", "METHOD_DECL", "NEW", "PARAM", "PARAMS", "POS_DECREMENTO", "POS_INCREMENTO", "PRE_DECREMENTO", "PRE_INCREMENTO", "RETURN", "SL_COMMENT", "VAR_DECL", "VAR_DECL_LISTA", "VECT_EXPR", "WHILE", "WS", "'!='", "'%'", "'&&'", "'('", "')'", "'*'", "'+'", "'++'", "','", "'-'", "'--'", "'.'", "'/'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'['", "'[]'", "']'", "'^'", "'class'", "'do'", "'else'", "'extends'", "'for'", "'if'", "'int'", "'new'", "'return'", "'static'", "'while'", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int BLOCO=4;
    public static final int CLASSE=5;
    public static final int COND_FOR=6;
    public static final int CONSTR_DECL=7;
    public static final int DOWHILE=8;
    public static final int EXPR=9;
    public static final int EXTENDS=10;
    public static final int FIELD_DECL=11;
    public static final int FOR=12;
    public static final int ID=13;
    public static final int IF=14;
    public static final int INC_FOR=15;
    public static final int INIT_FOR=16;
    public static final int INT=17;
    public static final int LETRA=18;
    public static final int LISTA_EXPR=19;
    public static final int LISTA_VAR_DECL=20;
    public static final int METHOD_CALL=21;
    public static final int METHOD_DECL=22;
    public static final int NEW=23;
    public static final int PARAM=24;
    public static final int PARAMS=25;
    public static final int POS_DECREMENTO=26;
    public static final int POS_INCREMENTO=27;
    public static final int PRE_DECREMENTO=28;
    public static final int PRE_INCREMENTO=29;
    public static final int RETURN=30;
    public static final int SL_COMMENT=31;
    public static final int VAR_DECL=32;
    public static final int VAR_DECL_LISTA=33;
    public static final int VECT_EXPR=34;
    public static final int WHILE=35;
    public static final int WS=36;

    // delegates
    public TreeFilter[] getDelegates() {
        return new TreeFilter[] {};
    }

    // delegators


    public Ref(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public Ref(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Ref.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g"; }


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
         
         private void visitarSubArvore(TradutorAST t) {
            	 
            	t.visited = true;
            	 
            	if (t.getChildCount() > 0){
            		 
            		for (Object c : t.getChildren())
            			visitarSubArvore((TradutorAST)c);
            		 
            	 }
            	 
             }
        



    // $ANTLR start "topdown"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:143:1: topdown : ( enterClass | enterMethod | enterConstructor | enterParam | enterField | subDivEnter | enterAtribuicao | enterAttrVetor | enterNewObjectListaVarDeclAtribuicao | enterIfComBloco | enterIfSemBloco );
    public final void topdown() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:144:5: ( enterClass | enterMethod | enterConstructor | enterParam | enterField | subDivEnter | enterAtribuicao | enterAttrVetor | enterNewObjectListaVarDeclAtribuicao | enterIfComBloco | enterIfSemBloco )
            int alt1=11;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:144:9: enterClass
                    {
                    pushFollow(FOLLOW_enterClass_in_topdown60);
                    enterClass();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:145:9: enterMethod
                    {
                    pushFollow(FOLLOW_enterMethod_in_topdown70);
                    enterMethod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:146:9: enterConstructor
                    {
                    pushFollow(FOLLOW_enterConstructor_in_topdown80);
                    enterConstructor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:147:9: enterParam
                    {
                    pushFollow(FOLLOW_enterParam_in_topdown90);
                    enterParam();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:148:9: enterField
                    {
                    pushFollow(FOLLOW_enterField_in_topdown100);
                    enterField();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:149:9: subDivEnter
                    {
                    pushFollow(FOLLOW_subDivEnter_in_topdown110);
                    subDivEnter();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:150:9: enterAtribuicao
                    {
                    pushFollow(FOLLOW_enterAtribuicao_in_topdown120);
                    enterAtribuicao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:151:9: enterAttrVetor
                    {
                    pushFollow(FOLLOW_enterAttrVetor_in_topdown130);
                    enterAttrVetor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:153:9: enterNewObjectListaVarDeclAtribuicao
                    {
                    pushFollow(FOLLOW_enterNewObjectListaVarDeclAtribuicao_in_topdown145);
                    enterNewObjectListaVarDeclAtribuicao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:154:9: enterIfComBloco
                    {
                    pushFollow(FOLLOW_enterIfComBloco_in_topdown155);
                    enterIfComBloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:155:9: enterIfSemBloco
                    {
                    pushFollow(FOLLOW_enterIfSemBloco_in_topdown165);
                    enterIfSemBloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        } catch (SyntacticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "topdown"



    // $ANTLR start "bottomup"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:162:1: bottomup : ( exitClass | exitMethod | exitConstructor | exitParams | listaVarDeclAtribuicao | exitAtribuicao | addMult | acessoCampo | vetorExpr | chamadaMetodo | chamadaMetodoSemParams | exitAttrVetor );
    public final void bottomup() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:163:5: ( exitClass | exitMethod | exitConstructor | exitParams | listaVarDeclAtribuicao | exitAtribuicao | addMult | acessoCampo | vetorExpr | chamadaMetodo | chamadaMetodoSemParams | exitAttrVetor )
            int alt2=12;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:163:9: exitClass
                    {
                    pushFollow(FOLLOW_exitClass_in_bottomup191);
                    exitClass();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:164:9: exitMethod
                    {
                    pushFollow(FOLLOW_exitMethod_in_bottomup201);
                    exitMethod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:165:9: exitConstructor
                    {
                    pushFollow(FOLLOW_exitConstructor_in_bottomup211);
                    exitConstructor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:166:9: exitParams
                    {
                    pushFollow(FOLLOW_exitParams_in_bottomup221);
                    exitParams();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:167:9: listaVarDeclAtribuicao
                    {
                    pushFollow(FOLLOW_listaVarDeclAtribuicao_in_bottomup231);
                    listaVarDeclAtribuicao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:168:9: exitAtribuicao
                    {
                    pushFollow(FOLLOW_exitAtribuicao_in_bottomup241);
                    exitAtribuicao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:169:9: addMult
                    {
                    pushFollow(FOLLOW_addMult_in_bottomup251);
                    addMult();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:171:9: acessoCampo
                    {
                    pushFollow(FOLLOW_acessoCampo_in_bottomup266);
                    acessoCampo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:172:9: vetorExpr
                    {
                    pushFollow(FOLLOW_vetorExpr_in_bottomup276);
                    vetorExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:173:9: chamadaMetodo
                    {
                    pushFollow(FOLLOW_chamadaMetodo_in_bottomup286);
                    chamadaMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:174:9: chamadaMetodoSemParams
                    {
                    pushFollow(FOLLOW_chamadaMetodoSemParams_in_bottomup296);
                    chamadaMetodoSemParams();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:175:9: exitAttrVetor
                    {
                    pushFollow(FOLLOW_exitAttrVetor_in_bottomup306);
                    exitAttrVetor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bottomup"



    // $ANTLR start "enterClass"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:178:1: enterClass : ^( CLASSE nome= ID ( ^( EXTENDS sup= ID ) )? ( . )+ ) ;
    public final void enterClass() throws RecognitionException {
        TradutorAST nome=null;
        TradutorAST sup=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:179:5: ( ^( CLASSE nome= ID ( ^( EXTENDS sup= ID ) )? ( . )+ ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:179:9: ^( CLASSE nome= ID ( ^( EXTENDS sup= ID ) )? ( . )+ )
            {
            match(input,CLASSE,FOLLOW_CLASSE_in_enterClass326); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            nome=(TradutorAST)match(input,ID,FOLLOW_ID_in_enterClass332); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:179:28: ( ^( EXTENDS sup= ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EXTENDS) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==ID) ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==UP) ) {
                            alt3=1;
                        }
                    }
                }
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:179:29: ^( EXTENDS sup= ID )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_enterClass336); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sup=(TradutorAST)match(input,ID,FOLLOW_ID_in_enterClass342); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:179:51: ( . )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= BLOCO && LA4_0 <= 74)) ) {
                    alt4=1;
                }
                else if ( (LA4_0==UP) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:179:51: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) { 
                         classeAtual = (SimboloClasse)nome.simbolo; 
            	     Tradutor.buffer = new StringBuffer();
            	     Tradutor.buffer.append(".class "+classeAtual.getNome()+"\n");
            	     
            	     if (sup != null)
            	       Tradutor.buffer.append(".super "+sup.getText()+"\n");
            	     
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "enterClass"



    // $ANTLR start "exitClass"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:191:1: exitClass : CLASSE ;
    public final void exitClass() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:192:5: ( CLASSE )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:192:9: CLASSE
            {
            match(input,CLASSE,FOLLOW_CLASSE_in_exitClass378); if (state.failed) return ;

            if ( state.backtracking==1 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "exitClass"



    // $ANTLR start "enterMethod"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:210:1: enterMethod : ^( METHOD_DECL (st= . )? tp= . ID (vet= . )? ( ^(parm= PARAMS ( . )+ ) )* ^( BLOCO ( . )* ) ) ;
    public final void enterMethod() throws RecognitionException {
        TradutorAST parm=null;
        TradutorAST ID1=null;
        TradutorAST st=null;
        TradutorAST tp=null;
        TradutorAST vet=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:211:5: ( ^( METHOD_DECL (st= . )? tp= . ID (vet= . )? ( ^(parm= PARAMS ( . )+ ) )* ^( BLOCO ( . )* ) ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:211:8: ^( METHOD_DECL (st= . )? tp= . ID (vet= . )? ( ^(parm= PARAMS ( . )+ ) )* ^( BLOCO ( . )* ) )
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_enterMethod411); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:211:25: (st= . )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:211:25: st= .
                    {
                    st=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            tp=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            ID1=(TradutorAST)match(input,ID,FOLLOW_ID_in_enterMethod426); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:211:44: (vet= . )?
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:211:44: vet= .
                    {
                    vet=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:211:49: ( ^(parm= PARAMS ( . )+ ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==PARAMS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:211:50: ^(parm= PARAMS ( . )+ )
            	    {
            	    parm=(TradutorAST)match(input,PARAMS,FOLLOW_PARAMS_in_enterMethod441); if (state.failed) return ;

            	    match(input, Token.DOWN, null); if (state.failed) return ;
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:211:66: ( . )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0 >= BLOCO && LA7_0 <= 74)) ) {
            	            alt7=1;
            	        }
            	        else if ( (LA7_0==UP) ) {
            	            alt7=2;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:211:66: .
            	    	    {
            	    	    matchAny(input); if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	    	    if (state.backtracking>0) {state.failed=true; return ;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);


            	    match(input, Token.UP, null); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input,BLOCO,FOLLOW_BLOCO_in_enterMethod450); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:211:80: ( . )*
                loop9:
                do {
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0 >= BLOCO && LA9_0 <= 74)) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==UP) ) {
                        alt9=2;
                    }


                    switch (alt9) {
                	case 1 :
                	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:211:80: .
                	    {
                	    matchAny(input); if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop9;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                    	metodoAtual = (SimboloMetodo) ID1.simbolo;
            	    
            	    	tipoMetodo = tp.getText();
            	    	
            	    	tipoRetornoVet = vet != null && vet.getText().equals("[]") && tipoMetodo.equals("int");
            	    	
            	    	if (parm == null) {
            	    	
            	    		Tradutor.buffer.append(".method ");
            	        
            	                if (st != null)
            	        	   Tradutor.buffer.append("static ");
            	        
            	                Tradutor.buffer.append( (ID1!=null?ID1.getText():null) + "()");
            	                
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
            	        
            	           linha += (ID1!=null?ID1.getText():null) + "(";
            	    	
            	    	}
            	    		   
            	        
            	        
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "enterMethod"



    // $ANTLR start "enterConstructor"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:258:1: enterConstructor : ^( CONSTR_DECL ID ( ^(parm= PARAMS ( . )+ ) )* ^( BLOCO ( . )* ) ) ;
    public final void enterConstructor() throws RecognitionException {
        TradutorAST parm=null;
        TradutorAST ID2=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:259:2: ( ^( CONSTR_DECL ID ( ^(parm= PARAMS ( . )+ ) )* ^( BLOCO ( . )* ) ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:259:5: ^( CONSTR_DECL ID ( ^(parm= PARAMS ( . )+ ) )* ^( BLOCO ( . )* ) )
            {
            match(input,CONSTR_DECL,FOLLOW_CONSTR_DECL_in_enterConstructor486); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID2=(TradutorAST)match(input,ID,FOLLOW_ID_in_enterConstructor488); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:259:22: ( ^(parm= PARAMS ( . )+ ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==PARAMS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:259:23: ^(parm= PARAMS ( . )+ )
            	    {
            	    parm=(TradutorAST)match(input,PARAMS,FOLLOW_PARAMS_in_enterConstructor496); if (state.failed) return ;

            	    match(input, Token.DOWN, null); if (state.failed) return ;
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:259:39: ( . )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( ((LA10_0 >= BLOCO && LA10_0 <= 74)) ) {
            	            alt10=1;
            	        }
            	        else if ( (LA10_0==UP) ) {
            	            alt10=2;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:259:39: .
            	    	    {
            	    	    matchAny(input); if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt10 >= 1 ) break loop10;
            	    	    if (state.backtracking>0) {state.failed=true; return ;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);


            	    match(input, Token.UP, null); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input,BLOCO,FOLLOW_BLOCO_in_enterConstructor505); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:259:53: ( . )*
                loop12:
                do {
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0 >= BLOCO && LA12_0 <= 74)) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==UP) ) {
                        alt12=2;
                    }


                    switch (alt12) {
                	case 1 :
                	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:259:53: .
                	    {
                	    matchAny(input); if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop12;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            	        metodoAtual = (SimboloMetodo) ID2.simbolo;
            	        
            	        if (parm == null) {
            	    	
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "enterConstructor"



    // $ANTLR start "exitMethod"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:291:1: exitMethod : METHOD_DECL ;
    public final void exitMethod() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:292:5: ( METHOD_DECL )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:292:9: METHOD_DECL
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_exitMethod544); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            	        if (tipoMetodo.equals("void"))
            			Tradutor.buffer.append("return\n");
            		else if (tipoMetodo.equals("int"))
            			Tradutor.buffer.append("ireturn\n");
            		else
            			Tradutor.buffer.append("areturn\n") ;
            			
            		Tradutor.buffer.append(".end method\n");
            		  
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "exitMethod"



    // $ANTLR start "exitConstructor"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:306:1: exitConstructor : CONSTR_DECL ;
    public final void exitConstructor() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:307:5: ( CONSTR_DECL )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:307:9: CONSTR_DECL
            {
            match(input,CONSTR_DECL,FOLLOW_CONSTR_DECL_in_exitConstructor573); if (state.failed) return ;

            if ( state.backtracking==1 ) {
                    	Tradutor.buffer.append("return\n");		
            		Tradutor.buffer.append(".end method\n");    
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "exitConstructor"



    // $ANTLR start "enterParam"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:314:1: enterParam : ^( PARAM tp= . ID (vet= . )? ) ;
    public final void enterParam() throws RecognitionException, SyntacticException {
        TradutorAST tp=null;
        TradutorAST vet=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:315:5: ( ^( PARAM tp= . ID (vet= . )? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:315:7: ^( PARAM tp= . ID (vet= . )? )
            {
            match(input,PARAM,FOLLOW_PARAM_in_enterParam607); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            tp=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input,ID,FOLLOW_ID_in_enterParam615); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:315:29: (vet= . )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0 >= BLOCO && LA13_0 <= 74)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:315:29: vet= .
                    {
                    vet=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            	        if (vet != null) {
            	        	if (tp.getText().equals("int"))
            			   linha += "[I;";
            		        else if (tp.getText().equals("void"))
            			   throw new SyntacticException("Line: "+tp.getLine()+"the type of a parameter cannot be void");
            		        else
            			   linha += "[L"+tp.getText()+";";
            	        } else {
            	        	
            			if (tp.getText().equals("int"))
            				linha += "I";
            			else if (tp.getText().equals("void"))
            				throw new SyntacticException("Line: "+tp.getLine()+"the type of a parameter cannot be void");
            			else
            				linha += "L"+tp.getText()+";";
            		}
            				
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "enterParam"



    // $ANTLR start "exitParams"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:337:1: exitParams : PARAMS ;
    public final void exitParams() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:338:2: ( PARAMS )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:338:4: PARAMS
            {
            match(input,PARAMS,FOLLOW_PARAMS_in_exitParams652); if (state.failed) return ;

            if ( state.backtracking==1 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "exitParams"


    public static class enterField_return extends TreeRuleReturnScope {
    };


    // $ANTLR start "enterField"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:361:1: enterField : ^( FIELD_DECL (st= . )? tp= . ID (vet= . )? ) ;
    public final Ref.enterField_return enterField() throws RecognitionException, SyntacticException {
        Ref.enterField_return retval = new Ref.enterField_return();
        retval.start = input.LT(1);


        TradutorAST ID3=null;
        TradutorAST st=null;
        TradutorAST tp=null;
        TradutorAST vet=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:362:5: ( ^( FIELD_DECL (st= . )? tp= . ID (vet= . )? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:362:9: ^( FIELD_DECL (st= . )? tp= . ID (vet= . )? )
            {
            match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_enterField673); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:362:25: (st= . )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:362:25: st= .
                    {
                    st=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return retval;

                    }
                    break;

            }


            tp=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return retval;

            ID3=(TradutorAST)match(input,ID,FOLLOW_ID_in_enterField688); if (state.failed) return retval;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:362:44: (vet= . )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0 >= BLOCO && LA15_0 <= 74)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:362:44: vet= .
                    {
                    vet=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;


            if ( state.backtracking==1 ) {
            	        Tradutor.buffer.append(".field ");
            	        
            	        if (st != null)
            	        	Tradutor.buffer.append("static ");
            	        
            	        Tradutor.buffer.append((ID3!=null?ID3.getText():null)+ " ");
            	        
            	        if (tp.getText().equals("int"))
            			Tradutor.buffer.append("I");
            		else if (tp.getText().equals("void"))
            			throw new SyntacticException("Line: "+tp.getLine()+"the type of a field cannot be void");
            		else
            			Tradutor.buffer.append("L"+tp.getText()+";");
            			
            		Tradutor.buffer.append("\n");
            	        
            	        
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enterField"



    // $ANTLR start "listaVarDeclAtribuicao"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:384:1: listaVarDeclAtribuicao : ^( LISTA_VAR_DECL ^( VAR_DECL tp= . ID (vet= . )? ^( EXPR a= . ) ) ( . )* ) ;
    public final void listaVarDeclAtribuicao() throws RecognitionException {
        TradutorAST ID4=null;
        TradutorAST tp=null;
        TradutorAST vet=null;
        TradutorAST a=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:385:5: ( ^( LISTA_VAR_DECL ^( VAR_DECL tp= . ID (vet= . )? ^( EXPR a= . ) ) ( . )* ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:385:9: ^( LISTA_VAR_DECL ^( VAR_DECL tp= . ID (vet= . )? ^( EXPR a= . ) ) ( . )* )
            {
            match(input,LISTA_VAR_DECL,FOLLOW_LISTA_VAR_DECL_in_listaVarDeclAtribuicao732); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,VAR_DECL,FOLLOW_VAR_DECL_in_listaVarDeclAtribuicao735); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            tp=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            ID4=(TradutorAST)match(input,ID,FOLLOW_ID_in_listaVarDeclAtribuicao743); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:385:51: (vet= . )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==EXPR) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==DOWN) ) {
                    int LA16_3 = input.LA(3);

                    if ( ((LA16_3 >= BLOCO && LA16_3 <= 74)) ) {
                        int LA16_4 = input.LA(4);

                        if ( (LA16_4==UP) ) {
                            int LA16_6 = input.LA(5);

                            if ( (LA16_6==EXPR) ) {
                                alt16=1;
                            }
                        }
                        else if ( ((LA16_4 >= BLOCO && LA16_4 <= 74)) ) {
                            alt16=1;
                        }
                    }
                }
                else if ( (LA16_1==EXPR) ) {
                    alt16=1;
                }
            }
            else if ( ((LA16_0 >= BLOCO && LA16_0 <= DOWHILE)||(LA16_0 >= EXTENDS && LA16_0 <= 74)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:385:51: vet= .
                    {
                    vet=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input,EXPR,FOLLOW_EXPR_in_listaVarDeclAtribuicao752); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            a=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            match(input, Token.UP, null); if (state.failed) return ;


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:385:70: ( . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= BLOCO && LA17_0 <= 74)) ) {
                    alt17=1;
                }
                else if ( (LA17_0==UP) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:385:70: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                    
                    	if (!ID4.visited){
                    
            	        	SimboloVariavel simboloVariavel;
            	        	
            	        	if (a.escopo != null){
            	        	
            	        		simboloVariavel = (SimboloVariavel)a.escopo.resolver(a.getText());
            	        		
            	        		loadVar(simboloVariavel);
            	        	
            	        	} else if (isInteger(a.getText()))
            	        	
            	        		loadConst(a.getText());
            	        		
            	        	
            	        	simboloVariavel = (SimboloVariavel) ID4.simbolo;
            	        	
            		        storeVar(simboloVariavel);
            		        
            		        ID4.visited = true;
            	        
            	        }
            	        	        
            	        
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listaVarDeclAtribuicao"



    // $ANTLR start "exitAtribuicao"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:415:1: exitAtribuicao : ^(at= '=' a= . b= . ) ;
    public final void exitAtribuicao() throws RecognitionException {
        TradutorAST at=null;
        TradutorAST a=null;
        TradutorAST b=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:416:2: ( ^(at= '=' a= . b= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:416:4: ^(at= '=' a= . b= . )
            {
            at=(TradutorAST)match(input,53,FOLLOW_53_in_exitAtribuicao797); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            a=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            b=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            	
            		if (!(a.hasAncestor(VECT_EXPR) || a.hasAncestor(METHOD_CALL)) && !at.visited){
            		
            			if (a.getText().equals(".")){
            		
            				TradutorAST t = (TradutorAST)a.getChildren().get(1);
            				
            				if (t.escopo != null){
            				
            					SimboloClasse sc = (SimboloClasse)tabelaSimbolos.global.resolver(nomeClasseAttrCampo);
            				
            					SimboloVariavel simboloVariavel = sc.resolverCampo(t.getText());
            					
            					String instr = "";
            					
            					if (estaticoAttrCampo)
            						instr += "putstatic ";
            					else
            						instr += "putfield ";
            						
            					estaticoAttrCampo = false;
            					
            					instr += nomeClasseAttrCampo+"/" + ((TradutorAST)a.getChildren().get(1)).getText() + " ";
            					
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
            					
            				if (b.getText().equals("null"))
            					Tradutor.buffer.append("aconst_null\n");
            				else if (b.escopo != null){			
            					simboloVariavel = (SimboloVariavel) b.escopo.resolver(b.getText());
            					loadVar(simboloVariavel);
            				} else if (isInteger(b.getText())) 
            					loadConst(b.getText());
            					
            				if (a.escopo != null){
            					simboloVariavel = (SimboloVariavel)a.escopo.resolver(a.getText());
            					storeVar(simboloVariavel);
            				}
            				
            				at.visited = true;
            			
            			}
            		
            		}
            		
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "exitAtribuicao"



    // $ANTLR start "addMult"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:482:1: addMult : ^( (op= '+' |op= '*' ) a= . b= . ) ;
    public final void addMult() throws RecognitionException {
        TradutorAST op=null;
        TradutorAST a=null;
        TradutorAST b=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:483:2: ( ^( (op= '+' |op= '*' ) a= . b= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:483:10: ^( (op= '+' |op= '*' ) a= . b= . )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:483:12: (op= '+' |op= '*' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            else if ( (LA18_0==42) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:483:13: op= '+'
                    {
                    op=(TradutorAST)match(input,43,FOLLOW_43_in_addMult837); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:483:24: op= '*'
                    {
                    op=(TradutorAST)match(input,42,FOLLOW_42_in_addMult845); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.DOWN, null); if (state.failed) return ;
            a=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            b=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            		
            			if (!(op.hasAncestor(VECT_EXPR) || op.hasAncestor(METHOD_CALL)) && !op.visited){
            			
            				SimboloVariavel simboloVariavel;
            				
            				if (a.escopo != null){
            					simboloVariavel = (SimboloVariavel) a.escopo.resolver(a.getText());
            					if (simboloVariavel != null)
            						loadVar(simboloVariavel);
            				} else if (isInteger(a.getText()))
            					loadConst(a.getText());
            				
            				if (b.escopo != null){
            					simboloVariavel = (SimboloVariavel) b.escopo.resolver(b.getText());
            					if (simboloVariavel != null)
            						loadVar(simboloVariavel);
            				} else if (isInteger(b.getText()))
            					loadConst(b.getText());
            				
            				if (op.getText().equals("+"))
            					Tradutor.buffer.append("iadd\n");
            				else
            					Tradutor.buffer.append("imul\n");
            					
            			       Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");
            			       
            			       op.visited = true;

            				
            			}
            			
            				
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "addMult"



    // $ANTLR start "subDivEnter"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:520:1: subDivEnter : ^( (op= '-' |op= '/' |op= '%' ) a= . b= . ) ;
    public final void subDivEnter() throws RecognitionException {
        TradutorAST op=null;
        TradutorAST a=null;
        TradutorAST b=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:521:2: ( ^( (op= '-' |op= '/' |op= '%' ) a= . b= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:521:4: ^( (op= '-' |op= '/' |op= '%' ) a= . b= . )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:521:6: (op= '-' |op= '/' |op= '%' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt19=1;
                }
                break;
            case 49:
                {
                alt19=2;
                }
                break;
            case 38:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:521:7: op= '-'
                    {
                    op=(TradutorAST)match(input,46,FOLLOW_46_in_subDivEnter881); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:521:18: op= '/'
                    {
                    op=(TradutorAST)match(input,49,FOLLOW_49_in_subDivEnter889); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:521:29: op= '%'
                    {
                    op=(TradutorAST)match(input,38,FOLLOW_38_in_subDivEnter897); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.DOWN, null); if (state.failed) return ;
            a=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            b=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            		
            			if (!(op.hasAncestor(VECT_EXPR) || op.hasAncestor(METHOD_CALL)) && !op.visited){
            				
            			        SimboloVariavel simboloVariavel;
            				
            				if (a.escopo != null){
            					simboloVariavel = (SimboloVariavel) a.escopo.resolver(a.getText());
            					if (simboloVariavel != null)
            						loadVar(simboloVariavel);
            				} else if (isInteger(a.getText())){
            					loadConst(a.getText());
            				} else {
            					percorrerSubArvore(a);
            					a.visited = true;
            				}
            					
            			       Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");
            			       
            			       if (b.escopo != null){
            			
            					simboloVariavel = (SimboloVariavel)b.escopo.resolver(b.getText());
            					
            					loadVar(simboloVariavel);
            					
            					Tradutor.tipoAtual = simboloVariavel.getTipo();
            				
            				} else if (isInteger(b.getText())){
            					
            					loadConst(b.getText());
            					
            					Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");
            				
            				} else {
            					percorrerSubArvore(b);
            					b.visited = true;
            				}
            					
            				if (op.getText().equals("-"))
            					Tradutor.buffer.append("isub\n");
            				else if (op.getText().equals("/"))
            					Tradutor.buffer.append("idiv\n");
            				else
            					Tradutor.buffer.append("irem\n");
            					
            				Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");


            			       op.visited = true;
            				
            			}
            			
            					
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "subDivEnter"



    // $ANTLR start "enterAtribuicao"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:578:1: enterAtribuicao : ^(at= '=' a= . b= . ) ;
    public final void enterAtribuicao() throws RecognitionException {
        TradutorAST at=null;
        TradutorAST a=null;
        TradutorAST b=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:579:2: ( ^(at= '=' a= . b= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:579:4: ^(at= '=' a= . b= . )
            {
            at=(TradutorAST)match(input,53,FOLLOW_53_in_enterAtribuicao932); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            a=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            b=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            	
            		SimboloVariavel simboloVariavel;
            		SimboloClasse simboloClasse;
            	
            		if (b.getText().equals("new")){
            		
            			TradutorAST t = (TradutorAST)b.getChildren().get(0);
            		
            			if (t.token.getType() == VECT_EXPR){
            			
            				TradutorAST expr = (TradutorAST) t.getChildren().get(1);
            			
            				if (a.getText().equals(".")){
            				
            					if (((TradutorAST)a.getChildren().get(0)).getText().equals(".")){
            						percorrerSubArvore((TradutorAST)a.getChildren().get(0));
            						((TradutorAST)a.getChildren().get(0)).visited = true;
            						nomeClasseAttrCampo = Tradutor.tipoAtual.getNome();
            					} else if (((TradutorAST)a.getChildren().get(0)).escopo != null){				
            						simboloVariavel = (SimboloVariavel)((TradutorAST)a.getChildren().get(0)).escopo.resolver(((TradutorAST)a.getChildren().get(0)).getText());
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
            					
            					TradutorAST p = (TradutorAST)a.getChildren().get(1);
            					
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
            				
            					a.visited = true;
            				
            				} else if (((TradutorAST)a).escopo != null){
            				
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
            					
            					simboloVariavel = (SimboloVariavel) ((TradutorAST)a).escopo.resolver(a.getText());
            					
            					storeVar(simboloVariavel);
            					
            					Tradutor.tipoAtual = simboloVariavel.getTipo();
            				
            				}
            			
            			} else {
            			
            				String nomeNovaClasse;
            			
            				if (a.getText().equals(".")) {
            				
            					if (((TradutorAST)a.getChildren().get(0)).getText().equals(".")) {
            					
            						percorrerSubArvore((TradutorAST)a.getChildren().get(0));
            						
            						((TradutorAST)a.getChildren().get(0)).visited = true;
            						
            						nomeClasseAttrCampo = Tradutor.tipoAtual.getNome(); 
            						
            					
            					} else if (((TradutorAST)a.getChildren().get(0)).escopo != null){
            					
            						simboloVariavel = (SimboloVariavel)((TradutorAST)a.getChildren().get(0)).escopo.resolver(((TradutorAST)a.getChildren().get(0)).getText());
            						
            						loadVar(simboloVariavel);
            						
            						Tradutor.tipoAtual = simboloVariavel.getTipo();
            						
            						nomeClasseAttrCampo = Tradutor.tipoAtual.getNome();
            					
            					}
            					
            					nomeNovaClasse = ((TradutorAST)t.getChildren().get(0)).getText();
            					
            					Tradutor.buffer.append("new "+nomeNovaClasse+"\n");
            					
            					TradutorAST p = (TradutorAST)a.getChildren().get(1);
            					
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
            					
            					if (((TradutorAST)a.getChildren().get(0)).getText().equals(".")) {
            					
            						percorrerSubArvore((TradutorAST)a.getChildren().get(0));
            						
            						((TradutorAST)a.getChildren().get(0)).visited = true;
            						
            						nomeClasseAttrCampo = Tradutor.tipoAtual.getNome(); 
            						
            					
            					} else if (((TradutorAST)a.getChildren().get(0)).escopo != null){
            					
            						simboloVariavel = (SimboloVariavel)((TradutorAST)a.getChildren().get(0)).escopo.resolver(((TradutorAST)a.getChildren().get(0)).getText());
            						
            						loadVar(simboloVariavel);
            						
            						Tradutor.tipoAtual = simboloVariavel.getTipo();
            						
            						nomeClasseAttrCampo = Tradutor.tipoAtual.getNome();
            					
            					}
            					
            					TradutorAST g = (TradutorAST)a.getChildren().get(1);
            										
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
            					
            					a.visited = true;
            				
            				} else if (a.escopo != null) {
            				
            					nomeNovaClasse = ((TradutorAST)t.getChildren().get(0)).getText();
            					
            					Tradutor.buffer.append("new "+nomeNovaClasse+"\n");
            					
            					simboloVariavel = (SimboloVariavel) a.escopo.resolver(a.getText());
            					
            					storeVar(simboloVariavel);
            					
            					loadVar(simboloVariavel);
            					
            					Tradutor.tipoAtual = simboloVariavel.getTipo();
            				
            				}
            			
            			}
            			
            			t.visited = true;
            			
            			at.visited = true;
            		
            		} else if (a.getText().equals(".")){
            		
            				TradutorAST t = (TradutorAST)a.getChildren().get(0);
            				if (t.escopo != null){
            					simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(t.getText());
            					if (simboloClasse != null){
            						nomeClasseAttrCampo = simboloClasse.getNome();
            						estaticoAttrCampo = true; 
            					} else {
            						simboloVariavel = (SimboloVariavel)t.escopo.resolver(t.getText());
            						loadVar(simboloVariavel);
            						a.visited = true;
            						nomeClasseAttrCampo = simboloVariavel.getTipo().getNome();
            					}
            				} else {
            					percorrerSubArvore(t);
            					t.visited = true;
            					nomeClasseAttrCampo = Tradutor.tipoAtual.getNome();
            				}
            				
            				if (b.escopo != null){
            				
            					simboloVariavel = (SimboloVariavel)b.escopo.resolver(b.getText());
            					
            					loadVar(simboloVariavel);
            					
            					Tradutor.tipoAtual = simboloVariavel.getTipo();
            				
            				} else if (isInteger(b.getText())){
            					
            					loadConst(b.getText());
            					
            					Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");
            				
            				}
            				
            			  //at.visited = true;
            		
            			}
            		
            		
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "enterAtribuicao"



    // $ANTLR start "enterAttrVetor"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:819:1: enterAttrVetor : ^( '=' ^( VECT_EXPR a= . ^( EXPR b= . ) ) c= . ) ;
    public final void enterAttrVetor() throws RecognitionException {
        TradutorAST a=null;
        TradutorAST b=null;
        TradutorAST c=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:820:2: ( ^( '=' ^( VECT_EXPR a= . ^( EXPR b= . ) ) c= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:820:4: ^( '=' ^( VECT_EXPR a= . ^( EXPR b= . ) ) c= . )
            {
            match(input,53,FOLLOW_53_in_enterAttrVetor967); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,VECT_EXPR,FOLLOW_VECT_EXPR_in_enterAttrVetor970); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            a=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input,EXPR,FOLLOW_EXPR_in_enterAttrVetor979); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            b=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            match(input, Token.UP, null); if (state.failed) return ;


            c=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            	
            		CommonTree tree;
            		SimboloVariavel simboloVariavel;
            				
            		if (a.escopo != null) {
            			simboloVariavel = (SimboloVariavel) a.escopo.resolver(a.getText());
            			loadVar(simboloVariavel);						
            		} else if (a.getText().equals(".")){
            			percorrerSubArvore(a);	
            			a.visited = true;
            		}
            				
            		if (b.escopo != null) {
            			simboloVariavel = (SimboloVariavel) b.escopo.resolver(b.getText());
            			loadVar(simboloVariavel);	
            		} else if (isInteger(b.getText()))
            			loadConst(b.getText());
            		else{				
            			percorrerSubArvore(b);
            			b.visited = true;
            		}
            		
            		if (c.escopo != null){
            			
            			simboloVariavel = (SimboloVariavel)c.escopo.resolver(c.getText());
            				
            			loadVar(simboloVariavel);
            				
            			Tradutor.tipoAtual = simboloVariavel.getTipo();
            			
            		} else if (isInteger(c.getText())){
            				
            			loadConst(c.getText());
            				
            			Tradutor.tipoAtual = new SimboloTipoPrimitivo("int");
            			
            		}
            		
            		a.visited = true;
            		
            		
            		
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "enterAttrVetor"



    // $ANTLR start "enterNewObjectListaVarDeclAtribuicao"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:874:1: enterNewObjectListaVarDeclAtribuicao : ^( LISTA_VAR_DECL ^( VAR_DECL tp= . ID (vet= . )? ^( EXPR a= . ) ) ( . )* ) ;
    public final void enterNewObjectListaVarDeclAtribuicao() throws RecognitionException {
        TradutorAST ID5=null;
        TradutorAST tp=null;
        TradutorAST vet=null;
        TradutorAST a=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:875:2: ( ^( LISTA_VAR_DECL ^( VAR_DECL tp= . ID (vet= . )? ^( EXPR a= . ) ) ( . )* ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:875:4: ^( LISTA_VAR_DECL ^( VAR_DECL tp= . ID (vet= . )? ^( EXPR a= . ) ) ( . )* )
            {
            match(input,LISTA_VAR_DECL,FOLLOW_LISTA_VAR_DECL_in_enterNewObjectListaVarDeclAtribuicao1014); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,VAR_DECL,FOLLOW_VAR_DECL_in_enterNewObjectListaVarDeclAtribuicao1017); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            tp=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            ID5=(TradutorAST)match(input,ID,FOLLOW_ID_in_enterNewObjectListaVarDeclAtribuicao1025); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:875:46: (vet= . )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EXPR) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==DOWN) ) {
                    int LA20_3 = input.LA(3);

                    if ( ((LA20_3 >= BLOCO && LA20_3 <= 74)) ) {
                        int LA20_4 = input.LA(4);

                        if ( (LA20_4==UP) ) {
                            int LA20_6 = input.LA(5);

                            if ( (LA20_6==EXPR) ) {
                                alt20=1;
                            }
                        }
                        else if ( ((LA20_4 >= BLOCO && LA20_4 <= 74)) ) {
                            alt20=1;
                        }
                    }
                }
                else if ( (LA20_1==EXPR) ) {
                    alt20=1;
                }
            }
            else if ( ((LA20_0 >= BLOCO && LA20_0 <= DOWHILE)||(LA20_0 >= EXTENDS && LA20_0 <= 74)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:875:46: vet= .
                    {
                    vet=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input,EXPR,FOLLOW_EXPR_in_enterNewObjectListaVarDeclAtribuicao1034); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            a=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            match(input, Token.UP, null); if (state.failed) return ;


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:875:65: ( . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= BLOCO && LA21_0 <= 74)) ) {
                    alt21=1;
                }
                else if ( (LA21_0==UP) ) {
                    alt21=2;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:875:65: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            		if (!ID5.visited && a.getText().equals("new")){
            		
            			SimboloVariavel simboloVariavel;
            		
            			TradutorAST t = (TradutorAST)a.getChildren().get(0);
            					
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
            					
            				simboloVariavel = (SimboloVariavel) ID5.escopo.resolver(ID5.getText());
            					
            				storeVar(simboloVariavel);
            				
            				Tradutor.tipoAtual = simboloVariavel.getTipo();
            				
            			} else {
            			
            				Tradutor.buffer.append("new "+tp.getText()+"\n");
            			
            				simboloVariavel = (SimboloVariavel)ID5.escopo.resolver((ID5!=null?ID5.getText():null));
            			
            				storeVar(simboloVariavel);
            				
            				loadVar(simboloVariavel);
            				
            				Tradutor.tipoAtual = simboloVariavel.getTipo();
            					
            			}
            			
            			ID5.visited = true;
            			
            			t.visited = true;
            				
            		
            		}
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "enterNewObjectListaVarDeclAtribuicao"



    // $ANTLR start "exitAttrVetor"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:930:1: exitAttrVetor : ^( '=' ^( VECT_EXPR . ^( EXPR . ) ) . ) ;
    public final void exitAttrVetor() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:931:2: ( ^( '=' ^( VECT_EXPR . ^( EXPR . ) ) . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:931:4: ^( '=' ^( VECT_EXPR . ^( EXPR . ) ) . )
            {
            match(input,53,FOLLOW_53_in_exitAttrVetor1062); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,VECT_EXPR,FOLLOW_VECT_EXPR_in_exitAttrVetor1065); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input,EXPR,FOLLOW_EXPR_in_exitAttrVetor1070); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            	
            		Tradutor.buffer.append("iastore\n");
            		
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "exitAttrVetor"



    // $ANTLR start "acessoCampo"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:971:1: acessoCampo : ^(p= '.' a= . b= . ) ;
    public final void acessoCampo() throws RecognitionException {
        TradutorAST p=null;
        TradutorAST a=null;
        TradutorAST b=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:972:2: ( ^(p= '.' a= . b= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:972:4: ^(p= '.' a= . b= . )
            {
            p=(TradutorAST)match(input,48,FOLLOW_48_in_acessoCampo1102); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            a=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            b=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            		
            			if (!(a.hasAncestor(VECT_EXPR) || a.hasAncestor(METHOD_CALL)) && !p.visited){
            		
            				/*SimboloClasse simboloClasse;
            				String instrucao = "";
            				
            				if (a.getText().equals(".")){
            	            			simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(Tradutor.tipoAtual.getNome());
            					instrucao += "getfield "+simboloClasse.getNome()+"/"+b.getText();
            					SimboloVariavel simboloVariavel = simboloClasse.resolverCampo(b.getText());
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
            				} else if (b.getText().equals(".")){
            	            			simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(Tradutor.tipoAtual.getNome());
            					instrucao += "getfield "+simboloClasse.getNome()+"/"+a.getText();
            					SimboloVariavel simboloVariavel = simboloClasse.resolverCampo(a.getText());
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
            				} else if (a.escopo != null && b.escopo != null){
            					simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(a.getText());
            					if (simboloClasse != null){
            						instrucao += "getstatic "+simboloClasse.getNome()+"/"+b.getText();
            						SimboloVariavel simboloVariavel = simboloClasse.resolverCampo(b.getText());
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
            						loadVar((SimboloVariavel)a.escopo.resolver(a.getText()));
            						simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(a.escopo.resolver(a.getText()).getTipo().getNome());
            						instrucao += "getfield "+simboloClasse.getNome()+"/"+b.getText();
            						SimboloVariavel simboloVariavel = simboloClasse.resolverCampo(b.getText());
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
            					
            					if (a.escopo != null){
            					
            						simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(a.getText());
            						
            						if (simboloClasse != null){
            						
            							Tradutor.buffer.append("getstatic "+simboloClasse.getNome()+"/"+b.getText()+" ");
            							
            							simboloVariavel = (SimboloVariavel) simboloClasse.resolverCampo(b.getText());
            							
            							if (simboloVariavel.getTipo().getNome().equals("int"))
            								Tradutor.buffer.append("I\n");
            							else if (simboloVariavel.getTipo().getNome().equals("int[]"))
            								Tradutor.buffer.append("[I;\n");
            							else
            								Tradutor.buffer.append("L"+simboloVariavel.getTipo().getNome()+";\n");
            								
            							Tradutor.tipoAtual = simboloVariavel.getTipo();
            							
            							estatico = true;
            						
            						} else {
            					
            							simboloVariavel = (SimboloVariavel) a.escopo.resolver(a.getText());
            							
            							loadVar(simboloVariavel);
            							
            							Tradutor.tipoAtual = simboloVariavel.getTipo();
            						
            						}
            					
            					}
            					
            					if (b.escopo != null && !estatico){
            					
            						simboloClasse = (SimboloClasse) tabelaSimbolos.global.resolver(Tradutor.tipoAtual.getNome());
            						
            						simboloVariavel = (SimboloVariavel)simboloClasse.resolverCampo(b.getText());
            						
            						Tradutor.buffer.append("getfield "+simboloClasse.getNome()+"/"+b.getText()+" ");
            						
            						if (simboloVariavel.getTipo().getNome().equals("int"))
            							Tradutor.buffer.append("I\n");
            						else if (simboloVariavel.getTipo().getNome().equals("int[]"))
            							Tradutor.buffer.append("[I;\n");
            						else
            							Tradutor.buffer.append("L"+simboloVariavel.getTipo().getNome()+";\n");
            							
            						Tradutor.tipoAtual = simboloVariavel.getTipo();
            					
            					}
            					
            					p.visited = true;				
            					
            				}
            				
            				//Tradutor.buffer.append(instrucao+"\n");
            						
            			
            			}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "acessoCampo"



    // $ANTLR start "vetorExpr"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1108:1: vetorExpr : ^( VECT_EXPR a= . ^( EXPR b= . ) ) ;
    public final void vetorExpr() throws RecognitionException {
        TradutorAST VECT_EXPR6=null;
        TradutorAST a=null;
        TradutorAST b=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1109:2: ( ^( VECT_EXPR a= . ^( EXPR b= . ) ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1109:4: ^( VECT_EXPR a= . ^( EXPR b= . ) )
            {
            VECT_EXPR6=(TradutorAST)match(input,VECT_EXPR,FOLLOW_VECT_EXPR_in_vetorExpr1137); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            a=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input,EXPR,FOLLOW_EXPR_in_vetorExpr1146); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            b=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            		
            		if (!(VECT_EXPR6.hasAncestor(VECT_EXPR) || VECT_EXPR6.hasAncestor(METHOD_CALL)) && !VECT_EXPR6.visited){
            		
            			if (!a.visited) {
            			
            				CommonTree tree;
            				SimboloVariavel simboloVariavel;
            				
            				if (a.escopo != null) {
            					simboloVariavel = (SimboloVariavel) a.escopo.resolver(a.getText());
            					loadVar(simboloVariavel);						
            				} else if (a.getText().equals(".")){
            					percorrerSubArvore(a);	
            					a.visited = true;
            				}
            				
            				if (b.escopo != null) {
            					simboloVariavel = (SimboloVariavel) b.escopo.resolver(b.getText());
            					loadVar(simboloVariavel);	
            				} else if (isInteger(b.getText()))
            					loadConst(b.getText());
            				else{				
            				        percorrerSubArvore(b);
            				        b.visited = true;
            				}
            				
            				Tradutor.buffer.append("iaload\n");
            				
            				Tradutor.tipoAtual = new SimboloTipoReferencia("int");
            				
            				a.visited = true;
            				
            			}
            			
            		}
            		
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vetorExpr"



    // $ANTLR start "chamadaMetodo"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1150:1: chamadaMetodo : ^( METHOD_CALL a= . ^( LISTA_EXPR (exprs+= . )+ ) ) ;
    public final void chamadaMetodo() throws RecognitionException {
        TradutorAST METHOD_CALL7=null;
        TradutorAST a=null;
        TradutorAST exprs=null;
        List list_exprs=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1151:2: ( ^( METHOD_CALL a= . ^( LISTA_EXPR (exprs+= . )+ ) ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1151:4: ^( METHOD_CALL a= . ^( LISTA_EXPR (exprs+= . )+ ) )
            {
            METHOD_CALL7=(TradutorAST)match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_chamadaMetodo1171); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            a=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input,LISTA_EXPR,FOLLOW_LISTA_EXPR_in_chamadaMetodo1180); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1151:43: (exprs+= . )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0 >= BLOCO && LA22_0 <= 74)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1151:43: exprs+= .
            	    {
            	    exprs=(TradutorAST)input.LT(1);

            	    matchAny(input); if (state.failed) return ;
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs);


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            		
            		if (!(METHOD_CALL7.hasAncestor(VECT_EXPR) || METHOD_CALL7.hasAncestor(METHOD_CALL)) && !a.visited){
            		
            			SimboloVariavel simboloVariavel;
            			SimboloMetodo simboloMetodo;
            			SimboloClasse simboloClasse = null;
            			String nomeMetodo;
            			boolean chamadaEstatica = false;
            			boolean metodoClasseAtual = false;
            			
            			if (a.getText().equals(".")){
            				nomeMetodo = ((Tree)a.getChildren().get(1)).getText();
            				if (((Tree)a.getChildren().get(0)).getText().equals(".")){
            					percorrerSubArvore((TradutorAST)a.getChildren().get(0));
            					((TradutorAST)a.getChildren().get(0)).visited = true;
            					simboloClasse = (SimboloClasse)Tradutor.tipoAtual;
            				}else {
            					Simbolo s = ((TradutorAST)a.getChildren().get(0)).escopo.resolver(((Tree)a.getChildren().get(0)).getText());
            					if (s instanceof SimboloVariavel){
            						simboloVariavel = (SimboloVariavel)s;
            						loadVar(simboloVariavel);
            						simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(simboloVariavel.getTipo().getNome());
            					} else if (s instanceof SimboloClasse){
            						simboloClasse = (SimboloClasse)s;
            						chamadaEstatica = true;
            					}

            				}
            			} else if (METHOD_CALL7.getParent().getText().equals("new")) {
            				simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(a.getText());
            				nomeMetodo = a.getText();
            			} else {
            				metodoClasseAtual = true;
            				simboloClasse = classeAtual;
            				nomeMetodo = a.getText();
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
            			
            			a.visited = true;
            			
            		
            		}
            	
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "chamadaMetodo"



    // $ANTLR start "chamadaMetodoSemParams"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1296:1: chamadaMetodoSemParams : ^( METHOD_CALL a= . ) ;
    public final void chamadaMetodoSemParams() throws RecognitionException {
        TradutorAST METHOD_CALL8=null;
        TradutorAST a=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1297:2: ( ^( METHOD_CALL a= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1297:4: ^( METHOD_CALL a= . )
            {
            METHOD_CALL8=(TradutorAST)match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_chamadaMetodoSemParams1204); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            a=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            		
            		if (!(METHOD_CALL8.hasAncestor(VECT_EXPR) || METHOD_CALL8.hasAncestor(METHOD_CALL)) && !a.visited){
            		
            			SimboloVariavel simboloVariavel;
            			SimboloMetodo simboloMetodo;
            			SimboloClasse simboloClasse = null;
            			String nomeMetodo;
            			boolean chamadaEstatica = false;
            			boolean metodoClasseAtual = false;
            			
            			if (a.getText().equals(".")){
            				nomeMetodo = ((Tree)a.getChildren().get(1)).getText();
            				if (((Tree)a.getChildren().get(0)).getText().equals(".")){
            					percorrerSubArvore((TradutorAST)a.getChildren().get(0));
            					((TradutorAST)a.getChildren().get(0)).visited = true;
            					simboloClasse = (SimboloClasse)Tradutor.tipoAtual;
            				}else {
            					Simbolo s = ((TradutorAST)a.getChildren().get(0)).escopo.resolver(((Tree)a.getChildren().get(0)).getText());
            					if (s instanceof SimboloVariavel){
            						simboloVariavel = (SimboloVariavel)s;
            						loadVar(simboloVariavel);
            						simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(simboloVariavel.getTipo().getNome());
            					} else if (s instanceof SimboloClasse){
            						simboloClasse = (SimboloClasse)s;
            						chamadaEstatica = true;
            					}
            				}
            				
            			} else if (METHOD_CALL8.getParent().getText().equals("new")) {
            				simboloClasse = (SimboloClasse)tabelaSimbolos.global.resolver(a.getText());
            				nomeMetodo = a.getText();
            			} else {
            				metodoClasseAtual = true;
            				simboloClasse = classeAtual;
            				nomeMetodo = a.getText();
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
            			
            			a.visited = true;
            		
            		}
            	
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "chamadaMetodoSemParams"



    // $ANTLR start "enterIfComBloco"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1394:1: enterIfComBloco : ^( IF ^( EXPR a= . ) ^( BLOCO ( . )* ) (b= . )? ( . )? ) ;
    public final void enterIfComBloco() throws RecognitionException {
        TradutorAST BLOCO9=null;
        TradutorAST a=null;
        TradutorAST b=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1395:2: ( ^( IF ^( EXPR a= . ) ^( BLOCO ( . )* ) (b= . )? ( . )? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1395:4: ^( IF ^( EXPR a= . ) ^( BLOCO ( . )* ) (b= . )? ( . )? )
            {
            match(input,IF,FOLLOW_IF_in_enterIfComBloco1226); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,EXPR,FOLLOW_EXPR_in_enterIfComBloco1229); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            a=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            BLOCO9=(TradutorAST)match(input,BLOCO,FOLLOW_BLOCO_in_enterIfComBloco1239); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1395:31: ( . )*
                loop23:
                do {
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0 >= BLOCO && LA23_0 <= 74)) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==UP) ) {
                        alt23=2;
                    }


                    switch (alt23) {
                	case 1 :
                	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1395:31: .
                	    {
                	    matchAny(input); if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop23;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1395:37: (b= . )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0 >= BLOCO && LA24_0 <= 74)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1395:37: b= .
                    {
                    b=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1395:42: ( . )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0 >= BLOCO && LA25_0 <= 74)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1395:42: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            	
            		percorrerSubArvore(a);
            		
            		visitarSubArvore(a);
            		
            		Tradutor.buffer.append(" L"+(++Tradutor.label)+"\n");
            		
            		Tradutor.buffer.append("goto L"+(Tradutor.label + 1)+"\n");
            		
            		Tradutor.buffer.append("L"+Tradutor.label+": ");
            		
            		percorrerSubArvore(BLOCO9);
            		
            		visitarSubArvore(BLOCO9);
            		
            		if (b != null)
            			Tradutor.buffer.append("goto L"+(Tradutor.label + 2)+"\n");
            		
            		Tradutor.buffer.append("L"+(++Tradutor.label)+": ");
            		
            		if (b != null) {
            		
            			TradutorAST els = (TradutorAST)b.getChild(0);
            			
            			percorrerSubArvore(els);
            		
            			visitarSubArvore(els);
            			
            			Tradutor.buffer.append("L"+(++Tradutor.label)+": ");
            		
            		}
            			
            	
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "enterIfComBloco"



    // $ANTLR start "enterIfSemBloco"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1433:1: enterIfSemBloco : ^( IF ^( EXPR a= . ) ^( EXPR b= . ) . (c= . )? ( . )? ) ;
    public final void enterIfSemBloco() throws RecognitionException {
        TradutorAST a=null;
        TradutorAST b=null;
        TradutorAST c=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1434:2: ( ^( IF ^( EXPR a= . ) ^( EXPR b= . ) . (c= . )? ( . )? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1434:4: ^( IF ^( EXPR a= . ) ^( EXPR b= . ) . (c= . )? ( . )? )
            {
            match(input,IF,FOLLOW_IF_in_enterIfSemBloco1270); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,EXPR,FOLLOW_EXPR_in_enterIfSemBloco1273); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            a=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            match(input,EXPR,FOLLOW_EXPR_in_enterIfSemBloco1283); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            b=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1434:41: (c= . )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0 >= BLOCO && LA26_0 <= 74)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1434:41: c= .
                    {
                    c=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1434:46: ( . )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0 >= BLOCO && LA27_0 <= 74)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Ref.g:1434:46: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            		percorrerSubArvore(a);
            		
            		visitarSubArvore(a);
            		
            		Tradutor.buffer.append(" L"+(++Tradutor.label)+"\n");
            		
            		Tradutor.buffer.append("goto L"+(Tradutor.label + 1)+"\n");
            		
            		Tradutor.buffer.append("L"+Tradutor.label+": ");
            		
            		percorrerSubArvore(b);
            		
            		visitarSubArvore(b);
            		
            		if (c != null)
            			Tradutor.buffer.append("goto L"+(Tradutor.label + 2)+"\n");
            		
            		Tradutor.buffer.append("L"+(++Tradutor.label)+": ");
            		
            		if (c != null) {
            		
            			TradutorAST els = (TradutorAST)c.getChild(0);
            			
            			percorrerSubArvore(els);
            		
            			visitarSubArvore(els);
            			
            			Tradutor.buffer.append("L"+(++Tradutor.label)+": ");
            		
            		}
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "enterIfSemBloco"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA1_eotS =
        "\33\uffff";
    static final String DFA1_eofS =
        "\33\uffff";
    static final String DFA1_minS =
        "\1\5\6\uffff\1\2\1\uffff\1\2\1\4\1\11\1\2\1\uffff\1\2\2\4\2\2\1"+
        "\uffff\1\2\2\4\1\3\2\uffff\1\3";
    static final String DFA1_maxS =
        "\1\65\6\uffff\1\2\1\uffff\1\2\1\112\1\11\1\112\1\uffff\1\2\3\112"+
        "\1\3\1\uffff\2\112\1\11\1\112\2\uffff\1\3";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\4\uffff\1\7\5\uffff"+
        "\1\10\4\uffff\1\12\1\13\1\uffff";
    static final String DFA1_specialS =
        "\33\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\uffff\1\3\3\uffff\1\5\2\uffff\1\11\5\uffff\1\10\1\uffff"+
            "\1\2\1\uffff\1\4\15\uffff\1\6\7\uffff\1\6\2\uffff\1\6\3\uffff"+
            "\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12",
            "",
            "\1\13",
            "\36\15\1\14\50\15",
            "\1\16",
            "\1\17\1\uffff\107\15",
            "",
            "\1\20",
            "\107\21",
            "\107\22",
            "\1\23\6\15\1\24\101\15",
            "\1\25\1\26",
            "",
            "\1\23\110\15",
            "\107\27",
            "\1\30\4\uffff\1\31",
            "\1\32\107\27",
            "",
            "",
            "\1\26"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "143:1: topdown : ( enterClass | enterMethod | enterConstructor | enterParam | enterField | subDivEnter | enterAtribuicao | enterAttrVetor | enterNewObjectListaVarDeclAtribuicao | enterIfComBloco | enterIfSemBloco );";
        }
    }
    static final String DFA2_eotS =
        "\31\uffff";
    static final String DFA2_eofS =
        "\31\uffff";
    static final String DFA2_minS =
        "\1\5\5\uffff\1\2\3\uffff\1\2\2\4\1\2\1\uffff\1\2\2\4\2\uffff\1\2"+
        "\1\3\1\uffff\1\2\1\3";
    static final String DFA2_maxS =
        "\1\65\5\uffff\1\2\3\uffff\1\2\3\112\1\uffff\1\23\2\112\2\uffff\2"+
        "\112\1\uffff\1\112\1\23";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\11\4\uffff\1\6\3"+
        "\uffff\1\12\1\13\2\uffff\1\14\2\uffff";
    static final String DFA2_specialS =
        "\31\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\uffff\1\3\14\uffff\1\5\1\12\1\2\2\uffff\1\4\10\uffff"+
            "\1\11\7\uffff\2\7\4\uffff\1\10\4\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "",
            "",
            "\1\14",
            "\36\16\1\15\50\16",
            "\107\17",
            "\1\20\1\uffff\107\16",
            "",
            "\1\21\1\23\17\uffff\1\22",
            "\107\24",
            "\107\25",
            "",
            "",
            "\1\26\6\16\1\27\101\16",
            "\1\30\107\25",
            "",
            "\1\26\110\16",
            "\1\23\17\uffff\1\22"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "162:1: bottomup : ( exitClass | exitMethod | exitConstructor | exitParams | listaVarDeclAtribuicao | exitAtribuicao | addMult | acessoCampo | vetorExpr | chamadaMetodo | chamadaMetodoSemParams | exitAttrVetor );";
        }
    }
    static final String DFA5_eotS =
        "\11\uffff";
    static final String DFA5_eofS =
        "\11\uffff";
    static final String DFA5_minS =
        "\1\4\1\2\1\4\1\2\1\uffff\1\3\2\uffff\1\4";
    static final String DFA5_maxS =
        "\4\112\1\uffff\1\112\2\uffff\1\112";
    static final String DFA5_acceptS =
        "\4\uffff\1\1\1\uffff\1\1\1\2\1\uffff";
    static final String DFA5_specialS =
        "\11\uffff}>";
    static final String[] DFA5_transitionS = {
            "\107\1",
            "\1\2\1\uffff\11\4\1\3\75\4",
            "\107\5",
            "\1\4\1\uffff\11\7\1\6\75\7",
            "",
            "\1\10\107\5",
            "",
            "",
            "\11\4\1\3\75\4"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "211:25: (st= . )?";
        }
    }
    static final String DFA6_eotS =
        "\13\uffff";
    static final String DFA6_eofS =
        "\13\uffff";
    static final String DFA6_minS =
        "\1\4\2\2\1\uffff\1\4\1\3\2\2\2\uffff\1\3";
    static final String DFA6_maxS =
        "\1\112\2\31\1\uffff\4\112\2\uffff\1\31";
    static final String DFA6_acceptS =
        "\3\uffff\1\1\4\uffff\1\2\1\1\1\uffff";
    static final String DFA6_specialS =
        "\13\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\24\3\1\1\61\3",
            "\1\4\1\uffff\1\3\24\uffff\1\3",
            "\1\5\1\uffff\1\3\24\uffff\1\3",
            "",
            "\107\6",
            "\1\10\107\7",
            "\1\10\1\11\107\6",
            "\1\10\1\12\107\7",
            "",
            "",
            "\1\10\1\11\24\uffff\1\11"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "211:44: (vet= . )?";
        }
    }
    static final String DFA14_eotS =
        "\11\uffff";
    static final String DFA14_eofS =
        "\11\uffff";
    static final String DFA14_minS =
        "\1\4\1\2\1\4\1\2\1\uffff\1\3\2\uffff\1\4";
    static final String DFA14_maxS =
        "\4\112\1\uffff\1\112\2\uffff\1\112";
    static final String DFA14_acceptS =
        "\4\uffff\1\1\1\uffff\1\1\1\2\1\uffff";
    static final String DFA14_specialS =
        "\11\uffff}>";
    static final String[] DFA14_transitionS = {
            "\107\1",
            "\1\2\1\uffff\11\4\1\3\75\4",
            "\107\5",
            "\1\4\12\7\1\6\75\7",
            "",
            "\1\10\107\5",
            "",
            "",
            "\11\4\1\3\75\4"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "362:25: (st= . )?";
        }
    }
 

    public static final BitSet FOLLOW_enterClass_in_topdown60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterMethod_in_topdown70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterConstructor_in_topdown80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterParam_in_topdown90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterField_in_topdown100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subDivEnter_in_topdown110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterAtribuicao_in_topdown120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterAttrVetor_in_topdown130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterNewObjectListaVarDeclAtribuicao_in_topdown145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterIfComBloco_in_topdown155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterIfSemBloco_in_topdown165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitClass_in_bottomup191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitMethod_in_bottomup201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitConstructor_in_bottomup211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitParams_in_bottomup221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listaVarDeclAtribuicao_in_bottomup231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitAtribuicao_in_bottomup241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addMult_in_bottomup251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_acessoCampo_in_bottomup266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vetorExpr_in_bottomup276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamadaMetodo_in_bottomup286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamadaMetodoSemParams_in_bottomup296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitAttrVetor_in_bottomup306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASSE_in_enterClass326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterClass332 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000007FFL});
    public static final BitSet FOLLOW_EXTENDS_in_enterClass336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterClass342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSE_in_exitClass378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_DECL_in_enterMethod411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterMethod426 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000007FFL});
    public static final BitSet FOLLOW_PARAMS_in_enterMethod441 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCO_in_enterMethod450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONSTR_DECL_in_enterConstructor486 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterConstructor488 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_PARAMS_in_enterConstructor496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCO_in_enterConstructor505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_METHOD_DECL_in_exitMethod544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTR_DECL_in_exitConstructor573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_in_enterParam607 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterParam615 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x00000000000007FFL});
    public static final BitSet FOLLOW_PARAMS_in_exitParams652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_DECL_in_enterField673 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterField688 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x00000000000007FFL});
    public static final BitSet FOLLOW_LISTA_VAR_DECL_in_listaVarDeclAtribuicao732 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_DECL_in_listaVarDeclAtribuicao735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_listaVarDeclAtribuicao743 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000007FFL});
    public static final BitSet FOLLOW_EXPR_in_listaVarDeclAtribuicao752 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_53_in_exitAtribuicao797 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_43_in_addMult837 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_42_in_addMult845 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_46_in_subDivEnter881 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_49_in_subDivEnter889 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_38_in_subDivEnter897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_53_in_enterAtribuicao932 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_53_in_enterAttrVetor967 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VECT_EXPR_in_enterAttrVetor970 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXPR_in_enterAttrVetor979 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LISTA_VAR_DECL_in_enterNewObjectListaVarDeclAtribuicao1014 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_DECL_in_enterNewObjectListaVarDeclAtribuicao1017 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterNewObjectListaVarDeclAtribuicao1025 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000007FFL});
    public static final BitSet FOLLOW_EXPR_in_enterNewObjectListaVarDeclAtribuicao1034 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_53_in_exitAttrVetor1062 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VECT_EXPR_in_exitAttrVetor1065 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXPR_in_exitAttrVetor1070 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_48_in_acessoCampo1102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VECT_EXPR_in_vetorExpr1137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXPR_in_vetorExpr1146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_METHOD_CALL_in_chamadaMetodo1171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LISTA_EXPR_in_chamadaMetodo1180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_METHOD_CALL_in_chamadaMetodoSemParams1204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IF_in_enterIfComBloco1226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXPR_in_enterIfComBloco1229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCO_in_enterIfComBloco1239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IF_in_enterIfSemBloco1270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXPR_in_enterIfSemBloco1273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXPR_in_enterIfSemBloco1283 = new BitSet(new long[]{0x0000000000000004L});

}