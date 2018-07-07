package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;
import interfaces.IPlay;
import interfaces.ISell;

public class Triangle extends Instrument implements IPlay {

    private int lengthInCm;

    public Triangle(
            int buyPrice,
            int sellPrice,
            MaterialType material,
            ColourType colour,
            int lengthInCm) {
        super(buyPrice, sellPrice, material, colour, FamilyType.PERCUSSION);
        this.lengthInCm = lengthInCm;
    }

    public int getLengthInCm() {
        return lengthInCm;
    }

    public String play() {
        return "ping";
    }

}
