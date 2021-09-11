import java.util.*;

class SumOfDigits {
  public static void main(String args[]) {
    String s = "zbax";
    int k = 2;

    System.out.println(func(s,k));
  }
  static int func(String s, int k) {
    int[] arr = new int[s.length()];
    int sum = 0;
    
    for (int i = 0; i < s.length(); i++) {
      arr[i] = s.charAt(i) % 96;
    }
    
    for (int i = 0; i < k; i++) {
      int rem = sum;
      if (rem > 0) {
        sum = 0;
        while (rem > 0) {
          sum += rem % 10;
          rem /= 10;
        }
      } else {
        for (int j = 0; j < arr.length; j++) {
          if (arr[j] > 0) {
            int temp = arr[j];
            while (temp > 0) {
              sum += temp % 10;
              temp /= 10;
            }
          } else sum += arr[j];
        }
      }
    }
    return sum;
  }
}