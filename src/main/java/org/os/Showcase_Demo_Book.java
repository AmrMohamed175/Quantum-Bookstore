package org.os;

public class Showcase_Demo_Book extends Book {


    public Showcase_Demo_Book(String ISBN, String title, int year, String author) {
        super(ISBN, title, year, 0.0, 0, author);
    }


    @Override
    public boolean isAvailableForSale() {
        return false;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        throw new RuntimeException("Quantum book store: Showcase books are not for sale.");
    }

}
