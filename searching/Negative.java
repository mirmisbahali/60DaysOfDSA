class Negative {
  public static void main(String args[]) {
    int[][] arr = {
      {3,2},
      {1,0}
    };

    System.out.println(negative(arr));

  }

  static int negative(int[][] arr) {
    int n = 0;
    for (int i = 0; i < arr.length; i++) {
      n += search(arr[i]);
    }
    return n;
  }

  static int search(int[] arr) {
    int l = 0, h = arr.length;
    while (l < h)
    {
      int mid = l + (h-l) / 2;
      if (arr[mid] < 0) h = mid;
      else l = mid + 1;
    }
    return arr.length-h;
  }
}