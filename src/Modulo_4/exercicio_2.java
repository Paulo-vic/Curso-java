package Modulo_4;
import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio; 
		double pi = 3.14159;
		
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		double area = (pi * (raio * raio));

        System.out.printf("A area do circulo é: " + "%.4f%n", area );
        sc.close();
	}

}
