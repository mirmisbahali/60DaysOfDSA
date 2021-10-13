import java.utils.*;

class ReverseString {
  public static void main(String args[]) {
    char[] s = {'h','e','l','l','o'};
    Array.toString(reverse(s, 0, s.length-1));
  }

  public static void reverse(char[] s, int n, int length) {
    if (n == length) {
      s[length - n] = s[n];
    }
    reverse(s, n++, length);
  }

}