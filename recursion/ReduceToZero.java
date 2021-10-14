class ReduceToZero {
  static int count = 0;
  public static void main(String[] args) {
    int res = numberOfSteps(8);
    System.out.println(res);
  }

  static int numberOfSteps(int n) {
    count++;
    if (n <= 0) {
      return count-1;
    } else if (n % 2 == 0) {
      return numberOfSteps(n/2);
    }
    return numberOfSteps(n-1);
  }

}