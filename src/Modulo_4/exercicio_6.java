package Modulo_4;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A, B, C;
		double pi = 3.14159;
		
		System.out.print("Digite os valores A, B e C: ");
		A =  sc.nextDouble(); B = sc.nextDouble(); C = sc.nextDouble();
		
		System.out.println("Area de um triangulo rentangulo que tem A por base e C por altura: " + ((A*C)/2));
		System.out.println("Area de um círculo de raio C: " + (pi*(C*C)));
		System.out.println("Area de um trapézio que tem A e B por bases e C por altura: " + ((A+B)*C)/2);
		System.out.println("Area de um quadrado que tem lado B: " + B*2);
		System.out.println("Area de um retângulo que tem lados A e B: " + A*B);
		
		sc.close();
	}

}
