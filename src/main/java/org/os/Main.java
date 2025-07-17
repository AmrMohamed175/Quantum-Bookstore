package org.os;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();


        Book paperBook = new Paper_book("go32ksdf", "Java Programming", 2020, 150.0, 10, "Amr Mohamed", 20);

        Book ebook = new Ebook("lk32j3f4", "AI Basics", 2023, 90.0, 1, "Ahmed Saeed", "PDF");

        Book showcase = new Showcase_Demo_Book("ha32lkfdj32", "Ancient Scripts", 2010, "Sobhi Mohamed");

        inventory.addBook(paperBook);

        inventory.addBook(ebook);

        inventory.addBook(showcase);

        inventory.buyBook("go32ksdf", 2, "buyer@example.com", "New Cairo");

        inventory.buyBook("lk32j3f4", 1, "reader@example.com", "Unknown city");


        try {
            inventory.buyBook("ha32lkfdj32", 1, "someone@example.com", "Giza");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        inventory.removeOutdatedBooks(2025, 10);
    }
}