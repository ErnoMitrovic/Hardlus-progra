import java.util.Scanner;
public class Palindromo{
  public static int reverseMethod(int n){
      int reversedNum = 0;
      if (n < 10) {
	   return n;
       }
       else {
           while (n != 0){
               reversedNum *= 10;
               reversedNum += n%10;
               n /= 10;
               // n /= es lo mismo que poner n = n /10
           }
           return reversedNum;           
       }
  }
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (true){
      int reverse = reverseMethod((n + 1));
      if (n + 1  == reverseMethod((n + 1))){
        System.out.println(reverse);
        break;
      }
      n++;
    }  
  }
}
