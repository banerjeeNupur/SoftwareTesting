import com.stp.Conversion.HexToOct;
import com.stp.Maths.Area;
import com.stp.Maths.GCD;
import com.stp.Maths.MagicSquare;
import com.stp.Maths.PythagoreanTriple;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select option: ");
        int choice = sc.nextInt();
        int ch=0;
        switch (choice){
            case 1: System.out.println("Maths");
                    System.out.println("Enter choice: ");
                    ch = sc.nextInt();
                    switch (ch){
                        case 1: // GCD;
                            System.out.println("Number 1: ");
                            int num1 = sc.nextInt();
                            System.out.println("Number 2: ");
                            int num2 = sc.nextInt();
                            GCD gcd = new GCD();
                            int gcd_res = gcd.gcd(num1,num2);
                            System.out.println("GCD: "+gcd_res);
                            break;

                        case 2: // Area;
                            System.out.println("Enter choice to calculate surface area:\n1. Cube"+
                                    "\n2. Sphere \n3. Cone \n4. Hemisphere \n5. Cylinder");

                            ch = sc.nextInt();
                            System.out.println("Enter dimensions: ");
                            String st[] = sc.nextLine().split("\\s+");
                            double a = Double.parseDouble(st[0]);
                            double b=0;
                            if(st.length>1){
                                b = Double.parseDouble(st[1]);
                            }

                            Area area = new Area();
                            double area_res = 0;
                            if(ch==1){
                                area_res = area.area(1,a,0);
                            }
                            else if(ch==2){
                                area_res = area.area(2,a,0);
                            }
                            else if(ch==3){
                                area_res = area.area(3,a,b);
                            }
                            else if(ch==4){
                                area_res = area.area(4,a,0);
                            }
                            else if(ch==5){
                                area_res = area.area(5,a,b);
                            }
                            System.out.println("Surface Area: "+area_res);
                            break;

                        case 3: //Pythagorean Triplet
                            System.out.println("Enter 3 integers: ");
                            String s[] = sc.nextLine().split("\\s+");
                            int x = Integer.parseInt(s[0]);
                            int y = Integer.parseInt(s[1]);
                            int z = Integer.parseInt(s[2]);
                            PythagoreanTriple pythagoreanTriple = new PythagoreanTriple();
                            boolean pythagorean_res =  pythagoreanTriple.pythagoreantriple(x,y,z);
                            System.out.println("The triplet is pythagorean: "+pythagorean_res);
                            break;

                        case 4 : // Magic Square;
                            System.out.println("Enter size of square: ");
                            int q = sc.nextInt();
                            System.out.println("Magic Sqaure of dimension "+q);
                            MagicSquare magicSquare = new MagicSquare();
                            int arr[][] = magicSquare.magicsquare(q);
                        break;

                        case 5: // Prime Factorization;
                            break;
                    }
            break;

            case 2: System.out.println("Conversion");
            System.out.println("Enter choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1: // Any to Any
                    break;

                case 2: // Binary to hexadecimal
                    break;

                case 3: // Hex to Octal
                    break;
            }
            break;

            case 3: System.out.println("Search");
            System.out.println("Enter choice: ");
            ch = sc.nextInt();
            switch (ch){
                case 1: // Binary
                    break;

                case 2: // Linear
                    break;
            }
            break;

            case 4: System.out.println("Sort");
                System.out.println("Enter choice: ");
                ch = sc.nextInt();
                switch (ch){
                    case 1: // Bubble Sort
                        break;
                    case 2: // Counting Sort
                        break;
                    case 3: // Insertion Sort
                        break;
                }
            break;

            case 5: System.out.println("Misc");
                System.out.println("Enter choice: ");
                ch = sc.nextInt();
                switch (ch){
                    case 1: // Leap Year
                        break;
                    case 2: // Nth Ugly Number
                        break;
                }
            break;
        }
    }
}
