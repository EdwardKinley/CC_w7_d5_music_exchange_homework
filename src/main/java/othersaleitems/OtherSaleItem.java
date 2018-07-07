package othersaleitems;

import interfaces.ISell;

public class OtherSaleItem implements ISell {

    private int buyPrice;
    private int sellPrice;
    private String description;

    public OtherSaleItem( int buyPrice, int sellPrice, String description) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.description = description;
    }

    @Override
    public int getBuyPrice() {
        return buyPrice;
    }

    @Override
    public int getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
