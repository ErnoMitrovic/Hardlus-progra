import java.util.Scanner;
import java.lang.Math;
public class Exponente{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base\n");
    int b = sc.nextInt();
    System.out.println("Enter the exponent\n");
    int e = sc.nextInt();
    System.out.println((int)Math.pow(b,e));
  }
}
