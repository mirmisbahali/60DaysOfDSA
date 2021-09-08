class Missing {
  public static void main(String args[]) {
    int[] nums = {0,1,2,3,4,5,7,8};
    System.out.println(missing(nums));
  }

  static int missing(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correctIndex = nums[i];
      if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
      } else i++;
    }

    for (int index = 0; index < nums.length; index++) {
      if (index != nums[index]) return index;
    }
    return 0;
  }
}