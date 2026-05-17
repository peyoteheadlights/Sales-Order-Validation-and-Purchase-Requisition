package com.mycompany.software_project;

public class SalesOrderItem {

    Book book;
    int quantity;
    double price_per_unit;
    double extended_Price;

    public SalesOrderItem(Book book, int quantity, double price_per_unit) {
        this.book = book;
        this.quantity = quantity;
        this.price_per_unit = price_per_unit;
        this.extended_Price = calculateExtendedPrice();
    }

    public double calculateExtendedPrice() {
        return quantity * price_per_unit;
    }

    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getExtended_Price() {
        return extended_Price;
    }

}
