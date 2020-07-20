import java.util.Scanner;
import java.util.Arrays;

public class MarcaPersonal{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        String[] gustos = new String[8];
        String[] nogustos = new String[8];
        
        System.out.println("¿Quién eres?");
        String ser = sc.next();
        System.out.println("¿Qué te gusta?");
        for(int i = 0; i < 8; i++){
            gustos[i] = sc.next();
        }
        
        System.out.println("Nada mal, ¿pero qué no te gusta?");
        for(int j = 0; j < 8; j++){
            nogustos[j] = sc.next();
        }
        
        System.out.println("Genial "+ ser +", sabemos que tus gustos son "+ Arrays.toString(gustos));
        System.out.println("Y no te gusta "+ Arrays.toString(nogustos));
        System.out.println("Pero ahora te diré algo más \nTus fortalezas");
    }
    
}
