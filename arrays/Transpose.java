import java.util.*;
class Transpose {
  public static void main(String args[]) {
    int[][] matrix = {
      {1,2,3},
      {4,5,6}
    };

    int[][] ans = transpose(matrix);
    for (int i = 0; i < ans.length; i++) {
        System.out.println(Arrays.toString(ans[i]));
      
    }
  }

  static int[][] transpose(int[][] matrix) {
    int[][] transposeMatrix = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[ddddddddddddddd].length; j++) {
        // System.out.println(matrix[i][j]);
        transposeMatrix[i][j] = matrix[j][i];
      }
    }
    return transposeMatrix;
  }


}