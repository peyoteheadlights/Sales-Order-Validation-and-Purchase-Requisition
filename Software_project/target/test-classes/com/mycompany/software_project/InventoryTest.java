package com.mycompany.software_project;

public class InventoryTest {

    public static void main(String[] args) {

        Book book = new Book(
                "B101",
                "Java",
                250,
                2,
                5,
                "OReilly"
        );

        InventoryManager manager =
                new InventoryManager();

        PurchaseSystem purchaseSystem =
                new PurchaseSystem();

        manager.addObserver(purchaseSystem);

        System.out.println("===== INVENTORY TEST =====");

        manager.checkStock(book);
    }
}