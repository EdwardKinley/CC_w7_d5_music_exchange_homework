package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(
            int buyPrice,
            int sellPrice,
            MaterialType material,
            ColourType colour,
            FamilyType family,
            int numberOfStrings) {
        super(buyPrice, sellPrice, material, colour, family);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }



}
