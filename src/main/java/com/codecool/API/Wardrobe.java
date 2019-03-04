package com.codecool.API;

import com.codecool.API.Clothing.Cloth;
import com.codecool.API.Exceptions.CapactiyException;
import com.codecool.API.Exceptions.ClothNotFoundException;

import java.util.List;

public class Wardrobe {

    private int capacity;
    private List<Hanger> hangers;

    public Wardrobe(int capacity) {
        this.capacity = capacity;
    }

    public void addHanger(Hanger hanger) throws CapactiyException {
        if (hangers.size() <= capacity) {
            hangers.add(hanger);
        } else {
            throw new CapactiyException("Wardrobe is full.");
        }
    }

    public Hanger getHanger(int index) {
        return hangers.get(index);
    }

    public Cloth getClothById(String id) throws ClothNotFoundException {
        for (Hanger hanger : hangers) {
            if(hanger instanceof SingleHanger) {
                if(hanger.getFirstCloth().getId().equals(id)) return hanger.takeFirstCloth();
            } else if(hanger instanceof DoubleHanger) {
                if(hanger.getFirstCloth().getId().equals(id)) return hanger.takeFirstCloth();
                if(((DoubleHanger) hanger).getSecondCloth().getId().equals(id)) return ((DoubleHanger) hanger).takeSecondCloth();
            }
        }
        throw new ClothNotFoundException("Cloth not found.");
    }

    public boolean isSpaceLeft() {
        if(hangers.size() >= capacity) {
            return false;
        } else {
            return true;
        }
    }
}



