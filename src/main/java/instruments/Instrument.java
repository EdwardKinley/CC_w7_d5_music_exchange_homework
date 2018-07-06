package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.MaterialType;

public abstract class Instrument {

    private int buyPrice;
    private int sellPrice;
    MaterialType material;
    ColourType colour;
//    private enum family;

    public Instrument(
            int buyPrice,
            int sellPrice,
            MaterialType material,
            ColourType colour) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.material = material;
        this.colour = colour;
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

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }



}
