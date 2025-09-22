package Modulo_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quant, id, porcentagem;
		double salario;
		String nome;

		System.out.print("How many employees will be registered? ");
		quant = sc.nextInt();
		sc.nextLine();
		
		List<Employee> employees = new ArrayList<>();

		for(int i = 0; i < quant; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			nome = sc.nextLine();
			System.out.print("Salary: ");
			salario = sc.nextInt();
			sc.nextLine();
			Employee emp = new Employee(id, nome, salario);
			employees.add(emp);
			System.out.println();
		}
		
		System.out.print("Enter the employee Id that will have a salary increse: ");
		id = sc.nextInt();
		System.out.print("Enter the percentage increase: ");
		porcentagem = sc.nextInt();
		
		for(int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getId() == id) {
				employees.get(i).percentIncrease(porcentagem);
			}
		}
		
		System.out.println("List of employees: ");
		
		for(int i = 0; i < employees.size(); i++) {
		System.out.println(employees.get(i));	
		}
		sc.close();
	}

}
