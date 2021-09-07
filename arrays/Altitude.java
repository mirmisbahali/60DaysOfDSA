import java.lang.Math;

class Altitude {
  public static void main(String args[]) {
    int[] gain = {-5,1,5,0,-7};
    System.out.println(altitude(gain));
  }

  static int altitude(int[] gain) {
    int max=0, height=0;
    for (int i = 0; i < gain.length; i++) {
      height += gain[i];
      if (height > max) max = height;
    }
  return max;

  }
}