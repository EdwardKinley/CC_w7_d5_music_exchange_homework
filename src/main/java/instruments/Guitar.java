package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.MaterialType;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(
            int buyPrice,
            int sellPrice,
            MaterialType material,
            ColourType colour,
            int numberOfStrings) {
        super(buyPrice, sellPrice, material, colour);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }



}
