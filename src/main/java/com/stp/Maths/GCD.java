package com.stp.Maths;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// This class converts the GCD of 2 numbers


public class GCD {


    public void gcd() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number 1: ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.println("Enter number 2: ");
        int num2 = Integer.parseInt(br.readLine());

        int ans=0;
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException();
        }

        if (num1 == 0 || num2 == 0) {
            if(num1<num2) 
                ans = num2-num1;
            else 
                ans = num1-num2;
        }

        else{
            while (num1 % num2 != 0) {
                int remainder = num1 % num2;
                num1 = num2;
                num2 = remainder;
            }
            ans = num2;
        }
        
        System.out.println("GCD is  : "+ans);
    }
}