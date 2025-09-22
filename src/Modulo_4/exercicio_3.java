package Modulo_4;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int num4;
		
		System.out.print("Digite o primeiro valor: ");
		num1 = sc.nextInt();
		
		System.out.print("");
		
		System.out.print("Digite o segundo valor: ");
		num2 = sc.nextInt();
		
		System.out.print("");
		
		System.out.print("Digite o terceiro valor: ");
		num3 = sc.nextInt();
		
		System.out.print("");
		
		System.out.print("Digite o quarto valor: ");
		num4 = sc.nextInt();
		
		System.out.print("");
		
		System.out.println("O valor da diferença dos produtos " + num1 + "x" + num2 + " e " + num3 + "x" + num4 + " é: " + (num1*num2 - num3*num4));

	}

}
