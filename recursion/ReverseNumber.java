class ReverseNumber {
  public static void main(String[] args) {
    System.out.println(Integer.parseInt(reverse(1234)));
  }
  static String reverse(int n) {
    if (n%10 == 0) {
      return "";
    }
    return String.valueOf(n%10) + reverse(n/10);
  }
}