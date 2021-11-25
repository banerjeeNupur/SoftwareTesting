package com.stp.Maths;

import java.util.Scanner;

public class PrimeFactorization {

    public void primeFactorization(){

        System.out.println("## all prime factors ##");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.print(("printing factors of " + n + " : "));


        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }
        scanner.close();


    }

}
