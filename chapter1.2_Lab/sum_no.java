import java.util.Scanner;

class Sum {
    private float fn, sn;

    // Method to set data for the two numbers
    public void setData(float fn, float sn) {
        this.fn = fn;
        this.sn = sn;
    }

    // Method to return the sum of the two numbers
    public float getSum() {
        float sum = fn + sn;
        return sum;
    }
}

public class sum_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the first number:");
        float m = sc.nextFloat();

        System.out.println("Enter the second number:");
        float n = sc.nextFloat();

        // Creating an instance of Sum and setting data
        Sum a = new Sum();
        a.setData(m, n);

        // Getting and printing the sum
        float sm = a.getSum();
        System.out.println("The sum of two numbers is: " + sm);

        sc.close();
    }
}
