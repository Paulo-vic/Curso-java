package Modulo_5;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digite o horario de começo do jogo: ");
		num1 = sc.nextInt();

		System.out.print("Digite o horario do fim do jogo: ");
		num2 = sc.nextInt();
		
		if((num1 >= 0 && num1 <= 23) && (num2 >= 0 && num2 <= 23)) {
			
			if (num1 < num2) {
				System.out.println("O jogo durou " + (num2 - num1)  + " horas.");
			}
			
			else if (num1 > num2) {
				System.out.println("O jogo durou " + (24 - num1 + num2) + " horas.");
			}
			
		}
		
		else {
			System.out.println("Horarios maiores que 23 e menores que 0 são invalidos, tente novamente");
		}
		
		sc.close();
	}

}
