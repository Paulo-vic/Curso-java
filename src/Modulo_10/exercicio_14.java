package Modulo_10;

import java.util.Scanner;

public class exercicio_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int linha, coluna, num;

		System.out.print("Entre o numero de linhas e colunas: ");
		linha = sc.nextInt();
		coluna = sc.nextInt();

		int mat[][] = new int[coluna][linha];

		for (int i = 0; i < mat.length; i++) {
			for (int z = 0; z < mat[i].length; z++) {
				System.out.print("Entre o seu numero: ");
				mat[i][z] = sc.nextInt();
			}
		}
		System.out.print("Entre o numero a ser procurado: ");
		num = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int z = 0; z < mat[i].length; z++) {
				if (mat[i][z] == num) {
					coluna = i;
					linha = z;

					System.out.println("Posição: " + coluna + "," + linha);

					if ((z - 1) >= 0) {
						System.out.println("Numero a esquerda: " + mat[i][z - 1]);
					} 
					if ((z + 1) < mat[coluna].length) {
						System.out.println("Numero a direita: " + mat[i][z + 1]);
					} 
					if ((i - 1) >= 0) {
						System.out.println("Numero acima: " + mat[i - 1][z]);
					} 
					if ((i + 1) < mat.length) {
						System.out.println("Numero abaixo: " + mat[i + 1][z]);
					}
					System.out.println();
				}
			}
		}
		sc.close();
	}

}
