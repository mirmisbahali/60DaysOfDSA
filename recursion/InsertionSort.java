import java.util.Arrays;
class InsertionSort {
  public static void main(String[] args) {
    int[] a = {123, 43, 87, 29, 1, 29, 8, 3, 2};
    sort(a, a.length);
    System.out.println(Arrays.toString(a));
  }
  static void sort(int[] a, int n) {
    if (n == 1) {
      return;
    }
    sort(a, n-1);
    int last = a[n-1];
    int j = n-2;
    while (j >= 0 && a[j] > last) {
      a[j+1] = a[j];
      j--;
    }
    a[j+1] = last;
  }
}