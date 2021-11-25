package com.stp.Conversion;
import java.util.Scanner;

// This class converts a Binary number to a Decimal number

public class BinaryToDecimal {

    public int binarytodecimal(int binNum) {
        //Scanner sc = new Scanner(System.in);
        int binCopy, d, s = 0, power = 0;
        System.out.print("Binary number: ");
        //binNum = sc.nextInt();
        binCopy = binNum;
        while (binCopy != 0) {
            d = binCopy % 10;
            s += d * (int) Math.pow(2, power++);
            binCopy /= 10;
        }
        System.out.println("Decimal equivalent:" + s);
        //sc.close();
        return s;
    }
}