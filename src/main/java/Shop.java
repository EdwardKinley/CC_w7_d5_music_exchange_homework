import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private int tillBalance;
    private ArrayList<ISell> stock;

    public Shop (String name, int tillBalance, ArrayList<ISell> stock) {
        this.name = name;
        this.tillBalance = tillBalance;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getTillBalance() {
        return tillBalance;
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

    public void addToTillBalance(int amount) {
        tillBalance += amount;
    }

    public void sellItem(ISell item) {
        this.removeStockSingle(item);
        this.addToTillBalance(item.getSellPrice());
    }

    public void sellMultipleItems(ArrayList<ISell> itemsToSell) {
        this.removeStockMultiple(itemsToSell);
        for (ISell item : itemsToSell) tillBalance += item.getSellPrice();
    }

    public String getPriceList(ArrayList<ISell> manyItems) {
        String list = "";
        for (ISell item : manyItems) list += item.getDescription() + ": £" + item.getSellPrice() + "; ";
        return list;
    }

}
