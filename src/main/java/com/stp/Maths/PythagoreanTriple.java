package com.stp.Maths;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// This class checks if 3 numbers form a Pythagorean triple or not


public class PythagoreanTriple {

    public void pythagoreantriple() throws IOException{

        boolean res = true;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 3 integers : ");
        String input[] = br.readLine().split("\\s+");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        
        if (a <= 0 || b <= 0 || c <= 0) {
            res =  false;
        } else {
            res =  (a * a) + (b * b) == (c * c);
        }

        if(res) 
            System.out.println("Given numbers form PythagoreanTriple");
        else 
            System.out.println("Given numbers don't form PythagoreanTriple");
        
    }

}