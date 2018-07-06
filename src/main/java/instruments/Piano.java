package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;
import interfaces.IPlay;

public class Piano extends Instrument implements IPlay {

    private int numberOfKeys;

    public Piano(
            int buyPrice,
            int sellPrice,
            MaterialType material,
            ColourType colour,
            FamilyType family,
            int numberOfKeys) {
        super(buyPrice, sellPrice, material, colour, family);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "plink";
    }



}
