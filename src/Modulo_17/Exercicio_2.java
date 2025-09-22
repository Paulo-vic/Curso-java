package Modulo_17;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;
import java.util.*;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path;
        Map<String, Integer> votes = new HashMap<>();

        System.out.print("Digite o caminho do arquivo: "); // /home/paulovictor/Desenvolvimento/eclipse-workspace/curso_java/Exercicio_Modulo_17/Arquivo_exercicio.csv
        path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String linha = br.readLine();
            while (linha != null){
                String[] split = linha.split(";");
                votes.merge(split[0], Integer.parseInt(split[1]), Integer::sum);
                linha = br.readLine();
            }

            Set<String> keys = new HashSet<>(votes.keySet());
            for (String key : keys){
                System.out.println(key + ": " + votes.get(key));
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            sc.close();
        }
    }
}
