class Main {
  public static void main(String args[]) {
    pattern15(5);
  }

  static void pattern15(int n) {
    for (int row = 1; row <= 2*n; row++) {

      int spaces = row > n ? (row - n) : (n - row);
      int numberOfCols = 2*(n - spaces) - 1;

      for (int i = 0; i < spaces; i++) System.out.print(" ");

      for (int col = 1; col <= numberOfCols; col++) {
        if (col == 1 || col == numberOfCols) System.out.print("*");
        else System.out.print(" ");
      }

      System.out.println();
    }
  }


  static void pattern14(int n) {
    for (int row = 1; row <= n; row++) {
      int spaces = row-1;
      int numberOfCols = 2*(n - row) + 1;
      for (int i = 0; i < spaces; i++) System.out.print(" ");
      for (int i = 1; i <= numberOfCols; i++) {
        if (i == 1 || i == numberOfCols || row == 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  static void pattern13(int n) {
    for (int row = 1; row <= n; row++) {

      int spaces = n - row;
      int numberOfCols = row*2 - 1;

      for (int i = 0; i < spaces; i++) System.out.print(" ");

      for (int i = 1; i <= numberOfCols; i++) {
        if (i == 1 || i == numberOfCols || row == n) System.out.print("*");
        else System.out.print(" ");
      }
      System.out.println();
    }

  }

  static void pattern12(int n) {
    for (int row = 1; row <= 2*n; row++) {
      int spaces = row > n ? (2*n-row) : (row - 1);
      int n_col = row > n ? (2*(n-spaces)) : (2*(n-row) + 1);

      for (int i = 0; i < spaces; i++) System.out.print(" ");

      for (int col = 0; col < n_col; col++) {
        if (col % 2 == 0) System.out.print("*");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }

  static void pattern11(int n) {
    for (int row = 1; row <= n; row++) {
      int spaces = row - 1;
      for (int i = 0; i < spaces; i++) System.out.print(" ");
      for (int col = 0; col < (2*(n-row) + 1); col++) {
        if (col % 2 == 0) System.out.print("*");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }

  static void pattern10(int n) {
    for (int row = 1; row <= n; row++) {
      int spaces = n - row;
      for (int i = 0; i < spaces; i++) System.out.print(" ");
      for (int col = 0; col < (row*2) - 1; col++) {
        if (col % 2 == 0) System.out.print("*");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }

  static void pattern9(int n) {
    for (int row = 1; row <= n; row++) {
      int spaces = row-1;
      int stars = 2*(n - row) + 1;
      for (int i = 0; i < spaces; i++) System.out.print(" ");
      for (int i = 0; i < stars; i++) System.out.print("*");
      System.out.println();
    }
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

  static void pattern7(int n) {
    for (int row = 0; row < n; row++) {
      int spaces = row;
      int stars = n - row;
      for (int i = 0; i < spaces; i++) System.out.print(" ");
      for (int i = 0; i < stars; i++) System.out.print("*");
      System.out.println();
    }
  }

  static void pattern8(int n) {
    for (int row = 1; row <= n; row++) {
      int spaces = n - row;
      int stars = row*2 - 1;
      for (int i = 0; i < spaces; i++) System.out.print(" ");
      for (int i = 0; i < stars; i++) System.out.print("*");
      System.out.println();
    }
  }

}