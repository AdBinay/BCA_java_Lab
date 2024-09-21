import java.util.Scanner;

class Rectangle {
    private double len, bre;

    // Method to set the length and breadth
    public void setData(double len, double bre) {
        this.len = len;
        this.bre = bre;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return len * bre;
    }
}

class area_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an object of the Rectangle class
        Rectangle r = new Rectangle();

        // Input for length
        System.out.println("Enter length:");
        double len = sc.nextDouble();

        // Input for breadth
        System.out.println("Enter breadth:");
        double bre = sc.nextDouble();

        // Setting the length and breadth of the rectangle
        r.setData(len, bre);

        // Calculating and displaying the area of the rectangle
        double a = r.getArea();
        System.out.println("Area of rectangle = " + a);
        sc.close();
    }
}
