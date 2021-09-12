class Main {
  public static void main(String args[]) {
    pattern6(5);
  }
  static void pattern1(int n) {
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern2(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern3(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 0; col <= n - row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern4(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }

  static void pattern5(int n) {
    for (int row = 1; row <= 2*n; row++) {
      int n_col = row > n ? (2*n - row) : row;
      for (int col = 1; col <= n_col; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern6(int n) {
    for (int row = 1; row <= n; row++) {
      int spaces = n-row;
      int stars = row;
      for (int i = 0; i < spaces; i++) {
        System.out.print(" ");
      }
      for (int i = 0; i < stars; i++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}