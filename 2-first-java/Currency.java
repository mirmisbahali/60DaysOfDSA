import java.util.Scanner;

class Currency {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Rupees (Rs): ");
    float rs = in.nextFloat();
    float usd = rs / 75;
    System.out.println("USD = " + usd);
  }
}