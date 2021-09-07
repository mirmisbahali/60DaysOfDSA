import java.util.Arrays;

class flipping {
  public static void main(String args[]) {
    int[][] image = {
      {1,1,0,0},
      {1,0,0,1},
      {0,1,1,1},
      {1,0,1,0}
      };
  image = flip(image);
  for (int i = 0; i < image.length; i++) {
    System.out.println(Arrays.toString(image[i]));
  }
  }

  static int[][] flip(int[][] image) {
    for (int i = 0; i < image.length; i++) {
      for (int j = 0; j < image[i].length; j++) {
        int last = image[i].length-1;
        int first = 0;
        while (last > first) {
          int temp = image[i][first] ^ 1;
          image[i][first] = image[i][last] ^ 1;
          image[i][last] = temp;
          first++;
          last--;
        }
      }
    }
    // for (int i = 0; i < image.length; i++) {
    //   for (int j = 0; j < image[i].length; j++) {
    //     if (image[i][j] == 0) image[i][j] = 1;
    //     else image[i][j] = 0;
    //   }
    // }
    return image;
  }


}