/*Crea un programa que contenga un método esPrimo que acepte un parámetro 
numérico. Este método tiene que determinar si ese número es primo. Tiene que 
imprimir en la pantalla si el número es primo o no y adicionalmente tiene que 
regresar true o false dependiendo si el número es primo o no.*/
import java.util.Scanner;

public class EsPrimo{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(IsPrime(n));
    if (IsPrime(n) == true) System.out.println("Es primo"); 
    else System.out.println("No es primo");
  }
  public static boolean IsPrime(int number){
    boolean primo = false;
    int count = 0;
    for (int i = 2; i < number-1; i++){
      if (number % i == 0){
        primo = true;
        break;
      }
    }
    if (!primo) return true;
    else return false;
  }
}
