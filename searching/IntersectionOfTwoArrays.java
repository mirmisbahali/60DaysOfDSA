// https://leetcode.com/problems/intersection-of-two-arrays-ii/

import java.util.*;

class IntersectionOfTwoArrays {
  public static void main(String args[]) {
    int[] nums1 = {4,9,5};
    int[] nums2 = {9,4,9,8,4};
    System.out.println(Arrays.toString(intersection(nums1, nums2)));
  }

  static int[] intersection(int[] nums1, int[] nums2) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    Arrays.sort(nums1);
    Arrays.sort(nums2);
      int i=0, j=0;
      while (i < nums1.length && j < nums2.length) {
        if (nums1[i] == nums2[j]) {
          list.add(nums1[i]);
          i++;
          j++;
        } else {
          i++;
        }
      }
    int[] ans = new int[list.size()];
    for (int k = 0; k < list.size(); k++) {
      ans[k] = list.get(k);
    }

    return ans;
  }

}