package Modulo_8;

import java.util.Scanner;

public class exercicio_2 {	
		public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Employee emp = new Employee();
	
	System.out.print("Enter the employee name: ");
	emp.name = sc.nextLine();
	System.out.print("Enter the employee gross salary: ");
	emp.sal_brut = sc.nextDouble();
	System.out.print("Enter the employee tax: ");
	emp.taxa = sc.nextDouble();
	
	System.out.print("Your salary after tax is: $ " + emp.netSalary());
	System.out.println("");
	System.out.print("Enter wich to percent increase the employee salary: ");
	emp.increaseSalary(sc.nextDouble());
	System.out.println();
	System.out.println(emp);
	sc.close();
		}
}
