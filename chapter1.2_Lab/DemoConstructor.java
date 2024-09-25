// WAP to find the area of rectangle using the concept of constructor.
class Rectangle{
    private double length,breadth;

    public Rectangle(){
        length = 0;
        breadth = 0;
    }
    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea(){
        return(length*breadth);
    }
}

public class DemoConstructor {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,6);
        double result = r.getArea();
        System.out.println("Area of rectangle is "+ result);
    }
}
