package Modulo_4;
import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Digite o primeiro valor: ");
		num1 = sc.nextInt();
		
		System.out.print("");
		
		System.out.print("Digite o segundo valor: ");
		num2 = sc.nextInt();
		
		System.out.print("");
		
		System.out.println("A soma entre " + num1 + " e " + num2 + " é: " + (num1 + num2));
		
		sc.close();

	}

}
