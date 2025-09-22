package Modulo_6;

import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o seu fatorial: ");
		int n = sc.nextInt();
		int fat = n;

		if (n == 0) {
			System.out.print("O resultado de 0! é: 1");
		} else {
			for (int x = 1; x < n; x++) {

				fat = fat * (n - x);
			}
			System.out.print("O resultado de " + n + "! é: " + fat);
		}
		sc.close();
	}

}
