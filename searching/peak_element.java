class peak_element {
  public static void main(String args[]) {
    int[] nums = {1,2};
    System.out.println(peak(nums));
  }

  static int peak(int[] nums) {
        if (nums.length <= 1) return 0;
        int max = nums[0];
        boolean foundMax = false;
        for (int i = 0; i < nums.length; i++) {
            if (foundMax) {
                if (nums[i] < max) return i-1;
            }
            if (nums[i] > max) {
                max = nums[i];
                if (i == nums.length-1) return i;
                else
                    foundMax = true;
            }
        }
        return 0; 

  }
}