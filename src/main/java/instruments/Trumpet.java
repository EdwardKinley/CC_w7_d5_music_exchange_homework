package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;
import interfaces.IPlay;
import interfaces.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {

    private int numberOfValves;

    public Trumpet(
            int buyPrice,
            int sellPrice,
            MaterialType material,
            ColourType colour,
            int numberOfValves) {
        super(buyPrice, sellPrice, material, colour, FamilyType.BRASS);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play() {
        return "parp";
    }


}
