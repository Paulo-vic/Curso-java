package Modulo_10;

import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quant, med = 0;

		System.out.print("Entre a quantidade de numeros: ");
		quant = sc.nextInt();

		int[] num = new int[quant];

		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			med += num[i];
		}
		med = med / quant;
		System.out.println("Media do vetor: " + (med));

		System.out.println("Elementos abaixo da media:");
		for (int i = 0; i < num.length; i++) {
			if (num[i] < med) {
				System.out.println(num[i]);
			}
		}
		sc.close();
	}

}
