package Modulo_12;

import Modulo_12.entities.Client;
import Modulo_12.entities.Order;
import Modulo_12.entities.OrderItem;
import Modulo_12.entities.Product;
import Modulo_12.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class exercicio_1 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String name, email, product, status;
        int price, quantity, items;
        Date birthDate;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
        System.out.print("Birth Date: (DD/MM/YYYY): ");
        birthDate = sdf.parse(sc.next());
        sc.nextLine();
        System.out.println();

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        status = sc.nextLine();
        System.out.print("How many items to this order: ");
        items = sc.nextInt();
        sc.nextLine();

        Order order = new Order(new Date(), OrderStatus.valueOf(status),new Client(name,email,birthDate));

        for (int i = 0; i < items; i++) {
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.print("Product Name: ");
            product = sc.nextLine();
            System.out.print("Product Price: ");
            price = sc.nextInt();
            System.out.print("Quantity: ");
            quantity = sc.nextInt();
            sc.nextLine();
            order.addItem(new OrderItem(quantity,price,new Product(product,price)));
        }

        System.out.println();
        System.out.println(order.toString());
        sc.close();
    }

}
