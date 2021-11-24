

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Find the area of various geometric shapes
 */
public class Area {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter choice : \n1. SurfaceAreaCube\n2. SurfaceAreaSphere\n3. SurfaceAreaCone"+
        "\n4. SurfaceAreaHemisphere\n5. SurfaceAreaCylinder");


        int input = Integer.parseInt(br.readLine());
        double ans=0;

        switch(input){
            case 1: System.out.println("Enter sidelength: ");
            double  sideLength = Double.parseDouble(br.readLine());
            ans = 6 * sideLength * sideLength;
            break;

            case 2: System.out.println("Enter radius: ");
            double  radius = Double.parseDouble(br.readLine());
            ans = 4 * Math.PI * radius * radius;
            break;

            case 3: System.out.println("Enter radius: ");
            double  r = Double.parseDouble(br.readLine());
            System.out.println("Enter height: ");
            double  height = Double.parseDouble(br.readLine());
            ans =  Math.PI * r * (r + Math.pow((height * height + r * r), 0.5));
            break;

            case 4: System.out.println("Enter radius: ");
            double  ra = Double.parseDouble(br.readLine()); 
            ans = 3 * Math.PI * ra * ra;
            break;

            case 5: System.out.println("Enter radius: ");
            double  rad = Double.parseDouble(br.readLine());
            System.out.println("Enter height: ");
            double  h = Double.parseDouble(br.readLine()); 
            ans = 2 * (Math.PI * rad * rad + Math.PI * rad * h);
            break; 
        }
  
        System.out.println("Result is : "+ans+" units");
        
    }

}