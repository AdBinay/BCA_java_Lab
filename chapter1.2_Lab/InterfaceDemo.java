import java.util.*;

class DemoInterface implements Area{
    public double findArea(double r){
        return(pi*r*r);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double r = sc.nextDouble();
        DemoInterface id = new DemoInterface();
        double rs = id.findArea(r);
        System.out.println("the area of circle is"+rs);
        sc.close();
    }
}
