package com.mycompany.software_project;

public class Book {
    String bookId;
    String title;
    double price;
    int quantityOnHand;
    int minThreshold;
    String publisherName;

    public Book(String bookId, String title, double price, int quantityOnHand, int minThreshold, String publisherName) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
        this.minThreshold = minThreshold;
        this.publisherName = publisherName;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public int getMinThreshold() {
        return minThreshold;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public boolean inStock() {
        return quantityOnHand > 0;
    }

    public boolean Restock() {
        return quantityOnHand < minThreshold;
    }

    public int getQuantityOnHand() {
    return quantityOnHand;
}

}
