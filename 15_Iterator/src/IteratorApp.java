/**
 * Iterator, Cursor
 */


public class IteratorApp {
    public static void main(String[] args) {

        System.out.println("\n==============================");
        System.out.println("=== Iterator ==================\n");

        String[] goods = {
                "Apple", "Orange", "Banana",
                "Water", "Juice", "Wine",
                "Fish", "Blanca", "Beef",
                "Book", "Disk", "Lamp",
        };

        MarketStore marketStore = new MarketStore("ChaosStore", goods);

        MyIterator myIterator = marketStore.getIterator();


        System.out.println("\n=== 1 ========================");

        System.out.println(marketStore.getName());

        System.out.println("\n=== 2 ========================");

        while (myIterator.hasNext()) {
            System.out.println(1 + ". " + myIterator.next().toString());
        }

        System.out.println("\n=== END ======================");
        System.out.println("==============================\n");


    }

}
