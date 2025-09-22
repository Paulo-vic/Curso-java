package Modulo_10;

import java.util.Scanner;

public class exercicio_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quant, contF = 0, contM = 0;
		double altura, maior, menor, media = 0;
		String genero;

		System.out.print("Entre o numero de pessoas: ");
		quant = sc.nextInt();
		sc.nextLine();

		double[] height = new double[quant];
		String[] gender = new String[quant];

		for (int i = 0; i < height.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa ");
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			height[i] = altura;
			sc.nextLine();
			System.out.print("Genero: ");
			genero = sc.nextLine();
			gender[i] = genero;
		}

		maior = height[1];
		menor = height[1];

		for (int i = 0; i < height.length; i++) {
			if (height[i] < menor) {
				menor = height[i];
			}
			if (height[i] > maior) {
				maior = height[i];
			}
			if (gender[i].equalsIgnoreCase("f")) {
				media += height[i];
				contF += 1;
			}
			if (gender[i].equalsIgnoreCase("m")) {
				contM += 1;
			}
		}

		System.out.println("Menor altura = " + menor);
		System.out.println("Maior altura = " + maior);
		System.out.println("Media de altura das mulheres = " + (media / contF));
		System.out.println("Numero de homens: " + contM);

		sc.close();
	}

}
