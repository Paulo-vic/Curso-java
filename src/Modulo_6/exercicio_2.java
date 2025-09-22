package Modulo_6;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escreva suas cordenadas x e y: ");
		int x = sc.nextInt(); int y = sc.nextInt();
		
		while(x != 0 && y != 0){
			if(x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			}
			else if(x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			}
			else if(x > 0 && y < 0) {
				System.out.println("Quarto quadrante");
			}
			System.out.print("Escreva suas cordenadas x e y: ");
			x = sc.nextInt(); y = sc.nextInt();
		}
		sc.close();
	}

}
