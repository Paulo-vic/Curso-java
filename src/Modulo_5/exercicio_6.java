package Modulo_5;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		System.out.print("Digite seu numero entre os seguintes intervalos [0,25], [25,50], [50,75], [75,100]: ");
		num = sc.nextDouble();
		
		if(num >= 0 && num <= 25.0) {
			System.out.println("O seu numero esta entre 0 e 25");
		}
		else if (num >= 25 && num <= 50.0) {
			System.out.println("O seu numero esta entre 25 e 50");
		}
		else if (num >= 50 && num <= 75.0) {
			System.out.println("O seu numero esta entre 50 e 75");
		}
		else if (num >= 75 && num <= 100) {
			System.out.println("O seu numero esta entre 75 e 100");
		}
		else System.out.println("O seu numero esta fora de intervalo");
		sc.close();
	}

}
