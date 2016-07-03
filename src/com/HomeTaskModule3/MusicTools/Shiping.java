package com.HomeTaskModule3.MusicTools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Shiping {

    public List<MusicTool> prepareListOfMusicToolsToRemove(MusicToolsShop musicToolsShop, Map<String, Integer> order) throws ExceptionInName,ExceptionOfQuantityInOrder {
        List<MusicTool> result = new ArrayList<>();

        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String musicToolType = orderEntry.getKey();
            Integer numberOfMusicToolToBeRemoved = orderEntry.getValue();
            int numberOfMusicToolRemoved = 0;
            for (MusicTool musicTool : musicToolsShop.getMusicToolsShop()) {
                if (musicTool.getName().equals(musicToolType) && numberOfMusicToolRemoved < numberOfMusicToolToBeRemoved) {
                    result.add(musicTool);
                    numberOfMusicToolRemoved++;
                } else if ((!musicTool.getName().equals("Guitar")) && (!musicTool.getName().equals("Trumpet")) && (!musicTool.getName().equals("Piano"))) {
                    throw new ExceptionInName("Type of music tool must be \"Guitar\" or \" \"Trumpet\" or \"Piano\"!!!", musicTool.getName());
                }
            }
            if (numberOfMusicToolRemoved < numberOfMusicToolToBeRemoved) {
                throw new IllegalArgumentException("Shop does not have enough " + musicToolType + "s");
            }
            if (numberOfMusicToolToBeRemoved <= 0) {
                throw new ExceptionOfQuantityInOrder("Quantity in order can not be < 1", numberOfMusicToolToBeRemoved);
            }
        }

        return result;
    }

    public void removeMusicToolsFromTheShop(MusicToolsShop musicToolsShop, Map<String, Integer> order) {
        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String musicToolType = orderEntry.getKey();
            Integer numberOfMusicToolsToBeRemoved = orderEntry.getValue();
            int numberOfMusicToolsRemoved = 0;
            Iterator<MusicTool> iterator = musicToolsShop.getMusicToolsShop().iterator();
            while (iterator.hasNext()) {
                MusicTool musicTool = iterator.next();
                if (musicTool.getName().equals(musicToolType) && numberOfMusicToolsRemoved < numberOfMusicToolsToBeRemoved) {
                    iterator.remove();
                    numberOfMusicToolsRemoved++;
                }
            }
        }
    }

    public void startUp(Shiping shiping,MusicToolsShop musicToolsShop) {
        try {
            List<MusicTool> musicToolsToBeRemove = shiping.prepareListOfMusicToolsToRemove(musicToolsShop, musicToolsShop.getOrder());
            shiping.removeMusicToolsFromTheShop(musicToolsShop, musicToolsShop.getOrder());
            System.out.println("Order: " + musicToolsToBeRemove);
            System.out.println(musicToolsShop.toString());

        } catch (Exception e) {
            System.out.println("Exception happen " + e);
            System.out.println(musicToolsShop.toString());
        }
    }
}
