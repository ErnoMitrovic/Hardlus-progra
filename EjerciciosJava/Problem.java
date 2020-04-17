//package com.company;
import java.util.Scanner;

public class Problem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //Number of trials
        int t = sc.nextInt();
        //Array of integers to contain the numbers
        int [] num = new int[t];
        //The sum of rounded figures in a number
        int SUM = 0;
        if (t >= 1) {
            for (int i = 0; i < t; i++){
                num[i] = sc.nextInt();
            }
            for (int entero:num) {
                String n = Integer.toString(entero);
                char [] separatedNum = n.toCharArray();
                SUM = 0;
                for (char c : separatedNum) {
                    if (c == '8') {
                        SUM += 2;
                    } else if (c == '0' || c == '6' || c == '9') {
                        SUM += 1;
                    }
                }
                System.out.println(SUM);
            }
        }
    }
}
