import java.util.Arrays;
class BubbleSort {
  public static void main(String[] args) {
    int a[] = {12, 43, 23, 43, 10, 44, 1};
    sort(a, a.length);
    System.out.println(Arrays.toString(a));
  }

  static void sort(int[] a, int n) {
    if (n == 1) {
      return;
    }
    for (int i = 0; i < n - 1; i++) {
      if (a[i] > a[i+1]) {
        int temp = a[i];
        a[i] = a[i+1];
        a[i+1] = temp;
      }
    }
    sort(a, n-1);
  }


}