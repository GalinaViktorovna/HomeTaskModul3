package com.HomeTaskModule3.Flowers;

import java.util.List;

public class Bouquet {
    private List<Rose> roses;
    private List<Chamomile> chamomiles;
    private List<Aster> asters;
    private List<Tulip> tulips;

    public List<Rose> getRoses() {
        return roses;
    }

    public void setRoses(List<Rose> roses) {
        this.roses = roses;
    }

    public List<Chamomile> getChamomiles() {
        return chamomiles;
    }

    public void setChamomiles(List<Chamomile> chamomiles) {
        this.chamomiles = chamomiles;
    }

    public List<Aster> getAsters() {
        return asters;
    }

    public void setAsters(List<Aster> asters) {
        this.asters = asters;
    }

    public List<Tulip> getTulips() {
        return tulips;
    }

    public void setTulips(List<Tulip> tulips) {
        this.tulips = tulips;
    }
}
