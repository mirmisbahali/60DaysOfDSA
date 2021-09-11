import java.util.*;

class RepeatedStringMatch {
  public static void main(String args[]) {
    String a = "abc";
    String b = "xyz";
    System.out.println(func(a,b));
  }

  static int func(String a, String b) {
    if (!b.contains(a)) return -1;
    StringBuilder str = new StringBuilder();
    int n = 0;
    str.append(a);
    while (b.contains(str)) {
      n++;
      str.append(a);
    }
    
    return n;
  }

}