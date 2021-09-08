import java.util.Arrays;
class ThirdMaximum {
  public static void main(String args[]) {
    int[] nums = {1,2,2,5,3,5};
    System.out.println(thirdMax(nums));
  }

  static int thirdMax(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
      for (int j = i+1; j > 0; j--) {
         if (nums[j] < nums[j-1]) {
          int temp = nums[j];
          nums[j] = nums[j-1];
          nums[j-1] = temp;
        } else break;
      }
    }
    
    if (nums.length > 2) {
    System.out.println(Arrays.toString(nums));

      int n = nums.length -1;
      int maxCount=1, prevMax=nums[n];
      for (int k = n; k >= 0; k--) {
        if (nums[k] < prevMax) {
          prevMax = nums[k];
          maxCount++;
        }
        if (maxCount == 3) return nums[k];
      }
    }
    return nums[nums.length-1];
  }

  static void swap(int[] nums, int first, int second) {
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
  }

}