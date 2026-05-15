package com.mycompany.software_project;

import java.util.ArrayList;

public class SalesOrder {

    String orderId;
    Customer customer;
    ArrayList<SalesOrderItem> items;
    String status;
    double orderTotal;

    public SalesOrder(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.status = "Created";
        this.orderTotal = 0.0;
    }

    public void addItem(SalesOrderItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        orderTotal = 0;
        for (SalesOrderItem item : items) {
            orderTotal += item.getExtended_Price();
        }
        return orderTotal;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getOrderId() {
        return orderId;
    }

    public ArrayList<SalesOrderItem> getItems() {
        return items;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public Customer getCustomer() {
        return customer;
    }

}
