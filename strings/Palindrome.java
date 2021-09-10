class Palindrome {
  public static void main(String args[]) {
    String s = "1234car";
    System.out.println(IsPalindrome(s));
  }
  static boolean IsPalindrome(String s) {
    s = s.toLowerCase();
    s = s.replaceAll("[^a-zA-Z0-9]+", "");
    System.out.println(s);
    int start=0, end = s.length() - 1;
    while (start < end) {
      if (s.charAt(start) != s.charAt(end)) return false;
      else {
        start++;
        end--;
      }

    }
    return true;
  }
}