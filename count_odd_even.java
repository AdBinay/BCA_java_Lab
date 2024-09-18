import java.util.Scanner;

public class count_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number from the user
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int even = 0, odd = 0;

        // Loop to process each digit of the number
        while (num != 0) {
            int ext = num % 10; // Extract the last digit

            // Check if the digit is even or odd
            if (ext % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            // Remove the last digit
            num = num / 10;
        }

        // Output the counts of even and odd digits
        System.out.println("Total Even Digits = " + even);
        System.out.println("Total Odd Digits = " + odd);

        // Closing the Scanner to avoid resource leak
        sc.close();
    }
}
