package Modulo_17;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quant;

        Set<Integer> idA = new HashSet<>();
        Set<Integer> idB = new HashSet<>();
        Set<Integer> idC = new HashSet<>();

        System.out.print("How many students for course A: ");
        quant = sc.nextInt();
        for (int i = 0; i < quant; i++) {
            int id = sc.nextInt();
            idA.add(id);
        }

        System.out.print("How many students for course B: ");
        quant = sc.nextInt();
        for (int i = 0; i < quant; i++) {
            int id = sc.nextInt();
            idB.add(id);
        }

        System.out.print("How many students for course C: ");
        quant = sc.nextInt();
        for (int i = 0; i < quant; i++) {
            int id = sc.nextInt();
            idC.add(id);
        }
        int total = idA.size()+idB.size()+idC.size();

        System.out.println("Total students: " + total);

        sc.close();
    }
}
