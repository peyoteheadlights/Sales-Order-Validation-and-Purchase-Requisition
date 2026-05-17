package com.mycompany.software_project;

public class SalesOrderTest {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "C001",
                "Mark"
        );

        Book book = new Book(
                "B101",
                "Java",
                250,
                10,
                5,
                "OReilly"
        );

        SalesOrder order = new SalesOrder(
                "O1001",
                customer
        );

        SalesOrderItem item = new SalesOrderItem(
                book,
                2,
                250
        );

        order.addItem(item);

        double total = order.calculateTotal();

        System.out.println("===== SALES ORDER TEST =====");

        System.out.println("Order ID: "
                + order.getOrderId());

        System.out.println("Customer: "
                + order.getCustomer().getName());

        System.out.println("Total: "
                + total);
    }
}