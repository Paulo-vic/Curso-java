package Modulo_10;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quant, ind = 0, comp = 0;

		System.out.print("Entre a quantidade de numeros: ");
		quant = sc.nextInt();

		int[] num = new int[quant];

		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] > comp) {
				ind = i;
				comp = num[i];
			}
		}
		System.out.println("Maior valor: " + comp);
		System.out.println("Index do maior valor: " + ind);

		sc.close();
	}

}
