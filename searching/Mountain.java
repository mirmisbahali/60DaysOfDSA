class Mountain {
  public static void main(String args[]) {
    int[] arr = {0,10,5,2};
    System.out.println(mountain(arr));
  }

  static int mountain(int[] arr) {
    
    int index = 0, max = arr[index];
    for (int i = 0; i < arr.length; i++) {
      if (max <= arr[i]) {
        max = arr[i];
        index = i;
      }
      else break;
    }
    return index;
  }

}