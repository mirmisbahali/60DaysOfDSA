class PowerOfThree {
  public static void main(String[] args) {
    System.out.println(isPowerOfThree(9));
  }

  static boolean isPowerOfThree(int n) {
    if (n <= 0) {
      return false;
    } else if (n == 1) {
      return true;
    } else if (n % 3 != 0) {
      return false;
    }
    return isPowerOfThree(n/3);
  }
}