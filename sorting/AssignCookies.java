import java.util.*;

class AssignCookies {
  public static void main(String args[]) {
    int[] g = {1,2};
    int[] s = {1,2,3};
    HashSet<Integer> gSet = new HashSet<Integer>();
    HashSet<Integer> sSet = new HashSet<Integer>();


    for (int i = 0; i < g.length-1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (g[j] > g[j-1]) swap(g, j, j-1);
        else break;
      }
    }
    for (int i = 0; i < s.length-1; i++) {
      for (int j = i+1; j > 0; j--) {
        if (s[j] > s[j-1]) swap(s, j, j-1);
        else break;
      }
    }

      
    int content = 0;
    int i = 0, j = 0;

      while (i < g.length && j < s.length) {
        if (s[j] >= g[i]) {
          j++;
          i++;
          content++;
        }
        else i++;
      }

    System.out.println(gSet);
    System.out.println(sSet);
    System.out.println(content);

  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}