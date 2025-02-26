package bankApp;

import java.util.Scanner;

public class bankInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to ABC Bank!");
            System.out.println("Chose any 1 of the below options!!");
            System.out.println("1. Open an Account with us!");
            System.out.println("2. Deposit funds to your account");
            System.out.println("3. Withdraw funds from your account");
            System.out.println("4. No longer bank with us :( / Delete your account");
            System.out.println("5. Display your Balance!");
            System.out.println("6. Display all your account details");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            if (choice == 0)
                break;

            String name, accType;
            int accNo;
            double accBal;
            bank b;
            switch (choice) {
                case 1:
                    System.out.println("We welcome you to bank with us !");
                    System.out.println("Please enter your name :");
                    name = sc.next();
                    System.out.println("Enter the amount you want to deposit !");
                    accBal = sc.nextDouble();
                    System.out.println("Enter the account type you want to open with us... Current/Savings/Salary");
                    accType = sc.next();
                    System.out.println("Since we are just begining, how about we let you chose your own account no.");
                    accNo = sc.nextInt();

                    b = new bank(accNo, name, accBal, accType);
                    bankOperations.openAccount(b);
                    break;
                case 2:
                    System.out.println("Enter your account number: ");
                    accNo = sc.nextInt();
                    System.out.println("Enter the amount you want to deposit: ");
                    double amtdep = sc.nextDouble();
                    bankOperations.deposit(accNo, amtdep);
                    break;

                case 3:
                    System.out.println("Enter your account number: ");
                    accNo = sc.nextInt();
                    System.out.println("Enter the amount you want to withdraw: ");
                    double amtwit = sc.nextDouble();
                    bankOperations.withdraw(accNo, amtwit);
                    break;

                case 4:
                    System.out.println("Enter your account number: ");
                    accNo = sc.nextInt();
                    bankOperations.deleteAcc(accNo);
                    break;

                case 5:
                    System.out.println("Enter your account number: ");
                    accNo = sc.nextInt();
                    bankOperations.displayBalance(accNo);
                    break;

                case 6:
                    System.out.println("Enter your account number: ");
                    accNo = sc.nextInt();
                    bankOperations.displayAccountdetials(accNo);
                    break;

                default:
                    System.out.println("Invalid Choice");

            }
        }
        sc.close();
    }

}
