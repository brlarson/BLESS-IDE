package com.multitude.aadl.bless.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBLESSLexer extends Lexer {
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int RULE_DOTCOMMA=7;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=9;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_DIGIT=13;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int T__168=168;
    public static final int T__167=167;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int RULE_LETTER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int RULE_DOTDOT=5;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__174=174;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__169=169;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int RULE_COMMACOMMA=8;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=11;
    public static final int RULE_NUMBER=4;
    public static final int RULE_COMMADOT=6;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalBLESSLexer() {;} 
    public InternalBLESSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBLESSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBLESS.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:11:7: ( 'any' )
            // InternalBLESS.g:11:9: 'any'
            {
            match("any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:12:7: ( '*' )
            // InternalBLESS.g:12:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:13:7: ( '=' )
            // InternalBLESS.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:14:7: ( '<>' )
            // InternalBLESS.g:14:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:15:7: ( '<' )
            // InternalBLESS.g:15:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:16:7: ( '<=' )
            // InternalBLESS.g:16:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:17:7: ( '>=' )
            // InternalBLESS.g:17:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:18:7: ( '>' )
            // InternalBLESS.g:18:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:19:7: ( '!=' )
            // InternalBLESS.g:19:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:20:7: ( '+=' )
            // InternalBLESS.g:20:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:21:7: ( '/' )
            // InternalBLESS.g:21:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:22:7: ( 'div' )
            // InternalBLESS.g:22:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:23:7: ( 'mod' )
            // InternalBLESS.g:23:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:24:7: ( 'rem' )
            // InternalBLESS.g:24:9: 'rem'
            {
            match("rem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:25:7: ( 'unitlibrary' )
            // InternalBLESS.g:25:9: 'unitlibrary'
            {
            match("unitlibrary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:26:7: ( 'typelibrary' )
            // InternalBLESS.g:26:9: 'typelibrary'
            {
            match("typelibrary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:27:7: ( 'assertionlibrary' )
            // InternalBLESS.g:27:9: 'assertionlibrary'
            {
            match("assertionlibrary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:28:7: ( 'actionsubclause' )
            // InternalBLESS.g:28:9: 'actionsubclause'
            {
            match("actionsubclause"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:29:7: ( 'exceptions' )
            // InternalBLESS.g:29:9: 'exceptions'
            {
            match("exceptions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:30:7: ( 'blesssubclause' )
            // InternalBLESS.g:30:9: 'blesssubclause'
            {
            match("blesssubclause"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:31:7: ( 'pre' )
            // InternalBLESS.g:31:9: 'pre'
            {
            match("pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:32:7: ( 'post' )
            // InternalBLESS.g:32:9: 'post'
            {
            match("post"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:33:7: ( 'invariant' )
            // InternalBLESS.g:33:9: 'invariant'
            {
            match("invariant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:34:7: ( 'variables' )
            // InternalBLESS.g:34:9: 'variables'
            {
            match("variables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:35:7: ( ':' )
            // InternalBLESS.g:35:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:36:7: ( 'state' )
            // InternalBLESS.g:36:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:37:7: ( ';' )
            // InternalBLESS.g:37:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:38:7: ( 'transitions' )
            // InternalBLESS.g:38:9: 'transitions'
            {
            match("transitions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:39:7: ( '-[' )
            // InternalBLESS.g:39:9: '-['
            {
            match("-["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:40:7: ( ']->' )
            // InternalBLESS.g:40:9: ']->'
            {
            match("]->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:41:7: ( ',' )
            // InternalBLESS.g:41:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:42:7: ( '{' )
            // InternalBLESS.g:42:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:43:7: ( '}' )
            // InternalBLESS.g:43:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:44:7: ( '[' )
            // InternalBLESS.g:44:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:45:7: ( ']' )
            // InternalBLESS.g:45:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:46:7: ( 'on' )
            // InternalBLESS.g:46:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:47:7: ( 'or' )
            // InternalBLESS.g:47:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:48:7: ( 'access' )
            // InternalBLESS.g:48:9: 'access'
            {
            match("access"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:49:7: ( 'and' )
            // InternalBLESS.g:49:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:50:7: ( ')' )
            // InternalBLESS.g:50:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:51:7: ( '.' )
            // InternalBLESS.g:51:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:52:7: ( '(' )
            // InternalBLESS.g:52:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:53:7: ( 'internal' )
            // InternalBLESS.g:53:9: 'internal'
            {
            match("internal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:54:7: ( 'assert' )
            // InternalBLESS.g:54:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:55:7: ( 'declare' )
            // InternalBLESS.g:55:9: 'declare'
            {
            match("declare"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:56:7: ( 'forall' )
            // InternalBLESS.g:56:9: 'forall'
            {
            match("forall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:57:7: ( 'in' )
            // InternalBLESS.g:57:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:58:7: ( '&' )
            // InternalBLESS.g:58:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:59:7: ( 'setmode' )
            // InternalBLESS.g:59:9: 'setmode'
            {
            match("setmode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:60:7: ( '!' )
            // InternalBLESS.g:60:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:61:7: ( '?' )
            // InternalBLESS.g:61:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:62:7: ( '|' )
            // InternalBLESS.g:62:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:63:7: ( 'if' )
            // InternalBLESS.g:63:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:64:7: ( ')~>' )
            // InternalBLESS.g:64:9: ')~>'
            {
            match(")~>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:65:7: ( 'fi' )
            // InternalBLESS.g:65:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:66:7: ( '[]' )
            // InternalBLESS.g:66:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:67:7: ( 'while' )
            // InternalBLESS.g:67:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:68:7: ( 'for' )
            // InternalBLESS.g:68:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:69:7: ( 'do' )
            // InternalBLESS.g:69:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:70:7: ( 'until' )
            // InternalBLESS.g:70:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:71:7: ( 'throws' )
            // InternalBLESS.g:71:9: 'throws'
            {
            match("throws"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:72:7: ( 'catch' )
            // InternalBLESS.g:72:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:73:7: ( 'when' )
            // InternalBLESS.g:73:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:74:7: ( 'throw' )
            // InternalBLESS.g:74:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:75:7: ( 'computation' )
            // InternalBLESS.g:75:9: 'computation'
            {
            match("computation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:76:7: ( 'binding' )
            // InternalBLESS.g:76:9: 'binding'
            {
            match("binding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:77:7: ( 'end' )
            // InternalBLESS.g:77:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:78:7: ( 'elsif' )
            // InternalBLESS.g:78:9: 'elsif'
            {
            match("elsif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:79:7: ( 'else' )
            // InternalBLESS.g:79:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:80:7: ( 'exception' )
            // InternalBLESS.g:80:9: 'exception'
            {
            match("exception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:81:7: ( 'frozen' )
            // InternalBLESS.g:81:9: 'frozen'
            {
            match("frozen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:82:7: ( 'timeout' )
            // InternalBLESS.g:82:9: 'timeout'
            {
            match("timeout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:83:7: ( 'ghost' )
            // InternalBLESS.g:83:9: 'ghost'
            {
            match("ghost"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:84:7: ( 'def' )
            // InternalBLESS.g:84:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:85:7: ( '~' )
            // InternalBLESS.g:85:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:86:7: ( '<<' )
            // InternalBLESS.g:86:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:87:7: ( '>>' )
            // InternalBLESS.g:87:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:88:7: ( 'returns' )
            // InternalBLESS.g:88:9: 'returns'
            {
            match("returns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:89:7: ( '+=>' )
            // InternalBLESS.g:89:9: '+=>'
            {
            match("+=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:90:7: ( 'xor' )
            // InternalBLESS.g:90:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:91:7: ( 'then' )
            // InternalBLESS.g:91:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:92:7: ( '+' )
            // InternalBLESS.g:92:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:93:7: ( '??' )
            // InternalBLESS.g:93:9: '??'
            {
            match("??"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:94:7: ( '$' )
            // InternalBLESS.g:94:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:95:7: ( '\\'' )
            // InternalBLESS.g:95:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:96:8: ( 'case' )
            // InternalBLESS.g:96:10: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:97:8: ( '->' )
            // InternalBLESS.g:97:10: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:98:8: ( 'sum' )
            // InternalBLESS.g:98:10: 'sum'
            {
            match("sum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:99:8: ( 'of' )
            // InternalBLESS.g:99:10: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:100:8: ( 'product' )
            // InternalBLESS.g:100:10: 'product'
            {
            match("product"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:101:8: ( 'numberof' )
            // InternalBLESS.g:101:10: 'numberof'
            {
            match("numberof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:102:8: ( 'that' )
            // InternalBLESS.g:102:10: 'that'
            {
            match("that"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:103:8: ( 'all' )
            // InternalBLESS.g:103:10: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:104:8: ( 'are' )
            // InternalBLESS.g:104:10: 'are'
            {
            match("are"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:105:8: ( 'exists' )
            // InternalBLESS.g:105:10: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:106:8: ( '=>' )
            // InternalBLESS.g:106:10: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:107:8: ( ')->' )
            // InternalBLESS.g:107:10: ')->'
            {
            match(")->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:108:8: ( 'type' )
            // InternalBLESS.g:108:10: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:109:8: ( 'is' )
            // InternalBLESS.g:109:10: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:110:8: ( 'enumeration' )
            // InternalBLESS.g:110:10: 'enumeration'
            {
            match("enumeration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:111:8: ( 'quantity' )
            // InternalBLESS.g:111:10: 'quantity'
            {
            match("quantity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:112:8: ( 'array' )
            // InternalBLESS.g:112:10: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:113:8: ( '#' )
            // InternalBLESS.g:113:10: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:114:8: ( 'extension' )
            // InternalBLESS.g:114:10: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:115:8: ( '::' )
            // InternalBLESS.g:115:10: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:116:8: ( 'DO_NOT_PROVE' )
            // InternalBLESS.g:116:10: 'DO_NOT_PROVE'
            {
            match("DO_NOT_PROVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:117:8: ( 'states' )
            // InternalBLESS.g:117:10: 'states'
            {
            match("states"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:118:8: ( 'initial' )
            // InternalBLESS.g:118:10: 'initial'
            {
            match("initial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:119:8: ( 'complete' )
            // InternalBLESS.g:119:10: 'complete'
            {
            match("complete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:120:8: ( 'final' )
            // InternalBLESS.g:120:10: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:121:8: ( 'mode' )
            // InternalBLESS.g:121:10: 'mode'
            {
            match("mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:122:8: ( 'dispatch' )
            // InternalBLESS.g:122:10: 'dispatch'
            {
            match("dispatch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:123:8: ( 'otherwise' )
            // InternalBLESS.g:123:10: 'otherwise'
            {
            match("otherwise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:124:8: ( 'nonvolatile' )
            // InternalBLESS.g:124:10: 'nonvolatile'
            {
            match("nonvolatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:125:8: ( 'shared' )
            // InternalBLESS.g:125:10: 'shared'
            {
            match("shared"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:126:8: ( 'constant' )
            // InternalBLESS.g:126:10: 'constant'
            {
            match("constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:127:8: ( 'spread' )
            // InternalBLESS.g:127:10: 'spread'
            {
            match("spread"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:128:8: ( ':=' )
            // InternalBLESS.g:128:10: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:129:8: ( 'skip' )
            // InternalBLESS.g:129:10: 'skip'
            {
            match("skip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:130:8: ( 'fetchadd' )
            // InternalBLESS.g:130:10: 'fetchadd'
            {
            match("fetchadd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:131:8: ( 'fetchor' )
            // InternalBLESS.g:131:10: 'fetchor'
            {
            match("fetchor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:132:8: ( 'fetchand' )
            // InternalBLESS.g:132:10: 'fetchand'
            {
            match("fetchand"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:133:8: ( 'fetchxor' )
            // InternalBLESS.g:133:10: 'fetchxor'
            {
            match("fetchxor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:134:8: ( 'swap' )
            // InternalBLESS.g:134:10: 'swap'
            {
            match("swap"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:135:8: ( 'bound' )
            // InternalBLESS.g:135:10: 'bound'
            {
            match("bound"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:136:8: ( '*!<' )
            // InternalBLESS.g:136:10: '*!<'
            {
            match("*!<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:137:8: ( '*!>' )
            // InternalBLESS.g:137:10: '*!>'
            {
            match("*!>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:138:8: ( '!<' )
            // InternalBLESS.g:138:10: '!<'
            {
            match("!<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:139:8: ( '!>' )
            // InternalBLESS.g:139:10: '!>'
            {
            match("!>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:140:8: ( 'pause' )
            // InternalBLESS.g:140:10: 'pause'
            {
            match("pause"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:141:8: ( 'iff' )
            // InternalBLESS.g:141:10: 'iff'
            {
            match("iff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:142:8: ( 'implies' )
            // InternalBLESS.g:142:10: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:143:8: ( '-' )
            // InternalBLESS.g:143:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:144:8: ( '**' )
            // InternalBLESS.g:144:10: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:145:8: ( '@' )
            // InternalBLESS.g:145:10: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:146:8: ( '^' )
            // InternalBLESS.g:146:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:147:8: ( 'not' )
            // InternalBLESS.g:147:10: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:148:8: ( 'abs' )
            // InternalBLESS.g:148:10: 'abs'
            {
            match("abs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:149:8: ( 'truncate' )
            // InternalBLESS.g:149:10: 'truncate'
            {
            match("truncate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:150:8: ( 'round' )
            // InternalBLESS.g:150:10: 'round'
            {
            match("round"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:151:8: ( 'now' )
            // InternalBLESS.g:151:10: 'now'
            {
            match("now"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:152:8: ( 'tops' )
            // InternalBLESS.g:152:10: 'tops'
            {
            match("tops"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:153:8: ( 'true' )
            // InternalBLESS.g:153:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:154:8: ( 'false' )
            // InternalBLESS.g:154:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:155:8: ( 'null' )
            // InternalBLESS.g:155:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:156:8: ( 'fresh' )
            // InternalBLESS.g:156:10: 'fresh'
            {
            match("fresh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:157:8: ( 'count' )
            // InternalBLESS.g:157:10: 'count'
            {
            match("count"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:158:8: ( 'updated' )
            // InternalBLESS.g:158:10: 'updated'
            {
            match("updated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:159:8: ( 'which' )
            // InternalBLESS.g:159:10: 'which'
            {
            match("which"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:160:8: ( 'boolean' )
            // InternalBLESS.g:160:10: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:161:8: ( 'string' )
            // InternalBLESS.g:161:10: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:162:8: ( 'scalar' )
            // InternalBLESS.g:162:10: 'scalar'
            {
            match("scalar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:163:8: ( 'whole' )
            // InternalBLESS.g:163:10: 'whole'
            {
            match("whole"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:164:8: ( 'record' )
            // InternalBLESS.g:164:10: 'record'
            {
            match("record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:165:8: ( 'variant' )
            // InternalBLESS.g:165:10: 'variant'
            {
            match("variant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:166:8: ( 'union' )
            // InternalBLESS.g:166:10: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:167:8: ( 'self' )
            // InternalBLESS.g:167:10: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:168:8: ( 'upper_bound' )
            // InternalBLESS.g:168:10: 'upper_bound'
            {
            match("upper_bound"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:169:8: ( 'lower_bound' )
            // InternalBLESS.g:169:10: 'lower_bound'
            {
            match("lower_bound"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:170:8: ( 'base' )
            // InternalBLESS.g:170:10: 'base'
            {
            match("base"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:34892:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBLESS.g:34892:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBLESS.g:34892:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBLESS.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:34894:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBLESS.g:34894:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalBLESS.g:34894:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBLESS.g:34894:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalBLESS.g:34894:40: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBLESS.g:34894:41: ( '\\r' )? '\\n'
                    {
                    // InternalBLESS.g:34894:41: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalBLESS.g:34894:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalBLESS.g:34896:21: ( '0' .. '9' )
            // InternalBLESS.g:34896:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:34898:13: ( ( '-' )? ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ ( 'e' ( '-' )? ( RULE_DIGIT )+ )? )? ( 'i' ( '-' )? ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ ( 'e' ( '-' )? ( RULE_DIGIT )+ )? )? )? )
            // InternalBLESS.g:34898:15: ( '-' )? ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ ( 'e' ( '-' )? ( RULE_DIGIT )+ )? )? ( 'i' ( '-' )? ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ ( 'e' ( '-' )? ( RULE_DIGIT )+ )? )? )?
            {
            // InternalBLESS.g:34898:15: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBLESS.g:34898:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalBLESS.g:34898:20: ( RULE_DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBLESS.g:34898:20: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // InternalBLESS.g:34898:32: ( '.' ( RULE_DIGIT )+ ( 'e' ( '-' )? ( RULE_DIGIT )+ )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='.') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBLESS.g:34898:33: '.' ( RULE_DIGIT )+ ( 'e' ( '-' )? ( RULE_DIGIT )+ )?
                    {
                    match('.'); 
                    // InternalBLESS.g:34898:37: ( RULE_DIGIT )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBLESS.g:34898:37: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // InternalBLESS.g:34898:49: ( 'e' ( '-' )? ( RULE_DIGIT )+ )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalBLESS.g:34898:50: 'e' ( '-' )? ( RULE_DIGIT )+
                            {
                            match('e'); 
                            // InternalBLESS.g:34898:54: ( '-' )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0=='-') ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // InternalBLESS.g:34898:54: '-'
                                    {
                                    match('-'); 

                                    }
                                    break;

                            }

                            // InternalBLESS.g:34898:59: ( RULE_DIGIT )+
                            int cnt9=0;
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // InternalBLESS.g:34898:59: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt9 >= 1 ) break loop9;
                                        EarlyExitException eee =
                                            new EarlyExitException(9, input);
                                        throw eee;
                                }
                                cnt9++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalBLESS.g:34898:75: ( 'i' ( '-' )? ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ ( 'e' ( '-' )? ( RULE_DIGIT )+ )? )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='i') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBLESS.g:34898:76: 'i' ( '-' )? ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ ( 'e' ( '-' )? ( RULE_DIGIT )+ )? )?
                    {
                    match('i'); 
                    // InternalBLESS.g:34898:80: ( '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='-') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalBLESS.g:34898:80: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // InternalBLESS.g:34898:85: ( RULE_DIGIT )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBLESS.g:34898:85: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    // InternalBLESS.g:34898:97: ( '.' ( RULE_DIGIT )+ ( 'e' ( '-' )? ( RULE_DIGIT )+ )? )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='.') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalBLESS.g:34898:98: '.' ( RULE_DIGIT )+ ( 'e' ( '-' )? ( RULE_DIGIT )+ )?
                            {
                            match('.'); 
                            // InternalBLESS.g:34898:102: ( RULE_DIGIT )+
                            int cnt14=0;
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalBLESS.g:34898:102: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt14 >= 1 ) break loop14;
                                        EarlyExitException eee =
                                            new EarlyExitException(14, input);
                                        throw eee;
                                }
                                cnt14++;
                            } while (true);

                            // InternalBLESS.g:34898:114: ( 'e' ( '-' )? ( RULE_DIGIT )+ )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0=='e') ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // InternalBLESS.g:34898:115: 'e' ( '-' )? ( RULE_DIGIT )+
                                    {
                                    match('e'); 
                                    // InternalBLESS.g:34898:119: ( '-' )?
                                    int alt15=2;
                                    int LA15_0 = input.LA(1);

                                    if ( (LA15_0=='-') ) {
                                        alt15=1;
                                    }
                                    switch (alt15) {
                                        case 1 :
                                            // InternalBLESS.g:34898:119: '-'
                                            {
                                            match('-'); 

                                            }
                                            break;

                                    }

                                    // InternalBLESS.g:34898:124: ( RULE_DIGIT )+
                                    int cnt16=0;
                                    loop16:
                                    do {
                                        int alt16=2;
                                        int LA16_0 = input.LA(1);

                                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                                            alt16=1;
                                        }


                                        switch (alt16) {
                                    	case 1 :
                                    	    // InternalBLESS.g:34898:124: RULE_DIGIT
                                    	    {
                                    	    mRULE_DIGIT(); 

                                    	    }
                                    	    break;

                                    	default :
                                    	    if ( cnt16 >= 1 ) break loop16;
                                                EarlyExitException eee =
                                                    new EarlyExitException(16, input);
                                                throw eee;
                                        }
                                        cnt16++;
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalBLESS.g:34900:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalBLESS.g:34900:24: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:34902:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalBLESS.g:34902:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalBLESS.g:34902:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\\') ) {
                    alt20=1;
                }
                else if ( ((LA20_0>='\u0000' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBLESS.g:34902:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalBLESS.g:34902:60: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:34904:9: ( RULE_LETTER ( ( '_' )? ( RULE_LETTER | '0' .. '9' ) )* )
            // InternalBLESS.g:34904:11: RULE_LETTER ( ( '_' )? ( RULE_LETTER | '0' .. '9' ) )*
            {
            mRULE_LETTER(); 
            // InternalBLESS.g:34904:23: ( ( '_' )? ( RULE_LETTER | '0' .. '9' ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBLESS.g:34904:24: ( '_' )? ( RULE_LETTER | '0' .. '9' )
            	    {
            	    // InternalBLESS.g:34904:24: ( '_' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0=='_') ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalBLESS.g:34904:24: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_DOTDOT"
    public final void mRULE_DOTDOT() throws RecognitionException {
        try {
            int _type = RULE_DOTDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:34906:13: ( '..' )
            // InternalBLESS.g:34906:15: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOTDOT"

    // $ANTLR start "RULE_COMMADOT"
    public final void mRULE_COMMADOT() throws RecognitionException {
        try {
            int _type = RULE_COMMADOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:34908:15: ( ',.' )
            // InternalBLESS.g:34908:17: ',.'
            {
            match(",."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMADOT"

    // $ANTLR start "RULE_DOTCOMMA"
    public final void mRULE_DOTCOMMA() throws RecognitionException {
        try {
            int _type = RULE_DOTCOMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:34910:15: ( '.,' )
            // InternalBLESS.g:34910:17: '.,'
            {
            match(".,"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOTCOMMA"

    // $ANTLR start "RULE_COMMACOMMA"
    public final void mRULE_COMMACOMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMACOMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBLESS.g:34912:17: ( ',,' )
            // InternalBLESS.g:34912:19: ',,'
            {
            match(",,"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMACOMMA"

    public void mTokens() throws RecognitionException {
        // InternalBLESS.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | RULE_WS | RULE_SL_COMMENT | RULE_NUMBER | RULE_STRING | RULE_ID | RULE_DOTDOT | RULE_COMMADOT | RULE_DOTCOMMA | RULE_COMMACOMMA )
        int alt23=169;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // InternalBLESS.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalBLESS.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalBLESS.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalBLESS.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalBLESS.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalBLESS.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalBLESS.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalBLESS.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalBLESS.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalBLESS.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalBLESS.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalBLESS.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalBLESS.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalBLESS.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalBLESS.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalBLESS.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalBLESS.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalBLESS.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalBLESS.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalBLESS.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalBLESS.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalBLESS.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalBLESS.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalBLESS.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalBLESS.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalBLESS.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalBLESS.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalBLESS.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalBLESS.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalBLESS.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalBLESS.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalBLESS.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalBLESS.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalBLESS.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalBLESS.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalBLESS.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalBLESS.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalBLESS.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalBLESS.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // InternalBLESS.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // InternalBLESS.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // InternalBLESS.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // InternalBLESS.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // InternalBLESS.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // InternalBLESS.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // InternalBLESS.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // InternalBLESS.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // InternalBLESS.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // InternalBLESS.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // InternalBLESS.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // InternalBLESS.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // InternalBLESS.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // InternalBLESS.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // InternalBLESS.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // InternalBLESS.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // InternalBLESS.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // InternalBLESS.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // InternalBLESS.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // InternalBLESS.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // InternalBLESS.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // InternalBLESS.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // InternalBLESS.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // InternalBLESS.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // InternalBLESS.g:1:388: T__78
                {
                mT__78(); 

                }
                break;
            case 65 :
                // InternalBLESS.g:1:394: T__79
                {
                mT__79(); 

                }
                break;
            case 66 :
                // InternalBLESS.g:1:400: T__80
                {
                mT__80(); 

                }
                break;
            case 67 :
                // InternalBLESS.g:1:406: T__81
                {
                mT__81(); 

                }
                break;
            case 68 :
                // InternalBLESS.g:1:412: T__82
                {
                mT__82(); 

                }
                break;
            case 69 :
                // InternalBLESS.g:1:418: T__83
                {
                mT__83(); 

                }
                break;
            case 70 :
                // InternalBLESS.g:1:424: T__84
                {
                mT__84(); 

                }
                break;
            case 71 :
                // InternalBLESS.g:1:430: T__85
                {
                mT__85(); 

                }
                break;
            case 72 :
                // InternalBLESS.g:1:436: T__86
                {
                mT__86(); 

                }
                break;
            case 73 :
                // InternalBLESS.g:1:442: T__87
                {
                mT__87(); 

                }
                break;
            case 74 :
                // InternalBLESS.g:1:448: T__88
                {
                mT__88(); 

                }
                break;
            case 75 :
                // InternalBLESS.g:1:454: T__89
                {
                mT__89(); 

                }
                break;
            case 76 :
                // InternalBLESS.g:1:460: T__90
                {
                mT__90(); 

                }
                break;
            case 77 :
                // InternalBLESS.g:1:466: T__91
                {
                mT__91(); 

                }
                break;
            case 78 :
                // InternalBLESS.g:1:472: T__92
                {
                mT__92(); 

                }
                break;
            case 79 :
                // InternalBLESS.g:1:478: T__93
                {
                mT__93(); 

                }
                break;
            case 80 :
                // InternalBLESS.g:1:484: T__94
                {
                mT__94(); 

                }
                break;
            case 81 :
                // InternalBLESS.g:1:490: T__95
                {
                mT__95(); 

                }
                break;
            case 82 :
                // InternalBLESS.g:1:496: T__96
                {
                mT__96(); 

                }
                break;
            case 83 :
                // InternalBLESS.g:1:502: T__97
                {
                mT__97(); 

                }
                break;
            case 84 :
                // InternalBLESS.g:1:508: T__98
                {
                mT__98(); 

                }
                break;
            case 85 :
                // InternalBLESS.g:1:514: T__99
                {
                mT__99(); 

                }
                break;
            case 86 :
                // InternalBLESS.g:1:520: T__100
                {
                mT__100(); 

                }
                break;
            case 87 :
                // InternalBLESS.g:1:527: T__101
                {
                mT__101(); 

                }
                break;
            case 88 :
                // InternalBLESS.g:1:534: T__102
                {
                mT__102(); 

                }
                break;
            case 89 :
                // InternalBLESS.g:1:541: T__103
                {
                mT__103(); 

                }
                break;
            case 90 :
                // InternalBLESS.g:1:548: T__104
                {
                mT__104(); 

                }
                break;
            case 91 :
                // InternalBLESS.g:1:555: T__105
                {
                mT__105(); 

                }
                break;
            case 92 :
                // InternalBLESS.g:1:562: T__106
                {
                mT__106(); 

                }
                break;
            case 93 :
                // InternalBLESS.g:1:569: T__107
                {
                mT__107(); 

                }
                break;
            case 94 :
                // InternalBLESS.g:1:576: T__108
                {
                mT__108(); 

                }
                break;
            case 95 :
                // InternalBLESS.g:1:583: T__109
                {
                mT__109(); 

                }
                break;
            case 96 :
                // InternalBLESS.g:1:590: T__110
                {
                mT__110(); 

                }
                break;
            case 97 :
                // InternalBLESS.g:1:597: T__111
                {
                mT__111(); 

                }
                break;
            case 98 :
                // InternalBLESS.g:1:604: T__112
                {
                mT__112(); 

                }
                break;
            case 99 :
                // InternalBLESS.g:1:611: T__113
                {
                mT__113(); 

                }
                break;
            case 100 :
                // InternalBLESS.g:1:618: T__114
                {
                mT__114(); 

                }
                break;
            case 101 :
                // InternalBLESS.g:1:625: T__115
                {
                mT__115(); 

                }
                break;
            case 102 :
                // InternalBLESS.g:1:632: T__116
                {
                mT__116(); 

                }
                break;
            case 103 :
                // InternalBLESS.g:1:639: T__117
                {
                mT__117(); 

                }
                break;
            case 104 :
                // InternalBLESS.g:1:646: T__118
                {
                mT__118(); 

                }
                break;
            case 105 :
                // InternalBLESS.g:1:653: T__119
                {
                mT__119(); 

                }
                break;
            case 106 :
                // InternalBLESS.g:1:660: T__120
                {
                mT__120(); 

                }
                break;
            case 107 :
                // InternalBLESS.g:1:667: T__121
                {
                mT__121(); 

                }
                break;
            case 108 :
                // InternalBLESS.g:1:674: T__122
                {
                mT__122(); 

                }
                break;
            case 109 :
                // InternalBLESS.g:1:681: T__123
                {
                mT__123(); 

                }
                break;
            case 110 :
                // InternalBLESS.g:1:688: T__124
                {
                mT__124(); 

                }
                break;
            case 111 :
                // InternalBLESS.g:1:695: T__125
                {
                mT__125(); 

                }
                break;
            case 112 :
                // InternalBLESS.g:1:702: T__126
                {
                mT__126(); 

                }
                break;
            case 113 :
                // InternalBLESS.g:1:709: T__127
                {
                mT__127(); 

                }
                break;
            case 114 :
                // InternalBLESS.g:1:716: T__128
                {
                mT__128(); 

                }
                break;
            case 115 :
                // InternalBLESS.g:1:723: T__129
                {
                mT__129(); 

                }
                break;
            case 116 :
                // InternalBLESS.g:1:730: T__130
                {
                mT__130(); 

                }
                break;
            case 117 :
                // InternalBLESS.g:1:737: T__131
                {
                mT__131(); 

                }
                break;
            case 118 :
                // InternalBLESS.g:1:744: T__132
                {
                mT__132(); 

                }
                break;
            case 119 :
                // InternalBLESS.g:1:751: T__133
                {
                mT__133(); 

                }
                break;
            case 120 :
                // InternalBLESS.g:1:758: T__134
                {
                mT__134(); 

                }
                break;
            case 121 :
                // InternalBLESS.g:1:765: T__135
                {
                mT__135(); 

                }
                break;
            case 122 :
                // InternalBLESS.g:1:772: T__136
                {
                mT__136(); 

                }
                break;
            case 123 :
                // InternalBLESS.g:1:779: T__137
                {
                mT__137(); 

                }
                break;
            case 124 :
                // InternalBLESS.g:1:786: T__138
                {
                mT__138(); 

                }
                break;
            case 125 :
                // InternalBLESS.g:1:793: T__139
                {
                mT__139(); 

                }
                break;
            case 126 :
                // InternalBLESS.g:1:800: T__140
                {
                mT__140(); 

                }
                break;
            case 127 :
                // InternalBLESS.g:1:807: T__141
                {
                mT__141(); 

                }
                break;
            case 128 :
                // InternalBLESS.g:1:814: T__142
                {
                mT__142(); 

                }
                break;
            case 129 :
                // InternalBLESS.g:1:821: T__143
                {
                mT__143(); 

                }
                break;
            case 130 :
                // InternalBLESS.g:1:828: T__144
                {
                mT__144(); 

                }
                break;
            case 131 :
                // InternalBLESS.g:1:835: T__145
                {
                mT__145(); 

                }
                break;
            case 132 :
                // InternalBLESS.g:1:842: T__146
                {
                mT__146(); 

                }
                break;
            case 133 :
                // InternalBLESS.g:1:849: T__147
                {
                mT__147(); 

                }
                break;
            case 134 :
                // InternalBLESS.g:1:856: T__148
                {
                mT__148(); 

                }
                break;
            case 135 :
                // InternalBLESS.g:1:863: T__149
                {
                mT__149(); 

                }
                break;
            case 136 :
                // InternalBLESS.g:1:870: T__150
                {
                mT__150(); 

                }
                break;
            case 137 :
                // InternalBLESS.g:1:877: T__151
                {
                mT__151(); 

                }
                break;
            case 138 :
                // InternalBLESS.g:1:884: T__152
                {
                mT__152(); 

                }
                break;
            case 139 :
                // InternalBLESS.g:1:891: T__153
                {
                mT__153(); 

                }
                break;
            case 140 :
                // InternalBLESS.g:1:898: T__154
                {
                mT__154(); 

                }
                break;
            case 141 :
                // InternalBLESS.g:1:905: T__155
                {
                mT__155(); 

                }
                break;
            case 142 :
                // InternalBLESS.g:1:912: T__156
                {
                mT__156(); 

                }
                break;
            case 143 :
                // InternalBLESS.g:1:919: T__157
                {
                mT__157(); 

                }
                break;
            case 144 :
                // InternalBLESS.g:1:926: T__158
                {
                mT__158(); 

                }
                break;
            case 145 :
                // InternalBLESS.g:1:933: T__159
                {
                mT__159(); 

                }
                break;
            case 146 :
                // InternalBLESS.g:1:940: T__160
                {
                mT__160(); 

                }
                break;
            case 147 :
                // InternalBLESS.g:1:947: T__161
                {
                mT__161(); 

                }
                break;
            case 148 :
                // InternalBLESS.g:1:954: T__162
                {
                mT__162(); 

                }
                break;
            case 149 :
                // InternalBLESS.g:1:961: T__163
                {
                mT__163(); 

                }
                break;
            case 150 :
                // InternalBLESS.g:1:968: T__164
                {
                mT__164(); 

                }
                break;
            case 151 :
                // InternalBLESS.g:1:975: T__165
                {
                mT__165(); 

                }
                break;
            case 152 :
                // InternalBLESS.g:1:982: T__166
                {
                mT__166(); 

                }
                break;
            case 153 :
                // InternalBLESS.g:1:989: T__167
                {
                mT__167(); 

                }
                break;
            case 154 :
                // InternalBLESS.g:1:996: T__168
                {
                mT__168(); 

                }
                break;
            case 155 :
                // InternalBLESS.g:1:1003: T__169
                {
                mT__169(); 

                }
                break;
            case 156 :
                // InternalBLESS.g:1:1010: T__170
                {
                mT__170(); 

                }
                break;
            case 157 :
                // InternalBLESS.g:1:1017: T__171
                {
                mT__171(); 

                }
                break;
            case 158 :
                // InternalBLESS.g:1:1024: T__172
                {
                mT__172(); 

                }
                break;
            case 159 :
                // InternalBLESS.g:1:1031: T__173
                {
                mT__173(); 

                }
                break;
            case 160 :
                // InternalBLESS.g:1:1038: T__174
                {
                mT__174(); 

                }
                break;
            case 161 :
                // InternalBLESS.g:1:1045: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 162 :
                // InternalBLESS.g:1:1053: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 163 :
                // InternalBLESS.g:1:1069: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 164 :
                // InternalBLESS.g:1:1081: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 165 :
                // InternalBLESS.g:1:1093: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 166 :
                // InternalBLESS.g:1:1101: RULE_DOTDOT
                {
                mRULE_DOTDOT(); 

                }
                break;
            case 167 :
                // InternalBLESS.g:1:1113: RULE_COMMADOT
                {
                mRULE_COMMADOT(); 

                }
                break;
            case 168 :
                // InternalBLESS.g:1:1127: RULE_DOTCOMMA
                {
                mRULE_DOTCOMMA(); 

                }
                break;
            case 169 :
                // InternalBLESS.g:1:1141: RULE_COMMACOMMA
                {
                mRULE_COMMACOMMA(); 

                }
                break;

        }

    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\1\uffff\1\65\1\76\1\100\1\104\1\107\1\113\1\115\1\uffff\12\65\1\154\1\65\1\uffff\1\170\1\172\1\175\2\uffff\1\177\1\65\1\u0086\1\u0089\1\uffff\1\65\1\uffff\1\u0090\1\uffff\3\65\1\uffff\1\65\2\uffff\2\65\1\uffff\1\65\2\uffff\1\65\4\uffff\6\65\20\uffff\1\u00a7\1\uffff\2\65\1\u00ac\24\65\1\u00d0\1\u00d2\1\u00d3\2\65\3\uffff\10\65\13\uffff\1\u00e0\1\u00e1\1\u00e2\1\65\6\uffff\1\65\1\u00e6\3\65\2\uffff\12\65\1\u00fd\1\u00fe\3\65\1\u0102\1\u0103\1\65\1\u0105\4\uffff\1\u0106\2\65\1\u0109\1\uffff\1\u010b\1\u010c\22\65\1\u0121\7\65\1\u012a\6\65\1\uffff\1\u0131\2\uffff\6\65\1\u0138\5\65\3\uffff\1\65\1\u0140\1\65\1\uffff\15\65\1\u0150\3\65\1\u0154\1\u0155\1\65\1\uffff\1\65\2\uffff\3\65\2\uffff\1\65\2\uffff\2\65\1\uffff\1\u015f\2\uffff\10\65\1\u0169\2\65\1\u016c\1\65\1\u016e\1\u016f\1\65\1\u0171\3\65\1\uffff\2\65\1\u0177\4\65\1\u017c\1\uffff\1\65\1\u017e\4\65\1\uffff\5\65\1\u0188\1\uffff\2\65\1\u018b\1\u018c\3\65\1\uffff\7\65\1\u0197\2\65\1\u019a\4\65\1\uffff\1\65\1\u01a1\1\65\2\uffff\6\65\1\u01a9\2\65\1\uffff\2\65\1\u01ae\1\65\1\u01b0\1\u01b1\3\65\1\uffff\2\65\1\uffff\1\u01b8\2\uffff\1\65\1\uffff\4\65\1\u01be\1\uffff\2\65\1\u01c1\1\65\1\uffff\1\65\1\uffff\1\u01c4\5\65\1\u01cc\2\65\1\uffff\2\65\2\uffff\3\65\1\u01d4\1\65\1\u01d6\1\65\1\u01da\1\u01db\1\u01dc\1\uffff\1\u01dd\1\u01de\1\uffff\3\65\1\u01e2\1\u01e3\1\65\1\uffff\4\65\1\u01ea\1\65\1\u01ec\1\uffff\3\65\1\u01f0\1\uffff\1\65\2\uffff\1\65\1\uffff\3\65\1\u01f7\1\uffff\2\65\1\u01fa\2\65\1\uffff\2\65\1\uffff\2\65\1\uffff\6\65\1\u0207\1\uffff\1\u0208\1\65\1\u020a\1\u020b\1\u020c\1\65\1\u020e\1\uffff\1\u020f\1\uffff\3\65\5\uffff\3\65\2\uffff\4\65\1\uffff\1\65\1\uffff\1\65\1\uffff\1\65\1\u021f\1\u0220\1\uffff\1\65\1\u0222\4\65\1\uffff\1\u0227\1\65\1\uffff\3\65\1\u022c\1\u022d\1\u022e\2\65\1\u0231\1\u0232\1\65\1\u0234\2\uffff\1\u0235\3\uffff\1\65\2\uffff\2\65\1\u0239\7\65\1\uffff\3\65\1\u0245\2\uffff\1\65\1\uffff\3\65\1\u024a\1\uffff\4\65\3\uffff\1\65\1\u0250\2\uffff\1\65\2\uffff\1\65\1\u0253\1\u0254\1\uffff\1\u0255\1\65\1\u0257\1\u0258\1\u0259\1\65\1\u025b\4\65\1\uffff\4\65\1\uffff\1\u0265\1\u0266\2\65\1\u0269\1\uffff\1\u026a\1\u026b\3\uffff\1\65\3\uffff\1\65\1\uffff\10\65\1\u0276\2\uffff\2\65\3\uffff\6\65\1\u027f\1\u0280\1\u0281\1\u0282\1\uffff\1\u0283\1\65\1\u0285\1\u0286\1\65\1\u0288\2\65\5\uffff\1\65\2\uffff\1\u028c\1\uffff\3\65\1\uffff\2\65\1\u0292\1\65\1\u0294\1\uffff\1\u0295\2\uffff";
    static final String DFA23_eofS =
        "\u0296\uffff";
    static final String DFA23_minS =
        "\1\11\1\142\1\41\1\76\1\74\1\75\1\74\1\75\1\uffff\1\145\1\157\1\145\1\156\1\150\1\154\2\141\1\146\1\141\1\72\1\143\1\uffff\2\55\1\54\2\uffff\1\135\1\146\1\55\1\54\1\uffff\1\141\1\uffff\1\77\1\uffff\1\150\1\141\1\150\1\uffff\1\157\2\uffff\1\157\1\165\1\uffff\1\117\2\uffff\1\157\4\uffff\1\144\1\163\1\143\1\154\1\145\1\163\1\74\17\uffff\1\76\1\uffff\1\163\1\143\1\60\1\144\1\143\1\165\1\151\1\144\1\160\2\141\1\155\1\160\1\143\1\144\1\163\1\145\1\156\1\157\1\163\1\145\1\163\1\165\3\60\1\160\1\162\3\uffff\1\141\1\154\1\155\1\141\1\162\1\151\2\141\13\uffff\3\60\1\150\6\uffff\1\162\1\60\1\145\1\164\1\154\2\uffff\1\145\1\163\1\155\1\157\1\162\1\154\1\156\1\141\1\137\1\167\2\60\1\145\1\151\1\145\2\60\1\141\1\60\4\uffff\1\60\1\160\1\154\1\60\1\uffff\2\60\1\165\1\157\1\156\1\157\1\151\1\141\2\145\1\156\1\145\1\157\1\156\1\164\1\145\1\163\1\145\1\163\1\145\1\60\1\155\1\145\1\163\1\144\1\156\1\154\1\145\1\60\1\144\1\164\1\163\1\141\1\145\1\164\1\uffff\1\60\2\uffff\1\154\1\151\1\164\1\151\1\155\1\146\1\60\1\162\1\145\2\160\1\154\3\uffff\1\145\1\60\1\141\1\uffff\1\172\1\163\1\143\1\163\1\143\1\156\1\154\1\143\1\145\1\160\1\163\1\156\1\163\1\60\1\142\1\154\1\166\2\60\1\156\1\60\1\145\2\uffff\1\162\1\157\1\163\2\uffff\1\171\2\uffff\2\141\1\uffff\1\60\2\uffff\2\162\1\144\1\154\1\156\1\154\1\164\1\162\1\60\1\163\1\143\1\60\1\167\2\60\1\157\1\60\1\160\1\164\1\156\1\uffff\1\145\1\146\1\60\1\163\1\151\1\144\1\145\1\60\1\uffff\1\165\1\60\1\145\2\162\1\151\1\uffff\1\151\1\141\1\145\1\156\1\157\1\60\1\uffff\1\145\1\141\2\60\1\141\1\162\1\154\1\uffff\1\154\1\145\2\150\2\145\1\150\1\60\1\145\1\150\1\60\1\154\3\164\1\uffff\1\145\1\60\1\157\2\uffff\1\164\1\117\1\162\1\164\1\156\1\163\1\60\1\164\1\162\1\uffff\1\156\1\144\1\60\1\151\2\60\1\145\1\137\1\151\1\uffff\1\151\1\141\1\uffff\1\60\2\uffff\1\165\1\uffff\1\164\2\163\1\162\1\60\1\uffff\1\163\1\156\1\60\1\141\1\uffff\1\143\1\uffff\1\60\1\151\1\156\1\141\1\145\1\142\1\60\1\147\1\144\1\uffff\2\144\2\uffff\1\162\1\167\1\154\1\60\1\156\1\60\1\141\3\60\1\uffff\2\60\1\uffff\1\164\1\145\1\141\2\60\1\162\1\uffff\1\154\1\151\1\124\1\137\1\60\1\163\1\60\1\uffff\1\143\1\145\1\163\1\60\1\uffff\1\142\2\uffff\1\144\1\60\1\142\2\164\1\60\1\uffff\1\164\1\151\1\60\1\151\1\141\1\uffff\1\165\1\147\1\uffff\1\156\1\164\1\uffff\2\141\1\154\1\163\1\154\1\164\1\60\1\uffff\1\60\1\145\3\60\1\151\1\60\1\uffff\1\60\1\uffff\1\144\1\162\1\157\5\uffff\1\141\1\164\1\156\2\uffff\1\157\1\141\1\164\1\137\1\60\1\157\1\uffff\1\165\1\uffff\1\150\2\60\1\uffff\1\162\1\60\1\157\1\162\1\151\1\145\1\uffff\1\60\1\157\1\uffff\1\157\1\164\1\142\3\60\1\156\1\154\2\60\1\145\1\60\2\uffff\1\60\3\uffff\1\163\2\uffff\2\144\1\60\1\162\1\164\1\145\1\164\1\146\1\164\1\171\1\60\1\157\1\156\1\142\1\60\2\uffff\1\141\1\uffff\1\165\1\141\1\157\1\60\1\uffff\2\156\1\151\1\143\3\uffff\1\164\1\60\2\uffff\1\163\2\uffff\1\145\2\60\1\uffff\1\60\1\151\3\60\1\151\1\60\1\122\1\165\1\154\1\143\1\uffff\1\162\1\156\1\162\1\156\1\uffff\2\60\1\157\1\154\1\60\1\uffff\2\60\3\uffff\1\157\3\uffff\1\154\1\uffff\1\117\1\156\1\151\1\154\1\171\1\144\1\171\1\163\1\60\2\uffff\1\156\1\141\3\uffff\1\156\1\145\1\126\1\144\1\142\1\141\4\60\1\uffff\1\60\1\165\2\60\1\105\1\60\1\162\1\165\5\uffff\1\163\2\uffff\1\60\1\uffff\1\141\1\163\1\145\1\uffff\1\162\1\145\1\60\1\171\1\60\1\uffff\1\60\2\uffff";
    static final String DFA23_maxS =
        "\1\176\1\163\1\52\4\76\1\75\1\uffff\3\157\1\160\1\171\1\170\1\157\1\162\1\163\1\141\1\75\1\167\1\uffff\1\133\1\55\1\56\2\uffff\1\135\1\164\1\176\1\56\1\uffff\1\162\1\uffff\1\77\1\uffff\1\150\1\157\1\150\1\uffff\1\157\2\uffff\2\165\1\uffff\1\117\2\uffff\1\157\4\uffff\1\171\1\163\1\164\1\154\1\162\1\163\1\76\17\uffff\1\76\1\uffff\1\166\1\146\1\172\1\144\1\164\1\165\1\164\2\160\1\165\1\162\1\155\1\160\1\164\1\165\1\163\1\145\1\156\1\165\1\163\1\157\1\163\1\165\3\172\1\160\1\162\3\uffff\1\162\1\164\1\155\1\141\1\162\1\151\2\141\13\uffff\3\172\1\150\6\uffff\1\162\1\172\1\157\1\164\1\154\2\uffff\1\157\1\164\1\165\1\157\1\162\1\155\1\167\1\141\1\137\1\167\2\172\1\145\1\151\1\145\2\172\1\141\1\172\4\uffff\1\172\1\160\1\154\1\172\1\uffff\2\172\1\165\1\157\1\156\1\164\1\151\1\141\2\145\2\156\1\157\1\156\1\164\1\145\1\163\1\145\1\163\1\145\1\172\1\155\1\151\1\163\1\144\1\156\1\154\1\145\1\172\1\144\1\164\1\163\1\141\1\145\1\164\1\uffff\1\172\2\uffff\1\154\1\151\1\164\1\151\1\155\1\146\1\172\1\162\1\145\2\160\1\154\3\uffff\1\145\1\172\1\141\1\uffff\1\172\1\163\1\143\1\163\1\154\1\156\1\154\1\143\1\145\1\160\1\163\1\156\1\163\1\172\1\142\1\154\1\166\2\172\1\156\1\172\1\145\2\uffff\1\162\1\157\1\163\2\uffff\1\171\2\uffff\2\141\1\uffff\1\172\2\uffff\2\162\1\144\1\154\1\156\1\154\1\164\1\162\1\172\1\163\1\143\1\172\1\167\2\172\1\157\1\172\1\160\1\164\1\156\1\uffff\1\145\1\146\1\172\1\163\1\151\1\144\1\145\1\172\1\uffff\1\165\1\172\1\145\2\162\1\151\1\uffff\1\151\1\141\1\145\1\156\1\157\1\172\1\uffff\1\145\1\141\2\172\1\141\1\162\1\154\1\uffff\1\154\1\145\2\150\2\145\1\150\1\172\1\145\1\150\1\172\1\165\3\164\1\uffff\1\145\1\172\1\157\2\uffff\1\164\1\117\1\162\1\164\1\156\1\163\1\172\1\164\1\162\1\uffff\1\156\1\144\1\172\1\151\2\172\1\145\1\137\1\151\1\uffff\1\151\1\141\1\uffff\1\172\2\uffff\1\165\1\uffff\1\164\2\163\1\162\1\172\1\uffff\1\163\1\156\1\172\1\141\1\uffff\1\143\1\uffff\1\172\1\151\1\156\1\141\1\145\1\156\1\172\1\147\1\144\1\uffff\2\144\2\uffff\1\162\1\167\1\154\1\172\1\156\1\172\1\170\3\172\1\uffff\2\172\1\uffff\1\164\1\145\1\141\2\172\1\162\1\uffff\1\154\1\151\1\124\1\137\1\172\1\163\1\172\1\uffff\1\143\1\145\1\163\1\172\1\uffff\1\142\2\uffff\1\144\1\172\1\142\2\164\1\172\1\uffff\1\164\1\151\1\172\1\151\1\141\1\uffff\1\165\1\147\1\uffff\1\156\1\164\1\uffff\2\141\1\154\1\163\1\154\1\164\1\172\1\uffff\1\172\1\145\3\172\1\151\1\172\1\uffff\1\172\1\uffff\1\156\1\162\1\157\5\uffff\1\141\1\164\1\156\2\uffff\1\157\1\141\1\164\1\137\1\172\1\157\1\uffff\1\165\1\uffff\1\150\2\172\1\uffff\1\162\1\172\1\157\1\162\1\151\1\145\1\uffff\1\172\1\157\1\uffff\1\157\1\164\1\142\3\172\1\156\1\154\2\172\1\145\1\172\2\uffff\1\172\3\uffff\1\163\2\uffff\2\144\1\172\1\162\1\164\1\145\1\164\1\146\1\164\1\171\1\172\1\157\1\156\1\142\1\172\2\uffff\1\141\1\uffff\1\165\1\141\1\157\1\172\1\uffff\2\156\1\151\1\143\3\uffff\1\164\1\172\2\uffff\1\163\2\uffff\1\145\2\172\1\uffff\1\172\1\151\3\172\1\151\1\172\1\122\1\165\1\154\1\143\1\uffff\1\162\1\156\1\162\1\156\1\uffff\2\172\1\157\1\154\1\172\1\uffff\2\172\3\uffff\1\157\3\uffff\1\154\1\uffff\1\117\1\156\1\151\1\154\1\171\1\144\1\171\1\163\1\172\2\uffff\1\156\1\141\3\uffff\1\156\1\145\1\126\1\144\1\142\1\141\4\172\1\uffff\1\172\1\165\2\172\1\105\1\172\1\162\1\165\5\uffff\1\163\2\uffff\1\172\1\uffff\1\141\1\163\1\145\1\uffff\1\162\1\145\1\172\1\171\1\172\1\uffff\1\172\2\uffff";
    static final String DFA23_acceptS =
        "\10\uffff\1\13\14\uffff\1\33\3\uffff\1\40\1\41\4\uffff\1\52\1\uffff\1\60\1\uffff\1\64\3\uffff\1\113\1\uffff\1\124\1\125\2\uffff\1\147\1\uffff\1\u0087\1\u0088\1\uffff\1\u00a1\1\u00a3\1\u00a4\1\u00a5\7\uffff\1\u0086\1\2\1\140\1\3\1\4\1\6\1\114\1\5\1\7\1\115\1\10\1\11\1\u0080\1\u0081\1\62\1\uffff\1\122\34\uffff\1\151\1\166\1\31\10\uffff\1\35\1\127\1\u00a2\1\u0085\1\36\1\43\1\u00a7\1\u00a9\1\37\1\70\1\42\4\uffff\1\66\1\141\1\50\1\u00a6\1\u00a8\1\51\5\uffff\1\123\1\63\23\uffff\1\176\1\177\1\117\1\12\4\uffff\1\73\43\uffff\1\57\1\uffff\1\65\1\143\14\uffff\1\44\1\45\1\131\3\uffff\1\67\26\uffff\1\1\1\47\3\uffff\1\135\1\136\1\uffff\1\u008a\1\14\2\uffff\1\112\1\uffff\1\15\1\16\24\uffff\1\103\10\uffff\1\25\6\uffff\1\u0083\6\uffff\1\130\7\uffff\1\72\17\uffff\1\120\3\uffff\1\u0089\1\u008d\11\uffff\1\157\11\uffff\1\142\2\uffff\1\u008f\1\uffff\1\121\1\134\1\uffff\1\u008e\5\uffff\1\105\4\uffff\1\u00a0\1\uffff\1\26\11\uffff\1\u009d\2\uffff\1\167\1\174\12\uffff\1\77\2\uffff\1\126\6\uffff\1\u0091\7\uffff\1\146\4\uffff\1\u008c\1\uffff\1\u009c\1\74\6\uffff\1\100\5\uffff\1\104\2\uffff\1\175\2\uffff\1\u0082\7\uffff\1\32\7\uffff\1\156\1\uffff\1\u0092\3\uffff\1\u0090\1\71\1\u0095\1\u0099\1\76\3\uffff\1\u0093\1\111\6\uffff\1\54\1\uffff\1\46\3\uffff\1\u009a\6\uffff\1\75\2\uffff\1\137\14\uffff\1\153\1\u0097\1\uffff\1\163\1\165\1\u0098\1\uffff\1\56\1\107\17\uffff\1\55\1\116\1\uffff\1\u0094\4\uffff\1\110\4\uffff\1\102\1\u0096\1\132\2\uffff\1\154\1\u0084\1\uffff\1\u009b\1\61\3\uffff\1\171\13\uffff\1\160\4\uffff\1\u008b\5\uffff\1\53\2\uffff\1\170\1\172\1\173\1\uffff\1\155\1\164\1\133\1\uffff\1\145\11\uffff\1\106\1\150\2\uffff\1\27\1\30\1\161\12\uffff\1\23\10\uffff\1\17\1\u009e\1\20\1\34\1\144\1\uffff\1\101\1\162\1\uffff\1\u009f\3\uffff\1\152\5\uffff\1\24\1\uffff\1\22\1\21";
    static final String DFA23_specialS =
        "\u0296\uffff}>";
    static final String[] DFA23_transitionS = {
            "\2\62\2\uffff\1\62\22\uffff\1\62\1\6\1\64\1\55\1\51\1\uffff\1\41\1\52\1\37\1\35\1\2\1\7\1\30\1\26\1\36\1\10\12\63\1\23\1\25\1\4\1\3\1\5\1\42\1\57\3\65\1\56\26\65\1\33\1\uffff\1\27\1\60\2\uffff\1\1\1\17\1\45\1\11\1\16\1\40\1\46\1\65\1\21\2\65\1\61\1\12\1\53\1\34\1\20\1\54\1\13\1\24\1\15\1\14\1\22\1\44\1\50\2\65\1\31\1\43\1\32\1\47",
            "\1\73\1\70\10\uffff\1\71\1\uffff\1\66\3\uffff\1\72\1\67",
            "\1\74\10\uffff\1\75",
            "\1\77",
            "\1\103\1\102\1\101",
            "\1\105\1\106",
            "\1\111\1\110\1\112",
            "\1\114",
            "",
            "\1\117\3\uffff\1\116\5\uffff\1\120",
            "\1\121",
            "\1\122\11\uffff\1\123",
            "\1\124\1\uffff\1\125",
            "\1\130\1\131\5\uffff\1\132\2\uffff\1\127\6\uffff\1\126",
            "\1\135\1\uffff\1\134\11\uffff\1\133",
            "\1\141\7\uffff\1\137\2\uffff\1\136\2\uffff\1\140",
            "\1\144\15\uffff\1\143\2\uffff\1\142",
            "\1\146\6\uffff\1\150\1\145\4\uffff\1\147",
            "\1\151",
            "\1\152\2\uffff\1\153",
            "\1\164\1\uffff\1\156\2\uffff\1\160\2\uffff\1\162\4\uffff\1\161\3\uffff\1\155\1\157\1\uffff\1\163",
            "",
            "\1\167\2\uffff\12\63\4\uffff\1\166\34\uffff\1\165",
            "\1\171",
            "\1\174\1\uffff\1\173",
            "",
            "",
            "\1\176",
            "\1\u0082\7\uffff\1\u0080\3\uffff\1\u0081\1\uffff\1\u0083",
            "\1\u0085\120\uffff\1\u0084",
            "\1\u0088\1\uffff\1\u0087",
            "",
            "\1\u008e\3\uffff\1\u008d\3\uffff\1\u008b\5\uffff\1\u008a\2\uffff\1\u008c",
            "",
            "\1\u008f",
            "",
            "\1\u0091",
            "\1\u0092\15\uffff\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "",
            "",
            "\1\u0097\5\uffff\1\u0096",
            "\1\u0098",
            "",
            "\1\u0099",
            "",
            "",
            "\1\u009a",
            "",
            "",
            "",
            "",
            "\1\u009c\24\uffff\1\u009b",
            "\1\u009d",
            "\1\u009f\20\uffff\1\u009e",
            "\1\u00a0",
            "\1\u00a1\14\uffff\1\u00a2",
            "\1\u00a3",
            "\1\u00a4\1\uffff\1\u00a5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a6",
            "",
            "\1\u00a9\2\uffff\1\u00a8",
            "\1\u00aa\2\uffff\1\u00ab",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00ad",
            "\1\u00b0\11\uffff\1\u00ae\6\uffff\1\u00af",
            "\1\u00b1",
            "\1\u00b2\12\uffff\1\u00b3",
            "\1\u00b4\13\uffff\1\u00b5",
            "\1\u00b6",
            "\1\u00b7\23\uffff\1\u00b8",
            "\1\u00bb\3\uffff\1\u00ba\14\uffff\1\u00b9",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be\5\uffff\1\u00bf\12\uffff\1\u00c0",
            "\1\u00c1\20\uffff\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c7\5\uffff\1\u00c6",
            "\1\u00c8",
            "\1\u00c9\11\uffff\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00cf\12\65\1\u00ce\1\65\1\u00cd\4\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\u00d1\24\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "",
            "",
            "\1\u00d6\20\uffff\1\u00d7",
            "\1\u00d9\7\uffff\1\u00d8",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00e3",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e4",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u00e5\14\65",
            "\1\u00e8\11\uffff\1\u00e7",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "",
            "\1\u00ec\3\uffff\1\u00eb\5\uffff\1\u00ed",
            "\1\u00ef\1\u00ee",
            "\1\u00f0\1\u00f1\6\uffff\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f6\1\u00f5",
            "\1\u00f7\5\uffff\1\u00f8\2\uffff\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0104",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0107",
            "\1\u0108",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u010a\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0111\4\uffff\1\u0110",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0118\10\uffff\1\u0117",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0122",
            "\1\u0124\3\uffff\1\u0123",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "",
            "",
            "",
            "\1\u013e",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u013f\31\65",
            "\1\u0141",
            "",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0147\10\uffff\1\u0146",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0156",
            "\12\65\7\uffff\15\65\1\u0157\14\65\6\uffff\32\65",
            "\1\u0158",
            "",
            "",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "",
            "",
            "\1\u015c",
            "",
            "",
            "\1\u015d",
            "\1\u015e",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u0168\16\65",
            "\1\u016a",
            "\1\u016b",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u016d",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0170",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u017d",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0189",
            "\1\u018a",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0198",
            "\1\u0199",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u019c\10\uffff\1\u019b",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "",
            "\1\u01a0",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01a2",
            "",
            "",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "\1\u01ac",
            "\1\u01ad",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01af",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "",
            "\1\u01b5",
            "\1\u01b6",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u01b7\7\65",
            "",
            "",
            "\1\u01b9",
            "",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u01bf",
            "\1\u01c0",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01c2",
            "",
            "\1\u01c3",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9\13\uffff\1\u01ca",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u01cb\7\65",
            "\1\u01cd",
            "\1\u01ce",
            "",
            "\1\u01cf",
            "\1\u01d0",
            "",
            "",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01d5",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01d7\15\uffff\1\u01d8\10\uffff\1\u01d9",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01e4",
            "",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u01e9\21\65",
            "\1\u01eb",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u01f1",
            "",
            "",
            "\1\u01f2",
            "\12\65\7\uffff\32\65\6\uffff\1\65\1\u01f3\30\65",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u01f8",
            "\1\u01f9",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01fb",
            "\1\u01fc",
            "",
            "\1\u01fd",
            "\1\u01fe",
            "",
            "\1\u01ff",
            "\1\u0200",
            "",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0209",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u020d",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0210\11\uffff\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "",
            "",
            "",
            "",
            "",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "",
            "",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\12\65\7\uffff\32\65\6\uffff\1\65\1\u021b\30\65",
            "\1\u021c",
            "",
            "\1\u021d",
            "",
            "\1\u021e",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0221",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0228",
            "",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u022f",
            "\1\u0230",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0233",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "\1\u0236",
            "",
            "",
            "\1\u0237",
            "\1\u0238",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\12\65\7\uffff\17\65\1\u0241\12\65\6\uffff\32\65",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u0246",
            "",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "",
            "",
            "",
            "\1\u024f",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u0251",
            "",
            "",
            "\1\u0252",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0256",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u025a",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u0264\7\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0267",
            "\1\u0268",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "\1\u026c",
            "",
            "",
            "",
            "\1\u026d",
            "",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u0277",
            "\1\u0278",
            "",
            "",
            "",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0284",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0287",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0289",
            "\1\u028a",
            "",
            "",
            "",
            "",
            "",
            "\1\u028b",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "",
            "\1\u0290",
            "\1\u0291",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0293",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | RULE_WS | RULE_SL_COMMENT | RULE_NUMBER | RULE_STRING | RULE_ID | RULE_DOTDOT | RULE_COMMADOT | RULE_DOTCOMMA | RULE_COMMACOMMA );";
        }
    }
 

}