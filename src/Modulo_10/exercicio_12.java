package Modulo_10;

import java.util.Scanner;

public class exercicio_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quant, quarto;
		String nome, emaill;

		System.out.print("How many rooms will be rented?: ");
		quant = sc.nextInt();
		sc.nextLine();

		String[] name = new String[10];
		String[] email = new String[10];
		Integer[] room = new Integer[10];

		for (int i = 0; i < quant; i++) {
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			nome = sc.nextLine();
			System.out.print("Email: ");
			emaill = sc.nextLine();
			System.out.print("Room: ");
			quarto = sc.nextInt();
			sc.nextLine();
			name[quarto] = nome;
			email[quarto] = emaill;
			room[quarto] = quarto;
		}

		System.out.println("Busy rooms:");
		for (int i = 0; i < room.length; i++) {
			if (room[i] != null) {
				System.out.println(room[i] + ": " + name[i] + ", " + email[i]);
			}
		}
		sc.close();
	}

}
