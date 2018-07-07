package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;
import interfaces.IPlay;
import interfaces.ISell;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;

    public Guitar(
            int buyPrice, int sellPrice, MaterialType material, ColourType colour, int numberOfStrings) {
        super(buyPrice, sellPrice, material, colour, FamilyType.STRING);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "strum";
    }

}
