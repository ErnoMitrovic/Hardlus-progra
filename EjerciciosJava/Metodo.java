/*
Hacer un programa que dado un número cualquiera (n) encuentre el menor número 
que sea palíndromo mayor a (n).
*/
//import java.util.Scanner;
public class Metodo{
  public static int Reverse(int x){
    int rev = 0;
    while (x!=0){
      rev *= 0;
      rev = rev + x%10;
      x /= 10;
    }
    return rev;
  }
  public static void main(String[]args){
    //Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt();
    int n = 7382;
    while (true){
      int reverse = Reverse((n + 1));
      if (n + 1  == Reverse((n + 1))){
        System.out.println(reverse);
        break;
      }
      n++;
    }  
  }
}

