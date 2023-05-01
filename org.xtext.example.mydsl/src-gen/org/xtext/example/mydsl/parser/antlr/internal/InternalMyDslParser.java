package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Start'", "'{'", "';'", "'}'", "'ApplyFilter'", "'('", "','", "')'", "'CreateChart'", "'chart'", "'title : '", "'xlabel : '", "'ylabel : '", "'SelectedColumns'", "'outputpath'", "'='", "'CsvLoader'", "'path'", "'C:/Users/DELL/Downloads/selected_cars.csv'", "'inf'", "'sup'", "'equal'", "'histogram'", "'pie'", "'line'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ProgChart";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgChart"
    // InternalMyDsl.g:65:1: entryRuleProgChart returns [EObject current=null] : iv_ruleProgChart= ruleProgChart EOF ;
    public final EObject entryRuleProgChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgChart = null;


        try {
            // InternalMyDsl.g:65:50: (iv_ruleProgChart= ruleProgChart EOF )
            // InternalMyDsl.g:66:2: iv_ruleProgChart= ruleProgChart EOF
            {
             newCompositeNode(grammarAccess.getProgChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgChart=ruleProgChart();

            state._fsp--;

             current =iv_ruleProgChart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgChart"


    // $ANTLR start "ruleProgChart"
    // InternalMyDsl.g:72:1: ruleProgChart returns [EObject current=null] : (otherlv_0= 'Start' otherlv_1= '{' ( (lv_functions_2_0= ruleFunctions ) ) (otherlv_3= ';' ( (lv_functions_4_0= ruleFunctions ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleProgChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_functions_2_0 = null;

        EObject lv_functions_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Start' otherlv_1= '{' ( (lv_functions_2_0= ruleFunctions ) ) (otherlv_3= ';' ( (lv_functions_4_0= ruleFunctions ) ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Start' otherlv_1= '{' ( (lv_functions_2_0= ruleFunctions ) ) (otherlv_3= ';' ( (lv_functions_4_0= ruleFunctions ) ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Start' otherlv_1= '{' ( (lv_functions_2_0= ruleFunctions ) ) (otherlv_3= ';' ( (lv_functions_4_0= ruleFunctions ) ) )* otherlv_5= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'Start' otherlv_1= '{' ( (lv_functions_2_0= ruleFunctions ) ) (otherlv_3= ';' ( (lv_functions_4_0= ruleFunctions ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgChartAccess().getStartKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProgChartAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:88:3: ( (lv_functions_2_0= ruleFunctions ) )
            // InternalMyDsl.g:89:4: (lv_functions_2_0= ruleFunctions )
            {
            // InternalMyDsl.g:89:4: (lv_functions_2_0= ruleFunctions )
            // InternalMyDsl.g:90:5: lv_functions_2_0= ruleFunctions
            {

            					newCompositeNode(grammarAccess.getProgChartAccess().getFunctionsFunctionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_functions_2_0=ruleFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgChartRule());
            					}
            					add(
            						current,
            						"functions",
            						lv_functions_2_0,
            						"org.xtext.example.mydsl.MyDsl.Functions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:107:3: (otherlv_3= ';' ( (lv_functions_4_0= ruleFunctions ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:108:4: otherlv_3= ';' ( (lv_functions_4_0= ruleFunctions ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getProgChartAccess().getSemicolonKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:112:4: ( (lv_functions_4_0= ruleFunctions ) )
            	    // InternalMyDsl.g:113:5: (lv_functions_4_0= ruleFunctions )
            	    {
            	    // InternalMyDsl.g:113:5: (lv_functions_4_0= ruleFunctions )
            	    // InternalMyDsl.g:114:6: lv_functions_4_0= ruleFunctions
            	    {

            	    						newCompositeNode(grammarAccess.getProgChartAccess().getFunctionsFunctionsParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_functions_4_0=ruleFunctions();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"functions",
            	    							lv_functions_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.Functions");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProgChartAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgChart"


    // $ANTLR start "entryRuleFunctions"
    // InternalMyDsl.g:140:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalMyDsl.g:140:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalMyDsl.g:141:2: iv_ruleFunctions= ruleFunctions EOF
            {
             newCompositeNode(grammarAccess.getFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctions=ruleFunctions();

            state._fsp--;

             current =iv_ruleFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctions"


    // $ANTLR start "ruleFunctions"
    // InternalMyDsl.g:147:1: ruleFunctions returns [EObject current=null] : (this_ApplyFilter_0= ruleApplyFilter | this_CreateChart_1= ruleCreateChart | this_CsvLoader_2= ruleCsvLoader | this_SelectedColumns_3= ruleSelectedColumns ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_ApplyFilter_0 = null;

        EObject this_CreateChart_1 = null;

        EObject this_CsvLoader_2 = null;

        EObject this_SelectedColumns_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:153:2: ( (this_ApplyFilter_0= ruleApplyFilter | this_CreateChart_1= ruleCreateChart | this_CsvLoader_2= ruleCsvLoader | this_SelectedColumns_3= ruleSelectedColumns ) )
            // InternalMyDsl.g:154:2: (this_ApplyFilter_0= ruleApplyFilter | this_CreateChart_1= ruleCreateChart | this_CsvLoader_2= ruleCsvLoader | this_SelectedColumns_3= ruleSelectedColumns )
            {
            // InternalMyDsl.g:154:2: (this_ApplyFilter_0= ruleApplyFilter | this_CreateChart_1= ruleCreateChart | this_CsvLoader_2= ruleCsvLoader | this_SelectedColumns_3= ruleSelectedColumns )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:155:3: this_ApplyFilter_0= ruleApplyFilter
                    {

                    			newCompositeNode(grammarAccess.getFunctionsAccess().getApplyFilterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplyFilter_0=ruleApplyFilter();

                    state._fsp--;


                    			current = this_ApplyFilter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:164:3: this_CreateChart_1= ruleCreateChart
                    {

                    			newCompositeNode(grammarAccess.getFunctionsAccess().getCreateChartParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateChart_1=ruleCreateChart();

                    state._fsp--;


                    			current = this_CreateChart_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:173:3: this_CsvLoader_2= ruleCsvLoader
                    {

                    			newCompositeNode(grammarAccess.getFunctionsAccess().getCsvLoaderParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CsvLoader_2=ruleCsvLoader();

                    state._fsp--;


                    			current = this_CsvLoader_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:182:3: this_SelectedColumns_3= ruleSelectedColumns
                    {

                    			newCompositeNode(grammarAccess.getFunctionsAccess().getSelectedColumnsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectedColumns_3=ruleSelectedColumns();

                    state._fsp--;


                    			current = this_SelectedColumns_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctions"


    // $ANTLR start "entryRuleApplyFilter"
    // InternalMyDsl.g:194:1: entryRuleApplyFilter returns [EObject current=null] : iv_ruleApplyFilter= ruleApplyFilter EOF ;
    public final EObject entryRuleApplyFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyFilter = null;


        try {
            // InternalMyDsl.g:194:52: (iv_ruleApplyFilter= ruleApplyFilter EOF )
            // InternalMyDsl.g:195:2: iv_ruleApplyFilter= ruleApplyFilter EOF
            {
             newCompositeNode(grammarAccess.getApplyFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplyFilter=ruleApplyFilter();

            state._fsp--;

             current =iv_ruleApplyFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplyFilter"


    // $ANTLR start "ruleApplyFilter"
    // InternalMyDsl.g:201:1: ruleApplyFilter returns [EObject current=null] : ( () otherlv_1= 'ApplyFilter' otherlv_2= '(' ( (lv_columname_3_0= ruleEString ) )? ( (lv_filter_4_0= ruleFilterType ) )? ( (lv_filtervalue_5_0= ruleEString ) )? otherlv_6= ',' ( (lv_filteredoutput_7_0= ruleEString ) )? otherlv_8= ')' ) ;
    public final EObject ruleApplyFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_columname_3_0 = null;

        Enumerator lv_filter_4_0 = null;

        AntlrDatatypeRuleToken lv_filtervalue_5_0 = null;

        AntlrDatatypeRuleToken lv_filteredoutput_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:207:2: ( ( () otherlv_1= 'ApplyFilter' otherlv_2= '(' ( (lv_columname_3_0= ruleEString ) )? ( (lv_filter_4_0= ruleFilterType ) )? ( (lv_filtervalue_5_0= ruleEString ) )? otherlv_6= ',' ( (lv_filteredoutput_7_0= ruleEString ) )? otherlv_8= ')' ) )
            // InternalMyDsl.g:208:2: ( () otherlv_1= 'ApplyFilter' otherlv_2= '(' ( (lv_columname_3_0= ruleEString ) )? ( (lv_filter_4_0= ruleFilterType ) )? ( (lv_filtervalue_5_0= ruleEString ) )? otherlv_6= ',' ( (lv_filteredoutput_7_0= ruleEString ) )? otherlv_8= ')' )
            {
            // InternalMyDsl.g:208:2: ( () otherlv_1= 'ApplyFilter' otherlv_2= '(' ( (lv_columname_3_0= ruleEString ) )? ( (lv_filter_4_0= ruleFilterType ) )? ( (lv_filtervalue_5_0= ruleEString ) )? otherlv_6= ',' ( (lv_filteredoutput_7_0= ruleEString ) )? otherlv_8= ')' )
            // InternalMyDsl.g:209:3: () otherlv_1= 'ApplyFilter' otherlv_2= '(' ( (lv_columname_3_0= ruleEString ) )? ( (lv_filter_4_0= ruleFilterType ) )? ( (lv_filtervalue_5_0= ruleEString ) )? otherlv_6= ',' ( (lv_filteredoutput_7_0= ruleEString ) )? otherlv_8= ')'
            {
            // InternalMyDsl.g:209:3: ()
            // InternalMyDsl.g:210:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplyFilterAccess().getApplyFilterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getApplyFilterAccess().getApplyFilterKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getApplyFilterAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:224:3: ( (lv_columname_3_0= ruleEString ) )?
            int alt3=2;
            switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    alt3=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt3=1;
                    }
                    break;
                case 29:
                    {
                    alt3=1;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:225:4: (lv_columname_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:225:4: (lv_columname_3_0= ruleEString )
                    // InternalMyDsl.g:226:5: lv_columname_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getApplyFilterAccess().getColumnameEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_columname_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplyFilterRule());
                    					}
                    					set(
                    						current,
                    						"columname",
                    						lv_columname_3_0,
                    						"org.xtext.example.mydsl.MyDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:243:3: ( (lv_filter_4_0= ruleFilterType ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=30 && LA4_0<=32)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:244:4: (lv_filter_4_0= ruleFilterType )
                    {
                    // InternalMyDsl.g:244:4: (lv_filter_4_0= ruleFilterType )
                    // InternalMyDsl.g:245:5: lv_filter_4_0= ruleFilterType
                    {

                    					newCompositeNode(grammarAccess.getApplyFilterAccess().getFilterFilterTypeEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_filter_4_0=ruleFilterType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplyFilterRule());
                    					}
                    					set(
                    						current,
                    						"filter",
                    						lv_filter_4_0,
                    						"org.xtext.example.mydsl.MyDsl.FilterType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:262:3: ( (lv_filtervalue_5_0= ruleEString ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:263:4: (lv_filtervalue_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:263:4: (lv_filtervalue_5_0= ruleEString )
                    // InternalMyDsl.g:264:5: lv_filtervalue_5_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getApplyFilterAccess().getFiltervalueEStringParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_filtervalue_5_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplyFilterRule());
                    					}
                    					set(
                    						current,
                    						"filtervalue",
                    						lv_filtervalue_5_0,
                    						"org.xtext.example.mydsl.MyDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getApplyFilterAccess().getCommaKeyword_6());
            		
            // InternalMyDsl.g:285:3: ( (lv_filteredoutput_7_0= ruleEString ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:286:4: (lv_filteredoutput_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:286:4: (lv_filteredoutput_7_0= ruleEString )
                    // InternalMyDsl.g:287:5: lv_filteredoutput_7_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getApplyFilterAccess().getFilteredoutputEStringParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_filteredoutput_7_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplyFilterRule());
                    					}
                    					set(
                    						current,
                    						"filteredoutput",
                    						lv_filteredoutput_7_0,
                    						"org.xtext.example.mydsl.MyDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getApplyFilterAccess().getRightParenthesisKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplyFilter"


    // $ANTLR start "entryRuleCreateChart"
    // InternalMyDsl.g:312:1: entryRuleCreateChart returns [EObject current=null] : iv_ruleCreateChart= ruleCreateChart EOF ;
    public final EObject entryRuleCreateChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateChart = null;


        try {
            // InternalMyDsl.g:312:52: (iv_ruleCreateChart= ruleCreateChart EOF )
            // InternalMyDsl.g:313:2: iv_ruleCreateChart= ruleCreateChart EOF
            {
             newCompositeNode(grammarAccess.getCreateChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateChart=ruleCreateChart();

            state._fsp--;

             current =iv_ruleCreateChart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateChart"


    // $ANTLR start "ruleCreateChart"
    // InternalMyDsl.g:319:1: ruleCreateChart returns [EObject current=null] : ( () otherlv_1= 'CreateChart' otherlv_2= '(' (otherlv_3= 'chart' ( (lv_chart_4_0= ruleChartType ) ) ) otherlv_5= ',' otherlv_6= 'title : ' ( (lv_titlechart_7_0= ruleEString ) ) otherlv_8= ',' otherlv_9= 'xlabel : ' ( (lv_xlabel_10_0= ruleEString ) ) otherlv_11= ',' otherlv_12= 'ylabel : ' ( (lv_ylabel_13_0= ruleEString ) )* (otherlv_14= ')' )? ) ;
    public final EObject ruleCreateChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_chart_4_0 = null;

        AntlrDatatypeRuleToken lv_titlechart_7_0 = null;

        AntlrDatatypeRuleToken lv_xlabel_10_0 = null;

        AntlrDatatypeRuleToken lv_ylabel_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:325:2: ( ( () otherlv_1= 'CreateChart' otherlv_2= '(' (otherlv_3= 'chart' ( (lv_chart_4_0= ruleChartType ) ) ) otherlv_5= ',' otherlv_6= 'title : ' ( (lv_titlechart_7_0= ruleEString ) ) otherlv_8= ',' otherlv_9= 'xlabel : ' ( (lv_xlabel_10_0= ruleEString ) ) otherlv_11= ',' otherlv_12= 'ylabel : ' ( (lv_ylabel_13_0= ruleEString ) )* (otherlv_14= ')' )? ) )
            // InternalMyDsl.g:326:2: ( () otherlv_1= 'CreateChart' otherlv_2= '(' (otherlv_3= 'chart' ( (lv_chart_4_0= ruleChartType ) ) ) otherlv_5= ',' otherlv_6= 'title : ' ( (lv_titlechart_7_0= ruleEString ) ) otherlv_8= ',' otherlv_9= 'xlabel : ' ( (lv_xlabel_10_0= ruleEString ) ) otherlv_11= ',' otherlv_12= 'ylabel : ' ( (lv_ylabel_13_0= ruleEString ) )* (otherlv_14= ')' )? )
            {
            // InternalMyDsl.g:326:2: ( () otherlv_1= 'CreateChart' otherlv_2= '(' (otherlv_3= 'chart' ( (lv_chart_4_0= ruleChartType ) ) ) otherlv_5= ',' otherlv_6= 'title : ' ( (lv_titlechart_7_0= ruleEString ) ) otherlv_8= ',' otherlv_9= 'xlabel : ' ( (lv_xlabel_10_0= ruleEString ) ) otherlv_11= ',' otherlv_12= 'ylabel : ' ( (lv_ylabel_13_0= ruleEString ) )* (otherlv_14= ')' )? )
            // InternalMyDsl.g:327:3: () otherlv_1= 'CreateChart' otherlv_2= '(' (otherlv_3= 'chart' ( (lv_chart_4_0= ruleChartType ) ) ) otherlv_5= ',' otherlv_6= 'title : ' ( (lv_titlechart_7_0= ruleEString ) ) otherlv_8= ',' otherlv_9= 'xlabel : ' ( (lv_xlabel_10_0= ruleEString ) ) otherlv_11= ',' otherlv_12= 'ylabel : ' ( (lv_ylabel_13_0= ruleEString ) )* (otherlv_14= ')' )?
            {
            // InternalMyDsl.g:327:3: ()
            // InternalMyDsl.g:328:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCreateChartAccess().getCreateChartAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateChartAccess().getCreateChartKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateChartAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:342:3: (otherlv_3= 'chart' ( (lv_chart_4_0= ruleChartType ) ) )
            // InternalMyDsl.g:343:4: otherlv_3= 'chart' ( (lv_chart_4_0= ruleChartType ) )
            {
            otherlv_3=(Token)match(input,20,FOLLOW_13); 

            				newLeafNode(otherlv_3, grammarAccess.getCreateChartAccess().getChartKeyword_3_0());
            			
            // InternalMyDsl.g:347:4: ( (lv_chart_4_0= ruleChartType ) )
            // InternalMyDsl.g:348:5: (lv_chart_4_0= ruleChartType )
            {
            // InternalMyDsl.g:348:5: (lv_chart_4_0= ruleChartType )
            // InternalMyDsl.g:349:6: lv_chart_4_0= ruleChartType
            {

            						newCompositeNode(grammarAccess.getCreateChartAccess().getChartChartTypeEnumRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_9);
            lv_chart_4_0=ruleChartType();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCreateChartRule());
            						}
            						set(
            							current,
            							"chart",
            							lv_chart_4_0,
            							"org.xtext.example.mydsl.MyDsl.ChartType");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getCreateChartAccess().getCommaKeyword_4());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getCreateChartAccess().getTitleKeyword_5());
            		
            // InternalMyDsl.g:375:3: ( (lv_titlechart_7_0= ruleEString ) )
            // InternalMyDsl.g:376:4: (lv_titlechart_7_0= ruleEString )
            {
            // InternalMyDsl.g:376:4: (lv_titlechart_7_0= ruleEString )
            // InternalMyDsl.g:377:5: lv_titlechart_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCreateChartAccess().getTitlechartEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_titlechart_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateChartRule());
            					}
            					set(
            						current,
            						"titlechart",
            						lv_titlechart_7_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getCreateChartAccess().getCommaKeyword_7());
            		
            otherlv_9=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getCreateChartAccess().getXlabelKeyword_8());
            		
            // InternalMyDsl.g:402:3: ( (lv_xlabel_10_0= ruleEString ) )
            // InternalMyDsl.g:403:4: (lv_xlabel_10_0= ruleEString )
            {
            // InternalMyDsl.g:403:4: (lv_xlabel_10_0= ruleEString )
            // InternalMyDsl.g:404:5: lv_xlabel_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCreateChartAccess().getXlabelEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_xlabel_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateChartRule());
            					}
            					set(
            						current,
            						"xlabel",
            						lv_xlabel_10_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getCreateChartAccess().getCommaKeyword_10());
            		
            otherlv_12=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_12, grammarAccess.getCreateChartAccess().getYlabelKeyword_11());
            		
            // InternalMyDsl.g:429:3: ( (lv_ylabel_13_0= ruleEString ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:430:4: (lv_ylabel_13_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:430:4: (lv_ylabel_13_0= ruleEString )
            	    // InternalMyDsl.g:431:5: lv_ylabel_13_0= ruleEString
            	    {

            	    					newCompositeNode(grammarAccess.getCreateChartAccess().getYlabelEStringParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_ylabel_13_0=ruleEString();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCreateChartRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ylabel",
            	    						lv_ylabel_13_0,
            	    						"org.xtext.example.mydsl.MyDsl.EString");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalMyDsl.g:448:3: (otherlv_14= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:449:4: otherlv_14= ')'
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getCreateChartAccess().getRightParenthesisKeyword_13());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateChart"


    // $ANTLR start "entryRuleSelectedColumns"
    // InternalMyDsl.g:458:1: entryRuleSelectedColumns returns [EObject current=null] : iv_ruleSelectedColumns= ruleSelectedColumns EOF ;
    public final EObject entryRuleSelectedColumns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectedColumns = null;


        try {
            // InternalMyDsl.g:458:56: (iv_ruleSelectedColumns= ruleSelectedColumns EOF )
            // InternalMyDsl.g:459:2: iv_ruleSelectedColumns= ruleSelectedColumns EOF
            {
             newCompositeNode(grammarAccess.getSelectedColumnsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectedColumns=ruleSelectedColumns();

            state._fsp--;

             current =iv_ruleSelectedColumns; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectedColumns"


    // $ANTLR start "ruleSelectedColumns"
    // InternalMyDsl.g:465:1: ruleSelectedColumns returns [EObject current=null] : (otherlv_0= 'SelectedColumns' otherlv_1= '(' ( (lv_columnsname_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_columnsname_4_0= ruleEString ) ) )* (otherlv_5= ',' otherlv_6= 'outputpath' otherlv_7= '=' ( (lv_outputpath_8_0= ruleEString ) ) )? otherlv_9= ')' ) ;
    public final EObject ruleSelectedColumns() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_columnsname_2_0 = null;

        AntlrDatatypeRuleToken lv_columnsname_4_0 = null;

        AntlrDatatypeRuleToken lv_outputpath_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:471:2: ( (otherlv_0= 'SelectedColumns' otherlv_1= '(' ( (lv_columnsname_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_columnsname_4_0= ruleEString ) ) )* (otherlv_5= ',' otherlv_6= 'outputpath' otherlv_7= '=' ( (lv_outputpath_8_0= ruleEString ) ) )? otherlv_9= ')' ) )
            // InternalMyDsl.g:472:2: (otherlv_0= 'SelectedColumns' otherlv_1= '(' ( (lv_columnsname_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_columnsname_4_0= ruleEString ) ) )* (otherlv_5= ',' otherlv_6= 'outputpath' otherlv_7= '=' ( (lv_outputpath_8_0= ruleEString ) ) )? otherlv_9= ')' )
            {
            // InternalMyDsl.g:472:2: (otherlv_0= 'SelectedColumns' otherlv_1= '(' ( (lv_columnsname_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_columnsname_4_0= ruleEString ) ) )* (otherlv_5= ',' otherlv_6= 'outputpath' otherlv_7= '=' ( (lv_outputpath_8_0= ruleEString ) ) )? otherlv_9= ')' )
            // InternalMyDsl.g:473:3: otherlv_0= 'SelectedColumns' otherlv_1= '(' ( (lv_columnsname_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_columnsname_4_0= ruleEString ) ) )* (otherlv_5= ',' otherlv_6= 'outputpath' otherlv_7= '=' ( (lv_outputpath_8_0= ruleEString ) ) )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectedColumnsAccess().getSelectedColumnsKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectedColumnsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:481:3: ( (lv_columnsname_2_0= ruleEString ) )
            // InternalMyDsl.g:482:4: (lv_columnsname_2_0= ruleEString )
            {
            // InternalMyDsl.g:482:4: (lv_columnsname_2_0= ruleEString )
            // InternalMyDsl.g:483:5: lv_columnsname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSelectedColumnsAccess().getColumnsnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_columnsname_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectedColumnsRule());
            					}
            					add(
            						current,
            						"columnsname",
            						lv_columnsname_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:500:3: (otherlv_3= ',' ( (lv_columnsname_4_0= ruleEString ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    int LA9_1 = input.LA(2);

                    if ( ((LA9_1>=RULE_STRING && LA9_1<=RULE_ID)||LA9_1==29) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:501:4: otherlv_3= ',' ( (lv_columnsname_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSelectedColumnsAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:505:4: ( (lv_columnsname_4_0= ruleEString ) )
            	    // InternalMyDsl.g:506:5: (lv_columnsname_4_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:506:5: (lv_columnsname_4_0= ruleEString )
            	    // InternalMyDsl.g:507:6: lv_columnsname_4_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getSelectedColumnsAccess().getColumnsnameEStringParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_columnsname_4_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectedColumnsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columnsname",
            	    							lv_columnsname_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMyDsl.g:525:3: (otherlv_5= ',' otherlv_6= 'outputpath' otherlv_7= '=' ( (lv_outputpath_8_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:526:4: otherlv_5= ',' otherlv_6= 'outputpath' otherlv_7= '=' ( (lv_outputpath_8_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectedColumnsAccess().getCommaKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getSelectedColumnsAccess().getOutputpathKeyword_4_1());
                    			
                    otherlv_7=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getSelectedColumnsAccess().getEqualsSignKeyword_4_2());
                    			
                    // InternalMyDsl.g:538:4: ( (lv_outputpath_8_0= ruleEString ) )
                    // InternalMyDsl.g:539:5: (lv_outputpath_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:539:5: (lv_outputpath_8_0= ruleEString )
                    // InternalMyDsl.g:540:6: lv_outputpath_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSelectedColumnsAccess().getOutputpathEStringParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_outputpath_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectedColumnsRule());
                    						}
                    						set(
                    							current,
                    							"outputpath",
                    							lv_outputpath_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSelectedColumnsAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectedColumns"


    // $ANTLR start "entryRuleCsvLoader"
    // InternalMyDsl.g:566:1: entryRuleCsvLoader returns [EObject current=null] : iv_ruleCsvLoader= ruleCsvLoader EOF ;
    public final EObject entryRuleCsvLoader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsvLoader = null;


        try {
            // InternalMyDsl.g:566:50: (iv_ruleCsvLoader= ruleCsvLoader EOF )
            // InternalMyDsl.g:567:2: iv_ruleCsvLoader= ruleCsvLoader EOF
            {
             newCompositeNode(grammarAccess.getCsvLoaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCsvLoader=ruleCsvLoader();

            state._fsp--;

             current =iv_ruleCsvLoader; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCsvLoader"


    // $ANTLR start "ruleCsvLoader"
    // InternalMyDsl.g:573:1: ruleCsvLoader returns [EObject current=null] : ( () otherlv_1= 'CsvLoader' otherlv_2= '(' (otherlv_3= 'path' otherlv_4= '=' ( (lv_path_5_0= ruleEString ) ) ) (otherlv_6= ')' )? ) ;
    public final EObject ruleCsvLoader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_path_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:579:2: ( ( () otherlv_1= 'CsvLoader' otherlv_2= '(' (otherlv_3= 'path' otherlv_4= '=' ( (lv_path_5_0= ruleEString ) ) ) (otherlv_6= ')' )? ) )
            // InternalMyDsl.g:580:2: ( () otherlv_1= 'CsvLoader' otherlv_2= '(' (otherlv_3= 'path' otherlv_4= '=' ( (lv_path_5_0= ruleEString ) ) ) (otherlv_6= ')' )? )
            {
            // InternalMyDsl.g:580:2: ( () otherlv_1= 'CsvLoader' otherlv_2= '(' (otherlv_3= 'path' otherlv_4= '=' ( (lv_path_5_0= ruleEString ) ) ) (otherlv_6= ')' )? )
            // InternalMyDsl.g:581:3: () otherlv_1= 'CsvLoader' otherlv_2= '(' (otherlv_3= 'path' otherlv_4= '=' ( (lv_path_5_0= ruleEString ) ) ) (otherlv_6= ')' )?
            {
            // InternalMyDsl.g:581:3: ()
            // InternalMyDsl.g:582:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCsvLoaderAccess().getCsvLoaderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCsvLoaderAccess().getCsvLoaderKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getCsvLoaderAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:596:3: (otherlv_3= 'path' otherlv_4= '=' ( (lv_path_5_0= ruleEString ) ) )
            // InternalMyDsl.g:597:4: otherlv_3= 'path' otherlv_4= '=' ( (lv_path_5_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,28,FOLLOW_21); 

            				newLeafNode(otherlv_3, grammarAccess.getCsvLoaderAccess().getPathKeyword_3_0());
            			
            otherlv_4=(Token)match(input,26,FOLLOW_15); 

            				newLeafNode(otherlv_4, grammarAccess.getCsvLoaderAccess().getEqualsSignKeyword_3_1());
            			
            // InternalMyDsl.g:605:4: ( (lv_path_5_0= ruleEString ) )
            // InternalMyDsl.g:606:5: (lv_path_5_0= ruleEString )
            {
            // InternalMyDsl.g:606:5: (lv_path_5_0= ruleEString )
            // InternalMyDsl.g:607:6: lv_path_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getCsvLoaderAccess().getPathEStringParserRuleCall_3_2_0());
            					
            pushFollow(FOLLOW_23);
            lv_path_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCsvLoaderRule());
            						}
            						set(
            							current,
            							"path",
            							lv_path_5_0,
            							"org.xtext.example.mydsl.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:625:3: (otherlv_6= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:626:4: otherlv_6= ')'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getCsvLoaderAccess().getRightParenthesisKeyword_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCsvLoader"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:635:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:635:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:636:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:642:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | kw= 'C:/Users/DELL/Downloads/selected_cars.csv' ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:648:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | kw= 'C:/Users/DELL/Downloads/selected_cars.csv' ) )
            // InternalMyDsl.g:649:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | kw= 'C:/Users/DELL/Downloads/selected_cars.csv' )
            {
            // InternalMyDsl.g:649:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | kw= 'C:/Users/DELL/Downloads/selected_cars.csv' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case 29:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:650:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:658:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:666:3: kw= 'C:/Users/DELL/Downloads/selected_cars.csv'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEStringAccess().getCUsersDELLDownloadsSelected_carsCsvKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleFilterType"
    // InternalMyDsl.g:675:1: ruleFilterType returns [Enumerator current=null] : ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'sup' ) | (enumLiteral_2= 'equal' ) ) ;
    public final Enumerator ruleFilterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:681:2: ( ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'sup' ) | (enumLiteral_2= 'equal' ) ) )
            // InternalMyDsl.g:682:2: ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'sup' ) | (enumLiteral_2= 'equal' ) )
            {
            // InternalMyDsl.g:682:2: ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'sup' ) | (enumLiteral_2= 'equal' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt13=1;
                }
                break;
            case 31:
                {
                alt13=2;
                }
                break;
            case 32:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:683:3: (enumLiteral_0= 'inf' )
                    {
                    // InternalMyDsl.g:683:3: (enumLiteral_0= 'inf' )
                    // InternalMyDsl.g:684:4: enumLiteral_0= 'inf'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getFilterTypeAccess().getInfEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFilterTypeAccess().getInfEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:691:3: (enumLiteral_1= 'sup' )
                    {
                    // InternalMyDsl.g:691:3: (enumLiteral_1= 'sup' )
                    // InternalMyDsl.g:692:4: enumLiteral_1= 'sup'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getFilterTypeAccess().getSupEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFilterTypeAccess().getSupEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:699:3: (enumLiteral_2= 'equal' )
                    {
                    // InternalMyDsl.g:699:3: (enumLiteral_2= 'equal' )
                    // InternalMyDsl.g:700:4: enumLiteral_2= 'equal'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getFilterTypeAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFilterTypeAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterType"


    // $ANTLR start "ruleChartType"
    // InternalMyDsl.g:710:1: ruleChartType returns [Enumerator current=null] : ( (enumLiteral_0= 'histogram' ) | (enumLiteral_1= 'pie' ) | (enumLiteral_2= 'line' ) ) ;
    public final Enumerator ruleChartType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:716:2: ( ( (enumLiteral_0= 'histogram' ) | (enumLiteral_1= 'pie' ) | (enumLiteral_2= 'line' ) ) )
            // InternalMyDsl.g:717:2: ( (enumLiteral_0= 'histogram' ) | (enumLiteral_1= 'pie' ) | (enumLiteral_2= 'line' ) )
            {
            // InternalMyDsl.g:717:2: ( (enumLiteral_0= 'histogram' ) | (enumLiteral_1= 'pie' ) | (enumLiteral_2= 'line' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 35:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:718:3: (enumLiteral_0= 'histogram' )
                    {
                    // InternalMyDsl.g:718:3: (enumLiteral_0= 'histogram' )
                    // InternalMyDsl.g:719:4: enumLiteral_0= 'histogram'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getHistogramEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getChartTypeAccess().getHistogramEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:726:3: (enumLiteral_1= 'pie' )
                    {
                    // InternalMyDsl.g:726:3: (enumLiteral_1= 'pie' )
                    // InternalMyDsl.g:727:4: enumLiteral_1= 'pie'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getPieEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getChartTypeAccess().getPieEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:734:3: (enumLiteral_2= 'line' )
                    {
                    // InternalMyDsl.g:734:3: (enumLiteral_2= 'line' )
                    // InternalMyDsl.g:735:4: enumLiteral_2= 'line'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getLineEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getChartTypeAccess().getLineEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChartType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000009088000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000001E0020030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020020030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020040030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020040032L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040002L});

}