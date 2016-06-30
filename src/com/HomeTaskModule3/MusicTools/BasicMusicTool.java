package com.HomeTaskModule3.MusicTools;

abstract class BasicMusicTool implements MusicTool {

    private String name;

    public BasicMusicTool(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
