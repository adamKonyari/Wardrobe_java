package com.codecool.API;

import com.codecool.API.Clothing.Cloth;
import com.codecool.API.Clothing.Skirt;
import com.codecool.API.Clothing.Throusers;
import com.codecool.API.Exceptions.ClothTypeException;

import java.util.ArrayList;
import java.util.List;

public class DoubleHanger extends Hanger {

    private Cloth secondCloth;



    public void addSecondCloth(Cloth cloth) throws ClothTypeException {
        if(cloth instanceof Throusers || cloth instanceof Skirt) {
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


