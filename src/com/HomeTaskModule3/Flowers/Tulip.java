package com.HomeTaskModule3.Flowers;

public class Tulip extends Flower {


    public Tulip(String color, String size) {
        super(color, size);
    }

    @Override
    public String getType() {
        return "Tulip";
    }
}
