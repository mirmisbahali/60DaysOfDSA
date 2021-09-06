class RotatedArr {
  public static void main(String args[]) {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 2;
    System.out.println(search(nums, target));
  }
  
  static int search(int[] nums, int target) {
    int l = 0, h = nums.length-1;

    while(l <= h)
    {
      int mid = l + (h-l) / 2;
      if (nums[mid] == target) return mid;
      if (nums[mid] > target) {
        if (nums[0] < nums[mid]) h = mid - 1;
        else l = mid + 1;
      } else {
        if (nums[nums.length-1] > nums[mid]) h = mid - 1;
        else l = mid + 1;

      }
    }
    return -1;

  }
}