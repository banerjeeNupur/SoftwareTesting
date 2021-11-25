import com.stp.Conversion.HexToOct;

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
