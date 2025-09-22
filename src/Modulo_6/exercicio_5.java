package Modulo_6;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de entradas: ");
		int in = 0, out = 0, num;
		int n = sc.nextInt();
		
		
		for(int x = 1; x <= n ; x++) {
			num = sc.nextInt();
			if(num >= 10 && num <= 20) {
			in++;	
			}
			else {out ++;}
		}
		
		sc.close();
		System.out.println("Numbers in the interval [10,20]: " + in);
		System.out.println("Numbers out of the interval [10,20]: " + out);
	}

}
