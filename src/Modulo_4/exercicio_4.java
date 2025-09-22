package Modulo_4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double horas;
		double salHora;
		
		System.out.print("Input your work hours: ");
		horas = sc.nextInt();

		System.out.print("");
		
		System.out.print("Input your hourly wage: ");
		salHora = sc.nextInt();
		
		double salario = horas * salHora;
		
		System.out.printf("Your monthly salary is: " + "%.2f%n",salario);
		sc.close();
		
	}

}
