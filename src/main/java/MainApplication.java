import com.stp.Calender.LeapYear;
import com.stp.Conversion.AnyToAny;
import com.stp.Conversion.BinaryToDecimal;
import com.stp.Conversion.HexToOct;
import com.stp.Maths.GCD;
import com.stp.Maths.PythagoreanTriple;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) {

        //LeapYear l = new LeapYear();
        //System.out.println(l.leapyear(2000));
        //GCD g = new GCD();
        //System.out.println(g.gcd(-1,4));
        //PythagoreanTriple p = new PythagoreanTriple();
        //System.out.println(p.pythagoreantriple(3,4,5));
       // BinaryToDecimal b = new BinaryToDecimal();
       // System.out.println(b.binarytodecimal(100));
        HexToOct h = new HexToOct();
        System.out.println(h.hextooct("FFFF"));
    }
}
