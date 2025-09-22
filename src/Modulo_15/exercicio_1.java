package Modulo_15;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> line = new ArrayList<>();
        List<String> resultLine = new ArrayList<>();
        String path = "Desenvolvimento/eclipse-workspace/curso_java/Exercicio_Modulo_15";
        String linha;
        String arquivo = "Desenvolvimento/eclipse-workspace/curso_java/Exercicio_Modulo_15/Arquivo_exercicio.csv";


        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            linha = br.readLine();
            while (linha != null) {
                line.add(linha);
                linha = br.readLine();
            }
            for (int i = 0; i < line.size(); i++) {
                StringBuilder result = new StringBuilder();

                String[] splitedLine = line.get(i).trim().split(";");
                double preco = Double.parseDouble(splitedLine[1]);
                int quantidade = Integer.parseInt(splitedLine[2]);
                double total = preco * quantidade;

                result.append(splitedLine[0]).append(";").append(total);
                resultLine.add(result.toString());
            }

            System.out.print("Digite o nome da pasta que você deseja criar: ");
            arquivo = sc.nextLine();
            path += "/" + arquivo;
            new File(path).mkdir();
            System.out.print("Digite o nome do arquivo csv que você deseja criar: ");
            arquivo = sc.nextLine();
            path += "/" + arquivo;

            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (String s : resultLine) {
                bw.write(s);
                bw.newLine();
            }
            bw.close();

       } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            sc.close();
        }
    }
}
