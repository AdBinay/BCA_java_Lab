import java.util.Scanner;

class BankAccount {
    private String name, acc_type;
    private int acc_no;
    private double balance;

    // Initialize account details
    public void initial(String name, int acc_no, String acc_type, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.acc_type = acc_type;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double c) {
        balance = balance + c;
    }

    // Method to withdraw money
    public void withdraw(double c) {
        if (balance < c) {
            System.out.println("Error!! Withdraw amount greater than balance");
        } else {
            balance = balance - c;
        }
    }

    // Method to display account details
    public void display() {
        System.out.println("Name = " + name);
        System.out.println("Account Number = " + acc_no);
        System.out.println("Account Type = " + acc_type);
        System.out.println("Balance amount = " + balance);
    }
}

public class DemoBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for account holder's name
        System.out.println("Enter the name of account holder:");
        String n = sc.nextLine();

        // Taking input for account number
        System.out.println("Enter account number:");
        int an = sc.nextInt();

        // Consuming the leftover newline
        sc.nextLine();

        // Taking input for account type
        System.out.println("Enter account type:");
        String at = sc.nextLine();

        // Taking input for initial balance
        System.out.println("Enter initial balance:");
        double d = sc.nextDouble();

        // Creating a BankAccount object and initializing it
        BankAccount b = new BankAccount();
        b.initial(n, an, at, d);

        // Depositing, withdrawing, and displaying account information
        b.deposit(10000);
        b.withdraw(5000);
        b.display();

        // Closing the scanner
        sc.close();
    }
}
