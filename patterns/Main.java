class Main {
  public static void main(String args[]) {
    problem3(5);
  }
  static void problem1(int n) {
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void problem2(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void problem3(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 0; col <= n - row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

}