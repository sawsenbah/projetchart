package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'C:/Users/DELL/Downloads/selected_cars.csv'", "'inf'", "'sup'", "'equal'", "'histogram'", "'pie'", "'line'", "'Start'", "'{'", "'}'", "';'", "'ApplyFilter'", "'('", "','", "')'", "'CreateChart'", "'title : '", "'xlabel : '", "'ylabel : '", "'chart'", "'SelectedColumns'", "'outputpath'", "'='", "'CsvLoader'", "'path'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgChart"
    // InternalMyDsl.g:53:1: entryRuleProgChart : ruleProgChart EOF ;
    public final void entryRuleProgChart() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleProgChart EOF )
            // InternalMyDsl.g:55:1: ruleProgChart EOF
            {
             before(grammarAccess.getProgChartRule()); 
            pushFollow(FOLLOW_1);
            ruleProgChart();

            state._fsp--;

             after(grammarAccess.getProgChartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgChart"


    // $ANTLR start "ruleProgChart"
    // InternalMyDsl.g:62:1: ruleProgChart : ( ( rule__ProgChart__Group__0 ) ) ;
    public final void ruleProgChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__ProgChart__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__ProgChart__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__ProgChart__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__ProgChart__Group__0 )
            {
             before(grammarAccess.getProgChartAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__ProgChart__Group__0 )
            // InternalMyDsl.g:69:4: rule__ProgChart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProgChart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgChartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgChart"


    // $ANTLR start "entryRuleFunctions"
    // InternalMyDsl.g:78:1: entryRuleFunctions : ruleFunctions EOF ;
    public final void entryRuleFunctions() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleFunctions EOF )
            // InternalMyDsl.g:80:1: ruleFunctions EOF
            {
             before(grammarAccess.getFunctionsRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctions();

            state._fsp--;

             after(grammarAccess.getFunctionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctions"


    // $ANTLR start "ruleFunctions"
    // InternalMyDsl.g:87:1: ruleFunctions : ( ( rule__Functions__Alternatives ) ) ;
    public final void ruleFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Functions__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Functions__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Functions__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Functions__Alternatives )
            {
             before(grammarAccess.getFunctionsAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Functions__Alternatives )
            // InternalMyDsl.g:94:4: rule__Functions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Functions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctions"


    // $ANTLR start "entryRuleApplyFilter"
    // InternalMyDsl.g:103:1: entryRuleApplyFilter : ruleApplyFilter EOF ;
    public final void entryRuleApplyFilter() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleApplyFilter EOF )
            // InternalMyDsl.g:105:1: ruleApplyFilter EOF
            {
             before(grammarAccess.getApplyFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleApplyFilter();

            state._fsp--;

             after(grammarAccess.getApplyFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplyFilter"


    // $ANTLR start "ruleApplyFilter"
    // InternalMyDsl.g:112:1: ruleApplyFilter : ( ( rule__ApplyFilter__Group__0 ) ) ;
    public final void ruleApplyFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__ApplyFilter__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__ApplyFilter__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__ApplyFilter__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__ApplyFilter__Group__0 )
            {
             before(grammarAccess.getApplyFilterAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__ApplyFilter__Group__0 )
            // InternalMyDsl.g:119:4: rule__ApplyFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplyFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplyFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplyFilter"


    // $ANTLR start "entryRuleCreateChart"
    // InternalMyDsl.g:128:1: entryRuleCreateChart : ruleCreateChart EOF ;
    public final void entryRuleCreateChart() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleCreateChart EOF )
            // InternalMyDsl.g:130:1: ruleCreateChart EOF
            {
             before(grammarAccess.getCreateChartRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateChart();

            state._fsp--;

             after(grammarAccess.getCreateChartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreateChart"


    // $ANTLR start "ruleCreateChart"
    // InternalMyDsl.g:137:1: ruleCreateChart : ( ( rule__CreateChart__Group__0 ) ) ;
    public final void ruleCreateChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__CreateChart__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__CreateChart__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__CreateChart__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__CreateChart__Group__0 )
            {
             before(grammarAccess.getCreateChartAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__CreateChart__Group__0 )
            // InternalMyDsl.g:144:4: rule__CreateChart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateChartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateChart"


    // $ANTLR start "entryRuleSelectedColumns"
    // InternalMyDsl.g:153:1: entryRuleSelectedColumns : ruleSelectedColumns EOF ;
    public final void entryRuleSelectedColumns() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleSelectedColumns EOF )
            // InternalMyDsl.g:155:1: ruleSelectedColumns EOF
            {
             before(grammarAccess.getSelectedColumnsRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectedColumns();

            state._fsp--;

             after(grammarAccess.getSelectedColumnsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectedColumns"


    // $ANTLR start "ruleSelectedColumns"
    // InternalMyDsl.g:162:1: ruleSelectedColumns : ( ( rule__SelectedColumns__Group__0 ) ) ;
    public final void ruleSelectedColumns() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__SelectedColumns__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__SelectedColumns__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__SelectedColumns__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__SelectedColumns__Group__0 )
            {
             before(grammarAccess.getSelectedColumnsAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__SelectedColumns__Group__0 )
            // InternalMyDsl.g:169:4: rule__SelectedColumns__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectedColumnsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectedColumns"


    // $ANTLR start "entryRuleCsvLoader"
    // InternalMyDsl.g:178:1: entryRuleCsvLoader : ruleCsvLoader EOF ;
    public final void entryRuleCsvLoader() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleCsvLoader EOF )
            // InternalMyDsl.g:180:1: ruleCsvLoader EOF
            {
             before(grammarAccess.getCsvLoaderRule()); 
            pushFollow(FOLLOW_1);
            ruleCsvLoader();

            state._fsp--;

             after(grammarAccess.getCsvLoaderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCsvLoader"


    // $ANTLR start "ruleCsvLoader"
    // InternalMyDsl.g:187:1: ruleCsvLoader : ( ( rule__CsvLoader__Group__0 ) ) ;
    public final void ruleCsvLoader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__CsvLoader__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__CsvLoader__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__CsvLoader__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__CsvLoader__Group__0 )
            {
             before(grammarAccess.getCsvLoaderAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__CsvLoader__Group__0 )
            // InternalMyDsl.g:194:4: rule__CsvLoader__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCsvLoaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCsvLoader"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleEString EOF )
            // InternalMyDsl.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleFilterType"
    // InternalMyDsl.g:228:1: ruleFilterType : ( ( rule__FilterType__Alternatives ) ) ;
    public final void ruleFilterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:232:1: ( ( ( rule__FilterType__Alternatives ) ) )
            // InternalMyDsl.g:233:2: ( ( rule__FilterType__Alternatives ) )
            {
            // InternalMyDsl.g:233:2: ( ( rule__FilterType__Alternatives ) )
            // InternalMyDsl.g:234:3: ( rule__FilterType__Alternatives )
            {
             before(grammarAccess.getFilterTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:235:3: ( rule__FilterType__Alternatives )
            // InternalMyDsl.g:235:4: rule__FilterType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FilterType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterType"


    // $ANTLR start "ruleChartType"
    // InternalMyDsl.g:244:1: ruleChartType : ( ( rule__ChartType__Alternatives ) ) ;
    public final void ruleChartType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:248:1: ( ( ( rule__ChartType__Alternatives ) ) )
            // InternalMyDsl.g:249:2: ( ( rule__ChartType__Alternatives ) )
            {
            // InternalMyDsl.g:249:2: ( ( rule__ChartType__Alternatives ) )
            // InternalMyDsl.g:250:3: ( rule__ChartType__Alternatives )
            {
             before(grammarAccess.getChartTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:251:3: ( rule__ChartType__Alternatives )
            // InternalMyDsl.g:251:4: rule__ChartType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ChartType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChartTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChartType"


    // $ANTLR start "rule__Functions__Alternatives"
    // InternalMyDsl.g:259:1: rule__Functions__Alternatives : ( ( ruleApplyFilter ) | ( ruleCreateChart ) | ( ruleCsvLoader ) | ( ruleSelectedColumns ) );
    public final void rule__Functions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:263:1: ( ( ruleApplyFilter ) | ( ruleCreateChart ) | ( ruleCsvLoader ) | ( ruleSelectedColumns ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 34:
                {
                alt1=3;
                }
                break;
            case 31:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:264:2: ( ruleApplyFilter )
                    {
                    // InternalMyDsl.g:264:2: ( ruleApplyFilter )
                    // InternalMyDsl.g:265:3: ruleApplyFilter
                    {
                     before(grammarAccess.getFunctionsAccess().getApplyFilterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleApplyFilter();

                    state._fsp--;

                     after(grammarAccess.getFunctionsAccess().getApplyFilterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:270:2: ( ruleCreateChart )
                    {
                    // InternalMyDsl.g:270:2: ( ruleCreateChart )
                    // InternalMyDsl.g:271:3: ruleCreateChart
                    {
                     before(grammarAccess.getFunctionsAccess().getCreateChartParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateChart();

                    state._fsp--;

                     after(grammarAccess.getFunctionsAccess().getCreateChartParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:276:2: ( ruleCsvLoader )
                    {
                    // InternalMyDsl.g:276:2: ( ruleCsvLoader )
                    // InternalMyDsl.g:277:3: ruleCsvLoader
                    {
                     before(grammarAccess.getFunctionsAccess().getCsvLoaderParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCsvLoader();

                    state._fsp--;

                     after(grammarAccess.getFunctionsAccess().getCsvLoaderParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:282:2: ( ruleSelectedColumns )
                    {
                    // InternalMyDsl.g:282:2: ( ruleSelectedColumns )
                    // InternalMyDsl.g:283:3: ruleSelectedColumns
                    {
                     before(grammarAccess.getFunctionsAccess().getSelectedColumnsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectedColumns();

                    state._fsp--;

                     after(grammarAccess.getFunctionsAccess().getSelectedColumnsParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functions__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:292:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) | ( 'C:/Users/DELL/Downloads/selected_cars.csv' ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:296:1: ( ( RULE_STRING ) | ( RULE_ID ) | ( 'C:/Users/DELL/Downloads/selected_cars.csv' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:297:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:297:2: ( RULE_STRING )
                    // InternalMyDsl.g:298:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:303:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:303:2: ( RULE_ID )
                    // InternalMyDsl.g:304:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:309:2: ( 'C:/Users/DELL/Downloads/selected_cars.csv' )
                    {
                    // InternalMyDsl.g:309:2: ( 'C:/Users/DELL/Downloads/selected_cars.csv' )
                    // InternalMyDsl.g:310:3: 'C:/Users/DELL/Downloads/selected_cars.csv'
                    {
                     before(grammarAccess.getEStringAccess().getCUsersDELLDownloadsSelected_carsCsvKeyword_2()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getCUsersDELLDownloadsSelected_carsCsvKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__FilterType__Alternatives"
    // InternalMyDsl.g:319:1: rule__FilterType__Alternatives : ( ( ( 'inf' ) ) | ( ( 'sup' ) ) | ( ( 'equal' ) ) );
    public final void rule__FilterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:323:1: ( ( ( 'inf' ) ) | ( ( 'sup' ) ) | ( ( 'equal' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:324:2: ( ( 'inf' ) )
                    {
                    // InternalMyDsl.g:324:2: ( ( 'inf' ) )
                    // InternalMyDsl.g:325:3: ( 'inf' )
                    {
                     before(grammarAccess.getFilterTypeAccess().getInfEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:326:3: ( 'inf' )
                    // InternalMyDsl.g:326:4: 'inf'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getFilterTypeAccess().getInfEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:330:2: ( ( 'sup' ) )
                    {
                    // InternalMyDsl.g:330:2: ( ( 'sup' ) )
                    // InternalMyDsl.g:331:3: ( 'sup' )
                    {
                     before(grammarAccess.getFilterTypeAccess().getSupEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:332:3: ( 'sup' )
                    // InternalMyDsl.g:332:4: 'sup'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getFilterTypeAccess().getSupEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:336:2: ( ( 'equal' ) )
                    {
                    // InternalMyDsl.g:336:2: ( ( 'equal' ) )
                    // InternalMyDsl.g:337:3: ( 'equal' )
                    {
                     before(grammarAccess.getFilterTypeAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:338:3: ( 'equal' )
                    // InternalMyDsl.g:338:4: 'equal'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getFilterTypeAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterType__Alternatives"


    // $ANTLR start "rule__ChartType__Alternatives"
    // InternalMyDsl.g:346:1: rule__ChartType__Alternatives : ( ( ( 'histogram' ) ) | ( ( 'pie' ) ) | ( ( 'line' ) ) );
    public final void rule__ChartType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:350:1: ( ( ( 'histogram' ) ) | ( ( 'pie' ) ) | ( ( 'line' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:351:2: ( ( 'histogram' ) )
                    {
                    // InternalMyDsl.g:351:2: ( ( 'histogram' ) )
                    // InternalMyDsl.g:352:3: ( 'histogram' )
                    {
                     before(grammarAccess.getChartTypeAccess().getHistogramEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:353:3: ( 'histogram' )
                    // InternalMyDsl.g:353:4: 'histogram'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getHistogramEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:357:2: ( ( 'pie' ) )
                    {
                    // InternalMyDsl.g:357:2: ( ( 'pie' ) )
                    // InternalMyDsl.g:358:3: ( 'pie' )
                    {
                     before(grammarAccess.getChartTypeAccess().getPieEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:359:3: ( 'pie' )
                    // InternalMyDsl.g:359:4: 'pie'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getPieEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:363:2: ( ( 'line' ) )
                    {
                    // InternalMyDsl.g:363:2: ( ( 'line' ) )
                    // InternalMyDsl.g:364:3: ( 'line' )
                    {
                     before(grammarAccess.getChartTypeAccess().getLineEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:365:3: ( 'line' )
                    // InternalMyDsl.g:365:4: 'line'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getLineEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartType__Alternatives"


    // $ANTLR start "rule__ProgChart__Group__0"
    // InternalMyDsl.g:373:1: rule__ProgChart__Group__0 : rule__ProgChart__Group__0__Impl rule__ProgChart__Group__1 ;
    public final void rule__ProgChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:377:1: ( rule__ProgChart__Group__0__Impl rule__ProgChart__Group__1 )
            // InternalMyDsl.g:378:2: rule__ProgChart__Group__0__Impl rule__ProgChart__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ProgChart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgChart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__Group__0"


    // $ANTLR start "rule__ProgChart__Group__0__Impl"
    // InternalMyDsl.g:385:1: rule__ProgChart__Group__0__Impl : ( 'Start' ) ;
    public final void rule__ProgChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( ( 'Start' ) )
            // InternalMyDsl.g:390:1: ( 'Start' )
            {
            // InternalMyDsl.g:390:1: ( 'Start' )
            // InternalMyDsl.g:391:2: 'Start'
            {
             before(grammarAccess.getProgChartAccess().getStartKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProgChartAccess().getStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__Group__0__Impl"


    // $ANTLR start "rule__ProgChart__Group__1"
    // InternalMyDsl.g:400:1: rule__ProgChart__Group__1 : rule__ProgChart__Group__1__Impl rule__ProgChart__Group__2 ;
    public final void rule__ProgChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:404:1: ( rule__ProgChart__Group__1__Impl rule__ProgChart__Group__2 )
            // InternalMyDsl.g:405:2: rule__ProgChart__Group__1__Impl rule__ProgChart__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ProgChart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgChart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__Group__1"


    // $ANTLR start "rule__ProgChart__Group__1__Impl"
    // InternalMyDsl.g:412:1: rule__ProgChart__Group__1__Impl : ( '{' ) ;
    public final void rule__ProgChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:1: ( ( '{' ) )
            // InternalMyDsl.g:417:1: ( '{' )
            {
            // InternalMyDsl.g:417:1: ( '{' )
            // InternalMyDsl.g:418:2: '{'
            {
             before(grammarAccess.getProgChartAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProgChartAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__Group__1__Impl"


    // $ANTLR start "rule__ProgChart__Group__2"
    // InternalMyDsl.g:427:1: rule__ProgChart__Group__2 : rule__ProgChart__Group__2__Impl rule__ProgChart__Group__3 ;
    public final void rule__ProgChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( rule__ProgChart__Group__2__Impl rule__ProgChart__Group__3 )
            // InternalMyDsl.g:432:2: rule__ProgChart__Group__2__Impl rule__ProgChart__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ProgChart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgChart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__Group__2"


    // $ANTLR start "rule__ProgChart__Group__2__Impl"
    // InternalMyDsl.g:439:1: rule__ProgChart__Group__2__Impl : ( ( rule__ProgChart__FunctionsAssignment_2 ) ) ;
    public final void rule__ProgChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( ( ( rule__ProgChart__FunctionsAssignment_2 ) ) )
            // InternalMyDsl.g:444:1: ( ( rule__ProgChart__FunctionsAssignment_2 ) )
            {
            // InternalMyDsl.g:444:1: ( ( rule__ProgChart__FunctionsAssignment_2 ) )
            // InternalMyDsl.g:445:2: ( rule__ProgChart__FunctionsAssignment_2 )
            {
             before(grammarAccess.getProgChartAccess().getFunctionsAssignment_2()); 
            // InternalMyDsl.g:446:2: ( rule__ProgChart__FunctionsAssignment_2 )
            // InternalMyDsl.g:446:3: rule__ProgChart__FunctionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProgChart__FunctionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProgChartAccess().getFunctionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__Group__2__Impl"


    // $ANTLR start "rule__ProgChart__Group__3"
    // InternalMyDsl.g:454:1: rule__ProgChart__Group__3 : rule__ProgChart__Group__3__Impl rule__ProgChart__Group__4 ;
    public final void rule__ProgChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:1: ( rule__ProgChart__Group__3__Impl rule__ProgChart__Group__4 )
            // InternalMyDsl.g:459:2: rule__ProgChart__Group__3__Impl rule__ProgChart__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ProgChart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgChart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__Group__3"


    // $ANTLR start "rule__ProgChart__Group__3__Impl"
    // InternalMyDsl.g:466:1: rule__ProgChart__Group__3__Impl : ( ( rule__ProgChart__Group_3__0 )* ) ;
    public final void rule__ProgChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:470:1: ( ( ( rule__ProgChart__Group_3__0 )* ) )
            // InternalMyDsl.g:471:1: ( ( rule__ProgChart__Group_3__0 )* )
            {
            // InternalMyDsl.g:471:1: ( ( rule__ProgChart__Group_3__0 )* )
            // InternalMyDsl.g:472:2: ( rule__ProgChart__Group_3__0 )*
            {
             before(grammarAccess.getProgChartAccess().getGroup_3()); 
            // InternalMyDsl.g:473:2: ( rule__ProgChart__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:473:3: rule__ProgChart__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ProgChart__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProgChartAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__Group__3__Impl"


    // $ANTLR start "rule__ProgChart__Group__4"
    // InternalMyDsl.g:481:1: rule__ProgChart__Group__4 : rule__ProgChart__Group__4__Impl ;
    public final void rule__ProgChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:485:1: ( rule__ProgChart__Group__4__Impl )
            // InternalMyDsl.g:486:2: rule__ProgChart__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProgChart__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__Group__4"


    // $ANTLR start "rule__ProgChart__Group__4__Impl"
    // InternalMyDsl.g:492:1: rule__ProgChart__Group__4__Impl : ( '}' ) ;
    public final void rule__ProgChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:496:1: ( ( '}' ) )
            // InternalMyDsl.g:497:1: ( '}' )
            {
            // InternalMyDsl.g:497:1: ( '}' )
            // InternalMyDsl.g:498:2: '}'
            {
             before(grammarAccess.getProgChartAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProgChartAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__Group__4__Impl"


    // $ANTLR start "rule__ProgChart__Group_3__0"
    // InternalMyDsl.g:508:1: rule__ProgChart__Group_3__0 : rule__ProgChart__Group_3__0__Impl rule__ProgChart__Group_3__1 ;
    public final void rule__ProgChart__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:512:1: ( rule__ProgChart__Group_3__0__Impl rule__ProgChart__Group_3__1 )
            // InternalMyDsl.g:513:2: rule__ProgChart__Group_3__0__Impl rule__ProgChart__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ProgChart__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgChart__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__Group_3__0"


    // $ANTLR start "rule__ProgChart__Group_3__0__Impl"
    // InternalMyDsl.g:520:1: rule__ProgChart__Group_3__0__Impl : ( ';' ) ;
    public final void rule__ProgChart__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:524:1: ( ( ';' ) )
            // InternalMyDsl.g:525:1: ( ';' )
            {
            // InternalMyDsl.g:525:1: ( ';' )
            // InternalMyDsl.g:526:2: ';'
            {
             before(grammarAccess.getProgChartAccess().getSemicolonKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProgChartAccess().getSemicolonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__Group_3__0__Impl"


    // $ANTLR start "rule__ProgChart__Group_3__1"
    // InternalMyDsl.g:535:1: rule__ProgChart__Group_3__1 : rule__ProgChart__Group_3__1__Impl ;
    public final void rule__ProgChart__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:539:1: ( rule__ProgChart__Group_3__1__Impl )
            // InternalMyDsl.g:540:2: rule__ProgChart__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProgChart__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__Group_3__1"


    // $ANTLR start "rule__ProgChart__Group_3__1__Impl"
    // InternalMyDsl.g:546:1: rule__ProgChart__Group_3__1__Impl : ( ( rule__ProgChart__FunctionsAssignment_3_1 ) ) ;
    public final void rule__ProgChart__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:550:1: ( ( ( rule__ProgChart__FunctionsAssignment_3_1 ) ) )
            // InternalMyDsl.g:551:1: ( ( rule__ProgChart__FunctionsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:551:1: ( ( rule__ProgChart__FunctionsAssignment_3_1 ) )
            // InternalMyDsl.g:552:2: ( rule__ProgChart__FunctionsAssignment_3_1 )
            {
             before(grammarAccess.getProgChartAccess().getFunctionsAssignment_3_1()); 
            // InternalMyDsl.g:553:2: ( rule__ProgChart__FunctionsAssignment_3_1 )
            // InternalMyDsl.g:553:3: rule__ProgChart__FunctionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProgChart__FunctionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProgChartAccess().getFunctionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__Group_3__1__Impl"


    // $ANTLR start "rule__ApplyFilter__Group__0"
    // InternalMyDsl.g:562:1: rule__ApplyFilter__Group__0 : rule__ApplyFilter__Group__0__Impl rule__ApplyFilter__Group__1 ;
    public final void rule__ApplyFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:1: ( rule__ApplyFilter__Group__0__Impl rule__ApplyFilter__Group__1 )
            // InternalMyDsl.g:567:2: rule__ApplyFilter__Group__0__Impl rule__ApplyFilter__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ApplyFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplyFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__0"


    // $ANTLR start "rule__ApplyFilter__Group__0__Impl"
    // InternalMyDsl.g:574:1: rule__ApplyFilter__Group__0__Impl : ( () ) ;
    public final void rule__ApplyFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:578:1: ( ( () ) )
            // InternalMyDsl.g:579:1: ( () )
            {
            // InternalMyDsl.g:579:1: ( () )
            // InternalMyDsl.g:580:2: ()
            {
             before(grammarAccess.getApplyFilterAccess().getApplyFilterAction_0()); 
            // InternalMyDsl.g:581:2: ()
            // InternalMyDsl.g:581:3: 
            {
            }

             after(grammarAccess.getApplyFilterAccess().getApplyFilterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__0__Impl"


    // $ANTLR start "rule__ApplyFilter__Group__1"
    // InternalMyDsl.g:589:1: rule__ApplyFilter__Group__1 : rule__ApplyFilter__Group__1__Impl rule__ApplyFilter__Group__2 ;
    public final void rule__ApplyFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:593:1: ( rule__ApplyFilter__Group__1__Impl rule__ApplyFilter__Group__2 )
            // InternalMyDsl.g:594:2: rule__ApplyFilter__Group__1__Impl rule__ApplyFilter__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ApplyFilter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplyFilter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__1"


    // $ANTLR start "rule__ApplyFilter__Group__1__Impl"
    // InternalMyDsl.g:601:1: rule__ApplyFilter__Group__1__Impl : ( 'ApplyFilter' ) ;
    public final void rule__ApplyFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( ( 'ApplyFilter' ) )
            // InternalMyDsl.g:606:1: ( 'ApplyFilter' )
            {
            // InternalMyDsl.g:606:1: ( 'ApplyFilter' )
            // InternalMyDsl.g:607:2: 'ApplyFilter'
            {
             before(grammarAccess.getApplyFilterAccess().getApplyFilterKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getApplyFilterAccess().getApplyFilterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__1__Impl"


    // $ANTLR start "rule__ApplyFilter__Group__2"
    // InternalMyDsl.g:616:1: rule__ApplyFilter__Group__2 : rule__ApplyFilter__Group__2__Impl rule__ApplyFilter__Group__3 ;
    public final void rule__ApplyFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:620:1: ( rule__ApplyFilter__Group__2__Impl rule__ApplyFilter__Group__3 )
            // InternalMyDsl.g:621:2: rule__ApplyFilter__Group__2__Impl rule__ApplyFilter__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ApplyFilter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplyFilter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__2"


    // $ANTLR start "rule__ApplyFilter__Group__2__Impl"
    // InternalMyDsl.g:628:1: rule__ApplyFilter__Group__2__Impl : ( '(' ) ;
    public final void rule__ApplyFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( ( '(' ) )
            // InternalMyDsl.g:633:1: ( '(' )
            {
            // InternalMyDsl.g:633:1: ( '(' )
            // InternalMyDsl.g:634:2: '('
            {
             before(grammarAccess.getApplyFilterAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getApplyFilterAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__2__Impl"


    // $ANTLR start "rule__ApplyFilter__Group__3"
    // InternalMyDsl.g:643:1: rule__ApplyFilter__Group__3 : rule__ApplyFilter__Group__3__Impl rule__ApplyFilter__Group__4 ;
    public final void rule__ApplyFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:647:1: ( rule__ApplyFilter__Group__3__Impl rule__ApplyFilter__Group__4 )
            // InternalMyDsl.g:648:2: rule__ApplyFilter__Group__3__Impl rule__ApplyFilter__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ApplyFilter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplyFilter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__3"


    // $ANTLR start "rule__ApplyFilter__Group__3__Impl"
    // InternalMyDsl.g:655:1: rule__ApplyFilter__Group__3__Impl : ( ( rule__ApplyFilter__ColumnameAssignment_3 )? ) ;
    public final void rule__ApplyFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( ( ( rule__ApplyFilter__ColumnameAssignment_3 )? ) )
            // InternalMyDsl.g:660:1: ( ( rule__ApplyFilter__ColumnameAssignment_3 )? )
            {
            // InternalMyDsl.g:660:1: ( ( rule__ApplyFilter__ColumnameAssignment_3 )? )
            // InternalMyDsl.g:661:2: ( rule__ApplyFilter__ColumnameAssignment_3 )?
            {
             before(grammarAccess.getApplyFilterAccess().getColumnameAssignment_3()); 
            // InternalMyDsl.g:662:2: ( rule__ApplyFilter__ColumnameAssignment_3 )?
            int alt6=2;
            switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    alt6=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt6=1;
                    }
                    break;
                case 11:
                    {
                    alt6=1;
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:662:3: rule__ApplyFilter__ColumnameAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplyFilter__ColumnameAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplyFilterAccess().getColumnameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__3__Impl"


    // $ANTLR start "rule__ApplyFilter__Group__4"
    // InternalMyDsl.g:670:1: rule__ApplyFilter__Group__4 : rule__ApplyFilter__Group__4__Impl rule__ApplyFilter__Group__5 ;
    public final void rule__ApplyFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( rule__ApplyFilter__Group__4__Impl rule__ApplyFilter__Group__5 )
            // InternalMyDsl.g:675:2: rule__ApplyFilter__Group__4__Impl rule__ApplyFilter__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__ApplyFilter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplyFilter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__4"


    // $ANTLR start "rule__ApplyFilter__Group__4__Impl"
    // InternalMyDsl.g:682:1: rule__ApplyFilter__Group__4__Impl : ( ( rule__ApplyFilter__FilterAssignment_4 )? ) ;
    public final void rule__ApplyFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( ( ( rule__ApplyFilter__FilterAssignment_4 )? ) )
            // InternalMyDsl.g:687:1: ( ( rule__ApplyFilter__FilterAssignment_4 )? )
            {
            // InternalMyDsl.g:687:1: ( ( rule__ApplyFilter__FilterAssignment_4 )? )
            // InternalMyDsl.g:688:2: ( rule__ApplyFilter__FilterAssignment_4 )?
            {
             before(grammarAccess.getApplyFilterAccess().getFilterAssignment_4()); 
            // InternalMyDsl.g:689:2: ( rule__ApplyFilter__FilterAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=12 && LA7_0<=14)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:689:3: rule__ApplyFilter__FilterAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplyFilter__FilterAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplyFilterAccess().getFilterAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__4__Impl"


    // $ANTLR start "rule__ApplyFilter__Group__5"
    // InternalMyDsl.g:697:1: rule__ApplyFilter__Group__5 : rule__ApplyFilter__Group__5__Impl rule__ApplyFilter__Group__6 ;
    public final void rule__ApplyFilter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:701:1: ( rule__ApplyFilter__Group__5__Impl rule__ApplyFilter__Group__6 )
            // InternalMyDsl.g:702:2: rule__ApplyFilter__Group__5__Impl rule__ApplyFilter__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ApplyFilter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplyFilter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__5"


    // $ANTLR start "rule__ApplyFilter__Group__5__Impl"
    // InternalMyDsl.g:709:1: rule__ApplyFilter__Group__5__Impl : ( ( rule__ApplyFilter__FiltervalueAssignment_5 )? ) ;
    public final void rule__ApplyFilter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( ( ( rule__ApplyFilter__FiltervalueAssignment_5 )? ) )
            // InternalMyDsl.g:714:1: ( ( rule__ApplyFilter__FiltervalueAssignment_5 )? )
            {
            // InternalMyDsl.g:714:1: ( ( rule__ApplyFilter__FiltervalueAssignment_5 )? )
            // InternalMyDsl.g:715:2: ( rule__ApplyFilter__FiltervalueAssignment_5 )?
            {
             before(grammarAccess.getApplyFilterAccess().getFiltervalueAssignment_5()); 
            // InternalMyDsl.g:716:2: ( rule__ApplyFilter__FiltervalueAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||LA8_0==11) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:716:3: rule__ApplyFilter__FiltervalueAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplyFilter__FiltervalueAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplyFilterAccess().getFiltervalueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__5__Impl"


    // $ANTLR start "rule__ApplyFilter__Group__6"
    // InternalMyDsl.g:724:1: rule__ApplyFilter__Group__6 : rule__ApplyFilter__Group__6__Impl rule__ApplyFilter__Group__7 ;
    public final void rule__ApplyFilter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( rule__ApplyFilter__Group__6__Impl rule__ApplyFilter__Group__7 )
            // InternalMyDsl.g:729:2: rule__ApplyFilter__Group__6__Impl rule__ApplyFilter__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__ApplyFilter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplyFilter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__6"


    // $ANTLR start "rule__ApplyFilter__Group__6__Impl"
    // InternalMyDsl.g:736:1: rule__ApplyFilter__Group__6__Impl : ( ',' ) ;
    public final void rule__ApplyFilter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( ( ',' ) )
            // InternalMyDsl.g:741:1: ( ',' )
            {
            // InternalMyDsl.g:741:1: ( ',' )
            // InternalMyDsl.g:742:2: ','
            {
             before(grammarAccess.getApplyFilterAccess().getCommaKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getApplyFilterAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__6__Impl"


    // $ANTLR start "rule__ApplyFilter__Group__7"
    // InternalMyDsl.g:751:1: rule__ApplyFilter__Group__7 : rule__ApplyFilter__Group__7__Impl rule__ApplyFilter__Group__8 ;
    public final void rule__ApplyFilter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( rule__ApplyFilter__Group__7__Impl rule__ApplyFilter__Group__8 )
            // InternalMyDsl.g:756:2: rule__ApplyFilter__Group__7__Impl rule__ApplyFilter__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__ApplyFilter__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplyFilter__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__7"


    // $ANTLR start "rule__ApplyFilter__Group__7__Impl"
    // InternalMyDsl.g:763:1: rule__ApplyFilter__Group__7__Impl : ( ( rule__ApplyFilter__FilteredoutputAssignment_7 )? ) ;
    public final void rule__ApplyFilter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( ( ( rule__ApplyFilter__FilteredoutputAssignment_7 )? ) )
            // InternalMyDsl.g:768:1: ( ( rule__ApplyFilter__FilteredoutputAssignment_7 )? )
            {
            // InternalMyDsl.g:768:1: ( ( rule__ApplyFilter__FilteredoutputAssignment_7 )? )
            // InternalMyDsl.g:769:2: ( rule__ApplyFilter__FilteredoutputAssignment_7 )?
            {
             before(grammarAccess.getApplyFilterAccess().getFilteredoutputAssignment_7()); 
            // InternalMyDsl.g:770:2: ( rule__ApplyFilter__FilteredoutputAssignment_7 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==11) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:770:3: rule__ApplyFilter__FilteredoutputAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplyFilter__FilteredoutputAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplyFilterAccess().getFilteredoutputAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__7__Impl"


    // $ANTLR start "rule__ApplyFilter__Group__8"
    // InternalMyDsl.g:778:1: rule__ApplyFilter__Group__8 : rule__ApplyFilter__Group__8__Impl ;
    public final void rule__ApplyFilter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( rule__ApplyFilter__Group__8__Impl )
            // InternalMyDsl.g:783:2: rule__ApplyFilter__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplyFilter__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__8"


    // $ANTLR start "rule__ApplyFilter__Group__8__Impl"
    // InternalMyDsl.g:789:1: rule__ApplyFilter__Group__8__Impl : ( ')' ) ;
    public final void rule__ApplyFilter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:793:1: ( ( ')' ) )
            // InternalMyDsl.g:794:1: ( ')' )
            {
            // InternalMyDsl.g:794:1: ( ')' )
            // InternalMyDsl.g:795:2: ')'
            {
             before(grammarAccess.getApplyFilterAccess().getRightParenthesisKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getApplyFilterAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__Group__8__Impl"


    // $ANTLR start "rule__CreateChart__Group__0"
    // InternalMyDsl.g:805:1: rule__CreateChart__Group__0 : rule__CreateChart__Group__0__Impl rule__CreateChart__Group__1 ;
    public final void rule__CreateChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( rule__CreateChart__Group__0__Impl rule__CreateChart__Group__1 )
            // InternalMyDsl.g:810:2: rule__CreateChart__Group__0__Impl rule__CreateChart__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__CreateChart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__0"


    // $ANTLR start "rule__CreateChart__Group__0__Impl"
    // InternalMyDsl.g:817:1: rule__CreateChart__Group__0__Impl : ( () ) ;
    public final void rule__CreateChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( ( () ) )
            // InternalMyDsl.g:822:1: ( () )
            {
            // InternalMyDsl.g:822:1: ( () )
            // InternalMyDsl.g:823:2: ()
            {
             before(grammarAccess.getCreateChartAccess().getCreateChartAction_0()); 
            // InternalMyDsl.g:824:2: ()
            // InternalMyDsl.g:824:3: 
            {
            }

             after(grammarAccess.getCreateChartAccess().getCreateChartAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__0__Impl"


    // $ANTLR start "rule__CreateChart__Group__1"
    // InternalMyDsl.g:832:1: rule__CreateChart__Group__1 : rule__CreateChart__Group__1__Impl rule__CreateChart__Group__2 ;
    public final void rule__CreateChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:836:1: ( rule__CreateChart__Group__1__Impl rule__CreateChart__Group__2 )
            // InternalMyDsl.g:837:2: rule__CreateChart__Group__1__Impl rule__CreateChart__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CreateChart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__1"


    // $ANTLR start "rule__CreateChart__Group__1__Impl"
    // InternalMyDsl.g:844:1: rule__CreateChart__Group__1__Impl : ( 'CreateChart' ) ;
    public final void rule__CreateChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( ( 'CreateChart' ) )
            // InternalMyDsl.g:849:1: ( 'CreateChart' )
            {
            // InternalMyDsl.g:849:1: ( 'CreateChart' )
            // InternalMyDsl.g:850:2: 'CreateChart'
            {
             before(grammarAccess.getCreateChartAccess().getCreateChartKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCreateChartAccess().getCreateChartKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__1__Impl"


    // $ANTLR start "rule__CreateChart__Group__2"
    // InternalMyDsl.g:859:1: rule__CreateChart__Group__2 : rule__CreateChart__Group__2__Impl rule__CreateChart__Group__3 ;
    public final void rule__CreateChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( rule__CreateChart__Group__2__Impl rule__CreateChart__Group__3 )
            // InternalMyDsl.g:864:2: rule__CreateChart__Group__2__Impl rule__CreateChart__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CreateChart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__2"


    // $ANTLR start "rule__CreateChart__Group__2__Impl"
    // InternalMyDsl.g:871:1: rule__CreateChart__Group__2__Impl : ( '(' ) ;
    public final void rule__CreateChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( ( '(' ) )
            // InternalMyDsl.g:876:1: ( '(' )
            {
            // InternalMyDsl.g:876:1: ( '(' )
            // InternalMyDsl.g:877:2: '('
            {
             before(grammarAccess.getCreateChartAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCreateChartAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__2__Impl"


    // $ANTLR start "rule__CreateChart__Group__3"
    // InternalMyDsl.g:886:1: rule__CreateChart__Group__3 : rule__CreateChart__Group__3__Impl rule__CreateChart__Group__4 ;
    public final void rule__CreateChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:890:1: ( rule__CreateChart__Group__3__Impl rule__CreateChart__Group__4 )
            // InternalMyDsl.g:891:2: rule__CreateChart__Group__3__Impl rule__CreateChart__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__CreateChart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__3"


    // $ANTLR start "rule__CreateChart__Group__3__Impl"
    // InternalMyDsl.g:898:1: rule__CreateChart__Group__3__Impl : ( ( rule__CreateChart__Group_3__0 ) ) ;
    public final void rule__CreateChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( ( ( rule__CreateChart__Group_3__0 ) ) )
            // InternalMyDsl.g:903:1: ( ( rule__CreateChart__Group_3__0 ) )
            {
            // InternalMyDsl.g:903:1: ( ( rule__CreateChart__Group_3__0 ) )
            // InternalMyDsl.g:904:2: ( rule__CreateChart__Group_3__0 )
            {
             before(grammarAccess.getCreateChartAccess().getGroup_3()); 
            // InternalMyDsl.g:905:2: ( rule__CreateChart__Group_3__0 )
            // InternalMyDsl.g:905:3: rule__CreateChart__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateChart__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateChartAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__3__Impl"


    // $ANTLR start "rule__CreateChart__Group__4"
    // InternalMyDsl.g:913:1: rule__CreateChart__Group__4 : rule__CreateChart__Group__4__Impl rule__CreateChart__Group__5 ;
    public final void rule__CreateChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:917:1: ( rule__CreateChart__Group__4__Impl rule__CreateChart__Group__5 )
            // InternalMyDsl.g:918:2: rule__CreateChart__Group__4__Impl rule__CreateChart__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__CreateChart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__4"


    // $ANTLR start "rule__CreateChart__Group__4__Impl"
    // InternalMyDsl.g:925:1: rule__CreateChart__Group__4__Impl : ( ',' ) ;
    public final void rule__CreateChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( ( ',' ) )
            // InternalMyDsl.g:930:1: ( ',' )
            {
            // InternalMyDsl.g:930:1: ( ',' )
            // InternalMyDsl.g:931:2: ','
            {
             before(grammarAccess.getCreateChartAccess().getCommaKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCreateChartAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__4__Impl"


    // $ANTLR start "rule__CreateChart__Group__5"
    // InternalMyDsl.g:940:1: rule__CreateChart__Group__5 : rule__CreateChart__Group__5__Impl rule__CreateChart__Group__6 ;
    public final void rule__CreateChart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( rule__CreateChart__Group__5__Impl rule__CreateChart__Group__6 )
            // InternalMyDsl.g:945:2: rule__CreateChart__Group__5__Impl rule__CreateChart__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__CreateChart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__5"


    // $ANTLR start "rule__CreateChart__Group__5__Impl"
    // InternalMyDsl.g:952:1: rule__CreateChart__Group__5__Impl : ( 'title : ' ) ;
    public final void rule__CreateChart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( ( 'title : ' ) )
            // InternalMyDsl.g:957:1: ( 'title : ' )
            {
            // InternalMyDsl.g:957:1: ( 'title : ' )
            // InternalMyDsl.g:958:2: 'title : '
            {
             before(grammarAccess.getCreateChartAccess().getTitleKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCreateChartAccess().getTitleKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__5__Impl"


    // $ANTLR start "rule__CreateChart__Group__6"
    // InternalMyDsl.g:967:1: rule__CreateChart__Group__6 : rule__CreateChart__Group__6__Impl rule__CreateChart__Group__7 ;
    public final void rule__CreateChart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:971:1: ( rule__CreateChart__Group__6__Impl rule__CreateChart__Group__7 )
            // InternalMyDsl.g:972:2: rule__CreateChart__Group__6__Impl rule__CreateChart__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__CreateChart__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__6"


    // $ANTLR start "rule__CreateChart__Group__6__Impl"
    // InternalMyDsl.g:979:1: rule__CreateChart__Group__6__Impl : ( ( rule__CreateChart__TitlechartAssignment_6 ) ) ;
    public final void rule__CreateChart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:983:1: ( ( ( rule__CreateChart__TitlechartAssignment_6 ) ) )
            // InternalMyDsl.g:984:1: ( ( rule__CreateChart__TitlechartAssignment_6 ) )
            {
            // InternalMyDsl.g:984:1: ( ( rule__CreateChart__TitlechartAssignment_6 ) )
            // InternalMyDsl.g:985:2: ( rule__CreateChart__TitlechartAssignment_6 )
            {
             before(grammarAccess.getCreateChartAccess().getTitlechartAssignment_6()); 
            // InternalMyDsl.g:986:2: ( rule__CreateChart__TitlechartAssignment_6 )
            // InternalMyDsl.g:986:3: rule__CreateChart__TitlechartAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CreateChart__TitlechartAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCreateChartAccess().getTitlechartAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__6__Impl"


    // $ANTLR start "rule__CreateChart__Group__7"
    // InternalMyDsl.g:994:1: rule__CreateChart__Group__7 : rule__CreateChart__Group__7__Impl rule__CreateChart__Group__8 ;
    public final void rule__CreateChart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( rule__CreateChart__Group__7__Impl rule__CreateChart__Group__8 )
            // InternalMyDsl.g:999:2: rule__CreateChart__Group__7__Impl rule__CreateChart__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__CreateChart__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__7"


    // $ANTLR start "rule__CreateChart__Group__7__Impl"
    // InternalMyDsl.g:1006:1: rule__CreateChart__Group__7__Impl : ( ',' ) ;
    public final void rule__CreateChart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( ( ',' ) )
            // InternalMyDsl.g:1011:1: ( ',' )
            {
            // InternalMyDsl.g:1011:1: ( ',' )
            // InternalMyDsl.g:1012:2: ','
            {
             before(grammarAccess.getCreateChartAccess().getCommaKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCreateChartAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__7__Impl"


    // $ANTLR start "rule__CreateChart__Group__8"
    // InternalMyDsl.g:1021:1: rule__CreateChart__Group__8 : rule__CreateChart__Group__8__Impl rule__CreateChart__Group__9 ;
    public final void rule__CreateChart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( rule__CreateChart__Group__8__Impl rule__CreateChart__Group__9 )
            // InternalMyDsl.g:1026:2: rule__CreateChart__Group__8__Impl rule__CreateChart__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__CreateChart__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__8"


    // $ANTLR start "rule__CreateChart__Group__8__Impl"
    // InternalMyDsl.g:1033:1: rule__CreateChart__Group__8__Impl : ( 'xlabel : ' ) ;
    public final void rule__CreateChart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( ( 'xlabel : ' ) )
            // InternalMyDsl.g:1038:1: ( 'xlabel : ' )
            {
            // InternalMyDsl.g:1038:1: ( 'xlabel : ' )
            // InternalMyDsl.g:1039:2: 'xlabel : '
            {
             before(grammarAccess.getCreateChartAccess().getXlabelKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCreateChartAccess().getXlabelKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__8__Impl"


    // $ANTLR start "rule__CreateChart__Group__9"
    // InternalMyDsl.g:1048:1: rule__CreateChart__Group__9 : rule__CreateChart__Group__9__Impl rule__CreateChart__Group__10 ;
    public final void rule__CreateChart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1052:1: ( rule__CreateChart__Group__9__Impl rule__CreateChart__Group__10 )
            // InternalMyDsl.g:1053:2: rule__CreateChart__Group__9__Impl rule__CreateChart__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__CreateChart__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__9"


    // $ANTLR start "rule__CreateChart__Group__9__Impl"
    // InternalMyDsl.g:1060:1: rule__CreateChart__Group__9__Impl : ( ( rule__CreateChart__XlabelAssignment_9 ) ) ;
    public final void rule__CreateChart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1064:1: ( ( ( rule__CreateChart__XlabelAssignment_9 ) ) )
            // InternalMyDsl.g:1065:1: ( ( rule__CreateChart__XlabelAssignment_9 ) )
            {
            // InternalMyDsl.g:1065:1: ( ( rule__CreateChart__XlabelAssignment_9 ) )
            // InternalMyDsl.g:1066:2: ( rule__CreateChart__XlabelAssignment_9 )
            {
             before(grammarAccess.getCreateChartAccess().getXlabelAssignment_9()); 
            // InternalMyDsl.g:1067:2: ( rule__CreateChart__XlabelAssignment_9 )
            // InternalMyDsl.g:1067:3: rule__CreateChart__XlabelAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__CreateChart__XlabelAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCreateChartAccess().getXlabelAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__9__Impl"


    // $ANTLR start "rule__CreateChart__Group__10"
    // InternalMyDsl.g:1075:1: rule__CreateChart__Group__10 : rule__CreateChart__Group__10__Impl rule__CreateChart__Group__11 ;
    public final void rule__CreateChart__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1079:1: ( rule__CreateChart__Group__10__Impl rule__CreateChart__Group__11 )
            // InternalMyDsl.g:1080:2: rule__CreateChart__Group__10__Impl rule__CreateChart__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__CreateChart__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__10"


    // $ANTLR start "rule__CreateChart__Group__10__Impl"
    // InternalMyDsl.g:1087:1: rule__CreateChart__Group__10__Impl : ( ',' ) ;
    public final void rule__CreateChart__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:1: ( ( ',' ) )
            // InternalMyDsl.g:1092:1: ( ',' )
            {
            // InternalMyDsl.g:1092:1: ( ',' )
            // InternalMyDsl.g:1093:2: ','
            {
             before(grammarAccess.getCreateChartAccess().getCommaKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCreateChartAccess().getCommaKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__10__Impl"


    // $ANTLR start "rule__CreateChart__Group__11"
    // InternalMyDsl.g:1102:1: rule__CreateChart__Group__11 : rule__CreateChart__Group__11__Impl rule__CreateChart__Group__12 ;
    public final void rule__CreateChart__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1106:1: ( rule__CreateChart__Group__11__Impl rule__CreateChart__Group__12 )
            // InternalMyDsl.g:1107:2: rule__CreateChart__Group__11__Impl rule__CreateChart__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__CreateChart__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__11"


    // $ANTLR start "rule__CreateChart__Group__11__Impl"
    // InternalMyDsl.g:1114:1: rule__CreateChart__Group__11__Impl : ( 'ylabel : ' ) ;
    public final void rule__CreateChart__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1118:1: ( ( 'ylabel : ' ) )
            // InternalMyDsl.g:1119:1: ( 'ylabel : ' )
            {
            // InternalMyDsl.g:1119:1: ( 'ylabel : ' )
            // InternalMyDsl.g:1120:2: 'ylabel : '
            {
             before(grammarAccess.getCreateChartAccess().getYlabelKeyword_11()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCreateChartAccess().getYlabelKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__11__Impl"


    // $ANTLR start "rule__CreateChart__Group__12"
    // InternalMyDsl.g:1129:1: rule__CreateChart__Group__12 : rule__CreateChart__Group__12__Impl rule__CreateChart__Group__13 ;
    public final void rule__CreateChart__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1133:1: ( rule__CreateChart__Group__12__Impl rule__CreateChart__Group__13 )
            // InternalMyDsl.g:1134:2: rule__CreateChart__Group__12__Impl rule__CreateChart__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__CreateChart__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__12"


    // $ANTLR start "rule__CreateChart__Group__12__Impl"
    // InternalMyDsl.g:1141:1: rule__CreateChart__Group__12__Impl : ( ( rule__CreateChart__YlabelAssignment_12 )* ) ;
    public final void rule__CreateChart__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( ( ( rule__CreateChart__YlabelAssignment_12 )* ) )
            // InternalMyDsl.g:1146:1: ( ( rule__CreateChart__YlabelAssignment_12 )* )
            {
            // InternalMyDsl.g:1146:1: ( ( rule__CreateChart__YlabelAssignment_12 )* )
            // InternalMyDsl.g:1147:2: ( rule__CreateChart__YlabelAssignment_12 )*
            {
             before(grammarAccess.getCreateChartAccess().getYlabelAssignment_12()); 
            // InternalMyDsl.g:1148:2: ( rule__CreateChart__YlabelAssignment_12 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||LA10_0==11) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1148:3: rule__CreateChart__YlabelAssignment_12
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__CreateChart__YlabelAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCreateChartAccess().getYlabelAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__12__Impl"


    // $ANTLR start "rule__CreateChart__Group__13"
    // InternalMyDsl.g:1156:1: rule__CreateChart__Group__13 : rule__CreateChart__Group__13__Impl ;
    public final void rule__CreateChart__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1160:1: ( rule__CreateChart__Group__13__Impl )
            // InternalMyDsl.g:1161:2: rule__CreateChart__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateChart__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__13"


    // $ANTLR start "rule__CreateChart__Group__13__Impl"
    // InternalMyDsl.g:1167:1: rule__CreateChart__Group__13__Impl : ( ( ')' )? ) ;
    public final void rule__CreateChart__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( ( ( ')' )? ) )
            // InternalMyDsl.g:1172:1: ( ( ')' )? )
            {
            // InternalMyDsl.g:1172:1: ( ( ')' )? )
            // InternalMyDsl.g:1173:2: ( ')' )?
            {
             before(grammarAccess.getCreateChartAccess().getRightParenthesisKeyword_13()); 
            // InternalMyDsl.g:1174:2: ( ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1174:3: ')'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCreateChartAccess().getRightParenthesisKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group__13__Impl"


    // $ANTLR start "rule__CreateChart__Group_3__0"
    // InternalMyDsl.g:1183:1: rule__CreateChart__Group_3__0 : rule__CreateChart__Group_3__0__Impl rule__CreateChart__Group_3__1 ;
    public final void rule__CreateChart__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1187:1: ( rule__CreateChart__Group_3__0__Impl rule__CreateChart__Group_3__1 )
            // InternalMyDsl.g:1188:2: rule__CreateChart__Group_3__0__Impl rule__CreateChart__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__CreateChart__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateChart__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group_3__0"


    // $ANTLR start "rule__CreateChart__Group_3__0__Impl"
    // InternalMyDsl.g:1195:1: rule__CreateChart__Group_3__0__Impl : ( 'chart' ) ;
    public final void rule__CreateChart__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1199:1: ( ( 'chart' ) )
            // InternalMyDsl.g:1200:1: ( 'chart' )
            {
            // InternalMyDsl.g:1200:1: ( 'chart' )
            // InternalMyDsl.g:1201:2: 'chart'
            {
             before(grammarAccess.getCreateChartAccess().getChartKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCreateChartAccess().getChartKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group_3__0__Impl"


    // $ANTLR start "rule__CreateChart__Group_3__1"
    // InternalMyDsl.g:1210:1: rule__CreateChart__Group_3__1 : rule__CreateChart__Group_3__1__Impl ;
    public final void rule__CreateChart__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1214:1: ( rule__CreateChart__Group_3__1__Impl )
            // InternalMyDsl.g:1215:2: rule__CreateChart__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateChart__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group_3__1"


    // $ANTLR start "rule__CreateChart__Group_3__1__Impl"
    // InternalMyDsl.g:1221:1: rule__CreateChart__Group_3__1__Impl : ( ( rule__CreateChart__ChartAssignment_3_1 ) ) ;
    public final void rule__CreateChart__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1225:1: ( ( ( rule__CreateChart__ChartAssignment_3_1 ) ) )
            // InternalMyDsl.g:1226:1: ( ( rule__CreateChart__ChartAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1226:1: ( ( rule__CreateChart__ChartAssignment_3_1 ) )
            // InternalMyDsl.g:1227:2: ( rule__CreateChart__ChartAssignment_3_1 )
            {
             before(grammarAccess.getCreateChartAccess().getChartAssignment_3_1()); 
            // InternalMyDsl.g:1228:2: ( rule__CreateChart__ChartAssignment_3_1 )
            // InternalMyDsl.g:1228:3: rule__CreateChart__ChartAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CreateChart__ChartAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCreateChartAccess().getChartAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__Group_3__1__Impl"


    // $ANTLR start "rule__SelectedColumns__Group__0"
    // InternalMyDsl.g:1237:1: rule__SelectedColumns__Group__0 : rule__SelectedColumns__Group__0__Impl rule__SelectedColumns__Group__1 ;
    public final void rule__SelectedColumns__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1241:1: ( rule__SelectedColumns__Group__0__Impl rule__SelectedColumns__Group__1 )
            // InternalMyDsl.g:1242:2: rule__SelectedColumns__Group__0__Impl rule__SelectedColumns__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectedColumns__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__0"


    // $ANTLR start "rule__SelectedColumns__Group__0__Impl"
    // InternalMyDsl.g:1249:1: rule__SelectedColumns__Group__0__Impl : ( 'SelectedColumns' ) ;
    public final void rule__SelectedColumns__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( ( 'SelectedColumns' ) )
            // InternalMyDsl.g:1254:1: ( 'SelectedColumns' )
            {
            // InternalMyDsl.g:1254:1: ( 'SelectedColumns' )
            // InternalMyDsl.g:1255:2: 'SelectedColumns'
            {
             before(grammarAccess.getSelectedColumnsAccess().getSelectedColumnsKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSelectedColumnsAccess().getSelectedColumnsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__0__Impl"


    // $ANTLR start "rule__SelectedColumns__Group__1"
    // InternalMyDsl.g:1264:1: rule__SelectedColumns__Group__1 : rule__SelectedColumns__Group__1__Impl rule__SelectedColumns__Group__2 ;
    public final void rule__SelectedColumns__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1268:1: ( rule__SelectedColumns__Group__1__Impl rule__SelectedColumns__Group__2 )
            // InternalMyDsl.g:1269:2: rule__SelectedColumns__Group__1__Impl rule__SelectedColumns__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__SelectedColumns__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__1"


    // $ANTLR start "rule__SelectedColumns__Group__1__Impl"
    // InternalMyDsl.g:1276:1: rule__SelectedColumns__Group__1__Impl : ( '(' ) ;
    public final void rule__SelectedColumns__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1280:1: ( ( '(' ) )
            // InternalMyDsl.g:1281:1: ( '(' )
            {
            // InternalMyDsl.g:1281:1: ( '(' )
            // InternalMyDsl.g:1282:2: '('
            {
             before(grammarAccess.getSelectedColumnsAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSelectedColumnsAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__1__Impl"


    // $ANTLR start "rule__SelectedColumns__Group__2"
    // InternalMyDsl.g:1291:1: rule__SelectedColumns__Group__2 : rule__SelectedColumns__Group__2__Impl rule__SelectedColumns__Group__3 ;
    public final void rule__SelectedColumns__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1295:1: ( rule__SelectedColumns__Group__2__Impl rule__SelectedColumns__Group__3 )
            // InternalMyDsl.g:1296:2: rule__SelectedColumns__Group__2__Impl rule__SelectedColumns__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__SelectedColumns__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__2"


    // $ANTLR start "rule__SelectedColumns__Group__2__Impl"
    // InternalMyDsl.g:1303:1: rule__SelectedColumns__Group__2__Impl : ( ( rule__SelectedColumns__ColumnsnameAssignment_2 ) ) ;
    public final void rule__SelectedColumns__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1307:1: ( ( ( rule__SelectedColumns__ColumnsnameAssignment_2 ) ) )
            // InternalMyDsl.g:1308:1: ( ( rule__SelectedColumns__ColumnsnameAssignment_2 ) )
            {
            // InternalMyDsl.g:1308:1: ( ( rule__SelectedColumns__ColumnsnameAssignment_2 ) )
            // InternalMyDsl.g:1309:2: ( rule__SelectedColumns__ColumnsnameAssignment_2 )
            {
             before(grammarAccess.getSelectedColumnsAccess().getColumnsnameAssignment_2()); 
            // InternalMyDsl.g:1310:2: ( rule__SelectedColumns__ColumnsnameAssignment_2 )
            // InternalMyDsl.g:1310:3: rule__SelectedColumns__ColumnsnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__ColumnsnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectedColumnsAccess().getColumnsnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__2__Impl"


    // $ANTLR start "rule__SelectedColumns__Group__3"
    // InternalMyDsl.g:1318:1: rule__SelectedColumns__Group__3 : rule__SelectedColumns__Group__3__Impl rule__SelectedColumns__Group__4 ;
    public final void rule__SelectedColumns__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( rule__SelectedColumns__Group__3__Impl rule__SelectedColumns__Group__4 )
            // InternalMyDsl.g:1323:2: rule__SelectedColumns__Group__3__Impl rule__SelectedColumns__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__SelectedColumns__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__3"


    // $ANTLR start "rule__SelectedColumns__Group__3__Impl"
    // InternalMyDsl.g:1330:1: rule__SelectedColumns__Group__3__Impl : ( ( rule__SelectedColumns__Group_3__0 )* ) ;
    public final void rule__SelectedColumns__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1334:1: ( ( ( rule__SelectedColumns__Group_3__0 )* ) )
            // InternalMyDsl.g:1335:1: ( ( rule__SelectedColumns__Group_3__0 )* )
            {
            // InternalMyDsl.g:1335:1: ( ( rule__SelectedColumns__Group_3__0 )* )
            // InternalMyDsl.g:1336:2: ( rule__SelectedColumns__Group_3__0 )*
            {
             before(grammarAccess.getSelectedColumnsAccess().getGroup_3()); 
            // InternalMyDsl.g:1337:2: ( rule__SelectedColumns__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    int LA12_1 = input.LA(2);

                    if ( ((LA12_1>=RULE_STRING && LA12_1<=RULE_ID)||LA12_1==11) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1337:3: rule__SelectedColumns__Group_3__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SelectedColumns__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSelectedColumnsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__3__Impl"


    // $ANTLR start "rule__SelectedColumns__Group__4"
    // InternalMyDsl.g:1345:1: rule__SelectedColumns__Group__4 : rule__SelectedColumns__Group__4__Impl rule__SelectedColumns__Group__5 ;
    public final void rule__SelectedColumns__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1349:1: ( rule__SelectedColumns__Group__4__Impl rule__SelectedColumns__Group__5 )
            // InternalMyDsl.g:1350:2: rule__SelectedColumns__Group__4__Impl rule__SelectedColumns__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__SelectedColumns__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__4"


    // $ANTLR start "rule__SelectedColumns__Group__4__Impl"
    // InternalMyDsl.g:1357:1: rule__SelectedColumns__Group__4__Impl : ( ( rule__SelectedColumns__Group_4__0 )? ) ;
    public final void rule__SelectedColumns__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1361:1: ( ( ( rule__SelectedColumns__Group_4__0 )? ) )
            // InternalMyDsl.g:1362:1: ( ( rule__SelectedColumns__Group_4__0 )? )
            {
            // InternalMyDsl.g:1362:1: ( ( rule__SelectedColumns__Group_4__0 )? )
            // InternalMyDsl.g:1363:2: ( rule__SelectedColumns__Group_4__0 )?
            {
             before(grammarAccess.getSelectedColumnsAccess().getGroup_4()); 
            // InternalMyDsl.g:1364:2: ( rule__SelectedColumns__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1364:3: rule__SelectedColumns__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectedColumns__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectedColumnsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__4__Impl"


    // $ANTLR start "rule__SelectedColumns__Group__5"
    // InternalMyDsl.g:1372:1: rule__SelectedColumns__Group__5 : rule__SelectedColumns__Group__5__Impl ;
    public final void rule__SelectedColumns__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1376:1: ( rule__SelectedColumns__Group__5__Impl )
            // InternalMyDsl.g:1377:2: rule__SelectedColumns__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__5"


    // $ANTLR start "rule__SelectedColumns__Group__5__Impl"
    // InternalMyDsl.g:1383:1: rule__SelectedColumns__Group__5__Impl : ( ')' ) ;
    public final void rule__SelectedColumns__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1387:1: ( ( ')' ) )
            // InternalMyDsl.g:1388:1: ( ')' )
            {
            // InternalMyDsl.g:1388:1: ( ')' )
            // InternalMyDsl.g:1389:2: ')'
            {
             before(grammarAccess.getSelectedColumnsAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSelectedColumnsAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__5__Impl"


    // $ANTLR start "rule__SelectedColumns__Group_3__0"
    // InternalMyDsl.g:1399:1: rule__SelectedColumns__Group_3__0 : rule__SelectedColumns__Group_3__0__Impl rule__SelectedColumns__Group_3__1 ;
    public final void rule__SelectedColumns__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1403:1: ( rule__SelectedColumns__Group_3__0__Impl rule__SelectedColumns__Group_3__1 )
            // InternalMyDsl.g:1404:2: rule__SelectedColumns__Group_3__0__Impl rule__SelectedColumns__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__SelectedColumns__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_3__0"


    // $ANTLR start "rule__SelectedColumns__Group_3__0__Impl"
    // InternalMyDsl.g:1411:1: rule__SelectedColumns__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SelectedColumns__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1415:1: ( ( ',' ) )
            // InternalMyDsl.g:1416:1: ( ',' )
            {
            // InternalMyDsl.g:1416:1: ( ',' )
            // InternalMyDsl.g:1417:2: ','
            {
             before(grammarAccess.getSelectedColumnsAccess().getCommaKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSelectedColumnsAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_3__0__Impl"


    // $ANTLR start "rule__SelectedColumns__Group_3__1"
    // InternalMyDsl.g:1426:1: rule__SelectedColumns__Group_3__1 : rule__SelectedColumns__Group_3__1__Impl ;
    public final void rule__SelectedColumns__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1430:1: ( rule__SelectedColumns__Group_3__1__Impl )
            // InternalMyDsl.g:1431:2: rule__SelectedColumns__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_3__1"


    // $ANTLR start "rule__SelectedColumns__Group_3__1__Impl"
    // InternalMyDsl.g:1437:1: rule__SelectedColumns__Group_3__1__Impl : ( ( rule__SelectedColumns__ColumnsnameAssignment_3_1 ) ) ;
    public final void rule__SelectedColumns__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1441:1: ( ( ( rule__SelectedColumns__ColumnsnameAssignment_3_1 ) ) )
            // InternalMyDsl.g:1442:1: ( ( rule__SelectedColumns__ColumnsnameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1442:1: ( ( rule__SelectedColumns__ColumnsnameAssignment_3_1 ) )
            // InternalMyDsl.g:1443:2: ( rule__SelectedColumns__ColumnsnameAssignment_3_1 )
            {
             before(grammarAccess.getSelectedColumnsAccess().getColumnsnameAssignment_3_1()); 
            // InternalMyDsl.g:1444:2: ( rule__SelectedColumns__ColumnsnameAssignment_3_1 )
            // InternalMyDsl.g:1444:3: rule__SelectedColumns__ColumnsnameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__ColumnsnameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectedColumnsAccess().getColumnsnameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_3__1__Impl"


    // $ANTLR start "rule__SelectedColumns__Group_4__0"
    // InternalMyDsl.g:1453:1: rule__SelectedColumns__Group_4__0 : rule__SelectedColumns__Group_4__0__Impl rule__SelectedColumns__Group_4__1 ;
    public final void rule__SelectedColumns__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1457:1: ( rule__SelectedColumns__Group_4__0__Impl rule__SelectedColumns__Group_4__1 )
            // InternalMyDsl.g:1458:2: rule__SelectedColumns__Group_4__0__Impl rule__SelectedColumns__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__SelectedColumns__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_4__0"


    // $ANTLR start "rule__SelectedColumns__Group_4__0__Impl"
    // InternalMyDsl.g:1465:1: rule__SelectedColumns__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SelectedColumns__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1469:1: ( ( ',' ) )
            // InternalMyDsl.g:1470:1: ( ',' )
            {
            // InternalMyDsl.g:1470:1: ( ',' )
            // InternalMyDsl.g:1471:2: ','
            {
             before(grammarAccess.getSelectedColumnsAccess().getCommaKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSelectedColumnsAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_4__0__Impl"


    // $ANTLR start "rule__SelectedColumns__Group_4__1"
    // InternalMyDsl.g:1480:1: rule__SelectedColumns__Group_4__1 : rule__SelectedColumns__Group_4__1__Impl rule__SelectedColumns__Group_4__2 ;
    public final void rule__SelectedColumns__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1484:1: ( rule__SelectedColumns__Group_4__1__Impl rule__SelectedColumns__Group_4__2 )
            // InternalMyDsl.g:1485:2: rule__SelectedColumns__Group_4__1__Impl rule__SelectedColumns__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__SelectedColumns__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_4__1"


    // $ANTLR start "rule__SelectedColumns__Group_4__1__Impl"
    // InternalMyDsl.g:1492:1: rule__SelectedColumns__Group_4__1__Impl : ( 'outputpath' ) ;
    public final void rule__SelectedColumns__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1496:1: ( ( 'outputpath' ) )
            // InternalMyDsl.g:1497:1: ( 'outputpath' )
            {
            // InternalMyDsl.g:1497:1: ( 'outputpath' )
            // InternalMyDsl.g:1498:2: 'outputpath'
            {
             before(grammarAccess.getSelectedColumnsAccess().getOutputpathKeyword_4_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSelectedColumnsAccess().getOutputpathKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_4__1__Impl"


    // $ANTLR start "rule__SelectedColumns__Group_4__2"
    // InternalMyDsl.g:1507:1: rule__SelectedColumns__Group_4__2 : rule__SelectedColumns__Group_4__2__Impl rule__SelectedColumns__Group_4__3 ;
    public final void rule__SelectedColumns__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1511:1: ( rule__SelectedColumns__Group_4__2__Impl rule__SelectedColumns__Group_4__3 )
            // InternalMyDsl.g:1512:2: rule__SelectedColumns__Group_4__2__Impl rule__SelectedColumns__Group_4__3
            {
            pushFollow(FOLLOW_15);
            rule__SelectedColumns__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_4__2"


    // $ANTLR start "rule__SelectedColumns__Group_4__2__Impl"
    // InternalMyDsl.g:1519:1: rule__SelectedColumns__Group_4__2__Impl : ( '=' ) ;
    public final void rule__SelectedColumns__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1523:1: ( ( '=' ) )
            // InternalMyDsl.g:1524:1: ( '=' )
            {
            // InternalMyDsl.g:1524:1: ( '=' )
            // InternalMyDsl.g:1525:2: '='
            {
             before(grammarAccess.getSelectedColumnsAccess().getEqualsSignKeyword_4_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSelectedColumnsAccess().getEqualsSignKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_4__2__Impl"


    // $ANTLR start "rule__SelectedColumns__Group_4__3"
    // InternalMyDsl.g:1534:1: rule__SelectedColumns__Group_4__3 : rule__SelectedColumns__Group_4__3__Impl ;
    public final void rule__SelectedColumns__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1538:1: ( rule__SelectedColumns__Group_4__3__Impl )
            // InternalMyDsl.g:1539:2: rule__SelectedColumns__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_4__3"


    // $ANTLR start "rule__SelectedColumns__Group_4__3__Impl"
    // InternalMyDsl.g:1545:1: rule__SelectedColumns__Group_4__3__Impl : ( ( rule__SelectedColumns__OutputpathAssignment_4_3 ) ) ;
    public final void rule__SelectedColumns__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( ( ( rule__SelectedColumns__OutputpathAssignment_4_3 ) ) )
            // InternalMyDsl.g:1550:1: ( ( rule__SelectedColumns__OutputpathAssignment_4_3 ) )
            {
            // InternalMyDsl.g:1550:1: ( ( rule__SelectedColumns__OutputpathAssignment_4_3 ) )
            // InternalMyDsl.g:1551:2: ( rule__SelectedColumns__OutputpathAssignment_4_3 )
            {
             before(grammarAccess.getSelectedColumnsAccess().getOutputpathAssignment_4_3()); 
            // InternalMyDsl.g:1552:2: ( rule__SelectedColumns__OutputpathAssignment_4_3 )
            // InternalMyDsl.g:1552:3: rule__SelectedColumns__OutputpathAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__OutputpathAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectedColumnsAccess().getOutputpathAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_4__3__Impl"


    // $ANTLR start "rule__CsvLoader__Group__0"
    // InternalMyDsl.g:1561:1: rule__CsvLoader__Group__0 : rule__CsvLoader__Group__0__Impl rule__CsvLoader__Group__1 ;
    public final void rule__CsvLoader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1565:1: ( rule__CsvLoader__Group__0__Impl rule__CsvLoader__Group__1 )
            // InternalMyDsl.g:1566:2: rule__CsvLoader__Group__0__Impl rule__CsvLoader__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__CsvLoader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__0"


    // $ANTLR start "rule__CsvLoader__Group__0__Impl"
    // InternalMyDsl.g:1573:1: rule__CsvLoader__Group__0__Impl : ( () ) ;
    public final void rule__CsvLoader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1577:1: ( ( () ) )
            // InternalMyDsl.g:1578:1: ( () )
            {
            // InternalMyDsl.g:1578:1: ( () )
            // InternalMyDsl.g:1579:2: ()
            {
             before(grammarAccess.getCsvLoaderAccess().getCsvLoaderAction_0()); 
            // InternalMyDsl.g:1580:2: ()
            // InternalMyDsl.g:1580:3: 
            {
            }

             after(grammarAccess.getCsvLoaderAccess().getCsvLoaderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__0__Impl"


    // $ANTLR start "rule__CsvLoader__Group__1"
    // InternalMyDsl.g:1588:1: rule__CsvLoader__Group__1 : rule__CsvLoader__Group__1__Impl rule__CsvLoader__Group__2 ;
    public final void rule__CsvLoader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1592:1: ( rule__CsvLoader__Group__1__Impl rule__CsvLoader__Group__2 )
            // InternalMyDsl.g:1593:2: rule__CsvLoader__Group__1__Impl rule__CsvLoader__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CsvLoader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__1"


    // $ANTLR start "rule__CsvLoader__Group__1__Impl"
    // InternalMyDsl.g:1600:1: rule__CsvLoader__Group__1__Impl : ( 'CsvLoader' ) ;
    public final void rule__CsvLoader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1604:1: ( ( 'CsvLoader' ) )
            // InternalMyDsl.g:1605:1: ( 'CsvLoader' )
            {
            // InternalMyDsl.g:1605:1: ( 'CsvLoader' )
            // InternalMyDsl.g:1606:2: 'CsvLoader'
            {
             before(grammarAccess.getCsvLoaderAccess().getCsvLoaderKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCsvLoaderAccess().getCsvLoaderKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__1__Impl"


    // $ANTLR start "rule__CsvLoader__Group__2"
    // InternalMyDsl.g:1615:1: rule__CsvLoader__Group__2 : rule__CsvLoader__Group__2__Impl rule__CsvLoader__Group__3 ;
    public final void rule__CsvLoader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1619:1: ( rule__CsvLoader__Group__2__Impl rule__CsvLoader__Group__3 )
            // InternalMyDsl.g:1620:2: rule__CsvLoader__Group__2__Impl rule__CsvLoader__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__CsvLoader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__2"


    // $ANTLR start "rule__CsvLoader__Group__2__Impl"
    // InternalMyDsl.g:1627:1: rule__CsvLoader__Group__2__Impl : ( '(' ) ;
    public final void rule__CsvLoader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1631:1: ( ( '(' ) )
            // InternalMyDsl.g:1632:1: ( '(' )
            {
            // InternalMyDsl.g:1632:1: ( '(' )
            // InternalMyDsl.g:1633:2: '('
            {
             before(grammarAccess.getCsvLoaderAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCsvLoaderAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__2__Impl"


    // $ANTLR start "rule__CsvLoader__Group__3"
    // InternalMyDsl.g:1642:1: rule__CsvLoader__Group__3 : rule__CsvLoader__Group__3__Impl rule__CsvLoader__Group__4 ;
    public final void rule__CsvLoader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1646:1: ( rule__CsvLoader__Group__3__Impl rule__CsvLoader__Group__4 )
            // InternalMyDsl.g:1647:2: rule__CsvLoader__Group__3__Impl rule__CsvLoader__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__CsvLoader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__3"


    // $ANTLR start "rule__CsvLoader__Group__3__Impl"
    // InternalMyDsl.g:1654:1: rule__CsvLoader__Group__3__Impl : ( ( rule__CsvLoader__Group_3__0 ) ) ;
    public final void rule__CsvLoader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1658:1: ( ( ( rule__CsvLoader__Group_3__0 ) ) )
            // InternalMyDsl.g:1659:1: ( ( rule__CsvLoader__Group_3__0 ) )
            {
            // InternalMyDsl.g:1659:1: ( ( rule__CsvLoader__Group_3__0 ) )
            // InternalMyDsl.g:1660:2: ( rule__CsvLoader__Group_3__0 )
            {
             before(grammarAccess.getCsvLoaderAccess().getGroup_3()); 
            // InternalMyDsl.g:1661:2: ( rule__CsvLoader__Group_3__0 )
            // InternalMyDsl.g:1661:3: rule__CsvLoader__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getCsvLoaderAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__3__Impl"


    // $ANTLR start "rule__CsvLoader__Group__4"
    // InternalMyDsl.g:1669:1: rule__CsvLoader__Group__4 : rule__CsvLoader__Group__4__Impl ;
    public final void rule__CsvLoader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1673:1: ( rule__CsvLoader__Group__4__Impl )
            // InternalMyDsl.g:1674:2: rule__CsvLoader__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__4"


    // $ANTLR start "rule__CsvLoader__Group__4__Impl"
    // InternalMyDsl.g:1680:1: rule__CsvLoader__Group__4__Impl : ( ( ')' )? ) ;
    public final void rule__CsvLoader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1684:1: ( ( ( ')' )? ) )
            // InternalMyDsl.g:1685:1: ( ( ')' )? )
            {
            // InternalMyDsl.g:1685:1: ( ( ')' )? )
            // InternalMyDsl.g:1686:2: ( ')' )?
            {
             before(grammarAccess.getCsvLoaderAccess().getRightParenthesisKeyword_4()); 
            // InternalMyDsl.g:1687:2: ( ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1687:3: ')'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCsvLoaderAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__4__Impl"


    // $ANTLR start "rule__CsvLoader__Group_3__0"
    // InternalMyDsl.g:1696:1: rule__CsvLoader__Group_3__0 : rule__CsvLoader__Group_3__0__Impl rule__CsvLoader__Group_3__1 ;
    public final void rule__CsvLoader__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1700:1: ( rule__CsvLoader__Group_3__0__Impl rule__CsvLoader__Group_3__1 )
            // InternalMyDsl.g:1701:2: rule__CsvLoader__Group_3__0__Impl rule__CsvLoader__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__CsvLoader__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group_3__0"


    // $ANTLR start "rule__CsvLoader__Group_3__0__Impl"
    // InternalMyDsl.g:1708:1: rule__CsvLoader__Group_3__0__Impl : ( 'path' ) ;
    public final void rule__CsvLoader__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1712:1: ( ( 'path' ) )
            // InternalMyDsl.g:1713:1: ( 'path' )
            {
            // InternalMyDsl.g:1713:1: ( 'path' )
            // InternalMyDsl.g:1714:2: 'path'
            {
             before(grammarAccess.getCsvLoaderAccess().getPathKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCsvLoaderAccess().getPathKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group_3__0__Impl"


    // $ANTLR start "rule__CsvLoader__Group_3__1"
    // InternalMyDsl.g:1723:1: rule__CsvLoader__Group_3__1 : rule__CsvLoader__Group_3__1__Impl rule__CsvLoader__Group_3__2 ;
    public final void rule__CsvLoader__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1727:1: ( rule__CsvLoader__Group_3__1__Impl rule__CsvLoader__Group_3__2 )
            // InternalMyDsl.g:1728:2: rule__CsvLoader__Group_3__1__Impl rule__CsvLoader__Group_3__2
            {
            pushFollow(FOLLOW_15);
            rule__CsvLoader__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group_3__1"


    // $ANTLR start "rule__CsvLoader__Group_3__1__Impl"
    // InternalMyDsl.g:1735:1: rule__CsvLoader__Group_3__1__Impl : ( '=' ) ;
    public final void rule__CsvLoader__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1739:1: ( ( '=' ) )
            // InternalMyDsl.g:1740:1: ( '=' )
            {
            // InternalMyDsl.g:1740:1: ( '=' )
            // InternalMyDsl.g:1741:2: '='
            {
             before(grammarAccess.getCsvLoaderAccess().getEqualsSignKeyword_3_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCsvLoaderAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group_3__1__Impl"


    // $ANTLR start "rule__CsvLoader__Group_3__2"
    // InternalMyDsl.g:1750:1: rule__CsvLoader__Group_3__2 : rule__CsvLoader__Group_3__2__Impl ;
    public final void rule__CsvLoader__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1754:1: ( rule__CsvLoader__Group_3__2__Impl )
            // InternalMyDsl.g:1755:2: rule__CsvLoader__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group_3__2"


    // $ANTLR start "rule__CsvLoader__Group_3__2__Impl"
    // InternalMyDsl.g:1761:1: rule__CsvLoader__Group_3__2__Impl : ( ( rule__CsvLoader__PathAssignment_3_2 ) ) ;
    public final void rule__CsvLoader__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( ( ( rule__CsvLoader__PathAssignment_3_2 ) ) )
            // InternalMyDsl.g:1766:1: ( ( rule__CsvLoader__PathAssignment_3_2 ) )
            {
            // InternalMyDsl.g:1766:1: ( ( rule__CsvLoader__PathAssignment_3_2 ) )
            // InternalMyDsl.g:1767:2: ( rule__CsvLoader__PathAssignment_3_2 )
            {
             before(grammarAccess.getCsvLoaderAccess().getPathAssignment_3_2()); 
            // InternalMyDsl.g:1768:2: ( rule__CsvLoader__PathAssignment_3_2 )
            // InternalMyDsl.g:1768:3: rule__CsvLoader__PathAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CsvLoader__PathAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCsvLoaderAccess().getPathAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group_3__2__Impl"


    // $ANTLR start "rule__ProgChart__FunctionsAssignment_2"
    // InternalMyDsl.g:1777:1: rule__ProgChart__FunctionsAssignment_2 : ( ruleFunctions ) ;
    public final void rule__ProgChart__FunctionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1781:1: ( ( ruleFunctions ) )
            // InternalMyDsl.g:1782:2: ( ruleFunctions )
            {
            // InternalMyDsl.g:1782:2: ( ruleFunctions )
            // InternalMyDsl.g:1783:3: ruleFunctions
            {
             before(grammarAccess.getProgChartAccess().getFunctionsFunctionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctions();

            state._fsp--;

             after(grammarAccess.getProgChartAccess().getFunctionsFunctionsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__FunctionsAssignment_2"


    // $ANTLR start "rule__ProgChart__FunctionsAssignment_3_1"
    // InternalMyDsl.g:1792:1: rule__ProgChart__FunctionsAssignment_3_1 : ( ruleFunctions ) ;
    public final void rule__ProgChart__FunctionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1796:1: ( ( ruleFunctions ) )
            // InternalMyDsl.g:1797:2: ( ruleFunctions )
            {
            // InternalMyDsl.g:1797:2: ( ruleFunctions )
            // InternalMyDsl.g:1798:3: ruleFunctions
            {
             before(grammarAccess.getProgChartAccess().getFunctionsFunctionsParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctions();

            state._fsp--;

             after(grammarAccess.getProgChartAccess().getFunctionsFunctionsParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgChart__FunctionsAssignment_3_1"


    // $ANTLR start "rule__ApplyFilter__ColumnameAssignment_3"
    // InternalMyDsl.g:1807:1: rule__ApplyFilter__ColumnameAssignment_3 : ( ruleEString ) ;
    public final void rule__ApplyFilter__ColumnameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1811:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1812:2: ( ruleEString )
            {
            // InternalMyDsl.g:1812:2: ( ruleEString )
            // InternalMyDsl.g:1813:3: ruleEString
            {
             before(grammarAccess.getApplyFilterAccess().getColumnameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplyFilterAccess().getColumnameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__ColumnameAssignment_3"


    // $ANTLR start "rule__ApplyFilter__FilterAssignment_4"
    // InternalMyDsl.g:1822:1: rule__ApplyFilter__FilterAssignment_4 : ( ruleFilterType ) ;
    public final void rule__ApplyFilter__FilterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( ( ruleFilterType ) )
            // InternalMyDsl.g:1827:2: ( ruleFilterType )
            {
            // InternalMyDsl.g:1827:2: ( ruleFilterType )
            // InternalMyDsl.g:1828:3: ruleFilterType
            {
             before(grammarAccess.getApplyFilterAccess().getFilterFilterTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterType();

            state._fsp--;

             after(grammarAccess.getApplyFilterAccess().getFilterFilterTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__FilterAssignment_4"


    // $ANTLR start "rule__ApplyFilter__FiltervalueAssignment_5"
    // InternalMyDsl.g:1837:1: rule__ApplyFilter__FiltervalueAssignment_5 : ( ruleEString ) ;
    public final void rule__ApplyFilter__FiltervalueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1842:2: ( ruleEString )
            {
            // InternalMyDsl.g:1842:2: ( ruleEString )
            // InternalMyDsl.g:1843:3: ruleEString
            {
             before(grammarAccess.getApplyFilterAccess().getFiltervalueEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplyFilterAccess().getFiltervalueEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__FiltervalueAssignment_5"


    // $ANTLR start "rule__ApplyFilter__FilteredoutputAssignment_7"
    // InternalMyDsl.g:1852:1: rule__ApplyFilter__FilteredoutputAssignment_7 : ( ruleEString ) ;
    public final void rule__ApplyFilter__FilteredoutputAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1856:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1857:2: ( ruleEString )
            {
            // InternalMyDsl.g:1857:2: ( ruleEString )
            // InternalMyDsl.g:1858:3: ruleEString
            {
             before(grammarAccess.getApplyFilterAccess().getFilteredoutputEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplyFilterAccess().getFilteredoutputEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFilter__FilteredoutputAssignment_7"


    // $ANTLR start "rule__CreateChart__ChartAssignment_3_1"
    // InternalMyDsl.g:1867:1: rule__CreateChart__ChartAssignment_3_1 : ( ruleChartType ) ;
    public final void rule__CreateChart__ChartAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1871:1: ( ( ruleChartType ) )
            // InternalMyDsl.g:1872:2: ( ruleChartType )
            {
            // InternalMyDsl.g:1872:2: ( ruleChartType )
            // InternalMyDsl.g:1873:3: ruleChartType
            {
             before(grammarAccess.getCreateChartAccess().getChartChartTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChartType();

            state._fsp--;

             after(grammarAccess.getCreateChartAccess().getChartChartTypeEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__ChartAssignment_3_1"


    // $ANTLR start "rule__CreateChart__TitlechartAssignment_6"
    // InternalMyDsl.g:1882:1: rule__CreateChart__TitlechartAssignment_6 : ( ruleEString ) ;
    public final void rule__CreateChart__TitlechartAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1886:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1887:2: ( ruleEString )
            {
            // InternalMyDsl.g:1887:2: ( ruleEString )
            // InternalMyDsl.g:1888:3: ruleEString
            {
             before(grammarAccess.getCreateChartAccess().getTitlechartEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCreateChartAccess().getTitlechartEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__TitlechartAssignment_6"


    // $ANTLR start "rule__CreateChart__XlabelAssignment_9"
    // InternalMyDsl.g:1897:1: rule__CreateChart__XlabelAssignment_9 : ( ruleEString ) ;
    public final void rule__CreateChart__XlabelAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1901:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1902:2: ( ruleEString )
            {
            // InternalMyDsl.g:1902:2: ( ruleEString )
            // InternalMyDsl.g:1903:3: ruleEString
            {
             before(grammarAccess.getCreateChartAccess().getXlabelEStringParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCreateChartAccess().getXlabelEStringParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__XlabelAssignment_9"


    // $ANTLR start "rule__CreateChart__YlabelAssignment_12"
    // InternalMyDsl.g:1912:1: rule__CreateChart__YlabelAssignment_12 : ( ruleEString ) ;
    public final void rule__CreateChart__YlabelAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1916:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1917:2: ( ruleEString )
            {
            // InternalMyDsl.g:1917:2: ( ruleEString )
            // InternalMyDsl.g:1918:3: ruleEString
            {
             before(grammarAccess.getCreateChartAccess().getYlabelEStringParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCreateChartAccess().getYlabelEStringParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateChart__YlabelAssignment_12"


    // $ANTLR start "rule__SelectedColumns__ColumnsnameAssignment_2"
    // InternalMyDsl.g:1927:1: rule__SelectedColumns__ColumnsnameAssignment_2 : ( ruleEString ) ;
    public final void rule__SelectedColumns__ColumnsnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1931:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1932:2: ( ruleEString )
            {
            // InternalMyDsl.g:1932:2: ( ruleEString )
            // InternalMyDsl.g:1933:3: ruleEString
            {
             before(grammarAccess.getSelectedColumnsAccess().getColumnsnameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSelectedColumnsAccess().getColumnsnameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__ColumnsnameAssignment_2"


    // $ANTLR start "rule__SelectedColumns__ColumnsnameAssignment_3_1"
    // InternalMyDsl.g:1942:1: rule__SelectedColumns__ColumnsnameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__SelectedColumns__ColumnsnameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1946:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1947:2: ( ruleEString )
            {
            // InternalMyDsl.g:1947:2: ( ruleEString )
            // InternalMyDsl.g:1948:3: ruleEString
            {
             before(grammarAccess.getSelectedColumnsAccess().getColumnsnameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSelectedColumnsAccess().getColumnsnameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__ColumnsnameAssignment_3_1"


    // $ANTLR start "rule__SelectedColumns__OutputpathAssignment_4_3"
    // InternalMyDsl.g:1957:1: rule__SelectedColumns__OutputpathAssignment_4_3 : ( ruleEString ) ;
    public final void rule__SelectedColumns__OutputpathAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1962:2: ( ruleEString )
            {
            // InternalMyDsl.g:1962:2: ( ruleEString )
            // InternalMyDsl.g:1963:3: ruleEString
            {
             before(grammarAccess.getSelectedColumnsAccess().getOutputpathEStringParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSelectedColumnsAccess().getOutputpathEStringParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__OutputpathAssignment_4_3"


    // $ANTLR start "rule__CsvLoader__PathAssignment_3_2"
    // InternalMyDsl.g:1972:1: rule__CsvLoader__PathAssignment_3_2 : ( ruleEString ) ;
    public final void rule__CsvLoader__PathAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1976:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1977:2: ( ruleEString )
            {
            // InternalMyDsl.g:1977:2: ( ruleEString )
            // InternalMyDsl.g:1978:3: ruleEString
            {
             before(grammarAccess.getCsvLoaderAccess().getPathEStringParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCsvLoaderAccess().getPathEStringParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__PathAssignment_3_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000484400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001007830L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000830L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});

}