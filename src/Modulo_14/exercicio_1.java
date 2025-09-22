package Modulo_14;

import Modulo_14.entities.Account;
import Modulo_14.exceptions.AccountException;

import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int number;
            double balance, limit, withdraw;
            String holder;

            System.out.println("Enter account data");
            System.out.print("Number: ");
            number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            holder = sc.nextLine();
            System.out.print("Initial balance: ");
            balance = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            limit = sc.nextDouble();

            Account ac = new Account(number, holder, balance, limit);
            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            withdraw = sc.nextDouble();
            ac.withdraw(withdraw);

            System.out.println("Remaining account balance: " + ac.getBalance());
            sc.close();
        }
        catch (AccountException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}
