import java.util.Scanner;

class Test {
    private String str;

    // Method to set the input string
    public void setData(String str) {
        this.str = str;
    }

    // Method to check if the string is a palindrome
    public boolean isPalindrome() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ext = str.charAt(i);
            rev = rev + ext;
        }

        // Checking if the string is equal to its reverse (ignoring case)
        if (str.equalsIgnoreCase(rev)) {
            return true;
        } else {
            return false;
        }
    }
}

public class palindrometest_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a Test object and accepting input from the user
        Test t = new Test();
        System.out.println("Enter string:");
        String str = sc.nextLine();

        // Setting the input string to the Test object
        t.setData(str);

        // Checking if the string is a palindrome
        boolean res = t.isPalindrome();

        // Outputting the result
        if (res == true) {
            System.out.println("The input String is a Palindrome");
        } else {
            System.out.println("The input String is Not Palindrome");
        }

        sc.close();
    }
}
