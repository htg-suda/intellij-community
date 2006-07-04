/* The following code was generated by JFlex 1.4.1 on 7/4/06 6:05 PM */

 /* It's an automatically generated code. Do not modify it. */
package com.intellij.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.*;
import com.intellij.psi.xml.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 7/4/06 6:05 PM from the specification file
 * <tt>C:/work/Irida/tools/lexer/_OldXmlLexer.flex</tt>
 */
public class _OldXmlLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int PROCESSING_INSTRUCTION = 11;
  public static final int DECL_ATTR_VALUE_DQ = 3;
  public static final int DECL_ATTR = 2;
  public static final int ATTRIBUTE_VALUE_START = 8;
  public static final int DECL_ATTR_VALUE_SQ = 4;
  public static final int ATTRIBUTE_VALUE_DQ = 9;
  public static final int CONDITIONAL = 18;
  public static final int DECL = 1;
  public static final int ATTRIBUTE_VALUE_SQ = 10;
  public static final int DOCTYPE_EXTERNAL_ID = 13;
  public static final int CDATA = 17;
  public static final int COMMENT = 7;
  public static final int TAG_NAME = 5;
  public static final int DOCTYPE_MARKUP = 14;
  public static final int DOCTYPE_COMMENT = 19;
  public static final int DOCTYPE_MARKUP_DQ = 15;
  public static final int YYINITIAL = 0;
  public static final int TAG_ATTRIBUTES = 6;
  public static final int DOCTYPE = 12;
  public static final int DOCTYPE_MARKUP_SQ = 16;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\2\3\1\0\2\3\22\0\1\43\1\12\1\4\1\35\1\0"+
    "\1\34\1\32\1\5\1\52\1\53\1\55\1\54\1\57\1\7\1\6"+
    "\1\11\12\2\1\1\1\33\1\10\1\44\1\21\1\40\1\0\1\16"+
    "\1\51\1\14\1\15\1\26\1\61\1\27\1\1\1\22\2\1\1\24"+
    "\1\50\1\23\1\30\1\46\1\60\1\31\1\47\1\17\1\25\2\1"+
    "\1\62\1\45\1\1\1\13\1\0\1\20\1\0\1\1\1\0\6\37"+
    "\5\1\1\42\1\41\12\1\1\36\2\1\1\0\1\56\55\0\1\1"+
    "\12\0\1\1\4\0\1\1\5\0\27\1\1\0\37\1\1\0\u013f\1"+
    "\31\0\162\1\4\0\14\1\16\0\5\1\11\0\1\1\213\0\1\1"+
    "\13\0\1\1\1\0\3\1\1\0\1\1\1\0\24\1\1\0\54\1"+
    "\1\0\46\1\1\0\5\1\4\0\202\1\10\0\105\1\1\0\46\1"+
    "\2\0\2\1\6\0\20\1\41\0\46\1\2\0\1\1\7\0\47\1"+
    "\110\0\33\1\5\0\3\1\56\0\32\1\5\0\13\1\43\0\2\1"+
    "\1\0\143\1\1\0\1\1\17\0\2\1\7\0\2\1\12\0\3\1"+
    "\2\0\1\1\20\0\1\1\1\0\36\1\35\0\3\1\60\0\46\1"+
    "\13\0\1\1\u0152\0\66\1\3\0\1\1\22\0\1\1\7\0\12\1"+
    "\43\0\10\1\2\0\2\1\2\0\26\1\1\0\7\1\1\0\1\1"+
    "\3\0\4\1\3\0\1\1\36\0\2\1\1\0\3\1\16\0\2\1"+
    "\23\0\6\1\4\0\2\1\2\0\26\1\1\0\7\1\1\0\2\1"+
    "\1\0\2\1\1\0\2\1\37\0\4\1\1\0\1\1\23\0\3\1"+
    "\20\0\11\1\1\0\3\1\1\0\26\1\1\0\7\1\1\0\2\1"+
    "\1\0\5\1\3\0\1\1\22\0\1\1\17\0\2\1\43\0\10\1"+
    "\2\0\2\1\2\0\26\1\1\0\7\1\1\0\2\1\1\0\5\1"+
    "\3\0\1\1\36\0\2\1\1\0\3\1\17\0\1\1\21\0\1\1"+
    "\1\0\6\1\3\0\3\1\1\0\4\1\3\0\2\1\1\0\1\1"+
    "\1\0\2\1\3\0\2\1\3\0\3\1\3\0\10\1\1\0\3\1"+
    "\113\0\10\1\1\0\3\1\1\0\27\1\1\0\12\1\1\0\5\1"+
    "\46\0\2\1\43\0\10\1\1\0\3\1\1\0\27\1\1\0\12\1"+
    "\1\0\5\1\3\0\1\1\40\0\1\1\1\0\2\1\43\0\10\1"+
    "\1\0\3\1\1\0\27\1\1\0\20\1\46\0\2\1\43\0\22\1"+
    "\3\0\30\1\1\0\11\1\1\0\1\1\2\0\7\1\72\0\60\1"+
    "\1\0\2\1\14\0\7\1\72\0\2\1\1\0\1\1\2\0\2\1"+
    "\1\0\1\1\2\0\1\1\6\0\4\1\1\0\7\1\1\0\3\1"+
    "\1\0\1\1\1\0\1\1\2\0\2\1\1\0\4\1\1\0\2\1"+
    "\11\0\1\1\2\0\5\1\1\0\1\1\25\0\2\1\42\0\1\1"+
    "\77\0\10\1\1\0\42\1\35\0\4\1\164\0\42\1\1\0\5\1"+
    "\1\0\2\1\45\0\6\1\112\0\46\1\12\0\51\1\7\0\132\1"+
    "\5\0\104\1\5\0\122\1\6\0\7\1\1\0\77\1\1\0\1\1"+
    "\1\0\4\1\2\0\7\1\1\0\1\1\1\0\4\1\2\0\47\1"+
    "\1\0\1\1\1\0\4\1\2\0\37\1\1\0\1\1\1\0\4\1"+
    "\2\0\7\1\1\0\1\1\1\0\4\1\2\0\7\1\1\0\7\1"+
    "\1\0\27\1\1\0\37\1\1\0\1\1\1\0\4\1\2\0\7\1"+
    "\1\0\47\1\1\0\23\1\105\0\125\1\14\0\u026c\1\2\0\10\1"+
    "\12\0\32\1\5\0\113\1\25\0\15\1\1\0\4\1\16\0\22\1"+
    "\16\0\22\1\16\0\15\1\1\0\3\1\17\0\64\1\43\0\1\1"+
    "\4\0\1\1\103\0\130\1\10\0\51\1\127\0\35\1\63\0\36\1"+
    "\2\0\5\1\u038b\0\154\1\224\0\234\1\4\0\132\1\6\0\26\1"+
    "\2\0\6\1\2\0\46\1\2\0\6\1\2\0\10\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\37\1\2\0\65\1\1\0\7\1"+
    "\1\0\1\1\3\0\3\1\1\0\7\1\3\0\4\1\2\0\6\1"+
    "\4\0\15\1\5\0\3\1\1\0\7\1\164\0\1\1\15\0\1\1"+
    "\202\0\1\1\4\0\1\1\2\0\12\1\1\0\1\1\3\0\5\1"+
    "\6\0\1\1\1\0\1\1\1\0\1\1\1\0\4\1\1\0\3\1"+
    "\1\0\7\1\3\0\3\1\5\0\5\1\u0ebb\0\2\1\52\0\5\1"+
    "\5\0\2\1\4\0\126\1\6\0\3\1\1\0\132\1\1\0\4\1"+
    "\5\0\50\1\4\0\136\1\21\0\30\1\70\0\20\1\u0200\0\u19b6\1"+
    "\112\0\u51a6\1\132\0\u048d\1\u0773\0\u2ba4\1\u215c\0\u012e\1\2\0\73\1"+
    "\225\0\7\1\14\0\5\1\5\0\1\1\1\0\12\1\1\0\15\1"+
    "\1\0\5\1\1\0\1\1\1\0\2\1\1\0\2\1\1\0\154\1"+
    "\41\0\u016b\1\22\0\100\1\2\0\66\1\50\0\14\1\164\0\5\1"+
    "\1\0\207\1\44\0\32\1\6\0\32\1\13\0\131\1\3\0\6\1"+
    "\2\0\6\1\2\0\6\1\2\0\3\1\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\2\1\2\0\1\2\13\0\1\2\1\3\1\4"+
    "\1\5\1\3\1\6\1\3\1\6\1\7\2\6\1\10"+
    "\2\6\1\11\1\12\1\13\1\1\1\14\11\1\1\15"+
    "\1\5\1\16\1\6\1\17\1\20\1\2\1\6\4\2"+
    "\1\21\1\22\1\1\1\23\3\1\6\24\1\25\1\26"+
    "\2\16\2\6\1\27\1\30\1\16\1\6\1\16\1\31"+
    "\1\32\1\16\1\33\1\34\1\35\1\6\1\36\2\16"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\3\3"+
    "\2\6\1\46\1\0\1\47\4\0\1\50\10\1\1\51"+
    "\2\0\4\2\1\52\2\16\2\0\1\53\1\0\2\16"+
    "\4\0\2\16\4\0\1\54\1\0\1\55\5\0\1\56"+
    "\1\57\2\0\1\55\1\56\1\57\2\1\1\55\1\56"+
    "\1\57\2\1\1\60\1\0\1\55\1\56\1\0\1\57"+
    "\2\2\2\16\1\61\1\16\4\0\2\16\1\0\1\62"+
    "\2\0\1\63\7\0\1\64\1\0\1\1\1\64\2\1"+
    "\1\64\1\1\1\2\1\64\1\2\3\16\4\0\2\16"+
    "\11\0\2\1\1\2\2\16\1\65\4\0\2\16\10\0"+
    "\1\66\2\1\1\2\1\67\1\70\3\0\1\71\1\72"+
    "\1\73\1\0\1\74\6\0\2\1\1\2\2\0\1\75"+
    "\1\76\4\0\1\77\1\0\2\1\1\2\1\100\1\0"+
    "\1\101\1\102\1\103\1\0\1\104\3\101\1\105\1\106";

  private static int [] zzUnpackAction() {
    int [] result = new int[296];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\u0132\0\u0165"+
    "\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264\0\u0297\0\u02ca\0\u02fd"+
    "\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc\0\u042f\0\u0462\0\u0495"+
    "\0\u04c8\0\u04fb\0\u03fc\0\u052e\0\u0561\0\u0495\0\u03fc\0\u04fb"+
    "\0\u0594\0\u03fc\0\u03fc\0\u03fc\0\u05c7\0\u03fc\0\u05fa\0\u062d"+
    "\0\u0660\0\u0693\0\u06c6\0\u06f9\0\u072c\0\u075f\0\u0792\0\u07c5"+
    "\0\u07f8\0\u082b\0\u085e\0\u03fc\0\u03fc\0\u0891\0\u08c4\0\u08f7"+
    "\0\u092a\0\u095d\0\u0990\0\u03fc\0\u03fc\0\u03fc\0\u03fc\0\u0495"+
    "\0\u04c8\0\u04fb\0\u03fc\0\u0561\0\u0495\0\u04c8\0\u04fb\0\u09c3"+
    "\0\u03fc\0\u03fc\0\u09f6\0\u0a29\0\u0a5c\0\u0a8f\0\u03fc\0\u03fc"+
    "\0\u0ac2\0\u0af5\0\u0b28\0\u0495\0\u03fc\0\u0b5b\0\u04c8\0\u03fc"+
    "\0\u04fb\0\u0b8e\0\u03fc\0\u0bc1\0\u0bf4\0\u03fc\0\u03fc\0\u03fc"+
    "\0\u03fc\0\u03fc\0\u03fc\0\u03fc\0\u0c27\0\u0c5a\0\u04c8\0\u0c8d"+
    "\0\u0cc0\0\u03fc\0\u0cf3\0\u0d26\0\u0d59\0\u0d8c\0\u0dbf\0\u0df2"+
    "\0\u03fc\0\u0e25\0\u0e58\0\u0e8b\0\u0ebe\0\u0ef1\0\u0f24\0\u0f57"+
    "\0\u0f8a\0\u03fc\0\u0fbd\0\u0ff0\0\u1023\0\u1056\0\u1089\0\u10bc"+
    "\0\u03fc\0\u10ef\0\u1122\0\u0a5c\0\u0a8f\0\u082b\0\u1155\0\u1188"+
    "\0\u11bb\0\u11ee\0\u1221\0\u1254\0\u1287\0\u12ba\0\u12ed\0\u1320"+
    "\0\u1353\0\u1386\0\u13b9\0\u03fc\0\u13ec\0\u141f\0\u1452\0\u1485"+
    "\0\u14b8\0\u14eb\0\u151e\0\u03fc\0\u03fc\0\u1551\0\u1584\0\u15b7"+
    "\0\u05c7\0\u05c7\0\u15ea\0\u161d\0\u1650\0\u06c6\0\u06c6\0\u1683"+
    "\0\u16b6\0\u03fc\0\u16e9\0\u171c\0\u0891\0\u174f\0\u0891\0\u1782"+
    "\0\u17b5\0\u17e8\0\u181b\0\u082b\0\u184e\0\u1881\0\u18b4\0\u18e7"+
    "\0\u191a\0\u194d\0\u1980\0\u19b3\0\u03fc\0\u19e6\0\u1a19\0\u03fc"+
    "\0\u1a4c\0\u1a7f\0\u1ab2\0\u1ae5\0\u1b18\0\u1b4b\0\u1b7e\0\u03fc"+
    "\0\u1bb1\0\u1be4\0\u05c7\0\u1c17\0\u1c4a\0\u06c6\0\u1c7d\0\u1cb0"+
    "\0\u0891\0\u1ce3\0\u1d16\0\u1d49\0\u1d7c\0\u1daf\0\u1de2\0\u1e15"+
    "\0\u1e48\0\u1e7b\0\u1eae\0\u1ee1\0\u1f14\0\u1f47\0\u1f7a\0\u1fad"+
    "\0\u1fe0\0\u2013\0\u2046\0\u2079\0\u20ac\0\u20df\0\u2112\0\u2145"+
    "\0\u2178\0\u082b\0\u21ab\0\u21de\0\u2211\0\u2244\0\u2277\0\u22aa"+
    "\0\u22dd\0\u2310\0\u2343\0\u2376\0\u23a9\0\u23dc\0\u240f\0\u2442"+
    "\0\u03fc\0\u2475\0\u24a8\0\u24db\0\u082b\0\u082b\0\u250e\0\u2541"+
    "\0\u2574\0\u03fc\0\u082b\0\u082b\0\u25a7\0\u03fc\0\u25da\0\u260d"+
    "\0\u2640\0\u2673\0\u26a6\0\u26d9\0\u270c\0\u273f\0\u2772\0\u27a5"+
    "\0\u27d8\0\u03fc\0\u03fc\0\u280b\0\u283e\0\u2871\0\u28a4\0\u03fc"+
    "\0\u28d7\0\u290a\0\u293d\0\u2970\0\u03fc\0\u29a3\0\u03fc\0\u03fc"+
    "\0\u03fc\0\u29d6\0\u03fc\0\u05c7\0\u06c6\0\u0891\0\u03fc\0\u03fc";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[296];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\25\1\26\4\25\1\27\7\25\1\30\11\25\1\31"+
    "\1\25\1\32\6\25\1\26\17\25\1\33\1\34\1\33"+
    "\1\26\4\33\1\35\3\33\4\34\1\36\1\37\10\34"+
    "\1\31\1\33\1\40\1\33\2\34\1\41\2\34\1\26"+
    "\1\33\5\34\6\33\3\34\3\33\1\26\1\42\1\43"+
    "\2\33\1\35\7\33\1\36\11\33\1\31\1\33\1\40"+
    "\6\33\1\26\1\44\16\33\4\45\1\46\3\45\1\47"+
    "\7\45\1\50\11\45\1\51\1\45\1\52\26\45\5\53"+
    "\1\46\2\53\1\54\7\53\1\55\11\53\1\56\1\53"+
    "\1\57\26\53\1\33\1\60\1\33\1\26\4\33\1\61"+
    "\3\33\4\60\1\36\1\33\10\60\1\31\1\33\1\40"+
    "\1\33\2\60\1\33\2\60\1\26\1\33\5\60\6\33"+
    "\3\60\1\33\1\62\1\33\1\26\4\33\1\61\1\63"+
    "\2\33\4\62\1\36\1\64\10\62\1\31\1\33\1\40"+
    "\1\33\2\62\1\33\2\62\1\26\1\65\5\62\6\33"+
    "\3\62\7\66\1\67\1\70\7\66\1\71\11\66\1\72"+
    "\1\66\1\73\26\66\3\33\1\26\1\74\1\75\2\33"+
    "\1\61\1\63\6\33\1\36\1\64\10\33\1\31\1\33"+
    "\1\40\6\33\1\26\17\33\4\76\1\77\3\76\1\61"+
    "\7\76\1\100\11\76\1\101\1\76\1\102\33\76\1\77"+
    "\2\76\1\61\7\76\1\100\11\76\1\101\1\76\1\102"+
    "\26\76\10\103\1\104\7\103\1\105\11\103\1\106\1\103"+
    "\1\107\3\103\1\110\22\103\1\33\1\62\1\33\1\26"+
    "\4\33\1\35\2\33\1\111\4\62\1\36\1\112\10\62"+
    "\1\31\1\33\1\40\1\33\2\62\1\33\2\62\1\26"+
    "\1\33\1\62\1\113\1\114\2\62\6\33\3\62\3\33"+
    "\1\26\1\115\1\116\2\33\1\35\2\33\1\111\4\33"+
    "\1\36\1\112\10\33\1\31\1\33\1\40\6\33\1\26"+
    "\20\33\2\62\1\26\1\117\1\120\1\62\1\121\1\122"+
    "\3\33\2\62\1\123\1\62\1\124\1\125\4\62\1\126"+
    "\3\62\1\127\1\130\1\131\1\132\2\62\1\133\2\62"+
    "\1\26\1\33\1\62\1\134\1\135\2\62\1\136\1\137"+
    "\1\140\1\141\1\142\1\143\3\62\4\45\1\144\3\45"+
    "\1\47\7\45\1\50\11\45\1\51\1\45\1\52\26\45"+
    "\5\53\1\144\2\53\1\54\7\53\1\55\11\53\1\56"+
    "\1\53\1\57\26\53\10\25\1\145\7\25\1\146\11\25"+
    "\1\147\1\25\1\32\26\25\3\33\1\26\4\33\1\35"+
    "\2\33\1\111\4\33\1\36\1\33\1\150\7\33\1\31"+
    "\1\33\1\40\6\33\1\26\17\33\7\66\1\151\1\70"+
    "\7\66\1\71\11\66\1\72\1\66\1\73\26\66\66\0"+
    "\1\26\37\0\1\26\30\0\1\152\1\153\25\0\1\154"+
    "\42\0\1\155\43\0\1\156\12\0\4\156\2\0\10\156"+
    "\3\0\1\157\2\156\1\0\2\156\2\0\5\156\6\0"+
    "\3\156\1\0\1\156\12\0\4\156\2\0\10\156\4\0"+
    "\2\156\1\0\2\156\2\0\5\156\6\0\3\156\1\0"+
    "\2\34\3\0\2\34\4\0\4\34\2\0\10\34\4\0"+
    "\2\34\1\0\2\34\2\0\5\34\6\0\3\34\12\0"+
    "\1\160\71\0\1\161\41\0\4\45\1\0\62\45\1\0"+
    "\5\45\1\162\54\45\1\0\13\45\1\163\43\45\1\164"+
    "\2\45\1\0\7\45\4\164\2\45\10\164\3\45\1\165"+
    "\2\164\1\45\2\164\2\45\5\164\6\45\3\164\1\45"+
    "\1\164\2\45\1\0\7\45\4\164\2\45\10\164\4\45"+
    "\2\164\1\45\2\164\2\45\5\164\6\45\3\164\5\53"+
    "\1\0\62\53\1\0\4\53\1\166\55\53\1\0\12\53"+
    "\1\167\43\53\1\170\3\53\1\0\6\53\4\170\2\53"+
    "\10\170\3\53\1\171\2\170\1\53\2\170\2\53\5\170"+
    "\6\53\3\170\1\53\1\170\3\53\1\0\6\53\4\170"+
    "\2\53\10\170\4\53\2\170\1\53\2\170\2\53\5\170"+
    "\6\53\3\170\1\0\2\60\3\0\2\60\4\0\4\60"+
    "\2\0\10\60\4\0\2\60\1\0\2\60\2\0\5\60"+
    "\6\0\3\60\11\0\1\152\1\160\51\0\2\62\3\0"+
    "\2\62\4\0\4\62\2\0\10\62\4\0\2\62\1\0"+
    "\2\62\2\0\5\62\6\0\3\62\21\0\1\172\41\0"+
    "\7\66\1\173\62\66\1\174\62\66\1\173\2\66\1\175"+
    "\57\66\1\173\10\66\1\176\43\66\1\177\5\66\1\173"+
    "\4\66\4\177\2\66\10\177\3\66\1\200\2\177\1\66"+
    "\2\177\2\66\5\177\6\66\3\177\1\66\1\177\5\66"+
    "\1\173\4\66\4\177\2\66\10\177\4\66\2\177\1\66"+
    "\2\177\2\66\5\177\6\66\3\177\21\0\1\201\42\0"+
    "\2\62\3\0\2\62\4\0\4\62\2\0\3\62\1\202"+
    "\4\62\4\0\2\62\1\0\2\62\2\0\5\62\6\0"+
    "\3\62\1\0\2\62\3\0\2\62\4\0\4\62\2\0"+
    "\10\62\4\0\2\62\1\0\2\62\2\0\1\203\4\62"+
    "\6\0\3\62\4\204\1\76\56\204\5\205\1\76\55\205"+
    "\1\0\2\62\3\0\1\62\1\206\4\0\4\62\2\0"+
    "\10\62\4\0\2\62\1\0\2\62\2\0\5\62\6\0"+
    "\3\62\12\0\1\207\51\0\2\62\3\0\2\62\4\0"+
    "\4\62\2\0\1\62\1\210\6\62\4\0\2\62\1\0"+
    "\2\62\2\0\5\62\6\0\3\62\1\0\2\62\3\0"+
    "\2\62\4\0\4\62\2\0\10\62\4\0\2\62\1\0"+
    "\2\62\2\0\3\62\1\211\1\62\6\0\3\62\22\0"+
    "\1\212\6\0\1\213\14\0\1\214\12\0\1\215\2\0"+
    "\2\62\3\0\2\62\4\0\4\62\2\0\3\62\1\216"+
    "\4\62\4\0\2\62\1\0\2\62\2\0\5\62\6\0"+
    "\3\62\1\0\2\62\3\0\2\62\4\0\4\62\2\0"+
    "\10\62\4\0\2\62\1\0\2\62\2\0\1\217\4\62"+
    "\6\0\3\62\12\0\1\220\70\0\1\221\65\0\1\222"+
    "\3\0\1\223\33\0\7\66\1\224\53\66\7\0\1\225"+
    "\3\0\1\226\1\0\1\227\1\230\4\0\1\231\2\0"+
    "\1\232\72\0\1\233\45\0\1\234\42\0\2\156\3\0"+
    "\2\156\4\0\4\156\2\0\10\156\1\0\1\235\2\0"+
    "\2\156\1\0\2\156\2\0\5\156\6\0\3\156\2\0"+
    "\1\236\33\0\1\237\33\0\1\225\3\0\1\226\47\0"+
    "\4\45\1\0\6\45\1\240\53\45\1\0\14\45\1\241"+
    "\42\45\2\164\1\45\1\0\1\45\2\164\4\45\4\164"+
    "\2\45\10\164\1\45\1\242\2\45\2\164\1\45\2\164"+
    "\2\45\5\164\6\45\3\164\2\45\1\243\1\45\1\0"+
    "\31\45\1\244\24\45\5\53\1\0\5\53\1\245\54\53"+
    "\1\0\13\53\1\246\42\53\2\170\2\53\1\0\2\170"+
    "\4\53\4\170\2\53\10\170\1\53\1\247\2\53\2\170"+
    "\1\53\2\170\2\53\5\170\6\53\3\170\2\53\1\250"+
    "\2\53\1\0\30\53\1\251\24\53\7\66\1\0\53\66"+
    "\21\0\1\252\41\0\7\66\1\253\3\66\1\254\56\66"+
    "\1\173\11\66\1\255\42\66\2\177\3\66\1\177\1\256"+
    "\4\66\4\177\2\66\10\177\1\66\1\257\2\66\2\177"+
    "\1\66\2\177\2\66\5\177\6\66\3\177\2\66\1\260"+
    "\4\66\1\173\26\66\1\261\24\66\1\0\2\62\3\0"+
    "\2\62\4\0\4\62\2\0\10\62\4\0\2\62\1\0"+
    "\2\62\2\0\4\62\1\262\6\0\3\62\1\0\2\62"+
    "\3\0\2\62\4\0\4\62\2\0\10\62\4\0\2\62"+
    "\1\0\2\62\2\0\2\62\1\263\2\62\6\0\3\62"+
    "\7\0\1\225\3\0\1\226\2\0\1\230\4\0\1\231"+
    "\2\0\1\232\35\0\2\62\3\0\2\62\4\0\4\62"+
    "\2\0\10\62\4\0\2\62\1\0\2\62\2\0\1\264"+
    "\4\62\6\0\3\62\1\0\2\62\3\0\2\62\4\0"+
    "\4\62\2\0\10\62\4\0\2\62\1\0\2\62\2\0"+
    "\1\62\1\265\3\62\6\0\3\62\50\0\1\266\40\0"+
    "\1\267\50\0\1\270\70\0\1\271\41\0\2\62\3\0"+
    "\2\62\4\0\4\62\2\0\10\62\4\0\2\62\1\0"+
    "\2\62\2\0\4\62\1\272\6\0\3\62\1\0\2\62"+
    "\3\0\2\62\4\0\4\62\2\0\10\62\4\0\2\62"+
    "\1\0\2\62\2\0\2\62\1\273\2\62\6\0\3\62"+
    "\7\0\1\274\3\0\1\226\70\0\1\275\55\0\1\276"+
    "\71\0\1\277\46\0\1\300\67\0\1\301\76\0\1\302"+
    "\51\0\1\303\73\0\1\304\55\0\1\305\1\306\77\0"+
    "\1\307\23\0\1\236\30\0\1\310\31\0\1\311\11\0"+
    "\3\311\7\0\1\311\10\0\1\311\11\0\1\311\7\0"+
    "\1\311\1\0\4\45\1\0\7\45\1\312\50\45\1\243"+
    "\1\45\1\0\26\45\1\313\31\45\1\314\1\45\1\0"+
    "\7\45\3\314\7\45\1\314\10\45\1\314\11\45\1\314"+
    "\7\45\1\314\1\45\5\53\1\0\6\53\1\315\50\53"+
    "\1\250\2\53\1\0\25\53\1\316\31\53\1\317\2\53"+
    "\1\0\6\53\3\317\7\53\1\317\10\53\1\317\11\53"+
    "\1\317\7\53\1\317\1\53\7\66\1\300\62\66\1\173"+
    "\4\66\1\320\47\66\2\177\3\66\1\177\1\156\4\66"+
    "\4\177\2\66\10\177\1\66\1\257\2\66\2\177\1\66"+
    "\2\177\2\66\5\177\6\66\3\177\2\66\1\260\4\66"+
    "\1\173\23\66\1\321\31\66\1\322\4\66\1\173\4\66"+
    "\3\322\7\66\1\322\10\66\1\322\11\66\1\322\7\66"+
    "\1\322\1\66\1\0\2\62\3\0\2\62\4\0\4\62"+
    "\2\0\2\62\1\323\5\62\4\0\2\62\1\0\2\62"+
    "\2\0\5\62\6\0\3\62\1\0\2\62\3\0\2\62"+
    "\4\0\3\62\1\324\2\0\10\62\4\0\2\62\1\0"+
    "\2\62\2\0\5\62\6\0\3\62\1\0\2\62\3\0"+
    "\2\62\4\0\3\62\1\325\2\0\10\62\4\0\2\62"+
    "\1\0\2\62\2\0\5\62\6\0\3\62\46\0\1\326"+
    "\74\0\1\327\17\0\1\330\127\0\1\331\1\0\2\62"+
    "\3\0\2\62\4\0\4\62\2\0\2\62\1\332\5\62"+
    "\4\0\2\62\1\0\2\62\2\0\5\62\6\0\3\62"+
    "\1\0\2\62\3\0\2\62\4\0\3\62\1\333\2\0"+
    "\10\62\4\0\2\62\1\0\2\62\2\0\5\62\6\0"+
    "\3\62\7\0\1\25\77\0\1\334\66\0\1\335\47\0"+
    "\1\336\61\0\1\337\65\0\1\340\62\0\1\341\62\0"+
    "\1\342\71\0\1\343\76\0\1\344\22\0\1\311\11\0"+
    "\3\311\7\0\1\311\4\0\1\310\3\0\1\311\11\0"+
    "\1\311\7\0\1\311\1\0\4\45\1\0\10\45\1\345"+
    "\47\45\1\314\1\45\1\0\7\45\3\314\7\45\1\314"+
    "\4\45\1\313\3\45\1\314\11\45\1\314\7\45\1\314"+
    "\1\45\5\53\1\0\7\53\1\346\47\53\1\317\2\53"+
    "\1\0\6\53\3\317\7\53\1\317\4\53\1\316\3\53"+
    "\1\317\11\53\1\317\7\53\1\317\1\53\7\66\1\173"+
    "\5\66\1\347\47\66\1\322\4\66\1\173\4\66\3\322"+
    "\7\66\1\322\4\66\1\321\3\66\1\322\11\66\1\322"+
    "\7\66\1\322\1\66\1\0\2\62\3\0\2\62\4\0"+
    "\4\62\2\0\1\350\7\62\4\0\2\62\1\0\2\62"+
    "\2\0\5\62\6\0\3\62\1\0\2\62\3\0\2\62"+
    "\4\0\4\62\2\0\4\62\1\351\3\62\4\0\2\62"+
    "\1\0\2\62\2\0\5\62\6\0\3\62\1\0\2\62"+
    "\3\0\2\62\4\0\4\62\2\0\10\62\4\0\2\62"+
    "\1\0\2\62\2\0\1\352\4\62\6\0\3\62\24\0"+
    "\1\353\63\0\1\354\53\0\1\355\72\0\1\356\35\0"+
    "\2\62\3\0\2\62\4\0\4\62\2\0\1\357\7\62"+
    "\4\0\2\62\1\0\2\62\2\0\5\62\6\0\3\62"+
    "\1\0\2\62\3\0\2\62\4\0\4\62\2\0\4\62"+
    "\1\360\3\62\4\0\2\62\1\0\2\62\2\0\5\62"+
    "\6\0\3\62\25\0\1\361\66\0\1\362\47\0\1\363"+
    "\63\0\1\364\67\0\1\365\54\0\1\366\66\0\1\367"+
    "\110\0\1\370\55\0\1\371\17\0\4\45\1\0\11\45"+
    "\1\372\44\45\5\53\1\0\10\53\1\373\44\53\7\66"+
    "\1\173\6\66\1\374\44\66\1\0\2\62\3\0\2\62"+
    "\4\0\1\375\3\62\2\0\10\62\4\0\2\62\1\0"+
    "\2\62\2\0\5\62\6\0\3\62\1\0\2\62\3\0"+
    "\2\62\4\0\4\62\2\0\10\62\4\0\2\62\1\0"+
    "\2\62\2\0\3\62\1\376\1\62\6\0\3\62\22\0"+
    "\1\377\62\0\1\u0100\57\0\1\u0101\60\0\1\u0102\46\0"+
    "\2\62\3\0\2\62\4\0\1\u0103\3\62\2\0\10\62"+
    "\4\0\2\62\1\0\2\62\2\0\5\62\6\0\3\62"+
    "\1\0\2\62\3\0\2\62\4\0\4\62\2\0\10\62"+
    "\4\0\2\62\1\0\2\62\2\0\3\62\1\u0104\1\62"+
    "\6\0\3\62\15\0\1\u0105\73\0\1\u0106\53\0\1\u0107"+
    "\110\0\1\u0108\37\0\1\u0109\57\0\1\u010a\62\0\1\u010b"+
    "\71\0\1\u010c\34\0\4\45\1\0\12\45\1\u010d\43\45"+
    "\5\53\1\0\11\53\1\u010e\43\53\7\66\1\173\7\66"+
    "\1\u010f\43\66\26\0\1\u0110\65\0\1\u0111\47\0\1\u0112"+
    "\72\0\1\u0113\52\0\1\u0114\112\0\1\u0115\63\0\1\u0116"+
    "\35\0\1\u0117\105\0\1\u0118\40\0\1\u0119\37\0\4\45"+
    "\1\0\11\45\1\u011a\44\45\5\53\1\0\10\53\1\u011b"+
    "\44\53\7\66\1\173\6\66\1\u011c\44\66\15\0\1\u011d"+
    "\73\0\1\u011e\47\0\1\u011f\75\0\1\u0120\53\0\1\u0121"+
    "\73\0\1\u0122\51\0\1\u0123\43\0\4\45\1\0\6\45"+
    "\1\u0124\47\45\5\53\1\0\5\53\1\u0125\47\53\7\66"+
    "\1\173\3\66\1\u0126\47\66\15\0\1\u0127\70\0\1\u0128"+
    "\37\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10761];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\2\1\2\0\1\1\13\0\1\1\1\11\5\1"+
    "\1\11\3\1\1\11\2\1\3\11\1\1\1\11\15\1"+
    "\2\11\6\1\4\11\3\1\1\11\5\1\2\11\4\1"+
    "\2\11\4\1\1\11\2\1\1\11\2\1\1\11\2\1"+
    "\7\11\5\1\1\11\1\0\1\1\4\0\1\11\10\1"+
    "\1\11\2\0\4\1\1\11\2\1\2\0\1\1\1\0"+
    "\2\1\4\0\2\1\4\0\1\11\1\0\1\1\5\0"+
    "\2\11\2\0\12\1\1\11\1\0\2\1\1\0\7\1"+
    "\4\0\2\1\1\0\1\11\2\0\1\11\7\0\1\11"+
    "\1\0\14\1\4\0\2\1\11\0\6\1\4\0\2\1"+
    "\10\0\1\11\5\1\3\0\1\11\2\1\1\0\1\11"+
    "\6\0\3\1\2\0\2\11\4\0\1\11\1\0\3\1"+
    "\1\11\1\0\3\11\1\0\1\11\3\1\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[296];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
   public _OldXmlLexer() {
     this((java.io.Reader)null);
   }


  public _OldXmlLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _OldXmlLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1234) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int initialState){
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = 0;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = buffer.length();
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = zzLexicalState;


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 21: 
          { yybegin(DOCTYPE_MARKUP); return XmlTokenType.XML_MARKUP_START;
          }
        case 71: break;
        case 1: 
          { return XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
          }
        case 72: break;
        case 59: 
          { return XmlTokenType.XML_DOCTYPE_SYSTEM;
          }
        case 73: break;
        case 36: 
          { return XmlTokenType.XML_COMMA;
          }
        case 74: break;
        case 11: 
          { return XmlTokenType.XML_EQ;
          }
        case 75: break;
        case 65: 
          { yybegin(CDATA); return XmlTokenType.XML_CDATA_START;
          }
        case 76: break;
        case 16: 
          { yybegin(ATTRIBUTE_VALUE_START); return XmlTokenType.XML_EQ;
          }
        case 77: break;
        case 60: 
          { return XmlTokenType.XML_CONDITIONAL_IGNORE;
          }
        case 78: break;
        case 28: 
          { return XmlTokenType.XML_SEMI;
          }
        case 79: break;
        case 54: 
          { yybegin(DECL); return XmlTokenType.XML_DECL_START;
          }
        case 80: break;
        case 9: 
          { yybegin(DECL_ATTR_VALUE_DQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
          }
        case 81: break;
        case 68: 
          { yybegin(DOCTYPE_MARKUP); return XmlTokenType.XML_ELEMENT_DECL_START;
          }
        case 82: break;
        case 14: 
          { return XmlTokenType.XML_NAME;
          }
        case 83: break;
        case 19: 
          { yybegin(TAG_ATTRIBUTES); return XmlTokenType.XML_ATTRIBUTE_VALUE_END_DELIMITER;
          }
        case 84: break;
        case 10: 
          { yybegin(DECL_ATTR_VALUE_SQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
          }
        case 85: break;
        case 58: 
          { return XmlTokenType.XML_DOCTYPE_PUBLIC;
          }
        case 86: break;
        case 51: 
          { yybegin(COMMENT); return XmlTokenType.XML_COMMENT_START;
          }
        case 87: break;
        case 7: 
          { yybegin(DECL_ATTR); return XmlTokenType.XML_NAME;
          }
        case 88: break;
        case 37: 
          { yybegin(DOCTYPE_MARKUP); return XmlTokenType.XML_ATTRIBUTE_VALUE_END_DELIMITER;
          }
        case 89: break;
        case 64: 
          { return XmlTokenType.XML_ATT_IMPLIED;
          }
        case 90: break;
        case 67: 
          { yybegin(DOCTYPE_MARKUP); return XmlTokenType.XML_ATTLIST_DECL_START;
          }
        case 91: break;
        case 3: 
          { return XmlTokenType.XML_DATA_CHARACTERS;
          }
        case 92: break;
        case 6: 
          { return XmlTokenType.XML_BAD_CHARACTER;
          }
        case 93: break;
        case 15: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_TAG_END;
          }
        case 94: break;
        case 13: 
          { yybegin(TAG_ATTRIBUTES); return XmlTokenType.XML_TAG_NAME;
          }
        case 95: break;
        case 48: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_COMMENT_END;
          }
        case 96: break;
        case 31: 
          { return XmlTokenType.XML_LEFT_PAREN;
          }
        case 97: break;
        case 61: 
          { return XmlTokenType.XML_PCDATA;
          }
        case 98: break;
        case 38: 
          { yybegin(TAG_NAME); return XmlTokenType.XML_END_TAG_START;
          }
        case 99: break;
        case 57: 
          { return XmlTokenType.XML_ATT_FIXED;
          }
        case 100: break;
        case 44: 
          { yybegin(DOCTYPE_MARKUP); return XmlTokenType.XML_COMMENT_END;
          }
        case 101: break;
        case 25: 
          { yybegin(DOCTYPE); return XmlTokenType.XML_MARKUP_END;
          }
        case 102: break;
        case 43: 
          { yybegin(DOCTYPE_COMMENT); return XmlTokenType.XML_COMMENT_START;
          }
        case 103: break;
        case 20: 
          { return XmlTokenType.XML_PI_TARGET;
          }
        case 104: break;
        case 62: 
          { return XmlTokenType.XML_CONDITIONAL_INCLUDE;
          }
        case 105: break;
        case 41: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_EMPTY_ELEMENT_END;
          }
        case 106: break;
        case 32: 
          { return XmlTokenType.XML_RIGHT_PAREN;
          }
        case 107: break;
        case 8: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_BAD_CHARACTER;
          }
        case 108: break;
        case 39: 
          { yybegin(PROCESSING_INSTRUCTION); return XmlTokenType.XML_PI_START;
          }
        case 109: break;
        case 63: 
          { yybegin(DOCTYPE_MARKUP); return XmlTokenType.XML_ENTITY_DECL_START;
          }
        case 110: break;
        case 24: 
          { yybegin(DOCTYPE_MARKUP_SQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
          }
        case 111: break;
        case 53: 
          { return XmlTokenType.XML_CONTENT_EMPTY;
          }
        case 112: break;
        case 33: 
          { return XmlTokenType.XML_PLUS;
          }
        case 113: break;
        case 23: 
          { yybegin(DOCTYPE_MARKUP_DQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
          }
        case 114: break;
        case 49: 
          { return XmlTokenType.XML_CONTENT_ANY;
          }
        case 115: break;
        case 22: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_DOCTYPE_END;
          }
        case 116: break;
        case 52: 
          { return XmlTokenType.XML_CHAR_ENTITY_REF;
          }
        case 117: break;
        case 69: 
          { return XmlTokenType.XML_ATT_REQUIRED;
          }
        case 118: break;
        case 30: 
          { return XmlTokenType.XML_QUESTION;
          }
        case 119: break;
        case 56: 
          { yybegin(DOCTYPE_EXTERNAL_ID); return XmlTokenType.XML_DOCTYPE_SYSTEM;
          }
        case 120: break;
        case 34: 
          { return XmlTokenType.XML_STAR;
          }
        case 121: break;
        case 40: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_DECL_END;
          }
        case 122: break;
        case 4: 
          { return XmlTokenType.XML_WHITE_SPACE;
          }
        case 123: break;
        case 47: 
          { return XmlTokenType.XML_ENTITY_REF_TOKEN;
          }
        case 124: break;
        case 29: 
          { return XmlTokenType.XML_PERCENT;
          }
        case 125: break;
        case 5: 
          { yybegin(TAG_NAME); return XmlTokenType.XML_START_TAG_START;
          }
        case 126: break;
        case 46: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_CONDITIONAL_SECTION_END;
          }
        case 127: break;
        case 50: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_CDATA_END;
          }
        case 128: break;
        case 55: 
          { yybegin(DOCTYPE_EXTERNAL_ID); return XmlTokenType.XML_DOCTYPE_PUBLIC;
          }
        case 129: break;
        case 12: 
          { yybegin(DECL); return XmlTokenType.XML_ATTRIBUTE_VALUE_END_DELIMITER;
          }
        case 130: break;
        case 27: 
          { return XmlTokenType.XML_AMP;
          }
        case 131: break;
        case 42: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_PI_END;
          }
        case 132: break;
        case 17: 
          { yybegin(ATTRIBUTE_VALUE_DQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
          }
        case 133: break;
        case 66: 
          { yybegin(DOCTYPE); return XmlTokenType.XML_DOCTYPE_START;
          }
        case 134: break;
        case 18: 
          { yybegin(ATTRIBUTE_VALUE_SQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
          }
        case 135: break;
        case 70: 
          { yybegin(DOCTYPE_MARKUP); return XmlTokenType.XML_NOTATION_DECL_START;
          }
        case 136: break;
        case 26: 
          { return XmlTokenType.XML_TAG_END;
          }
        case 137: break;
        case 35: 
          { return XmlTokenType.XML_BAR;
          }
        case 138: break;
        case 2: 
          { return XmlTokenType.XML_COMMENT_CHARACTERS;
          }
        case 139: break;
        case 45: 
          { yybegin(CONDITIONAL); return XmlTokenType.XML_CONDITIONAL_SECTION_START;
          }
        case 140: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
