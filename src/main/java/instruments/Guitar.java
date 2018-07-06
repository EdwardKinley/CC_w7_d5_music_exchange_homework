package instruments;

import instruments.instrumentproperties.MaterialType;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(
            int buyPrice,
            int sellPrice,
            MaterialType material,
            int numberOfStrings) {
        super(buyPrice, sellPrice, material);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }



}
