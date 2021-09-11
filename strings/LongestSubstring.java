import java.util.*;
class LongestSubstring {
  public static void main(String args[]) {
    String s = "pwwwkews";
    System.out.println(substring(s));
  }

  static int substring(String s) {
    if (s.length() == 0) return 0;

    String sub = "";
    int count = 0;
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (sub.charAt(sub.length() - 1) != c){
        count++;
        sub += String.valueOf(c);
        if (count > max) max = count;
      } else {
        count = 0;
      }
    }
    System.out.println(sub);
    return max+1;

    // HashSet<Character> set = new HashSet<Character>();
    // for (int i = 0; i < s.length();  i++) {
    //   set.add(s.charAt(i));

    // }

    // System.out.println(set);
    // return set.size();
  }
}