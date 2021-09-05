class InsertPosition {
  public static void main(String args[]) {
    int[] arr = {1,3,5,6};
    int target = 7;
    System.out.println(searchInsert(arr, target));
  }
  static int searchInsert(int[] nums, int target) {
    int l = 0, h = nums.length-1, rem = h;
    if (nums[h] < target) return h+1;
    while (l <= h)
    {
      int mid = l + (h-l) / 2;
      if (nums[mid] == target) return mid;
      else if(nums[mid] > target){
        h = mid - 1;
        rem = mid;
      } 
      else l = mid + 1;
    }
    return rem;
  }
}