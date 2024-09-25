// Write a program to find the area of circle and rectangle using the concept of method overloading.

import java.util.*;

class ComputeArea{
    public double area(double r){
        return (3.1415 * r * r);
    }
    public double area(double l, double b){
        return(l * b);
    }
}

public class DemoMethod{
    public static void main(String[] args) {
        ComputeArea a = new ComputeArea();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of radius");
        double radius = sc.nextDouble();
        System.out.println("Enter value of length");
        double length = sc.nextDouble();
        System.out.println("Enter value of breadth");
        double breadth = sc.nextDouble();
        System.out.println("The area of circle is "+a.area(radius));
        System.out.println("The area of rectangle is "+a.area(length,breadth));
        sc.close();
    }
}