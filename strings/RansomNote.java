import java.util.*;

class RansomNote {
  public static void main(String args[]) {
    String a = "aa";
    String b = "aab";
    System.out.println(func(a,b));
  }

  static boolean func(String a, String b) {
    char[] aChar = a.toCharArray();
    char[] bChar = b.toCharArray();

    Arrays.sort(aChar);
    Arrays.sort(bChar);

    String ransom = new String(aChar);
    String magazine = new String (bChar);
    return magazine.contains(ransom);
    
  }
}