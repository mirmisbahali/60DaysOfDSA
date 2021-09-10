import java.util.*;
class Anagram {
  public static void main(String args[]) {
    String s = "asdf123";
    String t = "a2sd1f3";
    System.out.println(IsAnagram(s, t));
  }

  static boolean IsAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    
    int n = s.length();
    
    char[] sCharArray = s.toCharArray();
    char[] tCharArray = t.toCharArray();
    Arrays.sort(sCharArray);
    Arrays.sort(tCharArray);
    


    int i = 0, j = 0;
    while (i < n && j < n) {
      if (sCharArray[i] != tCharArray[j]) return false;
      else {
        i++;
        j++;
      }
    }

    return true;
  
  }

}