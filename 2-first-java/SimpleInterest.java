import java.util.Scanner;

class SimpleInterest {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Principle: ");
    float principle = in.nextFloat();
    System.out.print("Enter Time (in years): ");
    float time = in.nextFloat();
    System.out.print("Enter Rate (in percentage): ");
    float rate = in.nextFloat();

    float simple_interest = (principle * time * rate)/100;

    System.out.println("Simple Interest = " + simple_interest);


  }
}