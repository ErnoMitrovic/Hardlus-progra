import java.util.Scanner;
import java.lang.Math;

public class Frecuencia{
  public static double frec(double nota, int octava){
      double resultado;
    if (nota <= 0 || 12 < nota || octava < 1 || 8 < octava){
        return 0;
    }
    else{
        int octInicial = 4;
        double razon = 2.0, n;
        double frecuencia = 440*(Math.pow(2, (nota/12))); 
        if (0 <= (octava-octInicial)){
            n = octInicial-octava;
            //frecuencia /= Math.abs(valorMultiplicador + 1);
            resultado = frecuencia*(Math.pow(razon, -n));
            return resultado;
        }
        else{
            n = octava-octInicial;
            //frecuencia *= Math.abs(valorMultiplicador - 1);
            resultado = frecuencia*(Math.pow(razon, n));
            return resultado;
        }
    }
  }
  public static double tono(double frecuencia){
    double semitono = 12*((Math.log(frecuencia/440))/(Math.log(2)));
    return Math.abs(semitono);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Quieres saber la Frecuencia, o el tono \t Escribe tu opcion");
    String valor = sc.next();
    if (valor.toUpperCase().matches("FRECUENCIA")){
      System.out.println("Introduce la nota, y luego la octava, la original es la octava 4");
      double nota = sc.nextInt();
      int octava = sc.nextInt();
      if (frec(nota, octava)==0){
          System.out.println("Tus inputs son inválidos");
      }
      else System.out.println("La nota que quieres tiene frecuencia de: "+ frec(nota, octava));
    }
    else if(valor.toUpperCase().matches("TONO")){
      System.out.println("Introduce la frecuencia de la nota a conocer el tono con respecto a La");
      double frecuenc = sc.nextDouble();
      System.out.println("El tono es aproximadamente: "+ (int)Math.round(tono(frecuenc)));
    }
    else{
        System.out.println("Revisa tu escritura");
    }
  }
}