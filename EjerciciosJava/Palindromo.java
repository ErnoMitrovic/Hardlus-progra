import java.util.Scanner;
public class Palindromo{
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
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
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
