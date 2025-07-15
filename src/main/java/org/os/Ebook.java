package org.os;

public class Ebook extends Book {

    String fileType;


    public Ebook(String ISBN ,String title, int year, double price, int quantity, String author, String fileType) {
        super(ISBN ,title, year, price, quantity, author);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }
}
