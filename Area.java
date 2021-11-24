

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Find the area of various geometric shapes
 */
public class Area {

    public static void main(String[] args) throws IOException {

        /* test cube */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter choice : \n1. SurfaceAreaCube\n2. SurfaceAreaSphere\n3. SurfaceAreaCone"+
        "\n4. SurfaceAreaHemisphere\n5. SurfaceAreaCylinder");


        int input = Integer.parseInt(br.readLine());
        double ans=0;

        switch(input){
            case 1: System.out.println("Enter sidelength: ");
            double  sideLength = Double.parseDouble(br.readLine());
            ans = surfaceAreaCube(sideLength);
            break;

            case 2: System.out.println("Enter radius: ");
            double  radius = Double.parseDouble(br.readLine());
            ans = surfaceAreaSphere(radius);
            break;

            case 3: System.out.println("Enter radius: ");
            double  r = Double.parseDouble(br.readLine());
            System.out.println("Enter height: ");
            double  height = Double.parseDouble(br.readLine());
            ans = surfaceAreaCone(r, height);
            break;

            case 4: System.out.println("Enter radius: ");
            double  ra = Double.parseDouble(br.readLine()); 
            ans = surfaceAreaHemisphere(ra);
            break;

            case 5: System.out.println("Enter radius: ");
            double  rad = Double.parseDouble(br.readLine());
            System.out.println("Enter height: ");
            double  h = Double.parseDouble(br.readLine()); 
            ans = surfaceAreaCylinder(rad, h);
            break; 
        }
  
        System.out.println("Result is : "+ans+" units");
        
    }

    /**
     * Calculate the surface area of a cube.
     *
     * @param sideLength side length of cube
     * @return surface area of given cube
     */
    private static double surfaceAreaCube(double sideLength) {
        return 6 * sideLength * sideLength;
    }

    /**
     * Calculate the surface area of a sphere.
     *
     * @param radius radius of sphere
     * @return surface area of given sphere
     */
    private static double surfaceAreaSphere(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    
    /**
     * Calculate surface area of a cylinder
     *
     * @param radius radius of the floor
     * @param height height of the cylinder.
     * @return volume of given cylinder
     */
    private static double surfaceAreaCylinder(double radius, double height) {
        return 2 * (Math.PI * radius * radius + Math.PI * radius * height);
    }



    /**
     * Calculate the surface area of a hemisphere.
     *
     * @param radius radius of hemisphere
     * @return surface area of given hemisphere
     */
    private static double surfaceAreaHemisphere(double radius) {
        return 3 * Math.PI * radius * radius;
    }

    /**
     * Calculate the surface area of a cone.
     *
     * @param radius radius of cone.
     * @param height of cone.
     * @return surface area of given cone.
     */
    private static double surfaceAreaCone(double radius, double height) {
        return Math.PI * radius * (radius + Math.pow((height * height + radius * radius), 0.5));
    }
}