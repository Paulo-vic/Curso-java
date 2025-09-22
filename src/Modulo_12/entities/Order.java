package Modulo_12.entities;

import Modulo_12.entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;

    List<OrderItem> items = new ArrayList<OrderItem>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public void getItems() {
        for (OrderItem item : items) {
            System.out.println(item);
        }
    }

    public double getTotal() {
        double total = 0.0;
        for (OrderItem item : items) {
            total += item.subTotal();
        }
        return total;
    }

    public String printItems() {
        StringBuilder sb = new StringBuilder();
        for (OrderItem item : items) {
            sb.append(item.toString() + "\n");
        }
        return sb.toString();
    }

    public String toString() {
        return "Order Summary: \n" +
                "Order Moment: " + moment.toString() + "\n" +
                "Order Status: " + status + "\n" +
                "Client: " + client.toString() + "\n" +
                "Order Items: \n" + printItems() + "\n" +
                "Total Price: $" + getTotal();
    }

}
