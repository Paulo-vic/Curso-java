package Modulo_10;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addSalary(double increment) {
		this.salary += increment;
	}
	
	public void percentIncrease(double increment) {
		addSalary(getSalary()*(increment/100));
	}

	public String toString() {
		return (id + ", " + name + ", " + salary);
	}
	
}
