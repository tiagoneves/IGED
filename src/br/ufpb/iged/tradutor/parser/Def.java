// $ANTLR 3.4 C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g 2013-09-24 12:33:59


    package br.ufpb.iged.tradutor.parser;
    
    import br.ufpb.iged.tradutor.simbolos.Escopo;
    import br.ufpb.iged.tradutor.simbolos.EscopoLocal;
    import br.ufpb.iged.tradutor.simbolos.SimboloClasse;
    import br.ufpb.iged.tradutor.simbolos.SimboloMetodo;
    import br.ufpb.iged.tradutor.simbolos.SimboloTipoPrimitivo;
    import br.ufpb.iged.tradutor.simbolos.SimboloTipoReferencia;
    import br.ufpb.iged.tradutor.simbolos.SimboloVariavel;
    import br.ufpb.iged.tradutor.simbolos.TabelaSimbolos;
    import br.ufpb.iged.tradutor.simbolos.Tipo;
    import br.ufpb.iged.tradutor.simbolos.TradutorAST;
    


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Def extends TreeFilter {
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


    public Def(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public Def(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Def.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g"; }


        TabelaSimbolos tabelaSimbolos;
        Escopo escopoAtual;
        SimboloMetodo metodoAtual;
        SimboloClasse classeAtual;
        public Def(CommonTreeNodeStream input, TabelaSimbolos tabelaSimbolos) {
            this(input);
            this.tabelaSimbolos = tabelaSimbolos;
            escopoAtual = tabelaSimbolos.global;
        }



    // $ANTLR start "topdown"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:37:1: topdown : ( enterBlock | enterMethod | enterClass | enterConstructor | fieldDecl | listaVarDecl | varDeclFor | varDeclLista | paramDecl | atoms );
    public final void topdown() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:38:5: ( enterBlock | enterMethod | enterClass | enterConstructor | fieldDecl | listaVarDecl | varDeclFor | varDeclLista | paramDecl | atoms )
            int alt1=10;
            switch ( input.LA(1) ) {
            case BLOCO:
                {
                alt1=1;
                }
                break;
            case METHOD_DECL:
                {
                alt1=2;
                }
                break;
            case CLASSE:
                {
                alt1=3;
                }
                break;
            case CONSTR_DECL:
                {
                alt1=4;
                }
                break;
            case FIELD_DECL:
                {
                alt1=5;
                }
                break;
            case LISTA_VAR_DECL:
                {
                alt1=6;
                }
                break;
            case INIT_FOR:
                {
                alt1=7;
                }
                break;
            case VAR_DECL_LISTA:
                {
                alt1=8;
                }
                break;
            case PARAM:
                {
                alt1=9;
                }
                break;
            case ID:
                {
                alt1=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:38:9: enterBlock
                    {
                    pushFollow(FOLLOW_enterBlock_in_topdown60);
                    enterBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:39:9: enterMethod
                    {
                    pushFollow(FOLLOW_enterMethod_in_topdown70);
                    enterMethod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:40:9: enterClass
                    {
                    pushFollow(FOLLOW_enterClass_in_topdown80);
                    enterClass();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:41:9: enterConstructor
                    {
                    pushFollow(FOLLOW_enterConstructor_in_topdown90);
                    enterConstructor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:42:9: fieldDecl
                    {
                    pushFollow(FOLLOW_fieldDecl_in_topdown100);
                    fieldDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:43:9: listaVarDecl
                    {
                    pushFollow(FOLLOW_listaVarDecl_in_topdown110);
                    listaVarDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:44:9: varDeclFor
                    {
                    pushFollow(FOLLOW_varDeclFor_in_topdown120);
                    varDeclFor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:45:9: varDeclLista
                    {
                    pushFollow(FOLLOW_varDeclLista_in_topdown130);
                    varDeclLista();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:46:9: paramDecl
                    {
                    pushFollow(FOLLOW_paramDecl_in_topdown140);
                    paramDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:47:9: atoms
                    {
                    pushFollow(FOLLOW_atoms_in_topdown150);
                    atoms();

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
    // $ANTLR end "topdown"



    // $ANTLR start "bottomup"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:50:1: bottomup : ( exitBlock | exitMethod | exitClass | exitConstructor );
    public final void bottomup() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:51:5: ( exitBlock | exitMethod | exitClass | exitConstructor )
            int alt2=4;
            switch ( input.LA(1) ) {
            case BLOCO:
                {
                alt2=1;
                }
                break;
            case METHOD_DECL:
                {
                alt2=2;
                }
                break;
            case CLASSE:
                {
                alt2=3;
                }
                break;
            case CONSTR_DECL:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:51:9: exitBlock
                    {
                    pushFollow(FOLLOW_exitBlock_in_bottomup169);
                    exitBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:52:9: exitMethod
                    {
                    pushFollow(FOLLOW_exitMethod_in_bottomup179);
                    exitMethod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:53:9: exitClass
                    {
                    pushFollow(FOLLOW_exitClass_in_bottomup189);
                    exitClass();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:54:9: exitConstructor
                    {
                    pushFollow(FOLLOW_exitConstructor_in_bottomup199);
                    exitConstructor();

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



    // $ANTLR start "enterBlock"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:58:1: enterBlock : BLOCO ;
    public final void enterBlock() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:59:5: ( BLOCO )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:59:9: BLOCO
            {
            match(input,BLOCO,FOLLOW_BLOCO_in_enterBlock219); if (state.failed) return ;

            if ( state.backtracking==1 ) {escopoAtual = new EscopoLocal(escopoAtual);}

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
    // $ANTLR end "enterBlock"



    // $ANTLR start "exitBlock"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:61:1: exitBlock : BLOCO ;
    public final void exitBlock() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:62:5: ( BLOCO )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:62:9: BLOCO
            {
            match(input,BLOCO,FOLLOW_BLOCO_in_exitBlock240); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            	        System.out.println("locals: "+escopoAtual);
            	        escopoAtual = escopoAtual.obterEscopoEnvolvente();    
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
    // $ANTLR end "exitBlock"



    // $ANTLR start "enterClass"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:69:1: enterClass : ^( CLASSE nome= ID ( ^( EXTENDS sup= ID ) )? ( . )+ ) ;
    public final void enterClass() throws RecognitionException {
        TradutorAST nome=null;
        TradutorAST sup=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:70:5: ( ^( CLASSE nome= ID ( ^( EXTENDS sup= ID ) )? ( . )+ ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:70:9: ^( CLASSE nome= ID ( ^( EXTENDS sup= ID ) )? ( . )+ )
            {
            match(input,CLASSE,FOLLOW_CLASSE_in_enterClass270); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            nome=(TradutorAST)match(input,ID,FOLLOW_ID_in_enterClass276); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:70:28: ( ^( EXTENDS sup= ID ) )?
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
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:70:29: ^( EXTENDS sup= ID )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_enterClass280); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sup=(TradutorAST)match(input,ID,FOLLOW_ID_in_enterClass286); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:70:51: ( . )+
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
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:70:51: .
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
            	        System.out.println("line "+nome.getLine()+
            	                           ": def class "+(nome!=null?nome.getText():null));
            	        
            	        if ( sup!=null )
            	           sup.escopo = escopoAtual; 
            	        SimboloClasse simboloClasse = new SimboloClasse((nome!=null?nome.getText():null),escopoAtual,null);
            	        simboloClasse.def = nome;           
            	        nome.simbolo = simboloClasse;        
            	        escopoAtual.definir(simboloClasse);  
            	        escopoAtual = simboloClasse;
            	        classeAtual = simboloClasse;        
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
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:86:1: exitClass : CLASSE ;
    public final void exitClass() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:87:5: ( CLASSE )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:87:9: CLASSE
            {
            match(input,CLASSE,FOLLOW_CLASSE_in_exitClass322); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            	        System.out.println("members: "+escopoAtual);
            	        escopoAtual = escopoAtual.obterEscopoEnvolvente();    
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


    public static class enterMethod_return extends TreeRuleReturnScope {
    };


    // $ANTLR start "enterMethod"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:94:1: enterMethod : ^( METHOD_DECL (st= . )? tp= . ID (vet= . )? ( ^( PARAMS ( . )+ ) )* ^( BLOCO ( . )* ) ) ;
    public final Def.enterMethod_return enterMethod() throws RecognitionException {
        Def.enterMethod_return retval = new Def.enterMethod_return();
        retval.start = input.LT(1);


        TradutorAST ID1=null;
        TradutorAST st=null;
        TradutorAST tp=null;
        TradutorAST vet=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:95:5: ( ^( METHOD_DECL (st= . )? tp= . ID (vet= . )? ( ^( PARAMS ( . )+ ) )* ^( BLOCO ( . )* ) ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:95:8: ^( METHOD_DECL (st= . )? tp= . ID (vet= . )? ( ^( PARAMS ( . )+ ) )* ^( BLOCO ( . )* ) )
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_enterMethod351); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:95:25: (st= . )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:95:25: st= .
                    {
                    st=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return retval;

                    }
                    break;

            }


            tp=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return retval;

            ID1=(TradutorAST)match(input,ID,FOLLOW_ID_in_enterMethod366); if (state.failed) return retval;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:95:44: (vet= . )?
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:95:44: vet= .
                    {
                    vet=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return retval;

                    }
                    break;

            }


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:95:49: ( ^( PARAMS ( . )+ ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==PARAMS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:95:50: ^( PARAMS ( . )+ )
            	    {
            	    match(input,PARAMS,FOLLOW_PARAMS_in_enterMethod377); if (state.failed) return retval;

            	    match(input, Token.DOWN, null); if (state.failed) return retval;
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:95:59: ( . )+
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
            	    	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:95:59: .
            	    	    {
            	    	    matchAny(input); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	    	    if (state.backtracking>0) {state.failed=true; return retval;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);


            	    match(input, Token.UP, null); if (state.failed) return retval;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input,BLOCO,FOLLOW_BLOCO_in_enterMethod386); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:95:73: ( . )*
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
                	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:95:73: .
                	    {
                	    matchAny(input); if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop9;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }


            match(input, Token.UP, null); if (state.failed) return retval;


            if ( state.backtracking==1 ) {
            	        System.out.println("line "+ID1.getLine()+": def method "+(ID1!=null?ID1.getText():null));
            	        tp.escopo = escopoAtual;
            	        boolean estatico = st != null;
            	        String nomeTipo = tp.getText();
            	        if (vet != null && vet.getText().equals("[]"))
            	        	nomeTipo += "[]"; 
            	        Tipo t;
            	        if (nomeTipo.equals("int") || nomeTipo.equals("void"))
            	        	t = new SimboloTipoPrimitivo(nomeTipo);
            	        else
            	        	t = new SimboloTipoReferencia(nomeTipo);
            	        SimboloMetodo simboloMetodo = new SimboloMetodo((ID1!=null?ID1.getText():null),t,escopoAtual, estatico);
            	        simboloMetodo.def = ID1;            
            	        ID1.simbolo = simboloMetodo;         
            	        escopoAtual.definir(simboloMetodo); 
            	        escopoAtual = simboloMetodo;
            	        metodoAtual = simboloMetodo; 
            	        
            	        if (st == null){
            	        
            	        	System.out.println("line "+ID1.getLine()+": def this");
            	                
            	                SimboloVariavel simboloVariavel = new SimboloVariavel("this", new SimboloTipoReferencia(classeAtual.getNome()), 0);
            	                metodoAtual.definir(simboloVariavel);
            	                
            	        	metodoAtual.incrementarQuantidadeVariaveis(); 
            	        } else 
            	        	metodoAtual.setEstatico(true);  
            	           
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
    // $ANTLR end "enterMethod"



    // $ANTLR start "enterConstructor"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:129:1: enterConstructor : ^( CONSTR_DECL ID ( ^( PARAMS ( . )+ ) )* ^( BLOCO ( . )* ) ) ;
    public final void enterConstructor() throws RecognitionException {
        TradutorAST ID2=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:130:2: ( ^( CONSTR_DECL ID ( ^( PARAMS ( . )+ ) )* ^( BLOCO ( . )* ) ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:130:5: ^( CONSTR_DECL ID ( ^( PARAMS ( . )+ ) )* ^( BLOCO ( . )* ) )
            {
            match(input,CONSTR_DECL,FOLLOW_CONSTR_DECL_in_enterConstructor422); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID2=(TradutorAST)match(input,ID,FOLLOW_ID_in_enterConstructor424); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:130:22: ( ^( PARAMS ( . )+ ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==PARAMS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:130:23: ^( PARAMS ( . )+ )
            	    {
            	    match(input,PARAMS,FOLLOW_PARAMS_in_enterConstructor428); if (state.failed) return ;

            	    match(input, Token.DOWN, null); if (state.failed) return ;
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:130:32: ( . )+
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
            	    	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:130:32: .
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


            match(input,BLOCO,FOLLOW_BLOCO_in_enterConstructor437); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:130:46: ( . )*
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
                	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:130:46: .
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
            	        System.out.println("line "+ID2.getLine()+": def method "+(ID2!=null?ID2.getText():null));
            	        SimboloMetodo simboloMetodo = new SimboloMetodo((ID2!=null?ID2.getText():null),new SimboloTipoPrimitivo("void"),escopoAtual, false);
            	        simboloMetodo.def = ID2;           
            	        ID2.simbolo = simboloMetodo;         
            	        escopoAtual.definir(simboloMetodo); 
            	        escopoAtual = simboloMetodo;
            	        metodoAtual = simboloMetodo; 
            	        System.out.println("line "+ID2.getLine()+": def this");
            	        SimboloVariavel simboloVariavel = new SimboloVariavel("this", new SimboloTipoReferencia(classeAtual.getNome()), 0);
            	        metodoAtual.definir(simboloVariavel);
                            metodoAtual.incrementarQuantidadeVariaveis();        
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
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:146:1: exitMethod : METHOD_DECL ;
    public final void exitMethod() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:147:5: ( METHOD_DECL )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:147:9: METHOD_DECL
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_exitMethod476); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            	        System.out.println("args: "+escopoAtual);
            	        escopoAtual = escopoAtual.obterEscopoEnvolvente();    
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
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:154:1: exitConstructor : CONSTR_DECL ;
    public final void exitConstructor() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:155:5: ( CONSTR_DECL )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:155:9: CONSTR_DECL
            {
            match(input,CONSTR_DECL,FOLLOW_CONSTR_DECL_in_exitConstructor505); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            	        System.out.println("args: "+escopoAtual);
            	        escopoAtual = escopoAtual.obterEscopoEnvolvente();    
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



    // $ANTLR start "atoms"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:162:1: atoms :{...}? ( ID ) ;
    public final void atoms() throws RecognitionException {
        TradutorAST t = (TradutorAST)input.LT(1);
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:164:5: ({...}? ( ID ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:164:8: {...}? ( ID )
            {
            if ( !((t.hasAncestor(FIELD_DECL) || t.hasAncestor(PARAM) || t.hasAncestor(EXPR) || t.hasAncestor(PRE_DECREMENTO)
                	|| t.hasAncestor(PRE_INCREMENTO) || t.hasAncestor(POS_DECREMENTO) || t.hasAncestor(POS_INCREMENTO)
                	|| t.hasAncestor(VAR_DECL) || t.hasAncestor(INIT_FOR))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "atoms", "t.hasAncestor(FIELD_DECL) || t.hasAncestor(PARAM) || t.hasAncestor(EXPR) || t.hasAncestor(PRE_DECREMENTO)\r\n    \t|| t.hasAncestor(PRE_INCREMENTO) || t.hasAncestor(POS_DECREMENTO) || t.hasAncestor(POS_INCREMENTO)\r\n    \t|| t.hasAncestor(VAR_DECL) || t.hasAncestor(INIT_FOR)");
            }

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:166:62: ( ID )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:166:63: ID
            {
            match(input,ID,FOLLOW_ID_in_atoms541); if (state.failed) return ;

            }


            if ( state.backtracking==1 ) {t.escopo = escopoAtual;}

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
    // $ANTLR end "atoms"



    // $ANTLR start "fieldDecl"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:179:1: fieldDecl : ^( FIELD_DECL (st= . )? tp= . ID (vet= . )? ) ;
    public final void fieldDecl() throws RecognitionException {
        TradutorAST ID3=null;
        TradutorAST st=null;
        TradutorAST tp=null;
        TradutorAST vet=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:180:5: ( ^( FIELD_DECL (st= . )? tp= . ID (vet= . )? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:180:9: ^( FIELD_DECL (st= . )? tp= . ID (vet= . )? )
            {
            match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_fieldDecl584); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:180:25: (st= . )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:180:25: st= .
                    {
                    st=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            tp=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            ID3=(TradutorAST)match(input,ID,FOLLOW_ID_in_fieldDecl599); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:180:44: (vet= . )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= BLOCO && LA14_0 <= 74)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:180:44: vet= .
                    {
                    vet=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            	        System.out.println("line "+ID3.getLine()+": def "+(ID3!=null?ID3.getText():null));
            	        tp.escopo = escopoAtual;
            	        SimboloVariavel simboloVariavel;
            	        if (tp.getText().equals("int") && vet == null)
            	        	simboloVariavel = new SimboloVariavel((ID3!=null?ID3.getText():null),new SimboloTipoPrimitivo("int"));
            	        else {
            	        	String tipo = tp.getText();
            	        	if (vet != null && vet.getText().equals("[]"))
            	        		tipo += "[]";
            	        	simboloVariavel = new SimboloVariavel((ID3!=null?ID3.getText():null),new SimboloTipoReferencia(tipo));
            	        }
            	        
            	        simboloVariavel.def = ID3;            
            	        ID3.simbolo = simboloVariavel;         
            	        escopoAtual.definir(simboloVariavel);
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
    // $ANTLR end "fieldDecl"



    // $ANTLR start "paramDecl"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:200:1: paramDecl : ^( PARAM tp= . ID (vet= . )? ) ;
    public final void paramDecl() throws RecognitionException {
        TradutorAST ID4=null;
        TradutorAST tp=null;
        TradutorAST vet=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:201:5: ( ^( PARAM tp= . ID (vet= . )? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:201:9: ^( PARAM tp= . ID (vet= . )? )
            {
            match(input,PARAM,FOLLOW_PARAM_in_paramDecl642); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            tp=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            ID4=(TradutorAST)match(input,ID,FOLLOW_ID_in_paramDecl650); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:201:31: (vet= . )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0 >= BLOCO && LA15_0 <= 74)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:201:31: vet= .
                    {
                    vet=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            	        System.out.println("line "+ID4.getLine()+": def "+(ID4!=null?ID4.getText():null));
            	        tp.escopo = escopoAtual;
            	        SimboloVariavel simboloVariavel;
            	        if (tp.getText().equals("int") && vet == null)
            	        	simboloVariavel = new SimboloVariavel((ID4!=null?ID4.getText():null),new SimboloTipoPrimitivo("int"), metodoAtual.getQuantidadeVariaveis());
            		else {
            	        	String tipo = tp.getText();
            	        	if (vet != null && vet.getText().equals("[]"))
            	        		tipo += "[]";
            	        	simboloVariavel = new SimboloVariavel((ID4!=null?ID4.getText():null),new SimboloTipoReferencia(tipo), metodoAtual.getQuantidadeVariaveis());
            	        } 	
            	              
            	        simboloVariavel.def = ID4;            
            	        ID4.simbolo = simboloVariavel;         
            	        escopoAtual.definir(simboloVariavel);
            	        
            	        metodoAtual.incrementarQuantidadeVariaveis();
            	        
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
    // $ANTLR end "paramDecl"



    // $ANTLR start "listaVarDecl"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:224:1: listaVarDecl : ^( LISTA_VAR_DECL ^( VAR_DECL tp= . ID (vet= . )? ( . )? ) ( . )* ) ;
    public final void listaVarDecl() throws RecognitionException {
        TradutorAST ID5=null;
        TradutorAST tp=null;
        TradutorAST vet=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:225:5: ( ^( LISTA_VAR_DECL ^( VAR_DECL tp= . ID (vet= . )? ( . )? ) ( . )* ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:225:9: ^( LISTA_VAR_DECL ^( VAR_DECL tp= . ID (vet= . )? ( . )? ) ( . )* )
            {
            match(input,LISTA_VAR_DECL,FOLLOW_LISTA_VAR_DECL_in_listaVarDecl693); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,VAR_DECL,FOLLOW_VAR_DECL_in_listaVarDecl696); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            tp=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            ID5=(TradutorAST)match(input,ID,FOLLOW_ID_in_listaVarDecl704); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:225:51: (vet= . )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0 >= BLOCO && LA16_0 <= 74)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:225:51: vet= .
                    {
                    vet=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:225:55: ( . )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0 >= BLOCO && LA17_0 <= 74)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:225:55: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:225:59: ( . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= BLOCO && LA18_0 <= 74)) ) {
                    alt18=1;
                }
                else if ( (LA18_0==UP) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:225:59: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                    	System.out.println("line "+ID5.getLine()+": def "+(ID5!=null?ID5.getText():null));
            	        tp.escopo = escopoAtual;
            	        SimboloVariavel simboloVariavel;
            	        if (tp.getText().equals("int") && (vet == null || !vet.getText().equals("[]")))
            	        	simboloVariavel = new SimboloVariavel((ID5!=null?ID5.getText():null), new SimboloTipoPrimitivo("int"), metodoAtual.getQuantidadeVariaveis());
            	        else {
            	        	String tipo = tp.getText();
            	        	if (vet != null && vet.getText().equals("[]"))
            	        		tipo += "[]";
            	        	simboloVariavel = new SimboloVariavel((ID5!=null?ID5.getText():null), new SimboloTipoReferencia(tipo), metodoAtual.getQuantidadeVariaveis());
            	        } 	
            	        
            	        simboloVariavel.def = ID5;            
            	        ID5.simbolo = simboloVariavel;         
            	        escopoAtual.definir(simboloVariavel);
            	        TradutorAST var = (TradutorAST) tp.getAncestor(LISTA_VAR_DECL);        
            	        if (var != null)
            	          var.simbolo = simboloVariavel;
            	          
            	        metodoAtual.incrementarQuantidadeVariaveis();
            	        	
            	        
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
    // $ANTLR end "listaVarDecl"



    // $ANTLR start "varDeclFor"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:253:1: varDeclFor : ^( INIT_FOR ^( VAR_DECL tp= . ID (vet= . )? ( . )? ) ( . )* ) ;
    public final void varDeclFor() throws RecognitionException {
        TradutorAST ID6=null;
        TradutorAST tp=null;
        TradutorAST vet=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:254:5: ( ^( INIT_FOR ^( VAR_DECL tp= . ID (vet= . )? ( . )? ) ( . )* ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:254:9: ^( INIT_FOR ^( VAR_DECL tp= . ID (vet= . )? ( . )? ) ( . )* )
            {
            match(input,INIT_FOR,FOLLOW_INIT_FOR_in_varDeclFor750); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,VAR_DECL,FOLLOW_VAR_DECL_in_varDeclFor753); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            tp=(TradutorAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            ID6=(TradutorAST)match(input,ID,FOLLOW_ID_in_varDeclFor761); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:254:45: (vet= . )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0 >= BLOCO && LA19_0 <= 74)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:254:45: vet= .
                    {
                    vet=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:254:49: ( . )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0 >= BLOCO && LA20_0 <= 74)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:254:49: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:254:53: ( . )*
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
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:254:53: .
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
                    	System.out.println("line "+ID6.getLine()+": def "+(ID6!=null?ID6.getText():null));
            	        tp.escopo = escopoAtual;
            	        SimboloVariavel simboloVariavel;
            	        if (tp.getText().equals("int") && vet == null)
            	        	simboloVariavel = new SimboloVariavel((ID6!=null?ID6.getText():null), new SimboloTipoPrimitivo("int"), metodoAtual.getQuantidadeVariaveis());
            		else {
            	        	String tipo = tp.getText();
            	        	if (vet != null && vet.getText().equals("[]"))
            	        		tipo += "[]";
            	        	simboloVariavel = new SimboloVariavel((ID6!=null?ID6.getText():null), new SimboloTipoReferencia(tipo), metodoAtual.getQuantidadeVariaveis());
            	        } 	
            	        
            	        simboloVariavel.def = ID6;            
            	        ID6.simbolo = simboloVariavel;         
            	        escopoAtual.definir(simboloVariavel);

            	        metodoAtual.incrementarQuantidadeVariaveis();
            	        	
            	        
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
    // $ANTLR end "varDeclFor"



    // $ANTLR start "varDeclLista"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:278:1: varDeclLista : ^( VAR_DECL_LISTA ID (vet= . )? ( . )? ) ;
    public final void varDeclLista() throws RecognitionException {
        TradutorAST ID7=null;
        TradutorAST vet=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:279:5: ( ^( VAR_DECL_LISTA ID (vet= . )? ( . )? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:279:9: ^( VAR_DECL_LISTA ID (vet= . )? ( . )? )
            {
            match(input,VAR_DECL_LISTA,FOLLOW_VAR_DECL_LISTA_in_varDeclLista814); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID7=(TradutorAST)match(input,ID,FOLLOW_ID_in_varDeclLista816); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:279:33: (vet= . )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0 >= BLOCO && LA22_0 <= 74)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:279:33: vet= .
                    {
                    vet=(TradutorAST)input.LT(1);

                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:279:38: ( . )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0 >= BLOCO && LA23_0 <= 74)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Def.g:279:38: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                    	SimboloVariavel primeiraVar = (SimboloVariavel) ((TradutorAST) ID7.getAncestor(LISTA_VAR_DECL)).simbolo;
            	        System.out.println("line "+ID7.getLine()+": def "+(ID7!=null?ID7.getText():null));
            	        SimboloVariavel simboloVariavel = new SimboloVariavel((ID7!=null?ID7.getText():null),primeiraVar.getTipo(), metodoAtual.getQuantidadeVariaveis());
            	        simboloVariavel.def = ID7;            
            	        ID7.simbolo = simboloVariavel;         
            	        escopoAtual.definir(simboloVariavel); 
            	        
            	        metodoAtual.incrementarQuantidadeVariaveis();
            	               	        
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
    // $ANTLR end "varDeclLista"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA13 dfa13 = new DFA13(this);
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
            return "95:25: (st= . )?";
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
            return "95:44: (vet= . )?";
        }
    }
    static final String DFA13_eotS =
        "\11\uffff";
    static final String DFA13_eofS =
        "\11\uffff";
    static final String DFA13_minS =
        "\1\4\1\2\1\4\1\2\1\uffff\1\3\2\uffff\1\4";
    static final String DFA13_maxS =
        "\4\112\1\uffff\1\112\2\uffff\1\112";
    static final String DFA13_acceptS =
        "\4\uffff\1\1\1\uffff\1\1\1\2\1\uffff";
    static final String DFA13_specialS =
        "\11\uffff}>";
    static final String[] DFA13_transitionS = {
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

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "180:25: (st= . )?";
        }
    }
 

    public static final BitSet FOLLOW_enterBlock_in_topdown60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterMethod_in_topdown70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterClass_in_topdown80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterConstructor_in_topdown90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDecl_in_topdown100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listaVarDecl_in_topdown110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclFor_in_topdown120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclLista_in_topdown130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramDecl_in_topdown140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atoms_in_topdown150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitBlock_in_bottomup169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitMethod_in_bottomup179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitClass_in_bottomup189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitConstructor_in_bottomup199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCO_in_enterBlock219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCO_in_exitBlock240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASSE_in_enterClass270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterClass276 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000007FFL});
    public static final BitSet FOLLOW_EXTENDS_in_enterClass280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterClass286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSE_in_exitClass322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_DECL_in_enterMethod351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterMethod366 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000007FFL});
    public static final BitSet FOLLOW_PARAMS_in_enterMethod377 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCO_in_enterMethod386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONSTR_DECL_in_enterConstructor422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterConstructor424 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_PARAMS_in_enterConstructor428 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCO_in_enterConstructor437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_METHOD_DECL_in_exitMethod476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTR_DECL_in_exitConstructor505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atoms541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_DECL_in_fieldDecl584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_fieldDecl599 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x00000000000007FFL});
    public static final BitSet FOLLOW_PARAM_in_paramDecl642 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_paramDecl650 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x00000000000007FFL});
    public static final BitSet FOLLOW_LISTA_VAR_DECL_in_listaVarDecl693 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_DECL_in_listaVarDecl696 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_listaVarDecl704 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x00000000000007FFL});
    public static final BitSet FOLLOW_INIT_FOR_in_varDeclFor750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_DECL_in_varDeclFor753 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_varDeclFor761 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x00000000000007FFL});
    public static final BitSet FOLLOW_VAR_DECL_LISTA_in_varDeclLista814 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_varDeclLista816 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x00000000000007FFL});

}