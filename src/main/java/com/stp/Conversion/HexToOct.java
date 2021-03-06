package com.stp.Conversion;

// Converts any Hexadecimal Number to Octal

public class HexToOct {

    public int hextooct(String hexadecnum) {

        int decnum, octalnum;

        System.out.print("Enter Hexadecimal Number : ");

        // first convert hexadecimal to decimal
        String str = "0123456789ABCDEF";
        hexadecnum = hexadecnum.toUpperCase();
        int val = 0;
        for (int i = 0; i < hexadecnum.length(); i++) {
            char a = hexadecnum.charAt(i);
            int n = str.indexOf(a);
            val = 16 * val + n;
        }
        decnum =  val;

        // convert decimal to octal
        int now;
        int i = 1;
        int octnum = 0;
        while (decnum > 0) {
            now = decnum % 8;
            octnum = (now * (int) (Math.pow(10, i))) + octnum;
            decnum /= 8;
            i++;
        }
        octnum /= 10;
        octalnum =  octnum;

        System.out.println("Result: "+octalnum);
        return octalnum;
    }
}