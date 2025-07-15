package org.os;

public class Paper_book extends Book{
    int Stock;

    public Paper_book(String ISBN , String title, int year, double price, int quantity, String author, int stock) {
        super(ISBN ,title, year, price, quantity, author);
        this.Stock = stock;
    }

    public int getStock() {
        return Stock;
    }
}
