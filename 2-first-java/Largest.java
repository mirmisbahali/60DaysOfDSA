import java.util.Scanner;

class Largest {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("n1 = ");
    int n1 = in.nextInt();
    System.out.print("n2 = ");
    int n2 = in.nextInt();
    if (n1 > n2)
      System.out.println(n1 + " > " + n2);
    else
      System.out.println(n2 + " > " + n1);
  }
}