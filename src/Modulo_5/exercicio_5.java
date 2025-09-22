package Modulo_5;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod, quant;
		
		System.out.print("Digite o codigo do item e a quantidade desejada: ");
		cod = sc.nextInt(); quant = sc.nextInt();
		
		if (cod == 1) {
			System.out.println("O total do seu pedido é: "+ quant * 4.0 + " R$");
		}
		else if (cod == 2) {
			System.out.println("O total do seu pedido é: "+ quant * 4.50 + " R$");
		}
		else if (cod == 3) {
			System.out.println("O total do seu pedido é: "+ quant * 5.0 + " R$");
		}
		else if (cod == 4) {
			System.out.println("O total do seu pedido é: "+ quant * 2.0 + " R$");
		}
		else if (cod == 5) {
			System.out.println("O total do seu pedido é: "+ quant * 1.50 + " R$");
		}
		
		else System.out.println("Codigo invalido, tente novamente");
		
		sc.close();
		
	}

}
