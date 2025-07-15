package org.os;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Book> inventory = new ArrayList<>();

    public void add(Book book) {
        inventory.add(book);
        System.out.println("Book Added successfully with title: " + book.getTitle());
    }


}
