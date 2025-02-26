package bankApp;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class bankOperations {

    static Map<Integer, bank> accounts = new HashMap<>();

    static AtomicInteger atomic = new AtomicInteger(1082);

    public static int genTransactionId() {
        return atomic.getAndIncrement();
    }

    public static void openAccount(bank b) {
        if (accounts.containsKey(b.getAccNo()))
            System.out.println("Account with this number already exists!");
        else
            accounts.put(b.getAccNo(), b);
        System.out.println("Account opened successfully!");
    }

    public static void deposit(int accNo, double amount) {
        bank account = accounts.get(accNo);
        if (account != null) {
            account.setAccBal(account.getAccBal() + amount);
            System.out.println("Your amount of : " + amount + " has been successfully deposited");
            System.out.println(
                    "New balance is : " + account.getAccBal() + " Your transaction id is: " + genTransactionId());
        } else
            System.out.println("We are sorry your account is does not exist");
    }

    public static void withdraw(int accNo, double amount) {
        bank account = accounts.get(accNo);
        if (account != null) {
            if (account.getAccBal() >= amount) {
                account.setAccBal(account.getAccBal() - amount);
                System.out.println("Your amount of : " + amount + " has been successfully withdrawn");
                System.out.println(
                        "New balance is : " + account.getAccBal() + " Your transaction id is: " + genTransactionId());
            } else
                System.out.println("Insufficient Balance!");
        } else
            System.out.println("We are sorry your account is does not exist");
    }

    public static void displayBalance(int accNo) {

        bank account = accounts.get(accNo);
        if (account == null)
            System.out.println("Account does not exist");
        else
            System.out.println("Current Balance : " + account.getAccBal());

    }

    public static void displayAccountdetials(int accNo) {
        bank account = accounts.get(accNo);
        if (account != null)
            System.out.println(account);
        else
            System.out.println("Sorry your account does not exist");
    }

    public static void deleteAcc(int accNo) {
        if (accounts.containsKey(accNo)) {
            accounts.remove(accNo);
            System.out.println("Your account has been deleted...\nWe are sad to see you go...");
        } else
            System.out.println("Sorry your account does not exist");

    }

}
