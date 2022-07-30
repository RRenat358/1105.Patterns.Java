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

        int itemPosition = 1;


        System.out.println("\n\n=== 1 ======================================================");

        System.out.println(marketStore.getName());


        System.out.println("\n\n=== 2 ======================================================");


        while (myIterator.hasNext()) {
            System.out.println(itemPosition++ + ". " + myIterator.next().toString());
        }

        System.out.println("\n\n=== 3 ======================================================");

        int itemId = 9;
        if (itemId > 0 && itemId - 1 < goods.length) {
            System.out.println(itemId + ". " + myIterator.getItem(itemId - 1));
        } else {
            System.out.println("That good # " + itemId + " is absent.");
        }


        System.out.println("\n\n=== 4 ======================================================");

        itemPosition = goods.length;
        while (myIterator.hasPrevious()) {
            System.out.println(itemPosition-- + ". " + myIterator.previous().toString());
        }

        System.out.println("\n\n=== 5 ======================================================");

        String searchNameItem = "Wine";
        itemPosition = 0;
        while (myIterator.hasNext()) {
            String itemTemp = myIterator.next().toString();
            if (itemTemp.equals(searchNameItem)) {
                itemPosition = myIterator.getIteratorPosition();
                System.out.println("Id of [" + searchNameItem + "] == " + itemPosition);
            }
        }
        if (itemPosition == 0) {
            System.out.println("Id of [" + searchNameItem + "] ==" + " is absent");
        }











        System.out.println("\n\n=== END ======================");
        System.out.println("==============================\n");


    }

}
