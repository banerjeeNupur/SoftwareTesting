package com.stp.Maths;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// This class calculates the Area of different shapes

public class Area {

    public double area(int input, double a, double b)  {

        double ans=0;

        switch(input){
            case 1:
                if(a<0){
                    System.out.println("sides cannot be negative");
                    return -1;
                }
                ans =  6 * a * a;
                break;

            case 2:
                if(a<0) {
                    System.out.println("sides cannot be negative");
                    return -1;
                }
                ans =  4 * Math.PI * a * a;
                break;

            case 3:
                if(a<0 || b<0) {
                    System.out.println("sides cannot be negative");
                    return -1;
                }
                ans =   Math.PI * a * (a + Math.pow((b * b + a * a), 0.5));
                break;

            case 4:
                if(a<0 || b<0) {
                    System.out.println("sides cannot be negative");
                    return -1;
                }
                ans =  3 * Math.PI * a * a;
                break;

            case 5:
                if(a<0 || b<0) {
                    System.out.println("sides cannot be negative");
                    return -1;
                }
                ans = 2 * (Math.PI * a * a + Math.PI * a * b);
                break;

            default:
                System.out.println("invalid input");
                ans = -1;
        }
  
        return ans;
        
    }

}