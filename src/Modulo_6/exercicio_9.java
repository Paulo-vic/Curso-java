package Modulo_6;

import java.util.Scanner;

public class exercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu numero: ");
		int num = sc.nextInt();
		sc.close();
		for(int x = 1; x <= num; x = x + 1 ){
		if(num % x == 0){	
			System.out.println(x);
			}
		}
		sc.close();
	}

}
