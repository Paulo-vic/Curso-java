package Modulo_5;

import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sal;
		
		System.out.print("Digite seu salario: ");
		sal = sc.nextDouble();
		
		if (sal >= 2000.001 && sal <= 3000.0){
			System.out.println("O seu imposto de renda é: "+ (sal - 2000)*0.08 + "R$");
		}
		else if (sal >= 3000.001 && sal <= 4500.0){
			System.out.println("O seu imposto de renda é: "+ (1000 * 0.08 + (sal - 3000) * 0.18) + " R$");
		}
		else if (sal >= 4500.001) {
			System.out.println("O seu imposto de renda é: "+ ((1000 * 0.08) + (1500 * 0.18) + (sal - 4500) * 0.28) + "R$");
		}
		else {System.out.println("Isento");}
		sc.close();
	}
}
