/* Generated By:JJTree&JavaCC: Do not edit this line. ExpressionParserTokenManager.java */
package Aritmetica;

/** Token Manager. */
public class ExpressionParserTokenManager implements ExpressionParserConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7800L) != 0L)
         {
            jjmatchedKind = 28;
            return 25;
         }
         if ((active0 & 0xcc00000L) != 0L)
            return 4;
         if ((active0 & 0x20000L) != 0L)
            return 1;
         return -1;
      case 1:
         if ((active0 & 0x7800L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 1;
            return 25;
         }
         return -1;
      case 2:
         if ((active0 & 0x7000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 2;
            return 25;
         }
         if ((active0 & 0x800L) != 0L)
            return 25;
         return -1;
      case 3:
         if ((active0 & 0x5000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 3;
            return 25;
         }
         if ((active0 & 0x2000L) != 0L)
            return 25;
         return -1;
      case 4:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 4;
            return 25;
         }
         if ((active0 & 0x1000L) != 0L)
            return 25;
         return -1;
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
      case 40:
         return jjStopAtPos(0, 15);
      case 41:
         return jjStopAtPos(0, 16);
      case 42:
         return jjStopAtPos(0, 24);
      case 43:
         jjmatchedKind = 23;
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 44:
         return jjStopAtPos(0, 18);
      case 45:
         jjmatchedKind = 22;
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 46:
         return jjStartNfaWithStates_0(0, 17, 1);
      case 47:
         return jjStopAtPos(0, 25);
      case 58:
         return jjStopAtPos(0, 19);
      case 59:
         return jjStopAtPos(0, 20);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x2000L);
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
      case 43:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(1, 26);
         break;
      case 45:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         break;
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x6000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 116:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(2, 11, 25);
         break;
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 103:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 116:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(5, 14, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x200002L, 0x0L, 0xf00000000L, 0x1200000000000000L
};
static final long[] jjbitVec2 = {
   0x10000000000000L, 0x4000L, 0x100000000000L, 0x0L
};
static final long[] jjbitVec3 = {
   0x1L, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec4 = {
   0x0L, 0x0L, 0x420040000000000L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec5 = {
   0xffffcffffffffL, 0xffffffffffff0000L, 0xf9ff3fffffffffffL, 0x401f00030003L
};
static final long[] jjbitVec6 = {
   0x0L, 0x400000000000000L, 0xfffffffbffffd740L, 0xffffffcff7fffL
};
static final long[] jjbitVec7 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xfffffffffffff003L, 0x33fffffffff199fL
};
static final long[] jjbitVec8 = {
   0xfffe000000000000L, 0xfffffffe027fffffL, 0xffL, 0x707ffffff0000L
};
static final long[] jjbitVec9 = {
   0x7fffffe00000000L, 0xfffe0000000007ffL, 0xffffffffffffffffL, 0x1c000060002fffffL
};
static final long[] jjbitVec10 = {
   0x1ffffffd0000L, 0x0L, 0x3fffffffffL, 0x0L
};
static final long[] jjbitVec11 = {
   0x23ffffffffffffe0L, 0x3ff010000L, 0x3c5fdfffff99fe0L, 0x30003b0000000L
};
static final long[] jjbitVec12 = {
   0x36dfdfffff987e0L, 0x1c00005e000000L, 0x23edfdfffffbafe0L, 0x100010000L
};
static final long[] jjbitVec13 = {
   0x23cdfdfffff99fe0L, 0x3b0000000L, 0x3bfc718d63dc7e0L, 0x0L
};
static final long[] jjbitVec14 = {
   0x3effdfffffddfe0L, 0x300000000L, 0x3effdfffffddfe0L, 0x340000000L
};
static final long[] jjbitVec15 = {
   0x3fffdfffffddfe0L, 0x300000000L, 0x2ffbfffffc7fffe0L, 0x7fL
};
static final long[] jjbitVec16 = {
   0xdfffffffffffeL, 0x7fL, 0xe00decaefef02596L, 0x3000005fL
};
static final long[] jjbitVec17 = {
   0x1L, 0x7ffffffffffL, 0xf00L, 0x0L
};
static final long[] jjbitVec18 = {
   0x6fbffffffffL, 0x3f0000L, 0xffffffff00000000L, 0x7fffffffff003fL
};
static final long[] jjbitVec19 = {
   0xffffffffffffffffL, 0xffffffff83ffffffL, 0xffffff07ffffffffL, 0x3ffffffffffffffL
};
static final long[] jjbitVec20 = {
   0xffffffffffffff7fL, 0xffffffff3d7f3d7fL, 0x7f3d7fffffff3d7fL, 0xffff7fffff7f7f3dL
};
static final long[] jjbitVec21 = {
   0xffffffff7f3d7fffL, 0x7ffff7fL, 0xffffffff00000000L, 0x1fffffffffffffL
};
static final long[] jjbitVec22 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec23 = {
   0xffffffffffffffffL, 0x7fffffffffffffL, 0xffffffff07fffffeL, 0x7ffffffffffL
};
static final long[] jjbitVec24 = {
   0x0L, 0x0L, 0xfffffffffffffL, 0x0L
};
static final long[] jjbitVec25 = {
   0xffffffff00000000L, 0xffffffffffffffL, 0x1ffffffffffL, 0x0L
};
static final long[] jjbitVec26 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffff0fffffffL, 0x3ffffffffffffffL
};
static final long[] jjbitVec27 = {
   0xffffffff3f3fffffL, 0x3fffffffaaff3f3fL, 0x5fdfffffffffffffL, 0x1fdc1fff0fcf1fdcL
};
static final long[] jjbitVec28 = {
   0x0L, 0x8000000000000000L, 0x0L, 0x0L
};
static final long[] jjbitVec29 = {
   0x3fbbd503e2ffc84L, 0xffffffff00000000L, 0xfL, 0x0L
};
static final long[] jjbitVec30 = {
   0x73e03fe000000e0L, 0xfffffffffffffffeL, 0xfffffffe601fffffL, 0x77ffffffffffffffL
};
static final long[] jjbitVec31 = {
   0xfffe1fffffffffe0L, 0xffffffffffffffffL, 0xffffff00007fffL, 0x0L
};
static final long[] jjbitVec32 = {
   0x0L, 0x0L, 0x20000000000000L, 0x0L
};
static final long[] jjbitVec33 = {
   0x0L, 0x0L, 0x2000000000L, 0x0L
};
static final long[] jjbitVec34 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x1fffL, 0x0L
};
static final long[] jjbitVec35 = {
   0x0L, 0x0L, 0x800000000L, 0x0L
};
static final long[] jjbitVec36 = {
   0x3fffffffffffL, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec37 = {
   0x5f7ffdffa0f8007fL, 0xffffffffffffffdbL, 0x3ffffffffffffL, 0xfffffffffff80000L
};
static final long[] jjbitVec38 = {
   0x3fffffffffffffffL, 0xffffffffffff0000L, 0xfffffffffffcffffL, 0xfff0000000000ffL
};
static final long[] jjbitVec39 = {
   0x0L, 0xffd7000000000000L, 0xffffffffffffffffL, 0x1fffffffffffffffL
};
static final long[] jjbitVec40 = {
   0x7fffffe00000000L, 0xffffffc007fffffeL, 0x7fffffffffffffffL, 0x1cfcfcfcL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 25;
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
                     if (kind > 5)
                        kind = 5;
                     jjCheckNAddStates(0, 9);
                  }
                  else if (curChar == 45)
                     jjCheckNAdd(4);
                  else if (curChar == 43)
                     jjCheckNAdd(4);
                  else if (curChar == 61)
                  {
                     if (kind > 21)
                        kind = 21;
                  }
                  else if (curChar == 46)
                     jjCheckNAdd(1);
                  break;
               case 25:
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAddTwoStates(7, 8);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
               case 4:
                  if (curChar == 61 && kind > 21)
                     kind = 21;
                  break;
               case 5:
                  if (curChar == 43)
                     jjCheckNAdd(4);
                  break;
               case 6:
                  if (curChar == 45)
                     jjCheckNAdd(4);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddStates(0, 9);
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddStates(10, 15);
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(21, 22);
                  break;
               case 22:
                  if (curChar == 46)
                     jjCheckNAdd(23);
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAddTwoStates(23, 2);
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(24, 2);
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
                     if (kind > 28)
                        kind = 28;
                     jjCheckNAddTwoStates(7, 8);
                  }
                  else if (curChar == 95)
                  {
                     if (kind > 28)
                        kind = 28;
                     jjCheckNAddTwoStates(7, 8);
                  }
                  break;
               case 25:
               case 7:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAddTwoStates(7, 8);
                  break;
               case 2:
                  if ((0x205000002050L & l) != 0L && kind > 9)
                     kind = 9;
                  break;
               case 9:
                  if (curChar != 95)
                     break;
                  kind = 28;
                  jjCheckNAddTwoStates(7, 8);
                  break;
               case 12:
                  if ((0x20100000201000L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 13:
                  if (curChar == 85)
                     jjCheckNAddTwoStates(14, 15);
                  break;
               case 14:
                  if (curChar == 76 && kind > 5)
                     kind = 5;
                  break;
               case 15:
                  if (curChar == 108 && kind > 5)
                     kind = 5;
                  break;
               case 16:
                  if (curChar == 117)
                     jjCheckNAddTwoStates(14, 15);
                  break;
               case 17:
                  if (curChar == 76)
                     jjCheckNAddTwoStates(18, 19);
                  break;
               case 18:
                  if (curChar == 85 && kind > 5)
                     kind = 5;
                  break;
               case 19:
                  if (curChar == 117 && kind > 5)
                     kind = 5;
                  break;
               case 20:
                  if (curChar == 108)
                     jjCheckNAddTwoStates(18, 19);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 7:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAddTwoStates(7, 8);
                  break;
               case 25:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAddTwoStates(7, 8);
                  break;
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
      if ((i = jjnewStateCnt) == (startsAt = 25 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   11, 12, 21, 22, 24, 2, 13, 16, 17, 20, 11, 12, 13, 16, 17, 20, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec4[i2] & l2) != 0L);
      case 2:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 3:
         return ((jjbitVec6[i2] & l2) != 0L);
      case 4:
         return ((jjbitVec7[i2] & l2) != 0L);
      case 5:
         return ((jjbitVec8[i2] & l2) != 0L);
      case 6:
         return ((jjbitVec9[i2] & l2) != 0L);
      case 7:
         return ((jjbitVec10[i2] & l2) != 0L);
      case 9:
         return ((jjbitVec11[i2] & l2) != 0L);
      case 10:
         return ((jjbitVec12[i2] & l2) != 0L);
      case 11:
         return ((jjbitVec13[i2] & l2) != 0L);
      case 12:
         return ((jjbitVec14[i2] & l2) != 0L);
      case 13:
         return ((jjbitVec15[i2] & l2) != 0L);
      case 14:
         return ((jjbitVec16[i2] & l2) != 0L);
      case 15:
         return ((jjbitVec17[i2] & l2) != 0L);
      case 16:
         return ((jjbitVec18[i2] & l2) != 0L);
      case 17:
         return ((jjbitVec19[i2] & l2) != 0L);
      case 18:
         return ((jjbitVec20[i2] & l2) != 0L);
      case 19:
         return ((jjbitVec21[i2] & l2) != 0L);
      case 20:
         return ((jjbitVec22[i2] & l2) != 0L);
      case 22:
         return ((jjbitVec23[i2] & l2) != 0L);
      case 23:
         return ((jjbitVec24[i2] & l2) != 0L);
      case 24:
         return ((jjbitVec25[i2] & l2) != 0L);
      case 30:
         return ((jjbitVec26[i2] & l2) != 0L);
      case 31:
         return ((jjbitVec27[i2] & l2) != 0L);
      case 32:
         return ((jjbitVec28[i2] & l2) != 0L);
      case 33:
         return ((jjbitVec29[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec30[i2] & l2) != 0L);
      case 49:
         return ((jjbitVec31[i2] & l2) != 0L);
      case 77:
         return ((jjbitVec32[i2] & l2) != 0L);
      case 159:
         return ((jjbitVec33[i2] & l2) != 0L);
      case 164:
         return ((jjbitVec34[i2] & l2) != 0L);
      case 215:
         return ((jjbitVec35[i2] & l2) != 0L);
      case 250:
         return ((jjbitVec36[i2] & l2) != 0L);
      case 251:
         return ((jjbitVec37[i2] & l2) != 0L);
      case 253:
         return ((jjbitVec38[i2] & l2) != 0L);
      case 254:
         return ((jjbitVec39[i2] & l2) != 0L);
      case 255:
         return ((jjbitVec40[i2] & l2) != 0L);
      default :
         if ((jjbitVec2[i1] & l1) != 0L)
            if ((jjbitVec3[i2] & l2) == 0L)
               return false;
            else
            return true;
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, 
"\151\156\164", "\146\154\157\141\164", "\154\157\156\147", "\144\157\165\142\154\145", "\50", 
"\51", "\56", "\54", "\72", "\73", null, "\55", "\53", "\52", "\57", "\53\53", 
"\55\55", null, null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1ffffa21L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[25];
static private final int[] jjstateSet = new int[50];
static protected char curChar;
/** Constructor. */
public ExpressionParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public ExpressionParserTokenManager(SimpleCharStream stream, int lexState){
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
   for (i = 25; i-- > 0;)
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
   if (lexState >= 1 || lexState < 0)
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
