
import java.util.Scanner;

public class PowerCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the base: ");
    double base = scanner.nextDouble();

    System.out.print("Enter the exponent: ");
    double exponent = scanner.nextDouble();

    double result = Math.pow(base, exponent);
    System.out.println(result);

  }

}