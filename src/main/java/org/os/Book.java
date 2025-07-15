package org.os;

public abstract class Book {
    String ISBN;
    String title;
     int year;
     double price;
     int quantity;
     String author;


    protected Book(String ISBN ,String title, int year, double price, int quantity,String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public String getAuthor() {
        return author;
    }

}
