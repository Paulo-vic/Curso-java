package Modulo_6;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Defina sua senha: ");
		int senha = sc.nextInt();
		System.out.println("Senha definida com sucesso");
		int login = 0;
		
		while(login != senha) {
			System.out.print("Insira sua senha: ");
			login = sc.nextInt();
			System.out.println("Senha incorreta, tente novamente.");
		}
		System.out.println("Senha correta, seja bem vindo.");
		sc.close();
	}

}
