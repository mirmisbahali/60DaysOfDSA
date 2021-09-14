import java.util.*;

class Squares {
  public static void main(String args[]) {
    int[] nums = {-7,-3,2,3,11};
    System.out.println(Arrays.toString(sorted(nums)));
  }

  static int[] sorted(int[] nums) {
    int[] arr = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      arr[i] = nums[i] * nums[i];
    }

    for (int i = 0; i < arr.length-1; i++) {
      for (int j = i+1; j > 0; j--) {
        if (arr[j-1] > arr[j]) {
          int temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }
      }
    }

    return arr;
  }

}