//Create a simple menu driven program for an ATM. Employ different methods like withdraw, check_balance, deposit etc using an object of the class.

import java.util.Scanner;

public class ATM {
    private int pin;
    private String acc_name;
    private double balance;
    private String acc_type;

    public ATM(int pin, double balance, String acc_type, String acc_name) {
        this.pin = pin;
        this.balance = balance;
        this.acc_type = acc_type;
        this.acc_name = acc_name;
    }

    public void check_balance() {
        System.out.println("Account Holder : " + acc_name);
        System.out.println("Account type : " + acc_type);
        System.out.println("Current Balance : " + balance);
    }

    public boolean withdraw(Scanner sc, double amount) {
        System.out.println("Enter your pin : ");
        int sec_pin = sc.nextInt();
        if (pin == sec_pin) {
            if (amount > balance) {
                System.out.println("Insufficient balance. Try again later.");
                return false;
            }
            System.out.println("Collect your Money : " + amount);
            balance = balance - amount;
            return true;
        } else {
            System.out.println("Pin entered incorrectly . Try again after some Time.");
            return false;
        }
    }

    public boolean deposit(Scanner sc, double amount) {
        System.out.println("Enter your pin : ");
        int sec_pin = sc.nextInt();
        if (pin == sec_pin) {
            System.out.println("Money deposited in your account.");
            balance = balance + amount;
            System.out.println("Current Balance : " + balance);
            return true;
        } else {
            System.out.println("Pin entered incorrectly . Try again after some Time.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(1234, 15000, "Savings", "Harshit Agrawal");
        int choice;
        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    atm.check_balance();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw : ");
                    double withdraw_amount = sc.nextDouble();
                    if (atm.withdraw(sc, withdraw_amount)) {
                        System.out.println("Money withdrawn successfully.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit : ");
                    double deposit_amount = sc.nextDouble();
                    if (atm.deposit(sc, deposit_amount)) {
                        System.out.println("Money deposited successfully.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }
}