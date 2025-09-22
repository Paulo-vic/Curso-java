package Modulo_18;

import Modulo_18.Entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path;
        double filter, sum = 0;
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the full file path: "); // /home/paulovictor/Desenvolvimento/eclipse-workspace/curso_java/Exercicio_Modulo_18/Arquivo_exercicio.csv
        path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(";");
                String name = data[0];
                String email = data[1];
                Double salary = Double.parseDouble(data[2]);
                employees.add(new Employee(name, email, salary));

                line = br.readLine();
            }
            System.out.print("Enter the salary filter: ");
            filter = sc.nextDouble();

            for (Employee employee : employees) {
                if (employee.getSalary() > filter) {
                    System.out.println(employee.getEmail());
                }
                if (employee.getName().startsWith("M")){
                    sum =+ employee.getSalary();
                }
            }
            System.out.print("Sum of the salaries of employees whose name starts with 'M' : " + sum);

        }
        catch (IOException e){
            System.out.println("File not found\n" + e.getMessage());
        }
        finally {
            sc.close();
        }

    }
}
