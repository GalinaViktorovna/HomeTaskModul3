package com.HomeTaskModule3.MusicTools;

public class ExceptionOfQuantityInOrder extends Exception {

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public ExceptionOfQuantityInOrder(String message, Integer quantity) {

        super(message);
        this.quantity = quantity;
    }
}
