class test {
  public static void main(String args[]) {
    int[] nums = {1,3,5,6};
    int target = 2;
    int start = 0, end = nums.length-1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) System.out.println(mid);
            else if (nums[mid] < target) start = mid + 1;
            else end = mid;
        }
        System.out.println(start);
  }
}