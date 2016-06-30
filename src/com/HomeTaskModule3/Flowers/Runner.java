package com.HomeTaskModule3.Flowers;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws Exception {

        Rose rosaria = new Rose("Gretta", "Red");
        Chamomile chamomile = new Chamomile("Sarreta", "Blue");
        Tulip tulip = new Tulip("Trew", "Green");

        List<Flower> flowersForBouquet = new ArrayList<>();
        flowersForBouquet.add(rosaria);
        flowersForBouquet.add(chamomile);
        flowersForBouquet.add(tulip);

        Bouquet bouquetOfFlower = new Bouquet(flowersForBouquet);
        bouquetOfFlower.deleteFlowerFromBouquet(bouquetOfFlower.getBouquet(), rosaria);


    }
}
