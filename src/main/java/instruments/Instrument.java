package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;

public abstract class Instrument {

    private int buyPrice;
    private int sellPrice;
    MaterialType material;
    ColourType colour;
    FamilyType family;

    public Instrument(
            int buyPrice,
            int sellPrice,
            MaterialType material,
            ColourType colour,
            FamilyType family) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.material = material;
        this.colour = colour;
        this.family = family;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public MaterialType getMaterial() {
        return material;
    }

    public ColourType getColour() {
        return colour;
    }

    public FamilyType getFamily() {
        return family;
    }

    public void setFamily(FamilyType newFamily) {
        family = newFamily;
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }



}
