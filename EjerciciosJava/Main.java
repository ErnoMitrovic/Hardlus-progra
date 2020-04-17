//package com.company;
import java.util.Scanner;

public class Main {
    public static boolean isPrime (int x){
        int i = 2;
        boolean prime = true;
        while ((prime) && (i != x)){
            if(x % i == 0){
                prime = false;
            }
            i ++;
        }
        return prime;
    }
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an integer:");
        t = sc.nextInt();
        if ((t < 1) || (10 < t)) {
            System.out.println("Invalid");
        } else {
            System.out.println(t);
            for (int i = 0; i < t; i++) {
                System.out.println("Input two integers different from each other\n");
                int n = sc.nextInt();
                int m = sc.nextInt();
                if ((m < 1 || 1000000000 < m) || (n < 1 || 1000000000 < n)) {
                    System.out.println("Invalid numbers");
                    break;
                } else {
                    if (n <= m) {
                        for (int x = n; x <= m; x++) {
                            if (isPrime(x)) {
                                System.out.println(x + " ");
                            }
                        }
                    } else {
                        for (int y = m; y <= n; y++) {
                            if (isPrime(y)) {
                                System.out.println(y + " ");
                            }
                        }
                    }
                }
            }
        }
    }
}
