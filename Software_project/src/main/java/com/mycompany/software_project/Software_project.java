package com.mycompany.software_project;

import java.util.Scanner;

public class Software_project {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Catalogue catalogue = Catalogue.getInstance();

        // Enter Book 1

        System.out.println("Enter First Book Details");

        System.out.print("Book ID: ");
        String bookId1 = input.nextLine();

        System.out.print("Book Title: ");
        String title1 = input.nextLine();

        System.out.print("Price: ");
        double price1 = input.nextDouble();

        System.out.print("Quantity: ");
        int quantity1 = input.nextInt();

        System.out.print("Minimum Threshold: ");
        int threshold1 = input.nextInt();

        input.nextLine();

        System.out.print("Publisher: ");
        String publisher1 = input.nextLine();

        Book book1 = new Book(
                bookId1,
                title1,
                price1,
                quantity1,
                threshold1,
                publisher1
        );

        catalogue.addBook(book1);

        // Enter Book 2

        System.out.println("\nEnter Second Book Details");

        System.out.print("Book ID: ");
        String bookId2 = input.nextLine();

        System.out.print("Book Title: ");
        String title2 = input.nextLine();

        System.out.print("Price: ");
        double price2 = input.nextDouble();

        System.out.print("Quantity: ");
        int quantity2 = input.nextInt();

        System.out.print("Minimum Threshold: ");
        int threshold2 = input.nextInt();

        input.nextLine();

        System.out.print("Publisher: ");
        String publisher2 = input.nextLine();

        Book book2 = new Book(
                bookId2,
                title2,
                price2,
                quantity2,
                threshold2,
                publisher2
        );

        catalogue.addBook(book2);

        // Customer

        System.out.println("\nEnter Customer Details");

        System.out.print("Customer ID: ");
        String customerId = input.nextLine();

        System.out.print("Customer Name: ");
        String customerName = input.nextLine();

        Customer customer = new Customer(
                customerId,
                customerName
        );

        // Order

        System.out.print("\nEnter Order ID: ");
        String orderId = input.nextLine();

        SalesOrder order = new SalesOrder(
                orderId,
                customer
        );

        // Order Item 1

        System.out.print("\nEnter quantity for first book: ");
        int orderQty1 = input.nextInt();

        SalesOrderItem item1 = new SalesOrderItem(
                book1,
                orderQty1,
                price1
        );

        order.addItem(item1);

        // Order Item 2

        System.out.print("Enter quantity for second book: ");
        int orderQty2 = input.nextInt();

        SalesOrderItem item2 = new SalesOrderItem(
                book2,
                orderQty2,
                price2
        );

        order.addItem(item2);

        // Validation

        OrderValidation validator = new OrderValidation();

        if (validator.validate(order)) {

            System.out.println("\n===== ORDER DETAILS =====");

            System.out.println("Order Validated Successfully");

            System.out.println("Order ID: " + order.getOrderId());

            System.out.println("Customer Name: "
                    + order.getCustomer().getName());

            double total = order.calculateTotal();

            System.out.println("Total Price: " + total);

        } else {

            System.out.println("Order Validation Failed");
        }

        // Inventory Check

        InventoryManager manager = new InventoryManager();

        PurchaseSystem purchaseSystem = new PurchaseSystem();

        manager.addObserver(purchaseSystem);

        manager.checkStock(book1);
        manager.checkStock(book2);

        input.close();
    }
}