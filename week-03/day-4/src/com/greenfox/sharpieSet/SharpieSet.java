package com.greenfox.sharpieSet;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    //- Reuse your `Sharpie` class
    //- Create `SharpieSet` class
    //  - it contains a list of Sharpie
    //  - countUsable() -> sharpie is usable if it has ink in it
    //  - removeTrash() -> removes all unusable sharpies

    List<Sharpie> sharpieSet = new ArrayList<>();

    public void addSharpie(Sharpie sharpie) {
        sharpieSet.add(sharpie);
    }

    public int countUsable() {
        int usable = 0;
        for (Sharpie sharpie : sharpieSet) {
            if (sharpie.usable()) {
                usable++;
            }
        }
        return usable;
    }

    public void removeTrash(){
        for (int i = 0; i < sharpieSet.size(); i++) {
            if (!sharpieSet.get(i).usable()) {
                sharpieSet.remove(i);
            }
        }
    }
}
