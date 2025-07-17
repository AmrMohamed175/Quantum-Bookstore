package org.os;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    List<Book> inventory = new ArrayList<>();


    public void addBook(Book book) {
        for (Book b : inventory) {
            if (b.getISBN().equals(book.getISBN())) {
                throw new RuntimeException("Quantum book store: ISBN already exists in inventory.");
            }
        }
        inventory.add(book);
        System.out.println("Quantum book store: Book Added successfully with title : "  + book.getTitle());
    }


    public List<Book> removeOutdatedBooks(int currentYear, int maxAge) {
        List<Book> removed = new ArrayList<>();
        Iterator<Book> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Book b = iterator.next();
            if (currentYear - b.getYear() > maxAge) {
                removed.add(b);
                iterator.remove();
                System.out.println("Quantum book store: Removed outdated book " + b.getTitle());
            }
        }
        return removed;
    }



    public double buyBook(String isbn, int quantity, String email, String address) {

        for (Book b : inventory) {
            if (b.getISBN().equals(isbn)) {
                if (!b.isAvailableForSale()) {
                    throw new RuntimeException("Quantum book store: " + b.getTitle() + " Book is not for sale.");
                }
                double paid = b.buy(quantity, email, address);
                System.out.println("Quantum book store: Book with title : " + b.getTitle() + " , Paid for : " + paid);
                return paid;
            }
        }
        throw new RuntimeException("Quantum book store: Book not found with ISBN : " + isbn);
    }
}