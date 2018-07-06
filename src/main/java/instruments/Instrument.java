package instruments;

import instruments.instrumentproperties.MaterialType;

public abstract class Instrument {

    private int buyPrice;
    private int sellPrice;
    MaterialType material;
//    private enum colour;
//    private enum family;

    public Instrument(
            int buyPrice,
            int sellPrice,
            MaterialType material) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.material = material;
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

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }



}
