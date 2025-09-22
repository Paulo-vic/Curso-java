package Modulo_10;

import java.util.Scanner;

public class exercicio_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quant, idade;
		double altura, cont = 0;
		String nome;

		System.out.print("Entre o numero de pessoas: ");
		quant = sc.nextInt();
		sc.nextLine();

		int[] age = new int[quant];
		double[] height = new double[quant];
		String[] name = new String[quant];

		for (int i = 0; i < quant; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa ");
			System.out.print("Nome: ");
			nome = sc.nextLine();
			name[i] = nome;
			System.out.print("Idade: ");
			idade = sc.nextInt();
			age[i] = idade;
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			height[i] = altura;
			sc.nextLine();
		}

		idade = 0;
		altura = 0;

		for (int i = 0; i < quant; i++) {
			idade += age[i];
			altura += height[i];
		}

		System.out.println("Media de altura: " + (altura / quant));
		System.out.println("Media de idade: " + (idade / quant));

		for (int i = 0; i < quant; i++) {
			if (age[i] < 16) {
				cont += 1;
			}
		}
		if (cont != 0) {
			System.out.println("Porcentagem de pessoas com menos de 16 anos: " + ((cont / quant) * 100) + "%");
		} else {
			System.out.println("Porcentagem de pessoas com menos de 16 anos: " + (cont) + "%");
		}

		System.out.println("Nome das pessoas menores de 16 anos");

		for (int i = 0; i < quant; i++) {
			if (age[i] < 16) {
				System.out.println(name[i]);
			} else {
				System.out.println("Não ha pessoas com menos de 16 anos");
			}
			sc.close();
		}
	}
}