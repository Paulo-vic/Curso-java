package Modulo_4;

import java.util.Scanner;

public class exercicio_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod1;
		int cod2;
		int quant1;
		int quant2;
		double din1;
		double din2;
		
		System.out.print("Digite o codigo, quantidade e valor do primeiro item: ");
		cod1 = sc.nextInt(); quant1 = sc.nextInt(); din1 = sc.nextInt();
		
		System.out.print(false);
		
		System.out.print("Digite o codigo, quantidade e valor do segundo item: ");
		cod2 = sc.nextInt(); quant2 = sc.nextInt(); din2 = sc.nextInt();
		
		System.out.println("Valor a pagar: " + ((quant1*din1)+(quant2*din2)) + "R$");
		sc.close();
		
	}
}
