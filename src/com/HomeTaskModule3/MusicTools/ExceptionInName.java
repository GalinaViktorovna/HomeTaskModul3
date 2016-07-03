package com.HomeTaskModule3.MusicTools;

public class ExceptionInName extends Exception {

    String name;

    public String getName() {
        return name;
    }

    public ExceptionInName(String message, String name) {

        super(message);
        this.name = name;
    }
}
