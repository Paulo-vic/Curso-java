package Modulo_8;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	String name;
	int nota1, nota2, nota3;
	
	public void setNota(){
		System.out.print("Enter your grade for the first test: ");
		nota1 = sc.nextInt();
		System.out.println();
		System.out.print("Enter your grade for the second test: ");
		nota2 = sc.nextInt();
		System.out.println();
		System.out.print("Enter your grade for the third test: ");
		nota3 = sc.nextInt();
		System.out.println();
	}
	
	public void getAproval(){
		if((nota1 + nota2 + nota3) >= 60) {
			System.out.println("Your final grade was: " + (nota1 + nota2 + nota3));
			System.out.println("You are aproved :)");
		}
		else{
			System.out.println("Your final grade was: " + (nota1 + nota2 + nota3));
			System.out.println("You have failed");
			System.out.println("You were missing " + ((nota1 + nota2 + nota3) - 60) + " points");
		}
	}

}