import java.util.Scanner;

class Greeting {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("What's your name? ");
    String name = in.next();
    System.out.println("Hi, " + name);
  }
}