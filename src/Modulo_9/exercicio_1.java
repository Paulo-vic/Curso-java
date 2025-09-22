package Modulo_9;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int code;
		String name;
		double balance;
		Account ac;

		System.out.print("Enter the account code: ");
		code = sc.nextInt();
		name = sc.nextLine();
		System.out.print("Enter the account holder: ");
		name = sc.nextLine();
		System.out.print("Enter initial deposit (y/n)? ");

		if (sc.nextLine().equalsIgnoreCase("y")) {
			System.out.print("Enter the deposit value: ");
			balance = sc.nextDouble();
			ac = new Account(code, name, balance);
		} else {
			ac = new Account(code, name);
		}

		System.out.println("Account data:");
		System.out.println(ac);

		System.out.print("Enter a deposit value: ");
		ac.deposit(sc.nextDouble());
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(ac);
		System.out.println("Note: Every withdraw has a $5 cost");
		System.out.print("Enter a withdraw value: ");
		ac.withdrawl(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(ac);

	}

}