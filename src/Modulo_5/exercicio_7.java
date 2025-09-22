package Modulo_5;

import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.print("Digite o x: ");
		x = sc.nextDouble();
		
		System.out.print("Digite o y: ");
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.print("Ponto de origem");
		}
		
		else if(x > 0.0 && y > 0.0) {
			System.out.print("Quadrante 1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.print("Quadrante 2");
		}
		
		else if (x < 0.0 && y < 0.0) {
			System.out.print("Quadrante 3");
		}
		
		else if (x > 0.0 && y < 0.0) {
			System.out.print("Quadrante 4");
		}
		
		else if (x == 0 && y != 0) {
			System.out.print("Eixo x");
		}
		
		else if (x != 0 && y == 0) {
			System.out.print("Eixo y");
		}
		
		sc.close();
	}

}
