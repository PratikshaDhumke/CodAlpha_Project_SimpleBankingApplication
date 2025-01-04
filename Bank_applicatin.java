import java.util.Scanner;

public class Bank_applicatin {

    private static double balance = 0.0;

   //Menu display
    public static void displayMenu() 
    {
        System.out.println("\nWelcome to Simple Bank");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    // Display deposit money
    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You deposited amount is: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // for withdraw money
    public static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("You withdrew amoutn is: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    //check the balance
    public static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting the program. Thank you for using Simple Bank!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}