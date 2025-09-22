package Modulo_10;

import java.util.Scanner;

public class exercicio_8 {

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

		quant = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				med += num[i];
				quant += 1;
			}
		}

		if (med != 0) {
			System.out.println("Media dos pares: " + (med / quant));
		} else {
			System.out.println("Nenhum numero par");
		}
		sc.close();
	}

}
