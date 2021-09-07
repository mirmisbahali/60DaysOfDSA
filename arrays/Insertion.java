import java.util.Arrays;
import java.util.ArrayList;

class Insertion {
  public static void main(String args[]) {
    int[] nums1 = {1,2};
    int[] nums2 = {1, 1};
    System.out.println(Arrays.toString(insertion(nums1, nums2)));
  }

  static int[] insertion(int[] nums1, int[] nums2) {
    if (nums1.length > nums2.length) return search(nums1, nums2);
    else return search(nums2, nums1);
  }

  static int[] search(int[] nums1, int[] nums2) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int j = 0, i=0;
    if (nums1.length == nums2.length) {
      while (i < nums1.length) {
        if (nums1[i++] == nums2[j++]) list.add(nums1[i-1]);
        if(list.size() == nums1.length)
      }
    }
    while (i < nums1.length) {
      if (j == nums2.length) break;
      if (nums1[i] == nums2[j]) {
        list.add(nums1[i]);
        j++;
        i=0;
      } else i++;
    }
    int[] arr = new int[list.size()];
    for (int k = 0; k < list.size(); k++) {
      arr[k] = list.get(k);
    }
    return arr;
  }

}