class Main {
  public static void main(String args[]) {
    problem5(5);
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

  static void problem4(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }

  static void problem5(int n) {
    for (int row = 1; row <= 2*n; row++) {
      int n_col = row > n ? (2*n - row) : row;
      for (int col = 1; col <= n_col; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}