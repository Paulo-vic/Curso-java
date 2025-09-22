package Modulo_10;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quant;

		System.out.print("Entre a quantidade de numeros dos vetores: ");
		quant = sc.nextInt();

		int[] num1 = new int[quant];
		int[] num2 = new int[quant];
		int[] sum = new int[quant];

		System.out.println("Preencha os " + quant + "numeros do vetor A:");
		for (int i = 0; i < num1.length; i++) {
			num1[i] = sc.nextInt();
		}

		System.out.println("Preencha os " + quant + "numeros do vetor B:");
		for (int i = 0; i < num2.length; i++) {
			num2[i] = sc.nextInt();
		}
		System.out.println("O vetor resultante da soma do vetor A com o vetor B é: ");
		for (int i = 0; i < num1.length; i++) {
			sum[i] = (num1[i] + num2[i]);
			System.out.println(sum[i]);

			sc.close();
		}
	}

}
