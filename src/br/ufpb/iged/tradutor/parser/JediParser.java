// $ANTLR 3.4 C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g 2013-09-24 12:33:58

  package br.ufpb.iged.tradutor.parser;
  //package br.ufpb.iged.tradutor.gramaticas.output;
  
  import br.ufpb.iged.tradutor.simbolos.TradutorAST;
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class JediParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public JediParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public JediParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return JediParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g"; }


    public static class programa_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "programa"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:52:1: programa : ( classe )+ ;
    public final JediParser.programa_return programa() throws RecognitionException {
        JediParser.programa_return retval = new JediParser.programa_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        JediParser.classe_return classe1 =null;



        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:52:10: ( ( classe )+ )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:52:12: ( classe )+
            {
            root_0 = (TradutorAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:52:12: ( classe )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==61) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:52:12: classe
            	    {
            	    pushFollow(FOLLOW_classe_in_programa205);
            	    classe1=classe();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classe1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "programa"


    public static class classe_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classe"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:54:1: classe : 'class' ID ( superClasse )? '{' ( membroClasse )+ '}' -> ^( CLASSE ID ( superClasse )? ( membroClasse )+ ) ;
    public final JediParser.classe_return classe() throws RecognitionException {
        JediParser.classe_return retval = new JediParser.classe_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token string_literal2=null;
        Token ID3=null;
        Token char_literal5=null;
        Token char_literal7=null;
        JediParser.superClasse_return superClasse4 =null;

        JediParser.membroClasse_return membroClasse6 =null;


        TradutorAST string_literal2_tree=null;
        TradutorAST ID3_tree=null;
        TradutorAST char_literal5_tree=null;
        TradutorAST char_literal7_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_membroClasse=new RewriteRuleSubtreeStream(adaptor,"rule membroClasse");
        RewriteRuleSubtreeStream stream_superClasse=new RewriteRuleSubtreeStream(adaptor,"rule superClasse");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:54:8: ( 'class' ID ( superClasse )? '{' ( membroClasse )+ '}' -> ^( CLASSE ID ( superClasse )? ( membroClasse )+ ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:54:10: 'class' ID ( superClasse )? '{' ( membroClasse )+ '}'
            {
            string_literal2=(Token)match(input,61,FOLLOW_61_in_classe214); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(string_literal2);


            ID3=(Token)match(input,ID,FOLLOW_ID_in_classe216); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID3);


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:54:22: ( superClasse )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==64) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:54:22: superClasse
                    {
                    pushFollow(FOLLOW_superClasse_in_classe219);
                    superClasse4=superClasse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_superClasse.add(superClasse4.getTree());

                    }
                    break;

            }


            char_literal5=(Token)match(input,72,FOLLOW_72_in_classe222); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_72.add(char_literal5);


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:54:39: ( membroClasse )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||LA3_0==67||LA3_0==70) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:54:39: membroClasse
            	    {
            	    pushFollow(FOLLOW_membroClasse_in_classe224);
            	    membroClasse6=membroClasse();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_membroClasse.add(membroClasse6.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            char_literal7=(Token)match(input,74,FOLLOW_74_in_classe227); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal7);


            // AST REWRITE
            // elements: membroClasse, ID, superClasse
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 55:9: -> ^( CLASSE ID ( superClasse )? ( membroClasse )+ )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:55:12: ^( CLASSE ID ( superClasse )? ( membroClasse )+ )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(CLASSE, "CLASSE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:55:24: ( superClasse )?
                if ( stream_superClasse.hasNext() ) {
                    adaptor.addChild(root_1, stream_superClasse.nextTree());

                }
                stream_superClasse.reset();

                if ( !(stream_membroClasse.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_membroClasse.hasNext() ) {
                    adaptor.addChild(root_1, stream_membroClasse.nextTree());

                }
                stream_membroClasse.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classe"


    public static class superClasse_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "superClasse"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:58:1: superClasse : 'extends' ID -> ^( EXTENDS ID ) ;
    public final JediParser.superClasse_return superClasse() throws RecognitionException {
        JediParser.superClasse_return retval = new JediParser.superClasse_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token string_literal8=null;
        Token ID9=null;

        TradutorAST string_literal8_tree=null;
        TradutorAST ID9_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:59:2: ( 'extends' ID -> ^( EXTENDS ID ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:59:5: 'extends' ID
            {
            string_literal8=(Token)match(input,64,FOLLOW_64_in_superClasse269); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_64.add(string_literal8);


            ID9=(Token)match(input,ID,FOLLOW_ID_in_superClasse271); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID9);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 59:18: -> ^( EXTENDS ID )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:59:21: ^( EXTENDS ID )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(EXTENDS, "EXTENDS")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "superClasse"


    public static class membroClasse_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "membroClasse"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:62:1: membroClasse : ( fieldDecl | constrDecl | methodDecl );
    public final JediParser.membroClasse_return membroClasse() throws RecognitionException {
        JediParser.membroClasse_return retval = new JediParser.membroClasse_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        JediParser.fieldDecl_return fieldDecl10 =null;

        JediParser.constrDecl_return constrDecl11 =null;

        JediParser.methodDecl_return methodDecl12 =null;



        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:62:14: ( fieldDecl | constrDecl | methodDecl )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==ID||LA4_1==67) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==58) ) {
                        int LA4_5 = input.LA(4);

                        if ( (LA4_5==ID) ) {
                            int LA4_6 = input.LA(5);

                            if ( (LA4_6==50) ) {
                                alt4=1;
                            }
                            else if ( (LA4_6==40) ) {
                                alt4=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 6, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 5, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA4_3==ID) ) {
                        int LA4_6 = input.LA(4);

                        if ( (LA4_6==50) ) {
                            alt4=1;
                        }
                        else if ( (LA4_6==40) ) {
                            alt4=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt4=2;
                    }
                    break;
                case 58:
                    {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==ID) ) {
                        int LA4_6 = input.LA(4);

                        if ( (LA4_6==50) ) {
                            alt4=1;
                        }
                        else if ( (LA4_6==40) ) {
                            alt4=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case ID:
                    {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6==50) ) {
                        alt4=1;
                    }
                    else if ( (LA4_6==40) ) {
                        alt4=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }

                }
                break;
            case 67:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==58) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==ID) ) {
                        int LA4_6 = input.LA(4);

                        if ( (LA4_6==50) ) {
                            alt4=1;
                        }
                        else if ( (LA4_6==40) ) {
                            alt4=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;

                    }
                }
                else if ( (LA4_3==ID) ) {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6==50) ) {
                        alt4=1;
                    }
                    else if ( (LA4_6==40) ) {
                        alt4=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:62:16: fieldDecl
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    pushFollow(FOLLOW_fieldDecl_in_membroClasse289);
                    fieldDecl10=fieldDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDecl10.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:62:28: constrDecl
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    pushFollow(FOLLOW_constrDecl_in_membroClasse293);
                    constrDecl11=constrDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constrDecl11.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:62:41: methodDecl
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    pushFollow(FOLLOW_methodDecl_in_membroClasse297);
                    methodDecl12=methodDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDecl12.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "membroClasse"


    public static class fieldDecl_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldDecl"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:64:1: fieldDecl : (a= 'static' )? tipo (vet= '[]' )? ID ';' -> ^( FIELD_DECL ( $a)? tipo ID ( $vet)? ) ;
    public final JediParser.fieldDecl_return fieldDecl() throws RecognitionException {
        JediParser.fieldDecl_return retval = new JediParser.fieldDecl_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token a=null;
        Token vet=null;
        Token ID14=null;
        Token char_literal15=null;
        JediParser.tipo_return tipo13 =null;


        TradutorAST a_tree=null;
        TradutorAST vet_tree=null;
        TradutorAST ID14_tree=null;
        TradutorAST char_literal15_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:64:11: ( (a= 'static' )? tipo (vet= '[]' )? ID ';' -> ^( FIELD_DECL ( $a)? tipo ID ( $vet)? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:64:13: (a= 'static' )? tipo (vet= '[]' )? ID ';'
            {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:64:15: (a= 'static' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==70) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:64:15: a= 'static'
                    {
                    a=(Token)match(input,70,FOLLOW_70_in_fieldDecl309); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(a);


                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_fieldDecl312);
            tipo13=tipo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tipo.add(tipo13.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:64:36: (vet= '[]' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==58) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:64:36: vet= '[]'
                    {
                    vet=(Token)match(input,58,FOLLOW_58_in_fieldDecl317); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(vet);


                    }
                    break;

            }


            ID14=(Token)match(input,ID,FOLLOW_ID_in_fieldDecl320); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID14);


            char_literal15=(Token)match(input,50,FOLLOW_50_in_fieldDecl323); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(char_literal15);


            // AST REWRITE
            // elements: vet, tipo, a, ID
            // token labels: a, vet
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleTokenStream stream_vet=new RewriteRuleTokenStream(adaptor,"token vet",vet);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 65:2: -> ^( FIELD_DECL ( $a)? tipo ID ( $vet)? )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:65:5: ^( FIELD_DECL ( $a)? tipo ID ( $vet)? )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(FIELD_DECL, "FIELD_DECL")
                , root_1);

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:65:19: ( $a)?
                if ( stream_a.hasNext() ) {
                    adaptor.addChild(root_1, stream_a.nextNode());

                }
                stream_a.reset();

                adaptor.addChild(root_1, stream_tipo.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:65:31: ( $vet)?
                if ( stream_vet.hasNext() ) {
                    adaptor.addChild(root_1, stream_vet.nextNode());

                }
                stream_vet.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldDecl"


    public static class methodDecl_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodDecl"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:68:1: methodDecl : (a= 'static' )? tipo (vet= '[]' )? ID '(' ( params )* ')' bloco -> ^( METHOD_DECL ( $a)? tipo ID ( $vet)? ( params )* bloco ) ;
    public final JediParser.methodDecl_return methodDecl() throws RecognitionException {
        JediParser.methodDecl_return retval = new JediParser.methodDecl_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token a=null;
        Token vet=null;
        Token ID17=null;
        Token char_literal18=null;
        Token char_literal20=null;
        JediParser.tipo_return tipo16 =null;

        JediParser.params_return params19 =null;

        JediParser.bloco_return bloco21 =null;


        TradutorAST a_tree=null;
        TradutorAST vet_tree=null;
        TradutorAST ID17_tree=null;
        TradutorAST char_literal18_tree=null;
        TradutorAST char_literal20_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_bloco=new RewriteRuleSubtreeStream(adaptor,"rule bloco");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:68:12: ( (a= 'static' )? tipo (vet= '[]' )? ID '(' ( params )* ')' bloco -> ^( METHOD_DECL ( $a)? tipo ID ( $vet)? ( params )* bloco ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:68:14: (a= 'static' )? tipo (vet= '[]' )? ID '(' ( params )* ')' bloco
            {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:68:16: (a= 'static' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==70) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:68:16: a= 'static'
                    {
                    a=(Token)match(input,70,FOLLOW_70_in_methodDecl360); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(a);


                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_methodDecl363);
            tipo16=tipo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tipo.add(tipo16.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:68:37: (vet= '[]' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==58) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:68:37: vet= '[]'
                    {
                    vet=(Token)match(input,58,FOLLOW_58_in_methodDecl368); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(vet);


                    }
                    break;

            }


            ID17=(Token)match(input,ID,FOLLOW_ID_in_methodDecl371); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID17);


            char_literal18=(Token)match(input,40,FOLLOW_40_in_methodDecl373); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_40.add(char_literal18);


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:68:51: ( params )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID||LA9_0==67) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:68:51: params
            	    {
            	    pushFollow(FOLLOW_params_in_methodDecl375);
            	    params19=params();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_params.add(params19.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            char_literal20=(Token)match(input,41,FOLLOW_41_in_methodDecl378); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(char_literal20);


            pushFollow(FOLLOW_bloco_in_methodDecl380);
            bloco21=bloco();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bloco.add(bloco21.getTree());

            // AST REWRITE
            // elements: tipo, a, bloco, params, ID, vet
            // token labels: a, vet
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleTokenStream stream_vet=new RewriteRuleTokenStream(adaptor,"token vet",vet);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 69:12: -> ^( METHOD_DECL ( $a)? tipo ID ( $vet)? ( params )* bloco )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:69:15: ^( METHOD_DECL ( $a)? tipo ID ( $vet)? ( params )* bloco )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(METHOD_DECL, "METHOD_DECL")
                , root_1);

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:69:30: ( $a)?
                if ( stream_a.hasNext() ) {
                    adaptor.addChild(root_1, stream_a.nextNode());

                }
                stream_a.reset();

                adaptor.addChild(root_1, stream_tipo.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:69:42: ( $vet)?
                if ( stream_vet.hasNext() ) {
                    adaptor.addChild(root_1, stream_vet.nextNode());

                }
                stream_vet.reset();

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:69:47: ( params )*
                while ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();

                adaptor.addChild(root_1, stream_bloco.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodDecl"


    public static class constrDecl_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constrDecl"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:72:1: constrDecl : ID '(' ( params )* ')' bloco -> ^( CONSTR_DECL ID ( params )* bloco ) ;
    public final JediParser.constrDecl_return constrDecl() throws RecognitionException {
        JediParser.constrDecl_return retval = new JediParser.constrDecl_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token ID22=null;
        Token char_literal23=null;
        Token char_literal25=null;
        JediParser.params_return params24 =null;

        JediParser.bloco_return bloco26 =null;


        TradutorAST ID22_tree=null;
        TradutorAST char_literal23_tree=null;
        TradutorAST char_literal25_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_bloco=new RewriteRuleSubtreeStream(adaptor,"rule bloco");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:72:12: ( ID '(' ( params )* ')' bloco -> ^( CONSTR_DECL ID ( params )* bloco ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:72:15: ID '(' ( params )* ')' bloco
            {
            ID22=(Token)match(input,ID,FOLLOW_ID_in_constrDecl432); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID22);


            char_literal23=(Token)match(input,40,FOLLOW_40_in_constrDecl434); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_40.add(char_literal23);


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:72:22: ( params )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||LA10_0==67) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:72:22: params
            	    {
            	    pushFollow(FOLLOW_params_in_constrDecl436);
            	    params24=params();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_params.add(params24.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            char_literal25=(Token)match(input,41,FOLLOW_41_in_constrDecl439); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(char_literal25);


            pushFollow(FOLLOW_bloco_in_constrDecl441);
            bloco26=bloco();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bloco.add(bloco26.getTree());

            // AST REWRITE
            // elements: ID, bloco, params
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 73:12: -> ^( CONSTR_DECL ID ( params )* bloco )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:73:15: ^( CONSTR_DECL ID ( params )* bloco )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(CONSTR_DECL, "CONSTR_DECL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:73:32: ( params )*
                while ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();

                adaptor.addChild(root_1, stream_bloco.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constrDecl"


    public static class params_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:76:1: params : param ( ',' param )* -> ^( PARAMS ( param )+ ) ;
    public final JediParser.params_return params() throws RecognitionException {
        JediParser.params_return retval = new JediParser.params_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token char_literal28=null;
        JediParser.param_return param27 =null;

        JediParser.param_return param29 =null;


        TradutorAST char_literal28_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:76:8: ( param ( ',' param )* -> ^( PARAMS ( param )+ ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:76:11: param ( ',' param )*
            {
            pushFollow(FOLLOW_param_in_params484);
            param27=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param27.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:76:17: ( ',' param )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==45) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:76:18: ',' param
            	    {
            	    char_literal28=(Token)match(input,45,FOLLOW_45_in_params487); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_45.add(char_literal28);


            	    pushFollow(FOLLOW_param_in_params489);
            	    param29=param();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_param.add(param29.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // AST REWRITE
            // elements: param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 76:30: -> ^( PARAMS ( param )+ )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:76:33: ^( PARAMS ( param )+ )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                if ( !(stream_param.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_param.nextTree());

                }
                stream_param.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class param_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:78:1: param : tipo (vet= '[]' )? ID -> ^( PARAM tipo ID ( $vet)? ) ;
    public final JediParser.param_return param() throws RecognitionException {
        JediParser.param_return retval = new JediParser.param_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token vet=null;
        Token ID31=null;
        JediParser.tipo_return tipo30 =null;


        TradutorAST vet_tree=null;
        TradutorAST ID31_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:78:7: ( tipo (vet= '[]' )? ID -> ^( PARAM tipo ID ( $vet)? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:78:10: tipo (vet= '[]' )? ID
            {
            pushFollow(FOLLOW_tipo_in_param509);
            tipo30=tipo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tipo.add(tipo30.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:78:19: (vet= '[]' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==58) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:78:19: vet= '[]'
                    {
                    vet=(Token)match(input,58,FOLLOW_58_in_param514); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(vet);


                    }
                    break;

            }


            ID31=(Token)match(input,ID,FOLLOW_ID_in_param517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID31);


            // AST REWRITE
            // elements: vet, tipo, ID
            // token labels: vet
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_vet=new RewriteRuleTokenStream(adaptor,"token vet",vet);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 78:30: -> ^( PARAM tipo ID ( $vet)? )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:78:33: ^( PARAM tipo ID ( $vet)? )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(PARAM, "PARAM")
                , root_1);

                adaptor.addChild(root_1, stream_tipo.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:78:50: ( $vet)?
                if ( stream_vet.hasNext() ) {
                    adaptor.addChild(root_1, stream_vet.nextNode());

                }
                stream_vet.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class instrucao_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instrucao"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:80:1: instrucao : ( ';' | expressao ';' | listaVarDecl ';' | bloco | ifStatement | whileStatement | doWhileStatement ';' | forStatement | returnStatement ';' );
    public final JediParser.instrucao_return instrucao() throws RecognitionException {
        JediParser.instrucao_return retval = new JediParser.instrucao_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token char_literal32=null;
        Token char_literal34=null;
        Token char_literal36=null;
        Token char_literal41=null;
        Token char_literal44=null;
        JediParser.expressao_return expressao33 =null;

        JediParser.listaVarDecl_return listaVarDecl35 =null;

        JediParser.bloco_return bloco37 =null;

        JediParser.ifStatement_return ifStatement38 =null;

        JediParser.whileStatement_return whileStatement39 =null;

        JediParser.doWhileStatement_return doWhileStatement40 =null;

        JediParser.forStatement_return forStatement42 =null;

        JediParser.returnStatement_return returnStatement43 =null;


        TradutorAST char_literal32_tree=null;
        TradutorAST char_literal34_tree=null;
        TradutorAST char_literal36_tree=null;
        TradutorAST char_literal41_tree=null;
        TradutorAST char_literal44_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:80:12: ( ';' | expressao ';' | listaVarDecl ';' | bloco | ifStatement | whileStatement | doWhileStatement ';' | forStatement | returnStatement ';' )
            int alt13=9;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt13=1;
                }
                break;
            case INT:
            case 40:
            case 44:
            case 46:
            case 47:
            case 68:
                {
                alt13=2;
                }
                break;
            case ID:
                {
                int LA13_3 = input.LA(2);

                if ( ((LA13_3 >= 37 && LA13_3 <= 40)||(LA13_3 >= 42 && LA13_3 <= 44)||(LA13_3 >= 46 && LA13_3 <= 57)||LA13_3==60||LA13_3==73) ) {
                    alt13=2;
                }
                else if ( (LA13_3==ID||LA13_3==58) ) {
                    alt13=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;

                }
                }
                break;
            case 67:
                {
                int LA13_4 = input.LA(2);

                if ( ((LA13_4 >= 37 && LA13_4 <= 40)||(LA13_4 >= 42 && LA13_4 <= 43)||LA13_4==46||(LA13_4 >= 48 && LA13_4 <= 57)||LA13_4==60||LA13_4==73) ) {
                    alt13=2;
                }
                else if ( (LA13_4==ID||LA13_4==58) ) {
                    alt13=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;

                }
                }
                break;
            case 72:
                {
                alt13=4;
                }
                break;
            case 66:
                {
                alt13=5;
                }
                break;
            case 71:
                {
                alt13=6;
                }
                break;
            case 62:
                {
                alt13=7;
                }
                break;
            case 65:
                {
                alt13=8;
                }
                break;
            case 69:
                {
                alt13=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:80:14: ';'
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    char_literal32=(Token)match(input,50,FOLLOW_50_in_instrucao541); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal32_tree = 
                    (TradutorAST)adaptor.create(char_literal32)
                    ;
                    adaptor.addChild(root_0, char_literal32_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:81:4: expressao ';'
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    pushFollow(FOLLOW_expressao_in_instrucao546);
                    expressao33=expressao();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressao33.getTree());

                    char_literal34=(Token)match(input,50,FOLLOW_50_in_instrucao548); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal34_tree = 
                    (TradutorAST)adaptor.create(char_literal34)
                    ;
                    adaptor.addChild(root_0, char_literal34_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:82:4: listaVarDecl ';'
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    pushFollow(FOLLOW_listaVarDecl_in_instrucao553);
                    listaVarDecl35=listaVarDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, listaVarDecl35.getTree());

                    char_literal36=(Token)match(input,50,FOLLOW_50_in_instrucao555); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal36_tree = 
                    (TradutorAST)adaptor.create(char_literal36)
                    ;
                    adaptor.addChild(root_0, char_literal36_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:83:4: bloco
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    pushFollow(FOLLOW_bloco_in_instrucao560);
                    bloco37=bloco();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bloco37.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:84:4: ifStatement
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    pushFollow(FOLLOW_ifStatement_in_instrucao565);
                    ifStatement38=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement38.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:85:4: whileStatement
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    pushFollow(FOLLOW_whileStatement_in_instrucao570);
                    whileStatement39=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement39.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:86:4: doWhileStatement ';'
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    pushFollow(FOLLOW_doWhileStatement_in_instrucao575);
                    doWhileStatement40=doWhileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileStatement40.getTree());

                    char_literal41=(Token)match(input,50,FOLLOW_50_in_instrucao577); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal41_tree = 
                    (TradutorAST)adaptor.create(char_literal41)
                    ;
                    adaptor.addChild(root_0, char_literal41_tree);
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:87:4: forStatement
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    pushFollow(FOLLOW_forStatement_in_instrucao582);
                    forStatement42=forStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStatement42.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:88:4: returnStatement ';'
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    pushFollow(FOLLOW_returnStatement_in_instrucao587);
                    returnStatement43=returnStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatement43.getTree());

                    char_literal44=(Token)match(input,50,FOLLOW_50_in_instrucao589); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal44_tree = 
                    (TradutorAST)adaptor.create(char_literal44)
                    ;
                    adaptor.addChild(root_0, char_literal44_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instrucao"


    public static class expressao_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressao"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:93:1: expressao : atribuicao -> ^( EXPR atribuicao ) ;
    public final JediParser.expressao_return expressao() throws RecognitionException {
        JediParser.expressao_return retval = new JediParser.expressao_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        JediParser.atribuicao_return atribuicao45 =null;


        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:93:12: ( atribuicao -> ^( EXPR atribuicao ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:93:14: atribuicao
            {
            pushFollow(FOLLOW_atribuicao_in_expressao602);
            atribuicao45=atribuicao();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atribuicao.add(atribuicao45.getTree());

            // AST REWRITE
            // elements: atribuicao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 93:25: -> ^( EXPR atribuicao )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:93:28: ^( EXPR atribuicao )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(EXPR, "EXPR")
                , root_1);

                adaptor.addChild(root_1, stream_atribuicao.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressao"


    public static class atribuicao_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atribuicao"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:95:1: atribuicao : or ( ( '=' ^) or )* ;
    public final JediParser.atribuicao_return atribuicao() throws RecognitionException {
        JediParser.atribuicao_return retval = new JediParser.atribuicao_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token char_literal47=null;
        JediParser.or_return or46 =null;

        JediParser.or_return or48 =null;


        TradutorAST char_literal47_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:95:12: ( or ( ( '=' ^) or )* )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:95:14: or ( ( '=' ^) or )*
            {
            root_0 = (TradutorAST)adaptor.nil();


            pushFollow(FOLLOW_or_in_atribuicao619);
            or46=or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or46.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:95:17: ( ( '=' ^) or )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==53) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:95:18: ( '=' ^) or
            	    {
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:95:18: ( '=' ^)
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:95:19: '=' ^
            	    {
            	    char_literal47=(Token)match(input,53,FOLLOW_53_in_atribuicao623); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal47_tree = 
            	    (TradutorAST)adaptor.create(char_literal47)
            	    ;
            	    root_0 = (TradutorAST)adaptor.becomeRoot(char_literal47_tree, root_0);
            	    }

            	    }


            	    pushFollow(FOLLOW_or_in_atribuicao627);
            	    or48=or();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, or48.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atribuicao"


    public static class or_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:97:1: or : and ( ( '||' ^) and )* ;
    public final JediParser.or_return or() throws RecognitionException {
        JediParser.or_return retval = new JediParser.or_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token string_literal50=null;
        JediParser.and_return and49 =null;

        JediParser.and_return and51 =null;


        TradutorAST string_literal50_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:97:4: ( and ( ( '||' ^) and )* )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:97:7: and ( ( '||' ^) and )*
            {
            root_0 = (TradutorAST)adaptor.nil();


            pushFollow(FOLLOW_and_in_or638);
            and49=and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and49.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:97:11: ( ( '||' ^) and )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==73) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:97:12: ( '||' ^) and
            	    {
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:97:12: ( '||' ^)
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:97:13: '||' ^
            	    {
            	    string_literal50=(Token)match(input,73,FOLLOW_73_in_or642); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal50_tree = 
            	    (TradutorAST)adaptor.create(string_literal50)
            	    ;
            	    root_0 = (TradutorAST)adaptor.becomeRoot(string_literal50_tree, root_0);
            	    }

            	    }


            	    pushFollow(FOLLOW_and_in_or646);
            	    and51=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and51.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "or"


    public static class and_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:99:1: and : xor ( ( '&&' ^) xor )* ;
    public final JediParser.and_return and() throws RecognitionException {
        JediParser.and_return retval = new JediParser.and_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token string_literal53=null;
        JediParser.xor_return xor52 =null;

        JediParser.xor_return xor54 =null;


        TradutorAST string_literal53_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:99:5: ( xor ( ( '&&' ^) xor )* )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:99:7: xor ( ( '&&' ^) xor )*
            {
            root_0 = (TradutorAST)adaptor.nil();


            pushFollow(FOLLOW_xor_in_and657);
            xor52=xor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, xor52.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:99:11: ( ( '&&' ^) xor )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:99:12: ( '&&' ^) xor
            	    {
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:99:12: ( '&&' ^)
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:99:13: '&&' ^
            	    {
            	    string_literal53=(Token)match(input,39,FOLLOW_39_in_and661); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal53_tree = 
            	    (TradutorAST)adaptor.create(string_literal53)
            	    ;
            	    root_0 = (TradutorAST)adaptor.becomeRoot(string_literal53_tree, root_0);
            	    }

            	    }


            	    pushFollow(FOLLOW_xor_in_and665);
            	    xor54=xor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, xor54.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "and"


    public static class xor_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xor"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:101:1: xor : igualdade ( ( '^' ^) igualdade )* ;
    public final JediParser.xor_return xor() throws RecognitionException {
        JediParser.xor_return retval = new JediParser.xor_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token char_literal56=null;
        JediParser.igualdade_return igualdade55 =null;

        JediParser.igualdade_return igualdade57 =null;


        TradutorAST char_literal56_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:101:6: ( igualdade ( ( '^' ^) igualdade )* )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:101:10: igualdade ( ( '^' ^) igualdade )*
            {
            root_0 = (TradutorAST)adaptor.nil();


            pushFollow(FOLLOW_igualdade_in_xor679);
            igualdade55=igualdade();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, igualdade55.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:101:20: ( ( '^' ^) igualdade )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==60) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:101:21: ( '^' ^) igualdade
            	    {
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:101:21: ( '^' ^)
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:101:22: '^' ^
            	    {
            	    char_literal56=(Token)match(input,60,FOLLOW_60_in_xor683); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal56_tree = 
            	    (TradutorAST)adaptor.create(char_literal56)
            	    ;
            	    root_0 = (TradutorAST)adaptor.becomeRoot(char_literal56_tree, root_0);
            	    }

            	    }


            	    pushFollow(FOLLOW_igualdade_in_xor687);
            	    igualdade57=igualdade();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, igualdade57.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "xor"


    public static class igualdade_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "igualdade"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:103:1: igualdade : relacional ( ( '==' ^| '!=' ^) relacional )* ;
    public final JediParser.igualdade_return igualdade() throws RecognitionException {
        JediParser.igualdade_return retval = new JediParser.igualdade_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token string_literal59=null;
        Token string_literal60=null;
        JediParser.relacional_return relacional58 =null;

        JediParser.relacional_return relacional61 =null;


        TradutorAST string_literal59_tree=null;
        TradutorAST string_literal60_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:103:12: ( relacional ( ( '==' ^| '!=' ^) relacional )* )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:103:16: relacional ( ( '==' ^| '!=' ^) relacional )*
            {
            root_0 = (TradutorAST)adaptor.nil();


            pushFollow(FOLLOW_relacional_in_igualdade701);
            relacional58=relacional();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relacional58.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:103:27: ( ( '==' ^| '!=' ^) relacional )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37||LA19_0==54) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:103:28: ( '==' ^| '!=' ^) relacional
            	    {
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:103:28: ( '==' ^| '!=' ^)
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==54) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==37) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:103:29: '==' ^
            	            {
            	            string_literal59=(Token)match(input,54,FOLLOW_54_in_igualdade705); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal59_tree = 
            	            (TradutorAST)adaptor.create(string_literal59)
            	            ;
            	            root_0 = (TradutorAST)adaptor.becomeRoot(string_literal59_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:103:36: '!=' ^
            	            {
            	            string_literal60=(Token)match(input,37,FOLLOW_37_in_igualdade709); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal60_tree = 
            	            (TradutorAST)adaptor.create(string_literal60)
            	            ;
            	            root_0 = (TradutorAST)adaptor.becomeRoot(string_literal60_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relacional_in_igualdade713);
            	    relacional61=relacional();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relacional61.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "igualdade"


    public static class relacional_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relacional"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:105:1: relacional : add ( ( '<' ^| '>' ^| '>=' ^| '<=' ^) add )* ;
    public final JediParser.relacional_return relacional() throws RecognitionException {
        JediParser.relacional_return retval = new JediParser.relacional_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token char_literal63=null;
        Token char_literal64=null;
        Token string_literal65=null;
        Token string_literal66=null;
        JediParser.add_return add62 =null;

        JediParser.add_return add67 =null;


        TradutorAST char_literal63_tree=null;
        TradutorAST char_literal64_tree=null;
        TradutorAST string_literal65_tree=null;
        TradutorAST string_literal66_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:105:12: ( add ( ( '<' ^| '>' ^| '>=' ^| '<=' ^) add )* )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:105:14: add ( ( '<' ^| '>' ^| '>=' ^| '<=' ^) add )*
            {
            root_0 = (TradutorAST)adaptor.nil();


            pushFollow(FOLLOW_add_in_relacional724);
            add62=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add62.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:105:18: ( ( '<' ^| '>' ^| '>=' ^| '<=' ^) add )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= 51 && LA21_0 <= 52)||(LA21_0 >= 55 && LA21_0 <= 56)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:105:19: ( '<' ^| '>' ^| '>=' ^| '<=' ^) add
            	    {
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:105:19: ( '<' ^| '>' ^| '>=' ^| '<=' ^)
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case 51:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:105:20: '<' ^
            	            {
            	            char_literal63=(Token)match(input,51,FOLLOW_51_in_relacional728); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal63_tree = 
            	            (TradutorAST)adaptor.create(char_literal63)
            	            ;
            	            root_0 = (TradutorAST)adaptor.becomeRoot(char_literal63_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:105:27: '>' ^
            	            {
            	            char_literal64=(Token)match(input,55,FOLLOW_55_in_relacional733); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal64_tree = 
            	            (TradutorAST)adaptor.create(char_literal64)
            	            ;
            	            root_0 = (TradutorAST)adaptor.becomeRoot(char_literal64_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:105:34: '>=' ^
            	            {
            	            string_literal65=(Token)match(input,56,FOLLOW_56_in_relacional738); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal65_tree = 
            	            (TradutorAST)adaptor.create(string_literal65)
            	            ;
            	            root_0 = (TradutorAST)adaptor.becomeRoot(string_literal65_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:105:42: '<=' ^
            	            {
            	            string_literal66=(Token)match(input,52,FOLLOW_52_in_relacional743); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal66_tree = 
            	            (TradutorAST)adaptor.create(string_literal66)
            	            ;
            	            root_0 = (TradutorAST)adaptor.becomeRoot(string_literal66_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_add_in_relacional747);
            	    add67=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add67.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relacional"


    public static class add_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:107:1: add : mult ( ( '+' ^| '-' ^) mult )* ;
    public final JediParser.add_return add() throws RecognitionException {
        JediParser.add_return retval = new JediParser.add_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token char_literal69=null;
        Token char_literal70=null;
        JediParser.mult_return mult68 =null;

        JediParser.mult_return mult71 =null;


        TradutorAST char_literal69_tree=null;
        TradutorAST char_literal70_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:107:4: ( mult ( ( '+' ^| '-' ^) mult )* )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:107:8: mult ( ( '+' ^| '-' ^) mult )*
            {
            root_0 = (TradutorAST)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add759);
            mult68=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult68.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:107:13: ( ( '+' ^| '-' ^) mult )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==43||LA23_0==46) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:107:14: ( '+' ^| '-' ^) mult
            	    {
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:107:14: ( '+' ^| '-' ^)
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==43) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==46) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:107:15: '+' ^
            	            {
            	            char_literal69=(Token)match(input,43,FOLLOW_43_in_add763); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal69_tree = 
            	            (TradutorAST)adaptor.create(char_literal69)
            	            ;
            	            root_0 = (TradutorAST)adaptor.becomeRoot(char_literal69_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:107:21: '-' ^
            	            {
            	            char_literal70=(Token)match(input,46,FOLLOW_46_in_add767); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal70_tree = 
            	            (TradutorAST)adaptor.create(char_literal70)
            	            ;
            	            root_0 = (TradutorAST)adaptor.becomeRoot(char_literal70_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_mult_in_add771);
            	    mult71=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult71.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "add"


    public static class mult_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:109:1: mult : novo ( ( '*' ^| '/' ^| '%' ^) novo )* ;
    public final JediParser.mult_return mult() throws RecognitionException {
        JediParser.mult_return retval = new JediParser.mult_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token char_literal73=null;
        Token char_literal74=null;
        Token char_literal75=null;
        JediParser.novo_return novo72 =null;

        JediParser.novo_return novo76 =null;


        TradutorAST char_literal73_tree=null;
        TradutorAST char_literal74_tree=null;
        TradutorAST char_literal75_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:109:5: ( novo ( ( '*' ^| '/' ^| '%' ^) novo )* )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:109:7: novo ( ( '*' ^| '/' ^| '%' ^) novo )*
            {
            root_0 = (TradutorAST)adaptor.nil();


            pushFollow(FOLLOW_novo_in_mult781);
            novo72=novo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, novo72.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:109:12: ( ( '*' ^| '/' ^| '%' ^) novo )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38||LA25_0==42||LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:109:13: ( '*' ^| '/' ^| '%' ^) novo
            	    {
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:109:13: ( '*' ^| '/' ^| '%' ^)
            	    int alt24=3;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:109:14: '*' ^
            	            {
            	            char_literal73=(Token)match(input,42,FOLLOW_42_in_mult785); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal73_tree = 
            	            (TradutorAST)adaptor.create(char_literal73)
            	            ;
            	            root_0 = (TradutorAST)adaptor.becomeRoot(char_literal73_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:109:21: '/' ^
            	            {
            	            char_literal74=(Token)match(input,49,FOLLOW_49_in_mult790); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal74_tree = 
            	            (TradutorAST)adaptor.create(char_literal74)
            	            ;
            	            root_0 = (TradutorAST)adaptor.becomeRoot(char_literal74_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:109:28: '%' ^
            	            {
            	            char_literal75=(Token)match(input,38,FOLLOW_38_in_mult795); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal75_tree = 
            	            (TradutorAST)adaptor.create(char_literal75)
            	            ;
            	            root_0 = (TradutorAST)adaptor.becomeRoot(char_literal75_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_novo_in_mult799);
            	    novo76=novo();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, novo76.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mult"


    public static class novo_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "novo"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:111:1: novo : ( posfixa | ( ( 'new' ^) posfixa ) );
    public final JediParser.novo_return novo() throws RecognitionException {
        JediParser.novo_return retval = new JediParser.novo_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token string_literal78=null;
        JediParser.posfixa_return posfixa77 =null;

        JediParser.posfixa_return posfixa79 =null;


        TradutorAST string_literal78_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:111:6: ( posfixa | ( ( 'new' ^) posfixa ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID||LA26_0==INT||LA26_0==40||LA26_0==44||(LA26_0 >= 46 && LA26_0 <= 47)||LA26_0==67) ) {
                alt26=1;
            }
            else if ( (LA26_0==68) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:111:9: posfixa
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    pushFollow(FOLLOW_posfixa_in_novo811);
                    posfixa77=posfixa();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, posfixa77.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:111:19: ( ( 'new' ^) posfixa )
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:111:19: ( ( 'new' ^) posfixa )
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:111:20: ( 'new' ^) posfixa
                    {
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:111:20: ( 'new' ^)
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:111:21: 'new' ^
                    {
                    string_literal78=(Token)match(input,68,FOLLOW_68_in_novo817); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal78_tree = 
                    (TradutorAST)adaptor.create(string_literal78)
                    ;
                    root_0 = (TradutorAST)adaptor.becomeRoot(string_literal78_tree, root_0);
                    }

                    }


                    pushFollow(FOLLOW_posfixa_in_novo821);
                    posfixa79=posfixa();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, posfixa79.getTree());

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "novo"


    public static class posfixa_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "posfixa"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:113:1: posfixa : ( primaria -> primaria ) ( options {backtrack=true; } : '.' ID '(' listaExpressoes ')' -> ^( METHOD_CALL ^( '.' $posfixa ID ) listaExpressoes ) | '.' ID -> ^( '.' $posfixa ID ) | '(' listaExpressoes ')' -> ^( METHOD_CALL $posfixa listaExpressoes ) | '(' ')' -> ^( METHOD_CALL $posfixa) | '.' ID '[' expressao ']' -> ^( VECT_EXPR ^( '.' $posfixa ID ) expressao ) | '[' expressao ']' -> ^( VECT_EXPR $posfixa expressao ) )* ;
    public final JediParser.posfixa_return posfixa() throws RecognitionException {
        JediParser.posfixa_return retval = new JediParser.posfixa_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token char_literal81=null;
        Token ID82=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token char_literal86=null;
        Token ID87=null;
        Token char_literal88=null;
        Token char_literal90=null;
        Token char_literal91=null;
        Token char_literal92=null;
        Token char_literal93=null;
        Token ID94=null;
        Token char_literal95=null;
        Token char_literal97=null;
        Token char_literal98=null;
        Token char_literal100=null;
        JediParser.primaria_return primaria80 =null;

        JediParser.listaExpressoes_return listaExpressoes84 =null;

        JediParser.listaExpressoes_return listaExpressoes89 =null;

        JediParser.expressao_return expressao96 =null;

        JediParser.expressao_return expressao99 =null;


        TradutorAST char_literal81_tree=null;
        TradutorAST ID82_tree=null;
        TradutorAST char_literal83_tree=null;
        TradutorAST char_literal85_tree=null;
        TradutorAST char_literal86_tree=null;
        TradutorAST ID87_tree=null;
        TradutorAST char_literal88_tree=null;
        TradutorAST char_literal90_tree=null;
        TradutorAST char_literal91_tree=null;
        TradutorAST char_literal92_tree=null;
        TradutorAST char_literal93_tree=null;
        TradutorAST ID94_tree=null;
        TradutorAST char_literal95_tree=null;
        TradutorAST char_literal97_tree=null;
        TradutorAST char_literal98_tree=null;
        TradutorAST char_literal100_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_primaria=new RewriteRuleSubtreeStream(adaptor,"rule primaria");
        RewriteRuleSubtreeStream stream_listaExpressoes=new RewriteRuleSubtreeStream(adaptor,"rule listaExpressoes");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:114:5: ( ( primaria -> primaria ) ( options {backtrack=true; } : '.' ID '(' listaExpressoes ')' -> ^( METHOD_CALL ^( '.' $posfixa ID ) listaExpressoes ) | '.' ID -> ^( '.' $posfixa ID ) | '(' listaExpressoes ')' -> ^( METHOD_CALL $posfixa listaExpressoes ) | '(' ')' -> ^( METHOD_CALL $posfixa) | '.' ID '[' expressao ']' -> ^( VECT_EXPR ^( '.' $posfixa ID ) expressao ) | '[' expressao ']' -> ^( VECT_EXPR $posfixa expressao ) )* )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:114:9: ( primaria -> primaria ) ( options {backtrack=true; } : '.' ID '(' listaExpressoes ')' -> ^( METHOD_CALL ^( '.' $posfixa ID ) listaExpressoes ) | '.' ID -> ^( '.' $posfixa ID ) | '(' listaExpressoes ')' -> ^( METHOD_CALL $posfixa listaExpressoes ) | '(' ')' -> ^( METHOD_CALL $posfixa) | '.' ID '[' expressao ']' -> ^( VECT_EXPR ^( '.' $posfixa ID ) expressao ) | '[' expressao ']' -> ^( VECT_EXPR $posfixa expressao ) )*
            {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:114:9: ( primaria -> primaria )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:114:10: primaria
            {
            pushFollow(FOLLOW_primaria_in_posfixa839);
            primaria80=primaria();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primaria.add(primaria80.getTree());

            // AST REWRITE
            // elements: primaria
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 114:18: -> primaria
            {
                adaptor.addChild(root_0, stream_primaria.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:115:6: ( options {backtrack=true; } : '.' ID '(' listaExpressoes ')' -> ^( METHOD_CALL ^( '.' $posfixa ID ) listaExpressoes ) | '.' ID -> ^( '.' $posfixa ID ) | '(' listaExpressoes ')' -> ^( METHOD_CALL $posfixa listaExpressoes ) | '(' ')' -> ^( METHOD_CALL $posfixa) | '.' ID '[' expressao ']' -> ^( VECT_EXPR ^( '.' $posfixa ID ) expressao ) | '[' expressao ']' -> ^( VECT_EXPR $posfixa expressao ) )*
            loop27:
            do {
                int alt27=7;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    int LA27_20 = input.LA(2);

                    if ( (synpred1_Jedi()) ) {
                        alt27=1;
                    }
                    else if ( (synpred2_Jedi()) ) {
                        alt27=2;
                    }
                    else if ( (synpred5_Jedi()) ) {
                        alt27=5;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA27_21 = input.LA(2);

                    if ( (synpred3_Jedi()) ) {
                        alt27=3;
                    }
                    else if ( (synpred4_Jedi()) ) {
                        alt27=4;
                    }


                    }
                    break;
                case 57:
                    {
                    alt27=6;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:116:5: '.' ID '(' listaExpressoes ')'
            	    {
            	    char_literal81=(Token)match(input,48,FOLLOW_48_in_posfixa862); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(char_literal81);


            	    ID82=(Token)match(input,ID,FOLLOW_ID_in_posfixa864); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID82);


            	    char_literal83=(Token)match(input,40,FOLLOW_40_in_posfixa866); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_40.add(char_literal83);


            	    pushFollow(FOLLOW_listaExpressoes_in_posfixa868);
            	    listaExpressoes84=listaExpressoes();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_listaExpressoes.add(listaExpressoes84.getTree());

            	    char_literal85=(Token)match(input,41,FOLLOW_41_in_posfixa870); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_41.add(char_literal85);


            	    // AST REWRITE
            	    // elements: posfixa, 48, ID, listaExpressoes
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (TradutorAST)adaptor.nil();
            	    // 116:36: -> ^( METHOD_CALL ^( '.' $posfixa ID ) listaExpressoes )
            	    {
            	        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:116:39: ^( METHOD_CALL ^( '.' $posfixa ID ) listaExpressoes )
            	        {
            	        TradutorAST root_1 = (TradutorAST)adaptor.nil();
            	        root_1 = (TradutorAST)adaptor.becomeRoot(
            	        (TradutorAST)adaptor.create(METHOD_CALL, "METHOD_CALL")
            	        , root_1);

            	        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:116:53: ^( '.' $posfixa ID )
            	        {
            	        TradutorAST root_2 = (TradutorAST)adaptor.nil();
            	        root_2 = (TradutorAST)adaptor.becomeRoot(
            	        stream_48.nextNode()
            	        , root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_2, 
            	        stream_ID.nextNode()
            	        );

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_1, stream_listaExpressoes.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:117:5: '.' ID
            	    {
            	    char_literal86=(Token)match(input,48,FOLLOW_48_in_posfixa894); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(char_literal86);


            	    ID87=(Token)match(input,ID,FOLLOW_ID_in_posfixa896); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID87);


            	    // AST REWRITE
            	    // elements: 48, posfixa, ID
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (TradutorAST)adaptor.nil();
            	    // 117:19: -> ^( '.' $posfixa ID )
            	    {
            	        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:117:22: ^( '.' $posfixa ID )
            	        {
            	        TradutorAST root_1 = (TradutorAST)adaptor.nil();
            	        root_1 = (TradutorAST)adaptor.becomeRoot(
            	        stream_48.nextNode()
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, 
            	        stream_ID.nextNode()
            	        );

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:118:5: '(' listaExpressoes ')'
            	    {
            	    char_literal88=(Token)match(input,40,FOLLOW_40_in_posfixa920); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_40.add(char_literal88);


            	    pushFollow(FOLLOW_listaExpressoes_in_posfixa922);
            	    listaExpressoes89=listaExpressoes();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_listaExpressoes.add(listaExpressoes89.getTree());

            	    char_literal90=(Token)match(input,41,FOLLOW_41_in_posfixa924); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_41.add(char_literal90);


            	    // AST REWRITE
            	    // elements: posfixa, listaExpressoes
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (TradutorAST)adaptor.nil();
            	    // 118:36: -> ^( METHOD_CALL $posfixa listaExpressoes )
            	    {
            	        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:118:39: ^( METHOD_CALL $posfixa listaExpressoes )
            	        {
            	        TradutorAST root_1 = (TradutorAST)adaptor.nil();
            	        root_1 = (TradutorAST)adaptor.becomeRoot(
            	        (TradutorAST)adaptor.create(METHOD_CALL, "METHOD_CALL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_listaExpressoes.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:119:11: '(' ')'
            	    {
            	    char_literal91=(Token)match(input,40,FOLLOW_40_in_posfixa954); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_40.add(char_literal91);


            	    char_literal92=(Token)match(input,41,FOLLOW_41_in_posfixa955); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_41.add(char_literal92);


            	    // AST REWRITE
            	    // elements: posfixa
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (TradutorAST)adaptor.nil();
            	    // 119:42: -> ^( METHOD_CALL $posfixa)
            	    {
            	        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:119:45: ^( METHOD_CALL $posfixa)
            	        {
            	        TradutorAST root_1 = (TradutorAST)adaptor.nil();
            	        root_1 = (TradutorAST)adaptor.becomeRoot(
            	        (TradutorAST)adaptor.create(METHOD_CALL, "METHOD_CALL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:120:11: '.' ID '[' expressao ']'
            	    {
            	    char_literal93=(Token)match(input,48,FOLLOW_48_in_posfixa1000); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(char_literal93);


            	    ID94=(Token)match(input,ID,FOLLOW_ID_in_posfixa1002); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID94);


            	    char_literal95=(Token)match(input,57,FOLLOW_57_in_posfixa1004); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal95);


            	    pushFollow(FOLLOW_expressao_in_posfixa1006);
            	    expressao96=expressao();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expressao.add(expressao96.getTree());

            	    char_literal97=(Token)match(input,59,FOLLOW_59_in_posfixa1008); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_59.add(char_literal97);


            	    // AST REWRITE
            	    // elements: ID, 48, posfixa, expressao
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (TradutorAST)adaptor.nil();
            	    // 120:36: -> ^( VECT_EXPR ^( '.' $posfixa ID ) expressao )
            	    {
            	        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:120:39: ^( VECT_EXPR ^( '.' $posfixa ID ) expressao )
            	        {
            	        TradutorAST root_1 = (TradutorAST)adaptor.nil();
            	        root_1 = (TradutorAST)adaptor.becomeRoot(
            	        (TradutorAST)adaptor.create(VECT_EXPR, "VECT_EXPR")
            	        , root_1);

            	        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:120:51: ^( '.' $posfixa ID )
            	        {
            	        TradutorAST root_2 = (TradutorAST)adaptor.nil();
            	        root_2 = (TradutorAST)adaptor.becomeRoot(
            	        stream_48.nextNode()
            	        , root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_2, 
            	        stream_ID.nextNode()
            	        );

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_1, stream_expressao.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:121:11: '[' expressao ']'
            	    {
            	    char_literal98=(Token)match(input,57,FOLLOW_57_in_posfixa1038); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal98);


            	    pushFollow(FOLLOW_expressao_in_posfixa1040);
            	    expressao99=expressao();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expressao.add(expressao99.getTree());

            	    char_literal100=(Token)match(input,59,FOLLOW_59_in_posfixa1042); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_59.add(char_literal100);


            	    // AST REWRITE
            	    // elements: posfixa, expressao
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (TradutorAST)adaptor.nil();
            	    // 121:30: -> ^( VECT_EXPR $posfixa expressao )
            	    {
            	        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:121:33: ^( VECT_EXPR $posfixa expressao )
            	        {
            	        TradutorAST root_1 = (TradutorAST)adaptor.nil();
            	        root_1 = (TradutorAST)adaptor.becomeRoot(
            	        (TradutorAST)adaptor.create(VECT_EXPR, "VECT_EXPR")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_expressao.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "posfixa"


    public static class listaExpressoes_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaExpressoes"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:125:1: listaExpressoes : expressao ( ',' expressao )* -> ^( LISTA_EXPR ( expressao )+ ) ;
    public final JediParser.listaExpressoes_return listaExpressoes() throws RecognitionException {
        JediParser.listaExpressoes_return retval = new JediParser.listaExpressoes_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token char_literal102=null;
        JediParser.expressao_return expressao101 =null;

        JediParser.expressao_return expressao103 =null;


        TradutorAST char_literal102_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:126:5: ( expressao ( ',' expressao )* -> ^( LISTA_EXPR ( expressao )+ ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:126:9: expressao ( ',' expressao )*
            {
            pushFollow(FOLLOW_expressao_in_listaExpressoes1077);
            expressao101=expressao();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressao.add(expressao101.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:126:19: ( ',' expressao )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==45) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:126:20: ',' expressao
            	    {
            	    char_literal102=(Token)match(input,45,FOLLOW_45_in_listaExpressoes1080); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_45.add(char_literal102);


            	    pushFollow(FOLLOW_expressao_in_listaExpressoes1082);
            	    expressao103=expressao();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expressao.add(expressao103.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 126:36: -> ^( LISTA_EXPR ( expressao )+ )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:126:39: ^( LISTA_EXPR ( expressao )+ )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(LISTA_EXPR, "LISTA_EXPR")
                , root_1);

                if ( !(stream_expressao.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expressao.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressao.nextTree());

                }
                stream_expressao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaExpressoes"


    public static class primaria_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primaria"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:130:1: primaria : ( INT | ID -> ID | 'int' -> 'int' | '-' ^ ID | incremento | '(' expressao ')' -> expressao );
    public final JediParser.primaria_return primaria() throws RecognitionException {
        JediParser.primaria_return retval = new JediParser.primaria_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token INT104=null;
        Token ID105=null;
        Token string_literal106=null;
        Token char_literal107=null;
        Token ID108=null;
        Token char_literal110=null;
        Token char_literal112=null;
        JediParser.incremento_return incremento109 =null;

        JediParser.expressao_return expressao111 =null;


        TradutorAST INT104_tree=null;
        TradutorAST ID105_tree=null;
        TradutorAST string_literal106_tree=null;
        TradutorAST char_literal107_tree=null;
        TradutorAST ID108_tree=null;
        TradutorAST char_literal110_tree=null;
        TradutorAST char_literal112_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:131:5: ( INT | ID -> ID | 'int' -> 'int' | '-' ^ ID | incremento | '(' expressao ')' -> expressao )
            int alt29=6;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:131:9: INT
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    INT104=(Token)match(input,INT,FOLLOW_INT_in_primaria1113); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT104_tree = 
                    (TradutorAST)adaptor.create(INT104)
                    ;
                    adaptor.addChild(root_0, INT104_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:132:9: ID
                    {
                    ID105=(Token)match(input,ID,FOLLOW_ID_in_primaria1126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID105);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (TradutorAST)adaptor.nil();
                    // 132:12: -> ID
                    {
                        adaptor.addChild(root_0, 
                        stream_ID.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:133:9: 'int'
                    {
                    string_literal106=(Token)match(input,67,FOLLOW_67_in_primaria1140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal106);


                    // AST REWRITE
                    // elements: 67
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (TradutorAST)adaptor.nil();
                    // 133:15: -> 'int'
                    {
                        adaptor.addChild(root_0, 
                        stream_67.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:136:9: '-' ^ ID
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    char_literal107=(Token)match(input,46,FOLLOW_46_in_primaria1164); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal107_tree = 
                    (TradutorAST)adaptor.create(char_literal107)
                    ;
                    root_0 = (TradutorAST)adaptor.becomeRoot(char_literal107_tree, root_0);
                    }

                    ID108=(Token)match(input,ID,FOLLOW_ID_in_primaria1167); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID108_tree = 
                    (TradutorAST)adaptor.create(ID108)
                    ;
                    adaptor.addChild(root_0, ID108_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:137:7: incremento
                    {
                    root_0 = (TradutorAST)adaptor.nil();


                    pushFollow(FOLLOW_incremento_in_primaria1175);
                    incremento109=incremento();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incremento109.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:138:9: '(' expressao ')'
                    {
                    char_literal110=(Token)match(input,40,FOLLOW_40_in_primaria1185); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal110);


                    pushFollow(FOLLOW_expressao_in_primaria1187);
                    expressao111=expressao();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressao.add(expressao111.getTree());

                    char_literal112=(Token)match(input,41,FOLLOW_41_in_primaria1188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(char_literal112);


                    // AST REWRITE
                    // elements: expressao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (TradutorAST)adaptor.nil();
                    // 138:26: -> expressao
                    {
                        adaptor.addChild(root_0, stream_expressao.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primaria"


    public static class incremento_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "incremento"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:143:1: incremento : ( '--' ID ( '.' ID )* -> ^( PRE_DECREMENTO ( ID )+ ) | '++' ID ( '.' ID )* -> ^( PRE_INCREMENTO ( ID )+ ) | ID ( '.' ID )* '--' -> ^( POS_DECREMENTO ( ID )+ ) | ID ( '.' ID )* '++' -> ^( POS_INCREMENTO ( ID )+ ) );
    public final JediParser.incremento_return incremento() throws RecognitionException {
        JediParser.incremento_return retval = new JediParser.incremento_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token string_literal113=null;
        Token ID114=null;
        Token char_literal115=null;
        Token ID116=null;
        Token string_literal117=null;
        Token ID118=null;
        Token char_literal119=null;
        Token ID120=null;
        Token ID121=null;
        Token char_literal122=null;
        Token ID123=null;
        Token string_literal124=null;
        Token ID125=null;
        Token char_literal126=null;
        Token ID127=null;
        Token string_literal128=null;

        TradutorAST string_literal113_tree=null;
        TradutorAST ID114_tree=null;
        TradutorAST char_literal115_tree=null;
        TradutorAST ID116_tree=null;
        TradutorAST string_literal117_tree=null;
        TradutorAST ID118_tree=null;
        TradutorAST char_literal119_tree=null;
        TradutorAST ID120_tree=null;
        TradutorAST ID121_tree=null;
        TradutorAST char_literal122_tree=null;
        TradutorAST ID123_tree=null;
        TradutorAST string_literal124_tree=null;
        TradutorAST ID125_tree=null;
        TradutorAST char_literal126_tree=null;
        TradutorAST ID127_tree=null;
        TradutorAST string_literal128_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:143:12: ( '--' ID ( '.' ID )* -> ^( PRE_DECREMENTO ( ID )+ ) | '++' ID ( '.' ID )* -> ^( PRE_INCREMENTO ( ID )+ ) | ID ( '.' ID )* '--' -> ^( POS_DECREMENTO ( ID )+ ) | ID ( '.' ID )* '++' -> ^( POS_INCREMENTO ( ID )+ ) )
            int alt34=4;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:143:15: '--' ID ( '.' ID )*
                    {
                    string_literal113=(Token)match(input,47,FOLLOW_47_in_incremento1208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_47.add(string_literal113);


                    ID114=(Token)match(input,ID,FOLLOW_ID_in_incremento1210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID114);


                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:143:23: ( '.' ID )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==48) ) {
                            int LA30_1 = input.LA(2);

                            if ( (LA30_1==ID) ) {
                                alt30=1;
                            }


                        }


                        switch (alt30) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:143:24: '.' ID
                    	    {
                    	    char_literal115=(Token)match(input,48,FOLLOW_48_in_incremento1213); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_48.add(char_literal115);


                    	    ID116=(Token)match(input,ID,FOLLOW_ID_in_incremento1214); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID116);


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (TradutorAST)adaptor.nil();
                    // 143:32: -> ^( PRE_DECREMENTO ( ID )+ )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:143:35: ^( PRE_DECREMENTO ( ID )+ )
                        {
                        TradutorAST root_1 = (TradutorAST)adaptor.nil();
                        root_1 = (TradutorAST)adaptor.becomeRoot(
                        (TradutorAST)adaptor.create(PRE_DECREMENTO, "PRE_DECREMENTO")
                        , root_1);

                        if ( !(stream_ID.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_ID.nextNode()
                            );

                        }
                        stream_ID.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:144:12: '++' ID ( '.' ID )*
                    {
                    string_literal117=(Token)match(input,44,FOLLOW_44_in_incremento1238); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_44.add(string_literal117);


                    ID118=(Token)match(input,ID,FOLLOW_ID_in_incremento1240); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID118);


                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:144:20: ( '.' ID )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==48) ) {
                            int LA31_1 = input.LA(2);

                            if ( (LA31_1==ID) ) {
                                alt31=1;
                            }


                        }


                        switch (alt31) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:144:21: '.' ID
                    	    {
                    	    char_literal119=(Token)match(input,48,FOLLOW_48_in_incremento1243); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_48.add(char_literal119);


                    	    ID120=(Token)match(input,ID,FOLLOW_ID_in_incremento1244); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID120);


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (TradutorAST)adaptor.nil();
                    // 144:29: -> ^( PRE_INCREMENTO ( ID )+ )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:144:32: ^( PRE_INCREMENTO ( ID )+ )
                        {
                        TradutorAST root_1 = (TradutorAST)adaptor.nil();
                        root_1 = (TradutorAST)adaptor.becomeRoot(
                        (TradutorAST)adaptor.create(PRE_INCREMENTO, "PRE_INCREMENTO")
                        , root_1);

                        if ( !(stream_ID.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_ID.nextNode()
                            );

                        }
                        stream_ID.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:145:16: ID ( '.' ID )* '--'
                    {
                    ID121=(Token)match(input,ID,FOLLOW_ID_in_incremento1272); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID121);


                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:145:19: ( '.' ID )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==48) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:145:20: '.' ID
                    	    {
                    	    char_literal122=(Token)match(input,48,FOLLOW_48_in_incremento1275); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_48.add(char_literal122);


                    	    ID123=(Token)match(input,ID,FOLLOW_ID_in_incremento1276); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID123);


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    string_literal124=(Token)match(input,47,FOLLOW_47_in_incremento1280); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_47.add(string_literal124);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (TradutorAST)adaptor.nil();
                    // 145:33: -> ^( POS_DECREMENTO ( ID )+ )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:145:36: ^( POS_DECREMENTO ( ID )+ )
                        {
                        TradutorAST root_1 = (TradutorAST)adaptor.nil();
                        root_1 = (TradutorAST)adaptor.becomeRoot(
                        (TradutorAST)adaptor.create(POS_DECREMENTO, "POS_DECREMENTO")
                        , root_1);

                        if ( !(stream_ID.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_ID.nextNode()
                            );

                        }
                        stream_ID.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:146:16: ID ( '.' ID )* '++'
                    {
                    ID125=(Token)match(input,ID,FOLLOW_ID_in_incremento1306); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID125);


                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:146:19: ( '.' ID )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==48) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:146:20: '.' ID
                    	    {
                    	    char_literal126=(Token)match(input,48,FOLLOW_48_in_incremento1309); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_48.add(char_literal126);


                    	    ID127=(Token)match(input,ID,FOLLOW_ID_in_incremento1310); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID127);


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    string_literal128=(Token)match(input,44,FOLLOW_44_in_incremento1314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_44.add(string_literal128);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (TradutorAST)adaptor.nil();
                    // 146:33: -> ^( POS_INCREMENTO ( ID )+ )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:146:36: ^( POS_INCREMENTO ( ID )+ )
                        {
                        TradutorAST root_1 = (TradutorAST)adaptor.nil();
                        root_1 = (TradutorAST)adaptor.becomeRoot(
                        (TradutorAST)adaptor.create(POS_INCREMENTO, "POS_INCREMENTO")
                        , root_1);

                        if ( !(stream_ID.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_ID.nextNode()
                            );

                        }
                        stream_ID.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "incremento"


    public static class chamadaMetodo_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chamadaMetodo"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:149:1: chamadaMetodo : ID ( options {backtrack=true; } : '.' ID '(' listaExpressoes ')' -> ^( METHOD_CALL ^( '.' $chamadaMetodo ID ) listaExpressoes ) | '(' listaExpressoes ')' -> ^( METHOD_CALL $chamadaMetodo listaExpressoes ) )+ ;
    public final JediParser.chamadaMetodo_return chamadaMetodo() throws RecognitionException {
        JediParser.chamadaMetodo_return retval = new JediParser.chamadaMetodo_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token ID129=null;
        Token char_literal130=null;
        Token ID131=null;
        Token char_literal132=null;
        Token char_literal134=null;
        Token char_literal135=null;
        Token char_literal137=null;
        JediParser.listaExpressoes_return listaExpressoes133 =null;

        JediParser.listaExpressoes_return listaExpressoes136 =null;


        TradutorAST ID129_tree=null;
        TradutorAST char_literal130_tree=null;
        TradutorAST ID131_tree=null;
        TradutorAST char_literal132_tree=null;
        TradutorAST char_literal134_tree=null;
        TradutorAST char_literal135_tree=null;
        TradutorAST char_literal137_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_listaExpressoes=new RewriteRuleSubtreeStream(adaptor,"rule listaExpressoes");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:150:5: ( ID ( options {backtrack=true; } : '.' ID '(' listaExpressoes ')' -> ^( METHOD_CALL ^( '.' $chamadaMetodo ID ) listaExpressoes ) | '(' listaExpressoes ')' -> ^( METHOD_CALL $chamadaMetodo listaExpressoes ) )+ )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:150:9: ID ( options {backtrack=true; } : '.' ID '(' listaExpressoes ')' -> ^( METHOD_CALL ^( '.' $chamadaMetodo ID ) listaExpressoes ) | '(' listaExpressoes ')' -> ^( METHOD_CALL $chamadaMetodo listaExpressoes ) )+
            {
            ID129=(Token)match(input,ID,FOLLOW_ID_in_chamadaMetodo1346); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID129);


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:151:6: ( options {backtrack=true; } : '.' ID '(' listaExpressoes ')' -> ^( METHOD_CALL ^( '.' $chamadaMetodo ID ) listaExpressoes ) | '(' listaExpressoes ')' -> ^( METHOD_CALL $chamadaMetodo listaExpressoes ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=3;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==48) ) {
                    alt35=1;
                }
                else if ( (LA35_0==40) ) {
                    alt35=2;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:152:5: '.' ID '(' listaExpressoes ')'
            	    {
            	    char_literal130=(Token)match(input,48,FOLLOW_48_in_chamadaMetodo1366); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(char_literal130);


            	    ID131=(Token)match(input,ID,FOLLOW_ID_in_chamadaMetodo1368); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID131);


            	    char_literal132=(Token)match(input,40,FOLLOW_40_in_chamadaMetodo1370); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_40.add(char_literal132);


            	    pushFollow(FOLLOW_listaExpressoes_in_chamadaMetodo1372);
            	    listaExpressoes133=listaExpressoes();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_listaExpressoes.add(listaExpressoes133.getTree());

            	    char_literal134=(Token)match(input,41,FOLLOW_41_in_chamadaMetodo1374); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_41.add(char_literal134);


            	    // AST REWRITE
            	    // elements: 48, listaExpressoes, ID, chamadaMetodo
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (TradutorAST)adaptor.nil();
            	    // 152:36: -> ^( METHOD_CALL ^( '.' $chamadaMetodo ID ) listaExpressoes )
            	    {
            	        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:152:39: ^( METHOD_CALL ^( '.' $chamadaMetodo ID ) listaExpressoes )
            	        {
            	        TradutorAST root_1 = (TradutorAST)adaptor.nil();
            	        root_1 = (TradutorAST)adaptor.becomeRoot(
            	        (TradutorAST)adaptor.create(METHOD_CALL, "METHOD_CALL")
            	        , root_1);

            	        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:152:53: ^( '.' $chamadaMetodo ID )
            	        {
            	        TradutorAST root_2 = (TradutorAST)adaptor.nil();
            	        root_2 = (TradutorAST)adaptor.becomeRoot(
            	        stream_48.nextNode()
            	        , root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_2, 
            	        stream_ID.nextNode()
            	        );

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_1, stream_listaExpressoes.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:153:5: '(' listaExpressoes ')'
            	    {
            	    char_literal135=(Token)match(input,40,FOLLOW_40_in_chamadaMetodo1398); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_40.add(char_literal135);


            	    pushFollow(FOLLOW_listaExpressoes_in_chamadaMetodo1400);
            	    listaExpressoes136=listaExpressoes();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_listaExpressoes.add(listaExpressoes136.getTree());

            	    char_literal137=(Token)match(input,41,FOLLOW_41_in_chamadaMetodo1402); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_41.add(char_literal137);


            	    // AST REWRITE
            	    // elements: chamadaMetodo, listaExpressoes
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (TradutorAST)adaptor.nil();
            	    // 153:36: -> ^( METHOD_CALL $chamadaMetodo listaExpressoes )
            	    {
            	        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:153:39: ^( METHOD_CALL $chamadaMetodo listaExpressoes )
            	        {
            	        TradutorAST root_1 = (TradutorAST)adaptor.nil();
            	        root_1 = (TradutorAST)adaptor.becomeRoot(
            	        (TradutorAST)adaptor.create(METHOD_CALL, "METHOD_CALL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_listaExpressoes.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "chamadaMetodo"


    public static class varDecl_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDecl"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:157:1: varDecl : tipo (vet= '[]' )? ID ( '=' expressao )? -> ^( VAR_DECL tipo ID ( $vet)? ( expressao )? ) ;
    public final JediParser.varDecl_return varDecl() throws RecognitionException {
        JediParser.varDecl_return retval = new JediParser.varDecl_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token vet=null;
        Token ID139=null;
        Token char_literal140=null;
        JediParser.tipo_return tipo138 =null;

        JediParser.expressao_return expressao141 =null;


        TradutorAST vet_tree=null;
        TradutorAST ID139_tree=null;
        TradutorAST char_literal140_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:158:5: ( tipo (vet= '[]' )? ID ( '=' expressao )? -> ^( VAR_DECL tipo ID ( $vet)? ( expressao )? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:158:9: tipo (vet= '[]' )? ID ( '=' expressao )?
            {
            pushFollow(FOLLOW_tipo_in_varDecl1444);
            tipo138=tipo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tipo.add(tipo138.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:158:18: (vet= '[]' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==58) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:158:18: vet= '[]'
                    {
                    vet=(Token)match(input,58,FOLLOW_58_in_varDecl1449); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(vet);


                    }
                    break;

            }


            ID139=(Token)match(input,ID,FOLLOW_ID_in_varDecl1452); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID139);


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:158:28: ( '=' expressao )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:158:29: '=' expressao
                    {
                    char_literal140=(Token)match(input,53,FOLLOW_53_in_varDecl1455); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal140);


                    pushFollow(FOLLOW_expressao_in_varDecl1457);
                    expressao141=expressao();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressao.add(expressao141.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: ID, expressao, vet, tipo
            // token labels: vet
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_vet=new RewriteRuleTokenStream(adaptor,"token vet",vet);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 159:5: -> ^( VAR_DECL tipo ID ( $vet)? ( expressao )? )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:159:8: ^( VAR_DECL tipo ID ( $vet)? ( expressao )? )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(VAR_DECL, "VAR_DECL")
                , root_1);

                adaptor.addChild(root_1, stream_tipo.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:159:28: ( $vet)?
                if ( stream_vet.hasNext() ) {
                    adaptor.addChild(root_1, stream_vet.nextNode());

                }
                stream_vet.reset();

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:159:33: ( expressao )?
                if ( stream_expressao.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressao.nextTree());

                }
                stream_expressao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varDecl"


    public static class listaVarDecl_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaVarDecl"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:163:1: listaVarDecl : varDecl ( varDeclLista )* -> ^( LISTA_VAR_DECL varDecl ( varDeclLista )* ) ;
    public final JediParser.listaVarDecl_return listaVarDecl() throws RecognitionException {
        JediParser.listaVarDecl_return retval = new JediParser.listaVarDecl_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        JediParser.varDecl_return varDecl142 =null;

        JediParser.varDeclLista_return varDeclLista143 =null;


        RewriteRuleSubtreeStream stream_varDeclLista=new RewriteRuleSubtreeStream(adaptor,"rule varDeclLista");
        RewriteRuleSubtreeStream stream_varDecl=new RewriteRuleSubtreeStream(adaptor,"rule varDecl");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:163:14: ( varDecl ( varDeclLista )* -> ^( LISTA_VAR_DECL varDecl ( varDeclLista )* ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:163:16: varDecl ( varDeclLista )*
            {
            pushFollow(FOLLOW_varDecl_in_listaVarDecl1504);
            varDecl142=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDecl.add(varDecl142.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:163:24: ( varDeclLista )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==45) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:163:25: varDeclLista
            	    {
            	    pushFollow(FOLLOW_varDeclLista_in_listaVarDecl1507);
            	    varDeclLista143=varDeclLista();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varDeclLista.add(varDeclLista143.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            // AST REWRITE
            // elements: varDecl, varDeclLista
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 164:7: -> ^( LISTA_VAR_DECL varDecl ( varDeclLista )* )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:164:10: ^( LISTA_VAR_DECL varDecl ( varDeclLista )* )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(LISTA_VAR_DECL, "LISTA_VAR_DECL")
                , root_1);

                adaptor.addChild(root_1, stream_varDecl.nextTree());

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:164:35: ( varDeclLista )*
                while ( stream_varDeclLista.hasNext() ) {
                    adaptor.addChild(root_1, stream_varDeclLista.nextTree());

                }
                stream_varDeclLista.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaVarDecl"


    public static class varDeclLista_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclLista"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:167:1: varDeclLista : ',' (vet= '[]' )? ID ( '=' expressao )? -> ^( VAR_DECL_LISTA ID ( $vet)? ( expressao )? ) ;
    public final JediParser.varDeclLista_return varDeclLista() throws RecognitionException {
        JediParser.varDeclLista_return retval = new JediParser.varDeclLista_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token vet=null;
        Token char_literal144=null;
        Token ID145=null;
        Token char_literal146=null;
        JediParser.expressao_return expressao147 =null;


        TradutorAST vet_tree=null;
        TradutorAST char_literal144_tree=null;
        TradutorAST ID145_tree=null;
        TradutorAST char_literal146_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:167:14: ( ',' (vet= '[]' )? ID ( '=' expressao )? -> ^( VAR_DECL_LISTA ID ( $vet)? ( expressao )? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:167:16: ',' (vet= '[]' )? ID ( '=' expressao )?
            {
            char_literal144=(Token)match(input,45,FOLLOW_45_in_varDeclLista1549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_45.add(char_literal144);


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:167:24: (vet= '[]' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==58) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:167:24: vet= '[]'
                    {
                    vet=(Token)match(input,58,FOLLOW_58_in_varDeclLista1555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(vet);


                    }
                    break;

            }


            ID145=(Token)match(input,ID,FOLLOW_ID_in_varDeclLista1558); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID145);


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:167:36: ( '=' expressao )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:167:37: '=' expressao
                    {
                    char_literal146=(Token)match(input,53,FOLLOW_53_in_varDeclLista1562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal146);


                    pushFollow(FOLLOW_expressao_in_varDeclLista1564);
                    expressao147=expressao();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressao.add(expressao147.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: expressao, vet, ID
            // token labels: vet
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_vet=new RewriteRuleTokenStream(adaptor,"token vet",vet);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 168:7: -> ^( VAR_DECL_LISTA ID ( $vet)? ( expressao )? )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:168:10: ^( VAR_DECL_LISTA ID ( $vet)? ( expressao )? )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(VAR_DECL_LISTA, "VAR_DECL_LISTA")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:168:31: ( $vet)?
                if ( stream_vet.hasNext() ) {
                    adaptor.addChild(root_1, stream_vet.nextNode());

                }
                stream_vet.reset();

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:168:36: ( expressao )?
                if ( stream_expressao.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressao.nextTree());

                }
                stream_expressao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varDeclLista"


    public static class tipo_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tipo"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:171:1: tipo : ( 'int' | ID );
    public final JediParser.tipo_return tipo() throws RecognitionException {
        JediParser.tipo_return retval = new JediParser.tipo_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token set148=null;

        TradutorAST set148_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:171:5: ( 'int' | ID )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:
            {
            root_0 = (TradutorAST)adaptor.nil();


            set148=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==67 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (TradutorAST)adaptor.create(set148)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tipo"


    public static class ifStatement_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStatement"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:175:1: ifStatement : 'if' '(' expressao ')' instrucao ( elseIf )? -> ^( IF expressao instrucao ( elseIf )? ) ;
    public final JediParser.ifStatement_return ifStatement() throws RecognitionException {
        JediParser.ifStatement_return retval = new JediParser.ifStatement_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token string_literal149=null;
        Token char_literal150=null;
        Token char_literal152=null;
        JediParser.expressao_return expressao151 =null;

        JediParser.instrucao_return instrucao153 =null;

        JediParser.elseIf_return elseIf154 =null;


        TradutorAST string_literal149_tree=null;
        TradutorAST char_literal150_tree=null;
        TradutorAST char_literal152_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_elseIf=new RewriteRuleSubtreeStream(adaptor,"rule elseIf");
        RewriteRuleSubtreeStream stream_instrucao=new RewriteRuleSubtreeStream(adaptor,"rule instrucao");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:175:14: ( 'if' '(' expressao ')' instrucao ( elseIf )? -> ^( IF expressao instrucao ( elseIf )? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:175:16: 'if' '(' expressao ')' instrucao ( elseIf )?
            {
            string_literal149=(Token)match(input,66,FOLLOW_66_in_ifStatement1638); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(string_literal149);


            char_literal150=(Token)match(input,40,FOLLOW_40_in_ifStatement1640); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_40.add(char_literal150);


            pushFollow(FOLLOW_expressao_in_ifStatement1642);
            expressao151=expressao();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressao.add(expressao151.getTree());

            char_literal152=(Token)match(input,41,FOLLOW_41_in_ifStatement1644); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(char_literal152);


            pushFollow(FOLLOW_instrucao_in_ifStatement1646);
            instrucao153=instrucao();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_instrucao.add(instrucao153.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:175:49: ( elseIf )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==63) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:175:49: elseIf
                    {
                    pushFollow(FOLLOW_elseIf_in_ifStatement1648);
                    elseIf154=elseIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseIf.add(elseIf154.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: instrucao, elseIf, expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 176:7: -> ^( IF expressao instrucao ( elseIf )? )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:176:10: ^( IF expressao instrucao ( elseIf )? )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(IF, "IF")
                , root_1);

                adaptor.addChild(root_1, stream_expressao.nextTree());

                adaptor.addChild(root_1, stream_instrucao.nextTree());

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:176:35: ( elseIf )?
                if ( stream_elseIf.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseIf.nextTree());

                }
                stream_elseIf.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifStatement"


    public static class elseIf_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseIf"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:179:1: elseIf : ( 'else' instrucao ) -> ^( 'else' instrucao ) ;
    public final JediParser.elseIf_return elseIf() throws RecognitionException {
        JediParser.elseIf_return retval = new JediParser.elseIf_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token string_literal155=null;
        JediParser.instrucao_return instrucao156 =null;


        TradutorAST string_literal155_tree=null;
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_instrucao=new RewriteRuleSubtreeStream(adaptor,"rule instrucao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:179:8: ( ( 'else' instrucao ) -> ^( 'else' instrucao ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:179:11: ( 'else' instrucao )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:179:11: ( 'else' instrucao )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:179:12: 'else' instrucao
            {
            string_literal155=(Token)match(input,63,FOLLOW_63_in_elseIf1685); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_63.add(string_literal155);


            pushFollow(FOLLOW_instrucao_in_elseIf1687);
            instrucao156=instrucao();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_instrucao.add(instrucao156.getTree());

            }


            // AST REWRITE
            // elements: instrucao, 63
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 179:30: -> ^( 'else' instrucao )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:179:33: ^( 'else' instrucao )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                stream_63.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_instrucao.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elseIf"


    public static class bloco_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bloco"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:181:1: bloco : '{' ( instrucao )* '}' -> ^( BLOCO ( instrucao )* ) ;
    public final JediParser.bloco_return bloco() throws RecognitionException {
        JediParser.bloco_return retval = new JediParser.bloco_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token char_literal157=null;
        Token char_literal159=null;
        JediParser.instrucao_return instrucao158 =null;


        TradutorAST char_literal157_tree=null;
        TradutorAST char_literal159_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_instrucao=new RewriteRuleSubtreeStream(adaptor,"rule instrucao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:182:2: ( '{' ( instrucao )* '}' -> ^( BLOCO ( instrucao )* ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:182:5: '{' ( instrucao )* '}'
            {
            char_literal157=(Token)match(input,72,FOLLOW_72_in_bloco1708); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_72.add(char_literal157);


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:182:9: ( instrucao )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ID||LA42_0==INT||LA42_0==40||LA42_0==44||(LA42_0 >= 46 && LA42_0 <= 47)||LA42_0==50||LA42_0==62||(LA42_0 >= 65 && LA42_0 <= 69)||(LA42_0 >= 71 && LA42_0 <= 72)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:182:9: instrucao
            	    {
            	    pushFollow(FOLLOW_instrucao_in_bloco1710);
            	    instrucao158=instrucao();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_instrucao.add(instrucao158.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            char_literal159=(Token)match(input,74,FOLLOW_74_in_bloco1713); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal159);


            // AST REWRITE
            // elements: instrucao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 182:24: -> ^( BLOCO ( instrucao )* )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:182:27: ^( BLOCO ( instrucao )* )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(BLOCO, "BLOCO")
                , root_1);

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:182:35: ( instrucao )*
                while ( stream_instrucao.hasNext() ) {
                    adaptor.addChild(root_1, stream_instrucao.nextTree());

                }
                stream_instrucao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bloco"


    public static class whileStatement_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileStatement"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:186:1: whileStatement : 'while' '(' expressao ')' instrucao -> ^( WHILE expressao instrucao ) ;
    public final JediParser.whileStatement_return whileStatement() throws RecognitionException {
        JediParser.whileStatement_return retval = new JediParser.whileStatement_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token string_literal160=null;
        Token char_literal161=null;
        Token char_literal163=null;
        JediParser.expressao_return expressao162 =null;

        JediParser.instrucao_return instrucao164 =null;


        TradutorAST string_literal160_tree=null;
        TradutorAST char_literal161_tree=null;
        TradutorAST char_literal163_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_instrucao=new RewriteRuleSubtreeStream(adaptor,"rule instrucao");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:186:16: ( 'while' '(' expressao ')' instrucao -> ^( WHILE expressao instrucao ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:186:18: 'while' '(' expressao ')' instrucao
            {
            string_literal160=(Token)match(input,71,FOLLOW_71_in_whileStatement1741); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(string_literal160);


            char_literal161=(Token)match(input,40,FOLLOW_40_in_whileStatement1743); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_40.add(char_literal161);


            pushFollow(FOLLOW_expressao_in_whileStatement1745);
            expressao162=expressao();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressao.add(expressao162.getTree());

            char_literal163=(Token)match(input,41,FOLLOW_41_in_whileStatement1747); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(char_literal163);


            pushFollow(FOLLOW_instrucao_in_whileStatement1749);
            instrucao164=instrucao();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_instrucao.add(instrucao164.getTree());

            // AST REWRITE
            // elements: instrucao, expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 187:16: -> ^( WHILE expressao instrucao )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:187:19: ^( WHILE expressao instrucao )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(WHILE, "WHILE")
                , root_1);

                adaptor.addChild(root_1, stream_expressao.nextTree());

                adaptor.addChild(root_1, stream_instrucao.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whileStatement"


    public static class doWhileStatement_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doWhileStatement"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:190:1: doWhileStatement : 'do' instrucao 'while' '(' expressao ')' -> ^( DOWHILE expressao instrucao ) ;
    public final JediParser.doWhileStatement_return doWhileStatement() throws RecognitionException {
        JediParser.doWhileStatement_return retval = new JediParser.doWhileStatement_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token string_literal165=null;
        Token string_literal167=null;
        Token char_literal168=null;
        Token char_literal170=null;
        JediParser.instrucao_return instrucao166 =null;

        JediParser.expressao_return expressao169 =null;


        TradutorAST string_literal165_tree=null;
        TradutorAST string_literal167_tree=null;
        TradutorAST char_literal168_tree=null;
        TradutorAST char_literal170_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_instrucao=new RewriteRuleSubtreeStream(adaptor,"rule instrucao");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:190:19: ( 'do' instrucao 'while' '(' expressao ')' -> ^( DOWHILE expressao instrucao ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:190:21: 'do' instrucao 'while' '(' expressao ')'
            {
            string_literal165=(Token)match(input,62,FOLLOW_62_in_doWhileStatement1800); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_62.add(string_literal165);


            pushFollow(FOLLOW_instrucao_in_doWhileStatement1802);
            instrucao166=instrucao();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_instrucao.add(instrucao166.getTree());

            string_literal167=(Token)match(input,71,FOLLOW_71_in_doWhileStatement1804); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(string_literal167);


            char_literal168=(Token)match(input,40,FOLLOW_40_in_doWhileStatement1806); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_40.add(char_literal168);


            pushFollow(FOLLOW_expressao_in_doWhileStatement1808);
            expressao169=expressao();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressao.add(expressao169.getTree());

            char_literal170=(Token)match(input,41,FOLLOW_41_in_doWhileStatement1810); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(char_literal170);


            // AST REWRITE
            // elements: instrucao, expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 191:19: -> ^( DOWHILE expressao instrucao )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:191:22: ^( DOWHILE expressao instrucao )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(DOWHILE, "DOWHILE")
                , root_1);

                adaptor.addChild(root_1, stream_expressao.nextTree());

                adaptor.addChild(root_1, stream_instrucao.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "doWhileStatement"


    public static class forStatement_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forStatement"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:195:1: forStatement : 'for' '(' ( inicializacaoFor )? ';' ( condicaoFor )? ';' ( incrementoFor )? ')' instrucao -> ^( FOR ( inicializacaoFor )? ( condicaoFor )? ( incrementoFor )? instrucao ) ;
    public final JediParser.forStatement_return forStatement() throws RecognitionException {
        JediParser.forStatement_return retval = new JediParser.forStatement_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token string_literal171=null;
        Token char_literal172=null;
        Token char_literal174=null;
        Token char_literal176=null;
        Token char_literal178=null;
        JediParser.inicializacaoFor_return inicializacaoFor173 =null;

        JediParser.condicaoFor_return condicaoFor175 =null;

        JediParser.incrementoFor_return incrementoFor177 =null;

        JediParser.instrucao_return instrucao179 =null;


        TradutorAST string_literal171_tree=null;
        TradutorAST char_literal172_tree=null;
        TradutorAST char_literal174_tree=null;
        TradutorAST char_literal176_tree=null;
        TradutorAST char_literal178_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_condicaoFor=new RewriteRuleSubtreeStream(adaptor,"rule condicaoFor");
        RewriteRuleSubtreeStream stream_instrucao=new RewriteRuleSubtreeStream(adaptor,"rule instrucao");
        RewriteRuleSubtreeStream stream_inicializacaoFor=new RewriteRuleSubtreeStream(adaptor,"rule inicializacaoFor");
        RewriteRuleSubtreeStream stream_incrementoFor=new RewriteRuleSubtreeStream(adaptor,"rule incrementoFor");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:195:14: ( 'for' '(' ( inicializacaoFor )? ';' ( condicaoFor )? ';' ( incrementoFor )? ')' instrucao -> ^( FOR ( inicializacaoFor )? ( condicaoFor )? ( incrementoFor )? instrucao ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:195:16: 'for' '(' ( inicializacaoFor )? ';' ( condicaoFor )? ';' ( incrementoFor )? ')' instrucao
            {
            string_literal171=(Token)match(input,65,FOLLOW_65_in_forStatement1861); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_65.add(string_literal171);


            char_literal172=(Token)match(input,40,FOLLOW_40_in_forStatement1863); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_40.add(char_literal172);


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:195:25: ( inicializacaoFor )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ID||LA43_0==INT||LA43_0==40||LA43_0==44||(LA43_0 >= 46 && LA43_0 <= 47)||(LA43_0 >= 67 && LA43_0 <= 68)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:195:25: inicializacaoFor
                    {
                    pushFollow(FOLLOW_inicializacaoFor_in_forStatement1864);
                    inicializacaoFor173=inicializacaoFor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inicializacaoFor.add(inicializacaoFor173.getTree());

                    }
                    break;

            }


            char_literal174=(Token)match(input,50,FOLLOW_50_in_forStatement1866); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(char_literal174);


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:195:46: ( condicaoFor )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ID||LA44_0==INT||LA44_0==40||LA44_0==44||(LA44_0 >= 46 && LA44_0 <= 47)||(LA44_0 >= 67 && LA44_0 <= 68)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:195:46: condicaoFor
                    {
                    pushFollow(FOLLOW_condicaoFor_in_forStatement1868);
                    condicaoFor175=condicaoFor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condicaoFor.add(condicaoFor175.getTree());

                    }
                    break;

            }


            char_literal176=(Token)match(input,50,FOLLOW_50_in_forStatement1870); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(char_literal176);


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:195:62: ( incrementoFor )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==ID||LA45_0==44||LA45_0==47) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:195:62: incrementoFor
                    {
                    pushFollow(FOLLOW_incrementoFor_in_forStatement1872);
                    incrementoFor177=incrementoFor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incrementoFor.add(incrementoFor177.getTree());

                    }
                    break;

            }


            char_literal178=(Token)match(input,41,FOLLOW_41_in_forStatement1875); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(char_literal178);


            pushFollow(FOLLOW_instrucao_in_forStatement1877);
            instrucao179=instrucao();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_instrucao.add(instrucao179.getTree());

            // AST REWRITE
            // elements: inicializacaoFor, incrementoFor, condicaoFor, instrucao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 196:7: -> ^( FOR ( inicializacaoFor )? ( condicaoFor )? ( incrementoFor )? instrucao )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:196:10: ^( FOR ( inicializacaoFor )? ( condicaoFor )? ( incrementoFor )? instrucao )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(FOR, "FOR")
                , root_1);

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:196:16: ( inicializacaoFor )?
                if ( stream_inicializacaoFor.hasNext() ) {
                    adaptor.addChild(root_1, stream_inicializacaoFor.nextTree());

                }
                stream_inicializacaoFor.reset();

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:196:34: ( condicaoFor )?
                if ( stream_condicaoFor.hasNext() ) {
                    adaptor.addChild(root_1, stream_condicaoFor.nextTree());

                }
                stream_condicaoFor.reset();

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:196:47: ( incrementoFor )?
                if ( stream_incrementoFor.hasNext() ) {
                    adaptor.addChild(root_1, stream_incrementoFor.nextTree());

                }
                stream_incrementoFor.reset();

                adaptor.addChild(root_1, stream_instrucao.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forStatement"


    public static class inicializacaoFor_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inicializacaoFor"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:199:1: inicializacaoFor : ( varDecl ( ',' atribuicao )* -> ^( INIT_FOR varDecl ( atribuicao )* ) | atribuicao ( ',' atribuicao )* -> ^( INIT_FOR ( atribuicao )+ ) );
    public final JediParser.inicializacaoFor_return inicializacaoFor() throws RecognitionException {
        JediParser.inicializacaoFor_return retval = new JediParser.inicializacaoFor_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token char_literal181=null;
        Token char_literal184=null;
        JediParser.varDecl_return varDecl180 =null;

        JediParser.atribuicao_return atribuicao182 =null;

        JediParser.atribuicao_return atribuicao183 =null;

        JediParser.atribuicao_return atribuicao185 =null;


        TradutorAST char_literal181_tree=null;
        TradutorAST char_literal184_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        RewriteRuleSubtreeStream stream_varDecl=new RewriteRuleSubtreeStream(adaptor,"rule varDecl");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:199:18: ( varDecl ( ',' atribuicao )* -> ^( INIT_FOR varDecl ( atribuicao )* ) | atribuicao ( ',' atribuicao )* -> ^( INIT_FOR ( atribuicao )+ ) )
            int alt48=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==ID||LA48_1==58) ) {
                    alt48=1;
                }
                else if ( ((LA48_1 >= 37 && LA48_1 <= 40)||(LA48_1 >= 42 && LA48_1 <= 57)||LA48_1==60||LA48_1==73) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
            case 40:
            case 44:
            case 46:
            case 47:
            case 68:
                {
                alt48=2;
                }
                break;
            case 67:
                {
                int LA48_3 = input.LA(2);

                if ( (LA48_3==ID||LA48_3==58) ) {
                    alt48=1;
                }
                else if ( ((LA48_3 >= 37 && LA48_3 <= 40)||(LA48_3 >= 42 && LA48_3 <= 43)||(LA48_3 >= 45 && LA48_3 <= 46)||(LA48_3 >= 48 && LA48_3 <= 57)||LA48_3==60||LA48_3==73) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:199:21: varDecl ( ',' atribuicao )*
                    {
                    pushFollow(FOLLOW_varDecl_in_inicializacaoFor1937);
                    varDecl180=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDecl.add(varDecl180.getTree());

                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:199:29: ( ',' atribuicao )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==45) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:199:30: ',' atribuicao
                    	    {
                    	    char_literal181=(Token)match(input,45,FOLLOW_45_in_inicializacaoFor1940); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_45.add(char_literal181);


                    	    pushFollow(FOLLOW_atribuicao_in_inicializacaoFor1942);
                    	    atribuicao182=atribuicao();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_atribuicao.add(atribuicao182.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: varDecl, atribuicao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (TradutorAST)adaptor.nil();
                    // 199:48: -> ^( INIT_FOR varDecl ( atribuicao )* )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:199:51: ^( INIT_FOR varDecl ( atribuicao )* )
                        {
                        TradutorAST root_1 = (TradutorAST)adaptor.nil();
                        root_1 = (TradutorAST)adaptor.becomeRoot(
                        (TradutorAST)adaptor.create(INIT_FOR, "INIT_FOR")
                        , root_1);

                        adaptor.addChild(root_1, stream_varDecl.nextTree());

                        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:199:70: ( atribuicao )*
                        while ( stream_atribuicao.hasNext() ) {
                            adaptor.addChild(root_1, stream_atribuicao.nextTree());

                        }
                        stream_atribuicao.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:200:7: atribuicao ( ',' atribuicao )*
                    {
                    pushFollow(FOLLOW_atribuicao_in_inicializacaoFor1964);
                    atribuicao183=atribuicao();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atribuicao.add(atribuicao183.getTree());

                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:200:18: ( ',' atribuicao )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==45) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:200:19: ',' atribuicao
                    	    {
                    	    char_literal184=(Token)match(input,45,FOLLOW_45_in_inicializacaoFor1967); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_45.add(char_literal184);


                    	    pushFollow(FOLLOW_atribuicao_in_inicializacaoFor1969);
                    	    atribuicao185=atribuicao();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_atribuicao.add(atribuicao185.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: atribuicao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (TradutorAST)adaptor.nil();
                    // 200:37: -> ^( INIT_FOR ( atribuicao )+ )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:200:40: ^( INIT_FOR ( atribuicao )+ )
                        {
                        TradutorAST root_1 = (TradutorAST)adaptor.nil();
                        root_1 = (TradutorAST)adaptor.becomeRoot(
                        (TradutorAST)adaptor.create(INIT_FOR, "INIT_FOR")
                        , root_1);

                        if ( !(stream_atribuicao.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_atribuicao.hasNext() ) {
                            adaptor.addChild(root_1, stream_atribuicao.nextTree());

                        }
                        stream_atribuicao.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inicializacaoFor"


    public static class condicaoFor_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condicaoFor"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:203:1: condicaoFor : expressao -> ^( COND_FOR expressao ) ;
    public final JediParser.condicaoFor_return condicaoFor() throws RecognitionException {
        JediParser.condicaoFor_return retval = new JediParser.condicaoFor_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        JediParser.expressao_return expressao186 =null;


        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:203:13: ( expressao -> ^( COND_FOR expressao ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:203:16: expressao
            {
            pushFollow(FOLLOW_expressao_in_condicaoFor2009);
            expressao186=expressao();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressao.add(expressao186.getTree());

            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 204:13: -> ^( COND_FOR expressao )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:204:16: ^( COND_FOR expressao )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(COND_FOR, "COND_FOR")
                , root_1);

                adaptor.addChild(root_1, stream_expressao.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condicaoFor"


    public static class incrementoFor_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "incrementoFor"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:207:1: incrementoFor : incremento ( ',' incremento )* -> ^( INC_FOR ( incremento )+ ) ;
    public final JediParser.incrementoFor_return incrementoFor() throws RecognitionException {
        JediParser.incrementoFor_return retval = new JediParser.incrementoFor_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token char_literal188=null;
        JediParser.incremento_return incremento187 =null;

        JediParser.incremento_return incremento189 =null;


        TradutorAST char_literal188_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleSubtreeStream stream_incremento=new RewriteRuleSubtreeStream(adaptor,"rule incremento");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:207:15: ( incremento ( ',' incremento )* -> ^( INC_FOR ( incremento )+ ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:207:17: incremento ( ',' incremento )*
            {
            pushFollow(FOLLOW_incremento_in_incrementoFor2048);
            incremento187=incremento();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_incremento.add(incremento187.getTree());

            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:207:28: ( ',' incremento )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==45) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:207:29: ',' incremento
            	    {
            	    char_literal188=(Token)match(input,45,FOLLOW_45_in_incrementoFor2051); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_45.add(char_literal188);


            	    pushFollow(FOLLOW_incremento_in_incrementoFor2053);
            	    incremento189=incremento();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_incremento.add(incremento189.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            // AST REWRITE
            // elements: incremento
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 208:15: -> ^( INC_FOR ( incremento )+ )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:208:18: ^( INC_FOR ( incremento )+ )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(INC_FOR, "INC_FOR")
                , root_1);

                if ( !(stream_incremento.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_incremento.hasNext() ) {
                    adaptor.addChild(root_1, stream_incremento.nextTree());

                }
                stream_incremento.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "incrementoFor"


    public static class returnStatement_return extends ParserRuleReturnScope {
        TradutorAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnStatement"
    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:211:1: returnStatement : 'return' ( expressao )? -> ^( RETURN ( expressao )? ) ;
    public final JediParser.returnStatement_return returnStatement() throws RecognitionException {
        JediParser.returnStatement_return retval = new JediParser.returnStatement_return();
        retval.start = input.LT(1);


        TradutorAST root_0 = null;

        Token string_literal190=null;
        JediParser.expressao_return expressao191 =null;


        TradutorAST string_literal190_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:211:17: ( 'return' ( expressao )? -> ^( RETURN ( expressao )? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:211:20: 'return' ( expressao )?
            {
            string_literal190=(Token)match(input,69,FOLLOW_69_in_returnStatement2117); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(string_literal190);


            // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:211:29: ( expressao )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ID||LA50_0==INT||LA50_0==40||LA50_0==44||(LA50_0 >= 46 && LA50_0 <= 47)||(LA50_0 >= 67 && LA50_0 <= 68)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:211:29: expressao
                    {
                    pushFollow(FOLLOW_expressao_in_returnStatement2119);
                    expressao191=expressao();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressao.add(expressao191.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (TradutorAST)adaptor.nil();
            // 211:40: -> ^( RETURN ( expressao )? )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:211:43: ^( RETURN ( expressao )? )
                {
                TradutorAST root_1 = (TradutorAST)adaptor.nil();
                root_1 = (TradutorAST)adaptor.becomeRoot(
                (TradutorAST)adaptor.create(RETURN, "RETURN")
                , root_1);

                // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:211:52: ( expressao )?
                if ( stream_expressao.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressao.nextTree());

                }
                stream_expressao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (TradutorAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (TradutorAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "returnStatement"

    // $ANTLR start synpred1_Jedi
    public final void synpred1_Jedi_fragment() throws RecognitionException {
        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:116:5: ( '.' ID '(' listaExpressoes ')' )
        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:116:5: '.' ID '(' listaExpressoes ')'
        {
        match(input,48,FOLLOW_48_in_synpred1_Jedi862); if (state.failed) return ;

        match(input,ID,FOLLOW_ID_in_synpred1_Jedi864); if (state.failed) return ;

        match(input,40,FOLLOW_40_in_synpred1_Jedi866); if (state.failed) return ;

        pushFollow(FOLLOW_listaExpressoes_in_synpred1_Jedi868);
        listaExpressoes();

        state._fsp--;
        if (state.failed) return ;

        match(input,41,FOLLOW_41_in_synpred1_Jedi870); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Jedi

    // $ANTLR start synpred2_Jedi
    public final void synpred2_Jedi_fragment() throws RecognitionException {
        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:117:5: ( '.' ID )
        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:117:5: '.' ID
        {
        match(input,48,FOLLOW_48_in_synpred2_Jedi894); if (state.failed) return ;

        match(input,ID,FOLLOW_ID_in_synpred2_Jedi896); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Jedi

    // $ANTLR start synpred3_Jedi
    public final void synpred3_Jedi_fragment() throws RecognitionException {
        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:118:5: ( '(' listaExpressoes ')' )
        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:118:5: '(' listaExpressoes ')'
        {
        match(input,40,FOLLOW_40_in_synpred3_Jedi920); if (state.failed) return ;

        pushFollow(FOLLOW_listaExpressoes_in_synpred3_Jedi922);
        listaExpressoes();

        state._fsp--;
        if (state.failed) return ;

        match(input,41,FOLLOW_41_in_synpred3_Jedi924); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Jedi

    // $ANTLR start synpred4_Jedi
    public final void synpred4_Jedi_fragment() throws RecognitionException {
        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:119:11: ( '(' ')' )
        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:119:11: '(' ')'
        {
        match(input,40,FOLLOW_40_in_synpred4_Jedi954); if (state.failed) return ;

        match(input,41,FOLLOW_41_in_synpred4_Jedi955); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Jedi

    // $ANTLR start synpred5_Jedi
    public final void synpred5_Jedi_fragment() throws RecognitionException {
        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:120:11: ( '.' ID '[' expressao ']' )
        // C:\\Users\\Tiago\\Git\\IGED\\src\\br\\ufpb\\iged\\tradutor\\gramaticas\\Jedi.g:120:11: '.' ID '[' expressao ']'
        {
        match(input,48,FOLLOW_48_in_synpred5_Jedi1000); if (state.failed) return ;

        match(input,ID,FOLLOW_ID_in_synpred5_Jedi1002); if (state.failed) return ;

        match(input,57,FOLLOW_57_in_synpred5_Jedi1004); if (state.failed) return ;

        pushFollow(FOLLOW_expressao_in_synpred5_Jedi1006);
        expressao();

        state._fsp--;
        if (state.failed) return ;

        match(input,59,FOLLOW_59_in_synpred5_Jedi1008); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Jedi

    // Delegated rules

    public final boolean synpred2_Jedi() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Jedi_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Jedi() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Jedi_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Jedi() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Jedi_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Jedi() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Jedi_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Jedi() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Jedi_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA29_eotS =
        "\12\uffff";
    static final String DFA29_eofS =
        "\12\uffff";
    static final String DFA29_minS =
        "\1\15\1\uffff\1\45\4\uffff\1\15\1\uffff\1\45";
    static final String DFA29_maxS =
        "\1\103\1\uffff\1\111\4\uffff\1\15\1\uffff\1\111";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\2\1\uffff";
    static final String DFA29_specialS =
        "\12\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\2\3\uffff\1\1\26\uffff\1\6\3\uffff\1\5\1\uffff\1\4\1\5\23"+
            "\uffff\1\3",
            "",
            "\7\10\1\5\2\10\1\5\1\7\11\10\1\uffff\2\10\14\uffff\1\10",
            "",
            "",
            "",
            "",
            "\1\11",
            "",
            "\7\10\1\5\2\10\1\5\1\7\11\10\1\uffff\2\10\14\uffff\1\10"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "130:1: primaria : ( INT | ID -> ID | 'int' -> 'int' | '-' ^ ID | incremento | '(' expressao ')' -> expressao );";
        }
    }
    static final String DFA34_eotS =
        "\10\uffff";
    static final String DFA34_eofS =
        "\10\uffff";
    static final String DFA34_minS =
        "\1\15\2\uffff\1\54\1\15\2\uffff\1\54";
    static final String DFA34_maxS =
        "\1\57\2\uffff\1\60\1\15\2\uffff\1\60";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\3\1\4\1\uffff";
    static final String DFA34_specialS =
        "\10\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\3\36\uffff\1\2\2\uffff\1\1",
            "",
            "",
            "\1\6\2\uffff\1\5\1\4",
            "\1\7",
            "",
            "",
            "\1\6\2\uffff\1\5\1\4"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "143:1: incremento : ( '--' ID ( '.' ID )* -> ^( PRE_DECREMENTO ( ID )+ ) | '++' ID ( '.' ID )* -> ^( PRE_INCREMENTO ( ID )+ ) | ID ( '.' ID )* '--' -> ^( POS_DECREMENTO ( ID )+ ) | ID ( '.' ID )* '++' -> ^( POS_INCREMENTO ( ID )+ ) );";
        }
    }
 

    public static final BitSet FOLLOW_classe_in_programa205 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_classe214 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_classe216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000101L});
    public static final BitSet FOLLOW_superClasse_in_classe219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_classe222 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000048L});
    public static final BitSet FOLLOW_membroClasse_in_classe224 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000448L});
    public static final BitSet FOLLOW_74_in_classe227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_superClasse269 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_superClasse271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDecl_in_membroClasse289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constrDecl_in_membroClasse293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDecl_in_membroClasse297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_fieldDecl309 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_tipo_in_fieldDecl312 = new BitSet(new long[]{0x0400000000002000L});
    public static final BitSet FOLLOW_58_in_fieldDecl317 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_fieldDecl320 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_fieldDecl323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_methodDecl360 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_tipo_in_methodDecl363 = new BitSet(new long[]{0x0400000000002000L});
    public static final BitSet FOLLOW_58_in_methodDecl368 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_methodDecl371 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_methodDecl373 = new BitSet(new long[]{0x0000020000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_params_in_methodDecl375 = new BitSet(new long[]{0x0000020000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_41_in_methodDecl378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_bloco_in_methodDecl380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constrDecl432 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_constrDecl434 = new BitSet(new long[]{0x0000020000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_params_in_constrDecl436 = new BitSet(new long[]{0x0000020000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_41_in_constrDecl439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_bloco_in_constrDecl441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params484 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_params487 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_param_in_params489 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_tipo_in_param509 = new BitSet(new long[]{0x0400000000002000L});
    public static final BitSet FOLLOW_58_in_param514 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_param517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_instrucao541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressao_in_instrucao546 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_instrucao548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listaVarDecl_in_instrucao553 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_instrucao555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloco_in_instrucao560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_instrucao565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_instrucao570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doWhileStatement_in_instrucao575 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_instrucao577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_instrucao582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_instrucao587 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_instrucao589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atribuicao_in_expressao602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_atribuicao619 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_atribuicao623 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_or_in_atribuicao627 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_and_in_or638 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_or642 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_and_in_or646 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_xor_in_and657 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_and661 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_xor_in_and665 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_igualdade_in_xor679 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_xor683 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_igualdade_in_xor687 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_relacional_in_igualdade701 = new BitSet(new long[]{0x0040002000000002L});
    public static final BitSet FOLLOW_54_in_igualdade705 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_37_in_igualdade709 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_relacional_in_igualdade713 = new BitSet(new long[]{0x0040002000000002L});
    public static final BitSet FOLLOW_add_in_relacional724 = new BitSet(new long[]{0x0198000000000002L});
    public static final BitSet FOLLOW_51_in_relacional728 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_55_in_relacional733 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_56_in_relacional738 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_52_in_relacional743 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_add_in_relacional747 = new BitSet(new long[]{0x0198000000000002L});
    public static final BitSet FOLLOW_mult_in_add759 = new BitSet(new long[]{0x0000480000000002L});
    public static final BitSet FOLLOW_43_in_add763 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_46_in_add767 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_mult_in_add771 = new BitSet(new long[]{0x0000480000000002L});
    public static final BitSet FOLLOW_novo_in_mult781 = new BitSet(new long[]{0x0002044000000002L});
    public static final BitSet FOLLOW_42_in_mult785 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_49_in_mult790 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_38_in_mult795 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_novo_in_mult799 = new BitSet(new long[]{0x0002044000000002L});
    public static final BitSet FOLLOW_posfixa_in_novo811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_novo817 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000008L});
    public static final BitSet FOLLOW_posfixa_in_novo821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaria_in_posfixa839 = new BitSet(new long[]{0x0201010000000002L});
    public static final BitSet FOLLOW_48_in_posfixa862 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_posfixa864 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_posfixa866 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_listaExpressoes_in_posfixa868 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_posfixa870 = new BitSet(new long[]{0x0201010000000002L});
    public static final BitSet FOLLOW_48_in_posfixa894 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_posfixa896 = new BitSet(new long[]{0x0201010000000002L});
    public static final BitSet FOLLOW_40_in_posfixa920 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_listaExpressoes_in_posfixa922 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_posfixa924 = new BitSet(new long[]{0x0201010000000002L});
    public static final BitSet FOLLOW_40_in_posfixa954 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_posfixa955 = new BitSet(new long[]{0x0201010000000002L});
    public static final BitSet FOLLOW_48_in_posfixa1000 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_posfixa1002 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_posfixa1004 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_expressao_in_posfixa1006 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_posfixa1008 = new BitSet(new long[]{0x0201010000000002L});
    public static final BitSet FOLLOW_57_in_posfixa1038 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_expressao_in_posfixa1040 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_posfixa1042 = new BitSet(new long[]{0x0201010000000002L});
    public static final BitSet FOLLOW_expressao_in_listaExpressoes1077 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_listaExpressoes1080 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_expressao_in_listaExpressoes1082 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_INT_in_primaria1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primaria1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_primaria1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_primaria1164 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_primaria1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incremento_in_primaria1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_primaria1185 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_expressao_in_primaria1187 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_primaria1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_incremento1208 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_incremento1210 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_incremento1213 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_incremento1214 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_44_in_incremento1238 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_incremento1240 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_incremento1243 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_incremento1244 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ID_in_incremento1272 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_48_in_incremento1275 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_incremento1276 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_47_in_incremento1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_incremento1306 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_incremento1309 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_incremento1310 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_incremento1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_chamadaMetodo1346 = new BitSet(new long[]{0x0001010000000000L});
    public static final BitSet FOLLOW_48_in_chamadaMetodo1366 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_chamadaMetodo1368 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_chamadaMetodo1370 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_listaExpressoes_in_chamadaMetodo1372 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_chamadaMetodo1374 = new BitSet(new long[]{0x0001010000000002L});
    public static final BitSet FOLLOW_40_in_chamadaMetodo1398 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_listaExpressoes_in_chamadaMetodo1400 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_chamadaMetodo1402 = new BitSet(new long[]{0x0001010000000002L});
    public static final BitSet FOLLOW_tipo_in_varDecl1444 = new BitSet(new long[]{0x0400000000002000L});
    public static final BitSet FOLLOW_58_in_varDecl1449 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_varDecl1452 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_varDecl1455 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_expressao_in_varDecl1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_listaVarDecl1504 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_varDeclLista_in_listaVarDecl1507 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_varDeclLista1549 = new BitSet(new long[]{0x0400000000002000L});
    public static final BitSet FOLLOW_58_in_varDeclLista1555 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_varDeclLista1558 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_varDeclLista1562 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_expressao_in_varDeclLista1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ifStatement1638 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifStatement1640 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_expressao_in_ifStatement1642 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ifStatement1644 = new BitSet(new long[]{0x4004D10000022000L,0x00000000000001BEL});
    public static final BitSet FOLLOW_instrucao_in_ifStatement1646 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_elseIf_in_ifStatement1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_elseIf1685 = new BitSet(new long[]{0x4004D10000022000L,0x00000000000001BEL});
    public static final BitSet FOLLOW_instrucao_in_elseIf1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_bloco1708 = new BitSet(new long[]{0x4004D10000022000L,0x00000000000005BEL});
    public static final BitSet FOLLOW_instrucao_in_bloco1710 = new BitSet(new long[]{0x4004D10000022000L,0x00000000000005BEL});
    public static final BitSet FOLLOW_74_in_bloco1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_whileStatement1741 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_whileStatement1743 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_expressao_in_whileStatement1745 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_whileStatement1747 = new BitSet(new long[]{0x4004D10000022000L,0x00000000000001BEL});
    public static final BitSet FOLLOW_instrucao_in_whileStatement1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_doWhileStatement1800 = new BitSet(new long[]{0x4004D10000022000L,0x00000000000001BEL});
    public static final BitSet FOLLOW_instrucao_in_doWhileStatement1802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_doWhileStatement1804 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_doWhileStatement1806 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_expressao_in_doWhileStatement1808 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_doWhileStatement1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_forStatement1861 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_forStatement1863 = new BitSet(new long[]{0x0004D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_inicializacaoFor_in_forStatement1864 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_forStatement1866 = new BitSet(new long[]{0x0004D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_condicaoFor_in_forStatement1868 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_forStatement1870 = new BitSet(new long[]{0x0000920000002000L});
    public static final BitSet FOLLOW_incrementoFor_in_forStatement1872 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_forStatement1875 = new BitSet(new long[]{0x4004D10000022000L,0x00000000000001BEL});
    public static final BitSet FOLLOW_instrucao_in_forStatement1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_inicializacaoFor1937 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_inicializacaoFor1940 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_atribuicao_in_inicializacaoFor1942 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_atribuicao_in_inicializacaoFor1964 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_inicializacaoFor1967 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_atribuicao_in_inicializacaoFor1969 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_expressao_in_condicaoFor2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incremento_in_incrementoFor2048 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_incrementoFor2051 = new BitSet(new long[]{0x0000900000002000L});
    public static final BitSet FOLLOW_incremento_in_incrementoFor2053 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_69_in_returnStatement2117 = new BitSet(new long[]{0x0000D10000022002L,0x0000000000000018L});
    public static final BitSet FOLLOW_expressao_in_returnStatement2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred1_Jedi862 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_synpred1_Jedi864 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_synpred1_Jedi866 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_listaExpressoes_in_synpred1_Jedi868 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred1_Jedi870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred2_Jedi894 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_synpred2_Jedi896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred3_Jedi920 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_listaExpressoes_in_synpred3_Jedi922 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred3_Jedi924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred4_Jedi954 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred4_Jedi955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred5_Jedi1000 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_synpred5_Jedi1002 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred5_Jedi1004 = new BitSet(new long[]{0x0000D10000022000L,0x0000000000000018L});
    public static final BitSet FOLLOW_expressao_in_synpred5_Jedi1006 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_synpred5_Jedi1008 = new BitSet(new long[]{0x0000000000000002L});

}