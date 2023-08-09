package UnusualLexOrder;

import java.util.Arrays;

public class Solution {
    static String[] unusualLexOrder(String[] words) {
      String[] wordsSorted = words.clone();
      
      Arrays.sort(wordsSorted, (String a, String b) -> {
        String aRev = new StringBuilder(a).reverse().toString().toLowerCase();
        String bRev = new StringBuilder(b).reverse().toString().toLowerCase();
        int res = aRev.compareTo(bRev);
        return res;
      });
  
      return wordsSorted;
      /*
      int res = 100;
      boolean c1 = Cond1StartsWith(aRev, bRev);
      boolean c2 = Cond2DiffInKPlusOneChar(aRev, bRev);
      boolean c3 = Cond3Len1(aRev, bRev);
      
      if (c1 || c2 || c3) {
        res = -1;
      } else if (!c1 && !c2 && !c3) {
        res = 1;
      } else {
        res = 0;
      }
      */
      //
      //System.out.println(aRev + " " + bRev + " " + res + " // " + c1 + " " + c2 +" " + c3);
      //
    }
  
    static boolean Cond1StartsWith(String a, String b) {
      // a is a suffix of b (in common sense, i.e. b ends with a substring equal to a);
      if (b.endsWith(a) && a.length() < b.length()) {
        return true;
      }
      return false;
    }
  
    static boolean Cond2DiffInKPlusOneChar(String a, String b) {
      // their last k characters are the same but the (k + 1)th character from the right in string a is smaller
      // than the same character in string b.
      int minLen = Math.min(a.length(), b.length());
      boolean hasEqualStart = false;
      
      for (int i=0; i < minLen; i++) {
        if (a.charAt(i) == b.charAt(i)) {
          hasEqualStart = true;
        }
        if ((a.charAt(i) < b.charAt(i)) && (hasEqualStart)) { //
          return true;
        }
      }
      return false;
    }
  
    static boolean Cond3Len1(String a, String b) {
      int minLen = Math.min(a.length(), b.length());
  
      for (int i=0; i < minLen; i++) {
        if ((a.charAt(i) < b.charAt(i))) {
          return true;
        }
      }
      return false;
    }
  
  }
