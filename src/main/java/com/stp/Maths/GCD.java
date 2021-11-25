package com.stp.Maths;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// This class calculates the GCD of 2 numbers


public class GCD {


    public int gcd(int num1,int num2)  {

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
        
        System.out.println("Result  : "+ans);
        return ans;
    }
}