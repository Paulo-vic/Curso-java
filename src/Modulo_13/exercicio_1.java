package Modulo_13;

import Modulo_13.entities.Imposto;
import Modulo_13.entities.pessoaFisica;
import Modulo_13.entities.pessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        char tipo;
        int funcionarios, quant;
        double renda, saude;
        List<Imposto> imp = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        quant = sc.nextInt();

        for (int i = 0; i < quant; i++) {
            System.out.print("Individal or Company (i/c)? ");
            tipo = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            nome = sc.nextLine();
            System.out.print("Anual Income: ");
            renda = sc.nextDouble();
            sc.nextLine();
            if (tipo == 'c') {
                System.out.print("Number of employees: ");
                funcionarios = sc.nextInt();
                imp.add(new pessoaJuridica(nome, renda, funcionarios));
            }
            else if (tipo == 'i') {
                System.out.print("Health expenditures: ");
                saude = sc.nextDouble();
                imp.add(new pessoaFisica(nome, renda, saude));
            }
            else {
                System.out.println("Opção invalida!");
            }
            sc.nextLine();
        }
        renda = 0;

        System.out.println("Taxes Paid:");
        for (Imposto imposto : imp) {
            imposto.calculaImposto();
            System.out.println(imposto.getNome() + " $ " + imposto.getImposto());
            renda += imposto.getImposto();
        }

        System.out.println("Total Taxes: $" + renda);
        sc.close();
    }
}
