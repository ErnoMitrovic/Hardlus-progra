/*for each number on the stairs he will note down the sum of all the numbers previously seen on the stairs which are
 smaller than the present number. Calculate the sum of all the numbers written on his notes diary.*/

//package com.company;
import java.util.Scanner;
//import java.util.Arrays;

public class ItsAMurder {
    public static void main(String[]args) throws Exception{
        try{
            Scanner sc = new Scanner(System.in);
            //Number of cases
            int SUM = 0, t = sc.nextInt();
            for (int i = 0; i < t; i++){
                //Number of stairs
                int n = sc.nextInt();
                //Number in each stair, starting all by default with 0
                int [] N = new int[n];
                for (int j = 0; j < n; j++){
                    N[j] = sc.nextInt();
                }
                //System.out.println(Arrays.toString(N));
                int [] b = new int[n];
                int j = n;
                for (int z = 0; z < n; z++){
                    b[j - 1] = N[z];
                    j = j - 1;
                }
                //System.out.println(Arrays.toString(b));
                for (int inicio = 0; inicio < b.length; inicio++){
                    int contador = inicio;
                    for (; contador < b.length; contador++){
                        if (b[inicio] > b[contador]){
                            SUM += b[contador];
                        }
                    }
                }
                System.out.println(SUM);
            }
        }catch(Exception ignored){
        }
    }
}
