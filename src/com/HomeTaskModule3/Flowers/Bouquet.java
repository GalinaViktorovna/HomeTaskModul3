package com.HomeTaskModule3.Flowers;

import java.util.List;

public class Bouquet {

    private List<Flower> bouquet;


    public Bouquet(List<Flower> bouquet) throws Exception {
        if (bouquet.size() <= 1) {
            System.out.println("It's not a bouquet!Please add more flowers!");
            throw new Exception();

        } else {

            this.bouquet = bouquet;
        }
    }


    public List<Flower> getBouquet() {
        return bouquet;
    }

    public void setBouquet(List<Flower> bouquet) {

        this.bouquet = bouquet;
    }


    public List<Flower> deleteFlowerFromBouquet(List<Flower> bouquetForChange, Flower flowerForDelete) throws Exception {
        if (bouquetForChange.size() < 2) {
            System.out.println("You can not delete flower because your bouquet can not exist without flower!!!");
            throw new Exception();
        } else {
            bouquetForChange.remove(flowerForDelete);
            return bouquetForChange;
        }
    }
}
