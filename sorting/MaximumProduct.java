class MaximumProduct {
  public static void main(String args[]) {
    int[] nums = {-100,-98,-1,2,3,4};
    System.out.println(maxPro(nums));
  }

  static int maxPro(int[] nums) {
for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j] < nums[j-1]) {
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                } else {
                    break;
                }
            }
        }
    int n = nums.length;
  return Math.max(nums[0]*nums[1]*nums[n-1], nums[n-1]*nums[n-2]*nums[n-3]);
  }

}