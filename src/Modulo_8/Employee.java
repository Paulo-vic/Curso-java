package Modulo_8;

public class Employee {
	String name;
	double sal_brut;
	double taxa;

	public double netSalary() {
		return sal_brut - taxa;
	}

	public void increaseSalary(double percent) {
		sal_brut = sal_brut + ((percent / 100) * sal_brut);
		System.out.print("Updated salary: " + sal_brut);
	}

	public String toString() {
		return ("Employee: " + name + ", $ " + netSalary());
	}

}
