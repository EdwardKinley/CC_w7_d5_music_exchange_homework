package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;
import interfaces.ISell;

public abstract class Instrument implements ISell {

    private int buyPrice;
    private int sellPrice;
    private MaterialType material;
    private ColourType colour;
    private FamilyType family;
    private String description;

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
        this.description = this.getClass().getSimpleName().toLowerCase();
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
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

    public String getDescription() {
        return description;
    }




}
