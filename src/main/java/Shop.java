import instruments.Guitar;
import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop (String name, ArrayList<ISell> stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getStockNumber() {
        return stock.size();
    }

    public void addStockSingle(ISell item) {
        stock.add(item);
    }

    public void addStockMultiple(ArrayList<ISell> newStock) {
        for (ISell item : newStock) stock.add(item);
    }

    public void removeStockSingle(ISell item) {
        stock.remove(item);
    }

    public void removeStockMultiple(ArrayList<ISell> items) {
        for (ISell item : items) stock.remove(item);
    }

    public int getPotentialProfit() {
        int aggregatePotentialProfit = 0;
        for (ISell item : stock) aggregatePotentialProfit += item.calculateMarkup();
        return aggregatePotentialProfit;
    }
}
