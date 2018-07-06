package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;
import interfaces.IPlay;
import interfaces.ISell;

public class Saxophone extends Instrument implements IPlay, ISell {

    private int numberOfToneHoles;

    public Saxophone(
            int buyPrice,
            int sellPrice,
            MaterialType material,
            ColourType colour,
            int numberOfToneHoles) {
        super(buyPrice, sellPrice, material, colour, FamilyType.WOODWIND);
        this.numberOfToneHoles = numberOfToneHoles;
    }

    public int getNumberOfToneHoles() {
        return numberOfToneHoles;
    }

    public String play() {
        return "wow";
    }



}
