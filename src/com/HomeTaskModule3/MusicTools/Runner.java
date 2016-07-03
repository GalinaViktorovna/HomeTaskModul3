package com.HomeTaskModule3.MusicTools;

public class Runner {

    public static void main(String[] args) throws ExceptionInName, ExceptionOfQuantityInOrder {
        MusicToolsShop musicToolsShop = new MusicToolsShop();
        Shipping shipping = new Shipping();
        musicToolsShop.addToShopGuitar(new Guitar(), 16);
        musicToolsShop.addToShopPiano(new Piano(), 2);
        musicToolsShop.addToShopTrumpet(new Trumpet(), 7);
        System.out.println(musicToolsShop.toString());
        shipping.putTheInMap("Guitar", 7);
        shipping.putTheInMap("Trumpet", 2);

        shipping.startUp(shipping, musicToolsShop);
        shipping.getOrder().clear();

        shipping.putTheInMap("Piano", 1);

        shipping.startUp(shipping, musicToolsShop);
        shipping.getOrder().clear();

        shipping.putTheInMap("Piano", 1);
        shipping.putTheInMap("Guitar", 8);
        shipping.putTheInMap("Trumpet", 6);
        shipping.startUp(shipping, musicToolsShop);

    }
}


