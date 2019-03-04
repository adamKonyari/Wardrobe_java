package com.codecool.API;

import com.codecool.API.Exceptions.ClothTypeException;

import java.util.ArrayList;
import java.util.List;

public class DoubleHanger extends Hanger {

    private Cloth secondCloth;



    public void addSecondCloth(Cloth cloth) throws ClothTypeException {
        if(cloth.getType().equals(Type.SKIRT) || cloth.getType().equals(Type.TROUSERS)) {
            this.secondCloth = cloth;
        } else {
            throw new ClothTypeException("Invalid cloth type");
        }
    }

    public Cloth getSecondCloth() {
        return secondCloth;
    }

    public Cloth takeSecondCloth() {
        Cloth tempCloth = this.secondCloth;
        this.secondCloth = null;
        return tempCloth;
    }

    public List<Cloth> takeBothClothes() {
        List<Cloth> clothes = new ArrayList<>();
        clothes.add(firstCloth);
        clothes.add(secondCloth);
        firstCloth = null;
        secondCloth = null;
        return clothes;
    }
}


