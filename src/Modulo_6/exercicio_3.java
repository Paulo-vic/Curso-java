package Modulo_6;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha;
		int alc = 0, gas = 0, dis = 0;
		boolean sair = false;
		
		while(sair == false) {
			System.out.println("Selecione o combustivel que você ira abastecer");
			System.out.println("1 - Alcool");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Disel");
			System.out.println("4 - Sair");
			
			escolha = sc.nextInt();
			
			if(escolha == 1) {
				alc ++;
			}
			else if(escolha == 2) {
				gas ++;
			}
			else if(escolha == 3) {
				dis ++;
			}
			else if(escolha == 4) {
				System.out.println("Muito Obrigado!");
				System.out.println("Alcool: " + alc);
				System.out.println("Gasolina: " + gas);
				System.out.println("Disel: " + dis);
				sair = true;
				break;
			}
			else {
				System.out.println("Numero invalido tente novamente");
			}
			sc.close();
			}
		}

	}


