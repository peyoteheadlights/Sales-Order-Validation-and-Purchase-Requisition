package com.mycompany.software_project;

import java.util.ArrayList;

public class InventoryManager {

    ArrayList<StockObserver> observers;

    public InventoryManager() {
        observers = new ArrayList<>();
    }

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    // notifies all observers about stock changes
    public void notifyObservers(Book book) {
        for (StockObserver observer : observers) {
            observer.update(book);
        }
    }

    public boolean checkStock(Book book) {
        if (book.getMinThreshold() > 0) {
            System.out.println("Stock is low for book: " + book.getTitle());
            notifyObservers(book);
            return false;
        }
        return true;
    }

}
