package Modulo_9;

public class Account {
	private int code;
	private String name;
	private double balance;

	public Account(int code, String name, double balance) {
		super();
		this.code = code;
		this.name = name;
		this.balance = balance;
	}

	public Account(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdrawl(double amount) {
		balance -= (amount + 5);
	}

	@Override
	public String toString() {
		return "Account " + code + ", Holder: " + name + ", Balance: $ " + balance;
	}

}
