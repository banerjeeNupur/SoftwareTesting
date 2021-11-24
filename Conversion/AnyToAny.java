package Conversion;
import java.util.Scanner;

// given a source number , source base, destination base, this code can give you the destination
// number.
// sn ,sb,db ---> ()dn  .   this is what we have to do    .

public class AnyToAny {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int sn = scn.nextInt();

        System.out.println("Enter source base: ");
        int sb = scn.nextInt();

        System.out.println("Enter destination base: ");
        int db = scn.nextInt();
        int m = 1, dec = 0, dn = 0;
        while (sn != 0) {
            dec = dec + (sn % 10) * m;
            m *= sb;
            sn /= 10;
        }
        m = 1;
        while (dec != 0) {
            dn = dn + (dec % db) * m;
            m *= 10;
            dec /= db;
        }
        System.out.println(dn);
        scn.close();
    }
}