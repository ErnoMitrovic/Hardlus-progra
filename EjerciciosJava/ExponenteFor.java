import java.util.Scanner;

public class ExponenteFor{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponente = sc.nextInt();
        int r = 1;
        for (int i = 0; i < exponente; i++){
            r *= base;
        }
        System.out.println("La base  "+ base + " con exponente " + exponente + " da como resultado: " + r);
    }
}
