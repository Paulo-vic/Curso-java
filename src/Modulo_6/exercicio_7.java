package Modulo_6;

import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de entradas: ");
		double num1 = 0, num2 = 0;
		int n = sc.nextInt();

		for (int x = 1; x <= n; x++) {
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			if (num1 == 0 || num2 == 0) {
				System.out.println("Divisão impossivel");
			} else {
				System.out.println("O valor da divisão é: " + (num1 / num2));
			}
		}
		sc.close();
	}

}
