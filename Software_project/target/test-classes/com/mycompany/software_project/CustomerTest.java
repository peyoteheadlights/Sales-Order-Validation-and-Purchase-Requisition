package com.mycompany.software_project;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "C001",
                "Mark"
        );

        System.out.println("===== CUSTOMER TEST =====");

        System.out.println("Customer ID: "
                + customer.getCustomerId());

        System.out.println("Customer Name: "
                + customer.getName());
    }
}