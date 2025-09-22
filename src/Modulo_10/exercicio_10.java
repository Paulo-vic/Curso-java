package Modulo_10;

import java.util.Scanner;

public class exercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quant;
		double nota;
		String nome;

		System.out.print("Entre o numero de pessoas: ");
		quant = sc.nextInt();
		sc.nextLine();

		double[] score1 = new double[quant];
		double[] score2 = new double[quant];
		String[] name = new String[quant];

		for (int i = 0; i < quant; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa ");
			System.out.print("Nome: ");
			nome = sc.nextLine();
			name[i] = nome;
			System.out.print("Primeira nota: ");
			nota = sc.nextInt();
			score1[i] = nota;
			System.out.print("Segunda nota: ");
			nota = sc.nextDouble();
			score2[i] = nota;
			sc.nextLine();
		}
		
		System.out.println("Alunos aprovados:");
		
		for (int i = 0; i < quant; i++) {
			if((score1[i]+score2[i])/2 >= 6) {
				System.out.println(name[i]);
			}
		}
		sc.close();
	}

}
