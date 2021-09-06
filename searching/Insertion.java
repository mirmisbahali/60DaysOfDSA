import java.util.HashSet;
import java.util.Arrays;
class Insertion {
  public static void main(String args[]) {
    int[] nums1 = {4,9,5};
    int[] nums2 = {9,4,9,8,4};
    int[] ans = insertion(nums1, nums2);
    System.out.println(Arrays.toString(ans));
  }

  static int[] insertion(int[] nums1, int[] nums2) {
    HashSet<Integer> ins = new HashSet<Integer>();

    if (nums1.length > nums2.length) {
      for (int i = 0; i < nums2.length; i++) {
        if (search(nums1, nums2[i])) ins.add(nums2[i]);
      }
    } else {
      for (int i = 0; i < nums1.length; i++) {
        if (search(nums2, nums1[i])) ins.add(nums1[i]);
      }
    }
    int[] arr = new int[ins.size()];
    int i = 0;
    for (int x : ins) {
      arr[i] = x;
      i++;
    }

    return arr;

  }

  static boolean search(int[] arr, int el) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == el) return true;
    }
    return false;
  }

}