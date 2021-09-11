import java.util.*;
class ZigZag {
  public static void main(String args[]) {
    String s = "PAYPALISHIRING";
    int n = 3;
    System.out.println(zigzag(s,n));
  }

  static char[] zigzag(String s, int n) {
    char[] ans = new char[s.length()];
    int row = 0, pos=0;
    // while (row < n) {
    //   pos = row;
    //   System.out.println(row);
    //   if (pos < s.length()) {
    //     ans[pos] = s.charAt(pos);
    //     pos += n%2 + n;
    //   } else row++;
    // }
    int i = 0;
    while (row < n) {
      pos = row;
      while (pos < s.length()) {
        ans[i] = s.charAt(pos);
        pos += (n-row)%2 + n;
        i++;
      }
      row++;
    }

  return ans;

  }


}