package org.os;

public class Ebook extends Book {

    String fileType;


    public Ebook(String ISBN ,String title, int year, double price, int quantity, String author, String fileType) {
        super(ISBN ,title, year, price, quantity, author);
        this.fileType = fileType;
    }

    @Override
    public boolean isAvailableForSale() {
        return true;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (quantity != 1) {
            throw new RuntimeException(
                    "Quantum book store: Only one eBook can be bought at a time.");
        }
        MailService.send(email, getTitle(), fileType);
        return getPrice();
    }


    public String getFileType() {
        return fileType;
    }
}
