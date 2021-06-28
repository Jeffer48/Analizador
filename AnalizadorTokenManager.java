/* Generated By:JavaCC: Do not edit this line. AnalizadorTokenManager.java */
import java.util.Hashtable;

/** Token Manager. */
public class AnalizadorTokenManager implements AnalizadorConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 40:
         return jjStopAtPos(0, 22);
      case 41:
         return jjStopAtPos(0, 23);
      case 42:
         return jjStopAtPos(0, 35);
      case 43:
         return jjStopAtPos(0, 33);
      case 44:
         return jjStopAtPos(0, 21);
      case 45:
         return jjStopAtPos(0, 34);
      case 47:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x120L);
      case 59:
         return jjStopAtPos(0, 20);
      case 60:
         jjmatchedKind = 37;
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 61:
         jjmatchedKind = 19;
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 62:
         jjmatchedKind = 39;
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 91:
         return jjStopAtPos(0, 24);
      case 93:
         return jjStopAtPos(0, 25);
      case 123:
         return jjStopAtPos(0, 28);
      case 125:
         return jjStopAtPos(0, 29);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         break;
      case 47:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      case 61:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 38;
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
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                     jjCheckNAddStates(0, 4);
                  }
                  else if (curChar == 46)
                     jjCheckNAdd(14);
                  break;
               case 13:
                  if (curChar == 46)
                     jjCheckNAdd(14);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(14);
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAddStates(0, 4);
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(31, 32);
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 34:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(34);
                  break;
               case 35:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(35, 36);
                  break;
               case 36:
                  if (curChar == 46)
                     jjCheckNAdd(37);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(37);
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
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     jjCheckNAdd(16);
                  }
                  if (curChar == 114)
                     jjAddStates(5, 6);
                  else if (curChar == 105)
                     jjAddStates(7, 8);
                  else if (curChar == 118)
                     jjstateSet[jjnewStateCnt++] = 10;
                  else if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 5;
                  else if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 2:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if (curChar == 101 && kind > 12)
                     kind = 12;
                  break;
               case 4:
                  if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 6:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if (curChar == 101 && kind > 13)
                     kind = 13;
                  break;
               case 9:
                  if (curChar == 118)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 11:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 12:
                  if (curChar == 100 && kind > 14)
                     kind = 14;
                  break;
               case 15:
               case 16:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAdd(16);
                  break;
               case 17:
                  if (curChar == 105)
                     jjAddStates(7, 8);
                  break;
               case 18:
                  if (curChar == 102 && kind > 11)
                     kind = 11;
                  break;
               case 19:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 20:
                  if (curChar == 116 && kind > 16)
                     kind = 16;
                  break;
               case 21:
                  if (curChar == 114)
                     jjAddStates(5, 6);
                  break;
               case 22:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 24:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 25:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 26:
                  if (curChar == 110 && kind > 15)
                     kind = 15;
                  break;
               case 27:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 28:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 29:
                  if (curChar == 108 && kind > 17)
                     kind = 17;
                  break;
               case 32:
               case 33:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(33);
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
      if ((i = jjnewStateCnt) == (startsAt = 38 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x40L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      default :
         return 2;
   }
   return 2;
}
static private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 9);
      default :
         return 1;
   }
}
static final int[] jjnextStates = {
   31, 32, 34, 35, 36, 22, 27, 18, 19, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, "\41\75", "\75", "\73", "\54", "\50", "\51", "\133", 
"\135", null, null, "\173", "\175", null, null, null, "\53", "\55", "\52", "\57", 
"\74", "\74\75", "\76", "\76\75", "\75\75", null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "DentroComentario",
   "DentroComentario2",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, 1, 0, -1, 2, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3fffffff801L, 
};
static final long[] jjtoSkip = {
   0x4000000037eL, 
};
static final long[] jjtoSpecial = {
   0x40000000000L, 
};
static final long[] jjtoMore = {
   0x480L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[38];
static private final int[] jjstateSet = new int[76];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public AnalizadorTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public AnalizadorTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 38; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 3 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

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

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         if (jjmatchedPos == 0 && jjmatchedKind > 42)
         {
            jjmatchedKind = 42;
         }
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 7)
         {
            jjmatchedKind = 7;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 10)
         {
            jjmatchedKind = 10;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
           TokenLexicalActions(matchedToken);
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
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
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 42 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                     System.out.println("Encontre un simbolo no valido, en la linea:" + matchedToken.beginLine);
         break;
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 11 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                        System.out.println("Encontre un if en la linea: " + matchedToken.beginLine);
         break;
      case 12 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                    System.out.println("Encontre un else en la linea: " + matchedToken.beginLine);
         break;
      case 13 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                          System.out.println("Encontre un while en la linea: " + matchedToken.beginLine);
         break;
      case 14 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                    System.out.println("Encontre un void en la linea: " + matchedToken.beginLine);
         break;
      case 15 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                System.out.println("Encontre un return en la linea: " + matchedToken.beginLine);
         break;
      case 16 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                              System.out.println("Encontre un int en la linea: " + matchedToken.beginLine);
         break;
      case 17 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                    System.out.println("Encontre un main en la linea: " + matchedToken.beginLine);
         break;
      case 18 :
        image.append(jjstrLiteralImages[18]);
        lengthOfMatch = jjstrLiteralImages[18].length();
               System.out.println("Encontre operador desigual"+ matchedToken.beginLine);
         break;
      case 19 :
        image.append(jjstrLiteralImages[19]);
        lengthOfMatch = jjstrLiteralImages[19].length();
               System.out.println("Encontre operador asignativo"+ matchedToken.beginLine);
         break;
      case 20 :
        image.append(jjstrLiteralImages[20]);
        lengthOfMatch = jjstrLiteralImages[20].length();
                System.out.println("Encontre un punto y coma"+ matchedToken.beginLine);
         break;
      case 21 :
        image.append(jjstrLiteralImages[21]);
        lengthOfMatch = jjstrLiteralImages[21].length();
               System.out.println("Encontre una coma"+ matchedToken.beginLine);
         break;
      case 22 :
        image.append(jjstrLiteralImages[22]);
        lengthOfMatch = jjstrLiteralImages[22].length();
              System.out.println("Encontre un parentesis izquierdo"+ matchedToken.beginLine);
         break;
      case 23 :
        image.append(jjstrLiteralImages[23]);
        lengthOfMatch = jjstrLiteralImages[23].length();
               System.out.println("Encontre un parentesis derecho"+ matchedToken.beginLine);
         break;
      case 24 :
        image.append(jjstrLiteralImages[24]);
        lengthOfMatch = jjstrLiteralImages[24].length();
              System.out.println("Encontre un corchete izquierdo"+ matchedToken.beginLine);
         break;
      case 25 :
        image.append(jjstrLiteralImages[25]);
        lengthOfMatch = jjstrLiteralImages[25].length();
               System.out.println("Encontre un corchete derecho"+ matchedToken.beginLine);
         break;
      case 26 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                                    System.out.println("Error lexico ID invalido en la linea: "+ matchedToken.beginLine);
         break;
      case 27 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                  System.out.println("Error lexico numero decimal invalido en la linea: "+ matchedToken.beginLine);
         break;
      case 28 :
        image.append(jjstrLiteralImages[28]);
        lengthOfMatch = jjstrLiteralImages[28].length();
               System.out.println("Encontre una llave izquierda"+ matchedToken.beginLine);
         break;
      case 29 :
        image.append(jjstrLiteralImages[29]);
        lengthOfMatch = jjstrLiteralImages[29].length();
                System.out.println("Encontre una llave derecha"+ matchedToken.beginLine);
         break;
      case 30 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                System.out.println("Encontre un ID "+image +" en la linea: "+ matchedToken.beginLine);
         break;
      case 31 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                              System.out.println("Encontre un numero "+image +" en la linea: "+ matchedToken.beginLine);
         break;
      case 32 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                         System.out.println("Encontre un numero decimal "+image +" en la linea: "+ matchedToken.beginLine);
         break;
      case 33 :
        image.append(jjstrLiteralImages[33]);
        lengthOfMatch = jjstrLiteralImages[33].length();
                   System.out.println("Encontre un operador suma, en la linea:" + matchedToken.beginLine);
         break;
      case 34 :
        image.append(jjstrLiteralImages[34]);
        lengthOfMatch = jjstrLiteralImages[34].length();
                    System.out.println("Encontre un operador resta, en la linea:" + matchedToken.beginLine);
         break;
      case 35 :
        image.append(jjstrLiteralImages[35]);
        lengthOfMatch = jjstrLiteralImages[35].length();
                         System.out.println("Encontre un operador de multiplicacion, en la linea:" + matchedToken.beginLine);
         break;
      case 36 :
        image.append(jjstrLiteralImages[36]);
        lengthOfMatch = jjstrLiteralImages[36].length();
                  System.out.println("Encontre un operador division, en la linea:" + matchedToken.beginLine);
         break;
      case 37 :
        image.append(jjstrLiteralImages[37]);
        lengthOfMatch = jjstrLiteralImages[37].length();
                    System.out.println("Encontre un operador menor que, en la linea:" + matchedToken.beginLine);
         break;
      case 38 :
        image.append(jjstrLiteralImages[38]);
        lengthOfMatch = jjstrLiteralImages[38].length();
                          System.out.println("Encontre un operador menor igual, en la linea:" + matchedToken.beginLine);
         break;
      case 39 :
        image.append(jjstrLiteralImages[39]);
        lengthOfMatch = jjstrLiteralImages[39].length();
                    System.out.println("Encontre un operador mayor que, en la linea:" + matchedToken.beginLine);
         break;
      case 40 :
        image.append(jjstrLiteralImages[40]);
        lengthOfMatch = jjstrLiteralImages[40].length();
                          System.out.println("Encontre un operador mayor igual, en la linea:" + matchedToken.beginLine);
         break;
      case 41 :
        image.append(jjstrLiteralImages[41]);
        lengthOfMatch = jjstrLiteralImages[41].length();
                          System.out.println("Encontre un operador igual igual, en la linea:" + matchedToken.beginLine);
         break;
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

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
