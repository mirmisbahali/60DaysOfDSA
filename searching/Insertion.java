import java.util.ArrayList;
import java.util.Arrays;
class Insertion {
  public static void main(String args[]) {
    int[] nums1 = {1,2,2,1};
    int[] nums2 = {2,2};
    int[] ins = insertion(nums1, nums2);
    System.out.println(Arrays.toString(ins));
  }

  static int[] insertion(int[] nums1, int[] nums2) {

    ArrayList<Integer> newArr = new ArrayList<Integer>();

    if (nums1.length > nums2.length) {
      for (int i = 0; i < nums2.length; i++){
        if(search(nums1, nums2[i])) newArr.add(nums2[i]);
      }
    } else {
      for (int i = 0; i < nums1.length; i++) {
        if (search(nums2, nums1[i])) newArr.add(nums1[i]);
      }
    }


    int[] arr = new int[newArr.size()];
    for (int i = 0; i < arr.length; i++)
    {
      arr[i] = newArr.get(i).intValue();
    }

    return arr;
  }

  static boolean search(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (target == arr[i]) return true;
    }
    return false;
  }


}