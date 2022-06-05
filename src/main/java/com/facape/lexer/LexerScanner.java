// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: scanner.flex

package com.facape.lexer;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class LexerScanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\1\1\5"+
    "\1\6\2\0\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\12\22\1\23\1\24"+
    "\1\25\1\26\1\25\2\0\22\27\1\30\7\27\1\31"+
    "\1\0\1\32\1\0\1\27\1\0\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\27\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\27\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\27\1\60\1\27\1\61"+
    "\1\62\1\63\7\0\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\2\1\1\3\2\1\1\4\1\5"+
    "\1\6\1\7\1\3\1\10\1\11\1\12\1\13\1\14"+
    "\2\15\1\16\1\17\13\15\1\20\1\1\1\21\1\13"+
    "\1\0\1\22\1\0\1\22\2\0\1\23\1\24\12\15"+
    "\1\25\10\15\1\26\2\0\21\15\1\10\1\23\11\15"+
    "\1\27\11\15\1\0\1\15\1\0\1\15\1\0\1\15"+
    "\1\0\1\15\1\0\1\15\1\0\1\15\1\0\1\15"+
    "\1\0\1\15\1\0\1\15\2\25\1\0\1\25";

  private static int [] zzUnpackAction() {
    int [] result = new int[128];
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
    "\0\0\0\64\0\64\0\150\0\234\0\320\0\64\0\u0104"+
    "\0\u0138\0\u016c\0\64\0\64\0\64\0\u01a0\0\u01d4\0\64"+
    "\0\64\0\234\0\234\0\u0208\0\u023c\0\64\0\64\0\u0270"+
    "\0\u02a4\0\u02d8\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410"+
    "\0\u0444\0\u0478\0\64\0\u04ac\0\64\0\64\0\320\0\320"+
    "\0\u0138\0\u0138\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0\0\u05e4"+
    "\0\u0618\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c\0\u0750\0\u0784"+
    "\0\u0208\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888\0\u08bc\0\u08f0"+
    "\0\u0924\0\64\0\u0958\0\u098c\0\u09c0\0\u09f4\0\u0a28\0\u0a5c"+
    "\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc"+
    "\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0d00\0\64\0\64\0\u0d34"+
    "\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38\0\u0e6c\0\u0ea0\0\u0ed4"+
    "\0\u0208\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8\0\u100c\0\u1040"+
    "\0\u1074\0\u10a8\0\u10dc\0\u1110\0\u1144\0\u1178\0\u11ac\0\u11e0"+
    "\0\u1214\0\u1248\0\u127c\0\u12b0\0\u12e4\0\u1318\0\u134c\0\u1380"+
    "\0\u13b4\0\u13e8\0\u141c\0\u1450\0\u1484\0\u14b8\0\u14ec\0\64";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[128];
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
    "\1\2\2\3\1\2\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\7\1\14\1\15\1\14\1\2"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\24\1\30\1\31\1\24\1\32\1\33"+
    "\2\24\1\34\5\24\1\35\1\36\1\37\1\40\1\24"+
    "\1\41\1\42\1\24\1\43\1\44\1\45\66\0\1\3"+
    "\107\0\1\46\35\0\2\47\1\0\3\47\1\50\7\47"+
    "\1\0\45\47\10\0\1\7\53\0\2\51\1\0\6\51"+
    "\1\52\4\51\1\0\45\51\17\0\1\53\60\0\1\54"+
    "\4\0\1\55\62\0\1\56\1\0\1\17\63\0\1\24"+
    "\4\0\2\24\2\0\26\24\25\0\1\24\4\0\2\24"+
    "\2\0\21\24\1\57\3\24\1\60\25\0\1\24\4\0"+
    "\2\24\2\0\15\24\1\61\1\24\1\62\6\24\25\0"+
    "\1\24\4\0\2\24\2\0\7\24\1\63\2\24\1\64"+
    "\2\24\1\65\10\24\25\0\1\24\4\0\2\24\2\0"+
    "\12\24\1\66\13\24\25\0\1\24\4\0\2\24\2\0"+
    "\1\67\11\24\1\70\13\24\25\0\1\24\4\0\2\24"+
    "\2\0\5\24\1\71\6\24\1\72\11\24\25\0\1\24"+
    "\4\0\2\24\2\0\22\24\1\73\3\24\25\0\1\24"+
    "\4\0\2\24\2\0\4\24\1\74\21\24\25\0\1\24"+
    "\4\0\2\24\2\0\21\24\1\75\2\24\1\76\1\24"+
    "\25\0\1\24\4\0\2\24\2\0\17\24\1\77\6\24"+
    "\25\0\1\24\4\0\2\24\2\0\15\24\1\100\10\24"+
    "\25\0\1\24\4\0\2\24\2\0\7\24\1\101\16\24"+
    "\65\0\1\102\23\0\1\103\41\0\14\54\1\104\47\54"+
    "\2\55\3\0\57\55\22\0\1\56\63\0\1\24\4\0"+
    "\2\24\2\0\17\24\1\105\6\24\25\0\1\24\4\0"+
    "\2\24\2\0\20\24\1\106\5\24\25\0\1\24\4\0"+
    "\2\24\2\0\15\24\1\107\10\24\25\0\1\24\4\0"+
    "\2\24\2\0\4\24\1\110\21\24\25\0\1\24\4\0"+
    "\2\24\2\0\1\111\25\24\25\0\1\24\4\0\2\24"+
    "\2\0\1\112\25\24\25\0\1\24\4\0\2\24\2\0"+
    "\14\24\1\113\11\24\25\0\1\24\4\0\2\24\2\0"+
    "\20\24\1\114\5\24\25\0\1\24\4\0\2\24\2\0"+
    "\12\24\1\115\13\24\25\0\1\24\4\0\2\24\2\0"+
    "\15\24\1\116\10\24\25\0\1\24\4\0\2\24\2\0"+
    "\21\24\1\71\4\24\25\0\1\24\4\0\2\24\2\0"+
    "\1\24\1\117\24\24\25\0\1\24\4\0\2\24\2\0"+
    "\21\24\1\120\4\24\25\0\1\24\4\0\2\24\2\0"+
    "\1\121\16\24\1\105\6\24\25\0\1\24\4\0\2\24"+
    "\2\0\10\24\1\122\15\24\25\0\1\24\4\0\2\24"+
    "\2\0\22\24\1\123\2\24\1\71\25\0\1\24\4\0"+
    "\2\24\2\0\10\24\1\124\15\24\25\0\1\24\4\0"+
    "\2\24\2\0\10\24\1\125\15\24\16\0\1\126\6\0"+
    "\1\103\41\0\14\54\1\104\4\54\1\127\42\54\22\0"+
    "\1\24\4\0\2\24\2\0\10\24\1\130\15\24\25\0"+
    "\1\24\4\0\2\24\2\0\21\24\1\131\4\24\25\0"+
    "\1\24\4\0\2\24\2\0\12\24\1\132\13\24\25\0"+
    "\1\24\4\0\2\24\2\0\1\133\25\24\25\0\1\24"+
    "\4\0\2\24\2\0\17\24\1\71\6\24\25\0\1\24"+
    "\4\0\2\24\2\0\20\24\1\134\5\24\25\0\1\24"+
    "\4\0\2\24\2\0\21\24\1\135\4\24\25\0\1\24"+
    "\4\0\2\24\2\0\4\24\1\71\21\24\25\0\1\24"+
    "\4\0\2\24\2\0\20\24\1\123\5\24\25\0\1\24"+
    "\4\0\2\24\2\0\1\72\25\24\25\0\1\24\4\0"+
    "\2\24\2\0\12\24\1\136\13\24\25\0\1\24\4\0"+
    "\2\24\2\0\22\24\1\137\3\24\25\0\1\24\4\0"+
    "\2\24\2\0\21\24\1\136\4\24\25\0\1\24\4\0"+
    "\2\24\2\0\21\24\1\140\4\24\25\0\1\24\4\0"+
    "\2\24\2\0\4\24\1\141\21\24\25\0\1\24\4\0"+
    "\2\24\2\0\3\24\1\71\22\24\25\0\1\24\4\0"+
    "\2\24\2\0\12\24\1\114\13\24\25\0\1\24\4\0"+
    "\2\24\2\0\14\24\1\142\11\24\25\0\1\24\4\0"+
    "\2\24\2\0\4\24\1\143\21\24\25\0\1\24\4\0"+
    "\2\24\2\0\4\24\1\144\21\24\25\0\1\24\4\0"+
    "\2\24\2\0\11\24\1\71\14\24\25\0\1\24\4\0"+
    "\2\24\2\0\20\24\1\71\5\24\25\0\1\24\4\0"+
    "\2\24\2\0\10\24\1\145\15\24\25\0\1\24\4\0"+
    "\2\24\2\0\10\24\1\146\15\24\25\0\1\24\4\0"+
    "\2\24\2\0\17\24\1\147\6\24\25\0\1\24\4\0"+
    "\2\24\2\0\2\24\1\150\23\24\25\0\1\24\4\0"+
    "\2\24\2\0\6\24\1\71\17\24\25\0\1\24\4\0"+
    "\2\24\2\0\13\24\1\151\12\24\25\0\1\24\4\0"+
    "\2\24\2\0\1\147\25\24\25\0\1\24\4\0\2\24"+
    "\2\0\14\24\1\152\11\24\25\0\1\24\4\0\2\24"+
    "\2\0\2\24\1\71\23\24\25\0\1\24\4\0\2\24"+
    "\2\0\14\24\1\71\11\24\25\0\1\24\4\0\2\24"+
    "\2\0\7\24\1\71\16\24\3\0\2\153\3\0\15\153"+
    "\1\154\4\153\2\154\2\153\26\154\3\153\22\0\1\24"+
    "\4\0\2\24\2\0\22\24\1\114\3\24\53\0\1\155"+
    "\35\0\1\24\4\0\2\24\2\0\15\24\1\156\10\24"+
    "\60\0\1\157\30\0\1\24\4\0\2\24\2\0\22\24"+
    "\1\160\3\24\57\0\1\161\31\0\1\24\4\0\2\24"+
    "\2\0\21\24\1\162\4\24\3\0\2\163\3\0\61\163"+
    "\3\0\15\163\1\164\4\163\2\164\2\163\26\164\3\163"+
    "\51\0\1\165\34\0\1\24\4\0\2\24\2\0\16\24"+
    "\1\166\7\24\55\0\1\167\33\0\1\24\4\0\2\24"+
    "\2\0\17\24\1\170\6\24\46\0\1\171\42\0\1\24"+
    "\4\0\2\24\2\0\10\24\1\172\15\24\52\0\1\173"+
    "\36\0\1\24\4\0\2\24\2\0\14\24\1\174\11\24"+
    "\57\0\1\175\31\0\1\24\4\0\2\24\2\0\21\24"+
    "\1\176\4\24\50\0\1\177\40\0\1\24\4\0\2\24"+
    "\2\0\12\24\1\147\13\24\52\0\1\200\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5408];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\1\11\3\1\3\11\2\1\2\11"+
    "\4\1\2\11\13\1\1\11\1\1\2\11\1\0\1\1"+
    "\1\0\1\1\2\0\25\1\1\11\2\0\21\1\2\11"+
    "\23\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\3\1\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[128];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;
    public int countLine = 1;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token.Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("BAD ERROR"); return Token.Tokens.TK_ERROR;
            }
            // fall through
          case 24: break;
          case 2:
            { /*Ignore*/
            }
            // fall through
          case 25: break;
          case 3:
            { lexeme = yytext(); return Token.Tokens.TK_OP_MULT;
            }
            // fall through
          case 26: break;
          case 4:
            { lexeme = yytext(); return Token.Tokens.TK_OPEN_PAR;
            }
            // fall through
          case 27: break;
          case 5:
            { lexeme = yytext(); return Token.Tokens.TK_CLOSE_PAR;
            }
            // fall through
          case 28: break;
          case 6:
            { lexeme = yytext(); return Token.Tokens.TK_ADD_ARIT;
            }
            // fall through
          case 29: break;
          case 7:
            { lexeme = yytext(); return Token.Tokens.TK_COMMA;
            }
            // fall through
          case 30: break;
          case 8:
            { lexeme=yytext(); return Token.Tokens.TK_NUMBER;
            }
            // fall through
          case 31: break;
          case 9:
            { lexeme = yytext(); return Token.Tokens.TK_TWO_POINTER;
            }
            // fall through
          case 32: break;
          case 10:
            { lexeme = yytext(); return Token.Tokens.TK_END_LINE;
            }
            // fall through
          case 33: break;
          case 11:
            { lexeme = yytext(); return Token.Tokens.TK_OP_REL;
            }
            // fall through
          case 34: break;
          case 12:
            { lexeme = yytext(); return Token.Tokens.TK_OP_ATR;
            }
            // fall through
          case 35: break;
          case 13:
            { lexeme=yytext(); return Token.Tokens.TK_IDENTIFIER;
            }
            // fall through
          case 36: break;
          case 14:
            { lexeme = yytext(); return Token.Tokens.TK_OPEN_ARRAY;
            }
            // fall through
          case 37: break;
          case 15:
            { lexeme = yytext(); return Token.Tokens.TK_CLOSE_ARRAY;
            }
            // fall through
          case 38: break;
          case 16:
            { lexeme = yytext(); return Token.Tokens.TK_OPEN_KEY;
            }
            // fall through
          case 39: break;
          case 17:
            { lexeme = yytext(); return Token.Tokens.TK_CLOSE_KEY;
            }
            // fall through
          case 40: break;
          case 18:
            { lexeme = yytext(); return Token.Tokens.TK_CONST_BOOLEAN;
            }
            // fall through
          case 41: break;
          case 19:
            { /* DO NOTHING */
            }
            // fall through
          case 42: break;
          case 20:
            { lexeme = yytext(); return Token.Tokens.TK_NUMBER_FLOAT;
            }
            // fall through
          case 43: break;
          case 21:
            { lexeme = yytext(); return Token.Tokens.TK_RESERVATION;
            }
            // fall through
          case 44: break;
          case 22:
            { lexeme = yytext(); return Token.Tokens.TK_ADD_LOGIC;
            }
            // fall through
          case 45: break;
          case 23:
            { lexeme = yytext(); System.out.println(lexeme); return Token.Tokens.TK_CONST_BOOLEAN;
            }
            // fall through
          case 46: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
