/**
 * Склад магазина
 */


public class MarketStore {

    private String name;
    private String[] goods;

    public MarketStore(String name, String[] goods) {
        this.name = name;
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    public String[] getGoods() {
        return goods;
    }


}
