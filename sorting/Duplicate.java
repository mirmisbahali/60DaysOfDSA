import java.util.Arrays;
class Duplicate {
  public static void main(String args[]) {
    int[] nums = {1,2,3,4,5,6};
    System.out.println(insertion(nums));
  }

  static boolean insertion(int[] nums) {
    for (int i = 0; i < nums.length-1; i++) {
      for (int j = i+1; j > 0; j--) {
        if (nums[j] == nums[j-1]) return true;
        else if (nums[j] < nums[j-1]) {
          int temp = nums[j];
          nums[j] = nums[j-1];
          nums[j-1] = temp;
        } else break;
      }
    }
    return false;
  }

  static boolean bubble(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length-1-i; j++) {
        if (nums[j] == nums[j+1]) return true;
        else if (nums[j] > nums[j+1]) {
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
        }

      }
    }
    return false;

  }
}