package Modulo_8;
import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		System.out.println("Enter the retangle width and and height:");
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		
		System.out.println("Area: " + ret.area());
		System.out.println("Perimeter: " + ret.perimetro());
		System.out.println("Diagonal: " + ret.diagonal());
	}

}
