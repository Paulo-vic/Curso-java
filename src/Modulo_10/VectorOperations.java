package Modulo_10;

import java.util.Scanner;

public class VectorOperations {
	Scanner sc = new Scanner(System.in);

	private int limit;
	public int[] entry;

	public void setLimit(int num) {
		limit = num;
	}

	public int getLimit() {
		return limit;
	}

	public void quantVec() {
		limit = sc.nextInt();
		this.entry = new int[limit];

		for (int i = 0; i < this.entry.length; i++) {
			System.out.print("Digite um numero: ");
			this.entry[i] = sc.nextInt();
		}
	}

	public void negNum() {
		for (int i = 0; i < this.entry.length; i++) {
			if (this.entry[i] < 0) {
				System.out.println(this.entry[i]);
			}
		}
	}

	public int soma() {
		int soma = 0;

		for (int i = 0; i < this.entry.length; i++) {
			soma += this.entry[i];
		}
		return soma;
	}

	public int media() {
		return (soma() / this.entry.length);
	}

	public String toString() {
		String vector = "";

		for (int i = 0; i < this.entry.length; i++) {
			vector += (" " + this.entry[i]);
		}
		return vector;
	}

}
