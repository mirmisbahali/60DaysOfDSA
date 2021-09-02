import java.util.Scanner;

class Operations {
  public static void main(String args[]) {
    float res;

    Scanner in = new Scanner(System.in);
    System.out.print("n1 = ");
    float n1 = in.nextFloat();
    System.out.print("n2 = ");
    float n2 = in.nextFloat();
    System.out.print("Operator: ");
    String op = in.next();
    switch (op) {
      case "+":
        res = n1 + n2;
        System.out.println(n1 + " " + op + " " + n2 + " = " + res);
        break;
      case "-":
        res = n1 - n2;
        System.out.println(n1 + " " + op + " " + n2 + " = " + res);
        break;
      case "*":
        res = n1 * n2;
        System.out.println(n1 + " " + op + " " + n2 + " = " + res);
        break;
      case "/":
        res = n1 / n2;
        System.out.println(n1 + " " + op + " " + n2 + " = " + res);
        break;
      case "%":
        res = n1 % n2;
        System.out.println(n1 + " " + op + " " + n2 + " = " + res);
        break;
      default:
        System.out.println("Invalid Operator");
    }
  }
}