class Fibonacci {
  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      System.out.print(fib(i) + " ");
    }
    System.out.println();
  }

  static int fib(int n) {
    if (n==1 || n==0) {
      return n;
    }
    return fib(n-1) + fib(n-2);

  }
}