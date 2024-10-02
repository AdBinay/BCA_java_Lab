class MathOperation{
    public static double mul(double x, double y){
        return (x*y);
    }
    public static double div(double x, double y){
        return (x/y);
    }
}

public class DemoStatic {
    public static void main(String[] args) {
        double a = MathOperation.mul(5, 5);
        double b = MathOperation.div(25, 5);
        System.out.println("result of multiplication is "+a);
        System.out.println("result of divison is "+b);
    }
}
