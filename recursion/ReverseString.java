class ReverseString {
  public static void main(String args[]) {
    char[] s = {"h","e","l","l","o"};
    reverse(s, 0);
  }

  static void reverse(char[] s, int n) {
    if (n == s.length-1) System.out.print(s[n] + " ");
    
    System.out.print(reverse(s, n+1) + " ");
  }

}