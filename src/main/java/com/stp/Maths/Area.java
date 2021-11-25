package com.stp.Maths;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// This class calculates the Area of different shapes

public class Area {

    public double area(int input, double a, double b)  {

        double ans=0;

        switch(input){
            case 1: ans =  6 * a * a;
            break;

            case 2: ans =  4 * Math.PI * a * a;
            break;

            case 3: ans =   Math.PI * a * (a + Math.pow((b * b + a * a), 0.5));
            break;

            case 4: ans =  3 * Math.PI * a * a;
            break;

            case 5: ans = 2 * (Math.PI * a * a + Math.PI * a * b);
            break; 
        }
  
        return ans;
        
    }

}