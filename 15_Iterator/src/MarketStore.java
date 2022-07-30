/**
 * Склад магазина
 */


public class MarketStore implements Collection{

    private String name;
    private String[] goods;

    public MarketStore(String name, String[] goods) {
        this.name = name;
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getGoods() {
        return goods;
    }

    public void setGoods(String[] goods) {
        this.goods = goods;
    }

    @Override
    public MyIterator getIterator() {
        return new MarketStoreIterator();
    }


    //Конкретный Итератор склада
    public class MarketStoreIterator implements MyIterator {

        int index;
        MarketStore marketStore;


        @Override
        public boolean hasNext() {
            if (index < goods.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return goods[index++];
        }


        @Override
        public boolean hasPrevious() {
            if (index > 0) {
                return true;
            }
            return false;
        }

        @Override
        public Object previous() {
            index--;
            return goods[index];
        }


        @Override
        public int getIteratorPosition() {
            return index;
        }

        @Override
        public Object getItem(int id) {
            return goods[id];
        }

        @Override
        public int setIteratorPosition(int position) {
            index = position;
            return index;
        }

        @Override
        public boolean removItem(int id) {
            if (id < goods.length) {
                goods[id] = "[DELETED]";
                return true;
            }
            return false;
        }


    }


}
