package com.HomeTaskModule3.MusicTools;

import java.util.*;

public class MusicToolsShop {

    private List<MusicTool> musicToolsShop;


    public MusicToolsShop() {
        this.musicToolsShop = new ArrayList<>();


    }


    public List<MusicTool> getMusicToolsShop() {
        return musicToolsShop;
    }

    public void setMusicToolsShop(List<MusicTool> musicToolsShop) {
        this.musicToolsShop = musicToolsShop;
    }

    @Override
    public String toString() {
        return "MusicToolsShop{" +
                "\nmusicToolsShop=\n" + musicToolsShop + "\n" +
                "}\n";
    }

    public List<MusicTool> addToShopGuitar(Guitar guitar, int quantity) {
        for (int i = 0; i < quantity; i++) {
            musicToolsShop.add(new Guitar());
        }

        return musicToolsShop;
    }

    public List<MusicTool> addToShopTrumpet(Trumpet trumpet, int quantity) {
        for (int i = 0; i < quantity; i++) {
            musicToolsShop.add(new Trumpet());
        }

        return musicToolsShop;
    }

    public List<MusicTool> addToShopPiano(Piano piano, int quantity) {
        for (int i = 0; i < quantity; i++) {
            musicToolsShop.add(new Piano());
        }

        return musicToolsShop;
    }

}



