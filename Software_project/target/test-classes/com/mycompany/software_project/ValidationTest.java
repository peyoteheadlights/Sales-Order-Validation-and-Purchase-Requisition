package com.mycompany.software_project;

public class ValidationTest {

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

        OrderValidation validator =
                new OrderValidation();

        boolean result =
                validator.validate(order);

        System.out.println("===== VALIDATION TEST =====");

        if (result) {
            System.out.println("Order is valid");
        } else {
            System.out.println("Order is invalid");
        }
    }
}