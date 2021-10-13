class PowerOfTwo {
  public static void main(String[] args) {
    System.out.println(isPowerOfTwo(48));
  }

  static boolean isPowerOfTwo(int n) {
    if (n > 2) {
      return isPowerOfTwo(n/2);
    } else if (n == 2) {
      return true;
    } 
    return false;
  }
}