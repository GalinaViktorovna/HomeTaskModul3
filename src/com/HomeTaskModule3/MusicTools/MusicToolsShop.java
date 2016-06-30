package com.HomeTaskModule3.MusicTools;

import java.util.ArrayList;
import java.util.List;

public class MusicToolsShop {

    private String name;
    private List<MusicTool> musicToolsShop;

    public MusicToolsShop(String name) {
        this.name = name;
        this.musicToolsShop = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MusicTool> getMusicToolsShop() {
        return musicToolsShop;
    }

    public void setMusicToolsShop(List<MusicTool> musicToolsShop) {
        this.musicToolsShop = musicToolsShop;
    }


}
