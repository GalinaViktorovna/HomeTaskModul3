package com.HomeTaskModule3.MusicTools;

public class Runner {

    public static void main(String[] args) throws ExceptionInName, ExceptionOfQuantityInOrder {
        MusicToolsShop musicToolsShop = new MusicToolsShop();
        Shiping shiping = new Shiping();
        musicToolsShop.addToShopGuitar(new Guitar(), 16);
        musicToolsShop.addToShopPiano(new Piano(), 2);
        musicToolsShop.addToShopTrumpet(new Trumpet(), 7);
        System.out.println(musicToolsShop.toString());
        musicToolsShop.putTheInMap("Guitar", 7);
        musicToolsShop.putTheInMap("Trumpet", 2);

        shiping.startUp(shiping, musicToolsShop);
        musicToolsShop.getOrder().clear();

        musicToolsShop.putTheInMap("Piano", 1);

        shiping.startUp(shiping, musicToolsShop);
        musicToolsShop.getOrder().clear();

        musicToolsShop.putTheInMap("Piano", 1);
        musicToolsShop.putTheInMap("Guitar", 8);
        musicToolsShop.putTheInMap("Trumpet", 6);
        shiping.startUp(shiping, musicToolsShop);

    }
}


