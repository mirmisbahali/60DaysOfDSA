class Gp {
  public static void main(String[] args) {
    int firstTerm = 3;
    int commonRatio = 2;
    int n = 5;
    System.out.println(n_Gp(firstTerm, commonRatio, n));
  }

  static int n_Gp(int firstTerm, int commonRatio, int n) {
    if (n==1) {
      return firstTerm;
    }
    return commonRatio * n_Gp(firstTerm, commonRatio, n-1);
  }
}