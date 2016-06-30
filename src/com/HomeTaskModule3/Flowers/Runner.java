package com.HomeTaskModule3.Flowers;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws Exception {

        Bouquet bouquet = new Bouquet();
        Rose rose = new Rose();
        Chamomile chamomile = new Chamomile();
        Tulip tulip = new Tulip();

        List<Flower>flowers = new ArrayList<>();
       // flowers.add(rose);
      //  flowers.add(chamomile);
        flowers.add(tulip);
        bouquet.setBouquet(flowers);

    }
}
