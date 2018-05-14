/* LugosiTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. LugosiTokenManager.java */
import java.io.*;

/** Token Manager. */
public class LugosiTokenManager implements LugosiConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1dfe060L) != 0L)
         {
            jjmatchedKind = 26;
            return 15;
         }
         return -1;
      case 1:
         if ((active0 & 0x48000L) != 0L)
            return 15;
         if ((active0 & 0x1db6060L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 1;
            return 15;
         }
         return -1;
      case 2:
         if ((active0 & 0x2040L) != 0L)
            return 15;
         if ((active0 & 0x1db4020L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 2;
            return 15;
         }
         return -1;
      case 3:
         if ((active0 & 0x814020L) != 0L)
            return 15;
         if ((active0 & 0x15a0000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 3;
            return 15;
         }
         return -1;
      case 4:
         if ((active0 & 0x120000L) != 0L)
            return 15;
         if ((active0 & 0x1480000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 4;
            return 15;
         }
         return -1;
      case 5:
         if ((active0 & 0x80000L) != 0L)
            return 15;
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 5;
            return 15;
         }
         return -1;
      case 6:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 6;
            return 15;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 9);
      case 41:
         return jjStopAtPos(0, 10);
      case 44:
         return jjStopAtPos(0, 11);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 59:
         return jjStopAtPos(0, 12);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x1400000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0xa000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 123:
         return jjStopAtPos(0, 7);
      case 125:
         return jjStopAtPos(0, 8);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000060L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 102:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(1, 15, 15);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 111:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(1, 18, 15);
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x900000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x120020L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 114:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(2, 6, 15);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 15);
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 101:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 15);
         else if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(3, 23, 15);
         break;
      case 108:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 15);
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 110:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 15);
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(4, 17, 15);
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      case 116:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 20, 15);
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(5, 24);
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 110:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(5, 19, 15);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(7, 22, 15);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 15;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 15:
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAddTwoStates(9, 10); }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                     { jjCheckNAddTwoStates(12, 13); }
                  }
                  else if ((0x5000ac0000000000L & l) != 0L)
                  {
                     if (kind > 25)
                        kind = 25;
                  }
                  else if (curChar == 33)
                     { jjCheckNAdd(5); }
                  else if (curChar == 61)
                     { jjCheckNAdd(5); }
                  else if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (curChar == 38 && kind > 25)
                     kind = 25;
                  break;
               case 2:
                  if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 5:
                  if (curChar == 61 && kind > 25)
                     kind = 25;
                  break;
               case 6:
                  if (curChar == 61)
                     { jjCheckNAdd(5); }
                  break;
               case 7:
                  if (curChar == 33)
                     { jjCheckNAdd(5); }
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  { jjCheckNAddTwoStates(12, 13); }
                  break;
               case 13:
                  if (curChar == 46)
                     { jjCheckNAdd(14); }
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  { jjCheckNAdd(14); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 15:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 26)
                        kind = 26;
                     { jjCheckNAddTwoStates(9, 10); }
                  }
                  else if (curChar == 95)
                     { jjCheckNAdd(11); }
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 26)
                        kind = 26;
                     { jjCheckNAddTwoStates(9, 10); }
                  }
                  else if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if (curChar == 124 && kind > 25)
                     kind = 25;
                  break;
               case 4:
                  if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 8:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAddTwoStates(9, 10); }
                  break;
               case 9:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAddTwoStates(9, 10); }
                  break;
               case 10:
                  if (curChar == 95)
                     { jjCheckNAdd(11); }
                  break;
               case 11:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAdd(11); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 15 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\155\141\151\156", "\166\141\162", "\173", 
"\175", "\50", "\51", "\54", "\73", "\151\156\164", "\142\157\157\154", "\151\146", 
"\145\154\163\145", "\167\150\151\154\145", "\144\157", "\162\145\164\165\162\156", 
"\160\162\151\156\164", "\72\75", "\146\165\156\143\164\151\157\156", "\164\162\165\145", 
"\146\141\154\163\145\76", null, null, null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {0
};

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public LugosiTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public LugosiTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 15; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[15];
    static private final int[] jjstateSet = new int[2 * 15];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}
