package Modulo_10;

import java.util.Scanner;

public class exercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quant, idade;
		String nome;

		System.out.print("Entre o numero de pessoas: ");
		quant = sc.nextInt();
		sc.nextLine();

		int[] age = new int[quant];
		String[] name = new String[quant];

		for (int i = 0; i < quant; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa ");
			System.out.print("Nome: ");
			nome = sc.nextLine();
			name[i] = nome;
			System.out.print("Idade: ");
			idade = sc.nextInt();
			age[i] = idade;
			sc.nextLine();
		}
		
		idade = 0; quant = 0;
		
		for(int i = 0; i < age.length; i++) {
			if(age[i] > idade) {
				idade = age[i];
				quant = i;
			}
		}
		
		System.out.println("Nome da pessoa mais velha: " + name[quant]);
		
		sc.close();
	}
}
