public class SoloTresVariables{
  public static void main(String[] args) {
    int x = 50, y = 100, aux;
    //System.out.println("El valor inicial de x es: "+ x + "\nEl valor inicial de y es: "+y);
    aux = x;
    x = y;
    y = aux;
    System.out.println("El nuevo valor de x es: "+ x + "\nEl nuevo valor de y es: "+ y);    
  }
}
