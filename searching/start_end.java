import java.util.Arrays;
class start_end {
  public static void main(String args[]) {
    int[] arr = {5,7,7,8,8,10};
    int target = 6;
    int[] res = solution(arr, target);
    System.out.println(Arrays.toString(res));
  }

  static int[] solution(int[] arr, int target) {
    int l = 0, h = arr.length-1;
    int[] res = {-1,-1};
    while (l <= h)
    {
      int mid = l + (h-l) / 2;
      if (arr[mid] == target) {
        l = mid;
        h = mid;
        while (arr[l] == target) l--;
        while (arr[h] == target) h++;
        res[0] = ++l;
        res[1] = --h;
        return res;
      } else if (arr[mid] > target) h = mid - 1;
      else l = mid + 1;
    }
    return res;
  }
}