package com.codecool.API;

import com.codecool.API.Clothing.Blouse;
import com.codecool.API.Clothing.Cloth;
import com.codecool.API.Clothing.Shirt;
import com.codecool.API.Exceptions.ClothTypeException;

public abstract class Hanger {

    Cloth firstCloth;

    public void addFirstCloth(Cloth cloth) throws ClothTypeException {

        if(cloth instanceof Shirt || cloth instanceof Blouse) {
            this.firstCloth = cloth;
        } else {
            throw new ClothTypeException("Invalid cloth type");
        }

    }

    public Cloth getFirstCloth() {
        return firstCloth;
    }

    public Cloth takeFirstCloth() {
        Cloth tempCloth = this.firstCloth;
        this.firstCloth = null;
        return tempCloth;
    }
}


