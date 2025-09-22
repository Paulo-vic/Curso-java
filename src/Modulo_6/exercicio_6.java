package Modulo_6;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de entradas: ");
		double num1 = 0, num2 = 0, num3 = 0;
		int n = sc.nextInt();
		
		
		for(int x = 1; x <= n ; x++) {
			num1 = sc.nextDouble(); num2 = sc.nextDouble(); num3 = sc.nextDouble();
			System.out.println("O valor da media ponderada é: " + ((num1 * 2 + num2 * 3 + num3 * 5)/10));
		}
		sc.close();
	}

}
