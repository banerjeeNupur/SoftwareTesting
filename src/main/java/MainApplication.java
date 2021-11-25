import com.stp.Conversion.*;
import com.stp.Maths.*;
import com.stp.Misc.*;
import com.stp.Search.*;
import com.stp.Sort.BubbleSort;
import com.stp.Sort.CountingSort;
import com.stp.Sort.InsertionSort;


import java.util.*;

public class MainApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select option:\n1. Math\n2. Conversion\n3. Search\n4. Sort\n5. Misc");
        int choice = sc.nextInt();
        int ch=0;
        switch (choice){
            case 1: System.out.println("Enter choice:\n1. GCD\n2. Area\n3. Pythagorean Triplet\n4. Magic Square\n5. Prime Factors ");
                    ch = sc.nextInt();
                    switch (ch){
                        case 1: // GCD;
                            System.out.println("Number 1: ");
                            int num1 = sc.nextInt();
                            System.out.println("Number 2: ");
                            int num2 = sc.nextInt();
                            GCD gcd = new GCD();
                            int gcd_res = gcd.gcd(num1,num2);
                            break;

                        case 2: // Area;
                            System.out.println("Enter choice to calculate surface area:\n1. Cube"+
                                    "\n2. Sphere \n3. Cone \n4. Hemisphere \n5. Cylinder\n");

                            ch = sc.nextInt();
                            System.out.println("Enter dimensions:");

                            String st[] = sc.next().split("\\s+");
                            double a = Double.parseDouble(st[0]);
                            double b=0;
                            if(st.length>1){
                                b = Double.parseDouble(st[1]);
                            }

                            Area area = new Area();

                            if(ch==1){
                                 area.area(1,a,0);
                            }
                            else if(ch==2){
                                 area.area(2,a,0);
                            }
                            else if(ch==3){
                                 area.area(3,a,b);
                            }
                            else if(ch==4){
                                 area.area(4,a,0);
                            }
                            else if(ch==5){
                                 area.area(5,a,b);
                            }
                            break;

                        case 3: //Pythagorean Triplet
                            System.out.println("Enter 3 integers: ");
                            String s[] = sc.nextLine().split("\\s+");
                            int x = Integer.parseInt(s[0]);
                            int y = Integer.parseInt(s[1]);
                            int z = Integer.parseInt(s[2]);
                            PythagoreanTriple pythagoreanTriple = new PythagoreanTriple();
                            boolean pythagorean_res =  pythagoreanTriple.pythagoreantriple(x,y,z);
                            break;

                        case 4 : // Magic Square;
                            System.out.println("Enter size of square: ");
                            int q = sc.nextInt();
                            System.out.println("Magic Sqaure of dimension "+q);
                            MagicSquare magicSquare = new MagicSquare();
                            int arr[][] = magicSquare.magicsquare(q);
                        break;

                        case 5: // Prime Factorization;
                            System.out.println("Enter number: ");
                            int prime_factor = sc.nextInt();
                            List<Integer> list = new PrimeFactorization().primeFactorization(prime_factor);
                            break;
                    }
            break;

            case 2: System.out.println("Enter choice:\n1. Any to Any\n2. Binary to Decimal\n3. Hex to Octal ");
            ch = sc.nextInt();
            switch(ch){
                case 1: // Any to Any
                    System.out.println("Enter number, source base, dest base: ");
                    String sd[] = sc.next().split("\\s+");
                    int ca = Integer.parseInt(sd[0]);
                    int cb = Integer.parseInt(sd[1]);
                    int cc = Integer.parseInt(sd[2]);
                    new AnyToAny().anyToAny(ca,cb,cc);
                    break;

                case 2: // Binary to decimal
                    System.out.println("Enter number: ");
                    int bn = sc.nextInt();
                    new BinaryToDecimal().binarytodecimal(bn);
                    break;

                case 3: // Hex to Octal
                    System.out.println("Enter number: ");
                    String hs = sc.next();
                    new HexToOct().hextooct(hs);
                    break;
            }
            break;

            case 3: System.out.println("Search");
            System.out.println("Enter choice: ");
            ch = sc.nextInt();

            System.out.println("Enter numbers: ");
            String bs[] = sc.next().split("\\s+");
            int arr[] = new int[bs.length];
            for(int k=0;k<bs.length;k++){
                arr[k] = Integer.parseInt(bs[k]);
            }
            System.out.println("Enter target: ");
            int target = sc.nextInt();

            switch (ch){
                case 1: // Binary
                    new SearchBinary().binarysearch(arr,target);
                    break;

                case 2: // Linear
                    new SearchLinear().linearsearch(arr,target);
                    break;
            }
            break;

            case 4:
                System.out.println("Enter choice:\n1. Bubble Sort\n2. Counting Sort\n3. Insertion Sort ");
                ch = sc.nextInt();
                System.out.println("Enter array length: ");
                int len = sc.nextInt();
                int sort_arr[] = new int[len];
                System.out.println("Enter numbers: ");
                for(int u=0;u<len;u++){
                    sort_arr[u] = sc.nextInt();
                }
                switch (ch){
                    case 1: // Bubble Sort
                        new BubbleSort().bubblesort(sort_arr);
                        break;
                    case 2: // Counting Sort
                        new CountingSort().countingsort(sort_arr);
                        break;
                    case 3: // Insertion Sort
                        new InsertionSort().insertionsort(sort_arr);
                        break;
                }
            break;

            case 5: System.out.println("Misc");
                System.out.println("Enter choice: ");
                ch = sc.nextInt();
                switch (ch){
                    case 1: // Leap Year
                        System.out.println("Enter year: ");
                        int ln = sc.nextInt();
                        new LeapYear().leapyear(ln);
                        break;
                    case 2: // Nth Ugly Number
                        System.out.println("Enter number: ");
                        int nn = sc.nextInt();
                        new NthUglyNumber().nthUglyNumber(nn);
                        break;
                }
            break;
        }
    }
}
