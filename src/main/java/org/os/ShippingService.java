package org.os;

public final class ShippingService {
     ShippingService() {}

    public static void ship(String address, String title, int qty) {
        System.out.println("Quantum book store: Shipping quantity : " + qty +" title: " + title + "address : "+  address);
    }
}
