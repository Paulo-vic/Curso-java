package Modulo_10;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VectorOperations vec = new VectorOperations();

		System.out.print("Quantos numeros voce vai digitar? ");
		vec.quantVec();

		System.out.println("Valores = " + vec.toString());
		System.out.println("Soma = " + vec.soma());
		System.out.println("Media = " + vec.media());

		sc.close();
	}

}
