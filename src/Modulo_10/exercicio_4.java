package Modulo_10;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quant, cont = 0;

		System.out.print("Entre a quantidade de numeros: ");
		quant = sc.nextInt();

		int[] num = new int[quant];

		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextInt();
		}

		System.out.println("Numeros pares:");

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.print(num[i] + " ");
			}
		}

		System.out.println();

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				cont += 1;
			}
		}

		System.out.println("Quantidade de pares: " + cont);

		sc.close();
	}

}
