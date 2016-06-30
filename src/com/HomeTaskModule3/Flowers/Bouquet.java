package com.HomeTaskModule3.Flowers;

import java.util.List;

public class Bouquet {

    private List<Flower> bouquet;

    public List<Flower> getBouquet() {
        return bouquet;
    }

    public void setBouquet(List<Flower> bouquet) throws Exception {
        if (bouquet.size() <= 1) {
            System.out.println("It's not a bouquet!Please add more flowers!");
            throw new Exception();

        } else {
            this.bouquet = bouquet;
        }
    }
}

