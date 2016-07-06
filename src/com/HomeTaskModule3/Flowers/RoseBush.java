package com.HomeTaskModule3.Flowers;

import java.util.List;

public class RoseBush {
    private List<Rose> roseBush;

    public List<Rose> getRoseBush() {
        return roseBush;
    } //Антипаттерн Лодочный якорь (Boat anchor)

    public void setRoseBush(List<Rose> roseBush) {
        this.roseBush = roseBush;
    }//Антипаттерн Лодочный якорь (Boat anchor)
}
