package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;
import interfaces.IPlay;
import interfaces.ISell;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(
            int buyPrice,
            int sellPrice,
            MaterialType material,
            ColourType colour,
            int numberOfKeys) {
        super(buyPrice, sellPrice, material, colour, FamilyType.KEYBOARD);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "plink";
    }



}
