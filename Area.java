import java.math.*;
import java.io.*;
import java.util.*;
public class Area
{
    float length,breadth;
    float radius;
    float side1,side2,side3;
    void area(float length,float breadth)
    {
        double area = length*breadth;
        System.out.println("Area of Rectangle : "+area);
    }
    void area(float radius)
    {
        double area = Math.PI*Math.pow(radius,2);
        System.out.println("Area of Circle : "+area);
    }
    void area(float side1,float side2,float side3)
    {
        float s = (side1+side2+side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("Area of Triangle : "+area);
    }
    public static void main(String[] args)
    {
        float length,breadth;
        float radius;
        float side1,side2,side3;
        Scanner sc = new Scanner(System.in);
        Area shape = new Area();
        System.out.println("Enter the length of rectangle");
        length = sc.nextFloat();
        System.out.println("Enter the breadth of rectangle");
        breadth = sc.nextFloat();
        shape.area(length,breadth);
        System.out.println("Enter the side-1 of triangle");
        side1 = sc.nextFloat();
        System.out.println("Enter the side-2 of triangle");
        side2 = sc.nextFloat();
        System.out.println("Enter the side-3 of triangle");
        side3 = sc.nextFloat();
        shape.area(side1,side2,side3);
        System.out.println("Enter the radius of circle");
        radius = sc.nextFloat();
        shape.area(radius);
        sc.close();
    }
}