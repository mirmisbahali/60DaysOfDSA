class Double {
  public static void main(String args[]) {
    int[] arr = {-2,0,10,-19,4,6,-8};
    System.out.println(checkIfExist(arr));
  }

  static boolean checkIfExist(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(i + " = " + arr[i]);
      if (arr[i] % 2 == 0) {
        if (search(arr, arr[i], i)) return true;
      }
    }
    return false;
  }

  static boolean search(int[] arr, int num, int index) {
    for (int i = 0; i < arr.length; i++) {
      if (i != index && (arr[i]) == num/2) return true;
    }
    return false;
  }

}