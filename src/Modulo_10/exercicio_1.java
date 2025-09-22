package Modulo_10;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Quantos numeros voce vai digitar? ");
		num = sc.nextInt();
		int[] entry = new int[num];

		for (int i = 0; i < entry.length; i++) {
			System.out.print("Digite um numero: ");
			entry[i] = sc.nextInt();
		}

		System.out.println("Numeros negativos:");

		for (int i = 0; i < entry.length; i++) {
			if (entry[i] < 0) {
				System.out.println(entry[i]);
			}
		}
		sc.close();
	}

}
