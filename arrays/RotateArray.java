import java.util.*;

class RotateArray {
  public static void main(String args[]) {
    int[] nums = {1,2};
    int k = 3;
    rotate(nums,k);
    System.out.println(Arrays.toString(nums));
  }

  static void rotate(int[] nums, int k) {
    
  int rotations = k%nums.length;
    int start = nums.length -1 - rotations;
    reverse(nums,0,start);
    reverse(nums,start+1,nums.length-1);
    reverse(nums,0,nums.length-1);
  }


  static void reverse(int[] nums, int start, int end)
{
    while(start<end)
    {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
}