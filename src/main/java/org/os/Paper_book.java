package org.os;

public class Paper_book extends Book{
    int Stock;

    public Paper_book(String ISBN , String title, int year, double price, int quantity, String author, int stock) {
        super(ISBN ,title, year, price, quantity, author);
        this.Stock = stock;
    }

    @Override
    public boolean isAvailableForSale() {
        return Stock > 0;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (quantity <= 0) {
            throw new IllegalArgumentException(
                    "Quantum book store: Quantity must be positive.");
        }
        if (Stock < quantity) {
            throw new RuntimeException(
                    "Quantum book store: Not enough stock for \"" + getTitle() + "\".");
        }
        Stock -= quantity;
        ShippingService.ship(address, getTitle(), quantity);
        return getPrice() * quantity;
    }

    public int getStock() {
        return Stock;
    }
}
