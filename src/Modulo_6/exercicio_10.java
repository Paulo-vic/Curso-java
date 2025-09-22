package Modulo_6;

import java.util.Scanner;

public class exercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu numero: ");
		int num = sc.nextInt();
		sc.close();
		for(int x = 1; x <= num; x = x + 1 ){
			
			System.out.println((x) + " "+ (x*x) + " " + (x*x*x) );
		}
		sc.close();

	}

}
