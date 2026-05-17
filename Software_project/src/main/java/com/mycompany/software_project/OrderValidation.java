package com.mycompany.software_project;

public class OrderValidation {

    Catalogue catalogue;

    public OrderValidation() {
        this.catalogue = Catalogue.getInstance();
    }

    public boolean checkBookExixts(String bookID) {
        return catalogue.getBook(bookID) != null;
    }

    public boolean checkPrice(String bookId, double price) {
        Book book = catalogue.getBook(bookId);
        if (book != null) {
            return book.getPrice() == price;
        }
        return false;
    }

    public boolean validate(SalesOrder order) {

        for (SalesOrderItem item : order.getItems()) {

            if (!checkBookExixts(item.getBook().getBookId())) {
                System.out.println("Book with ID " + item.getBook().getBookId() + " does not exist in the catalogue.");
                order.setStatus("Rejected");
                return false;

            }
            if (!checkPrice(item.getBook().getBookId(), item.getBook().getPrice())) {
                System.out.println("Price for book with ID " + item.getBook().getBookId()
                        + " does not match the catalogue price.");
                order.setStatus("Rejected");
                return false;
            }

        }
        order.setStatus("Validated");
        return true;

    }

}
