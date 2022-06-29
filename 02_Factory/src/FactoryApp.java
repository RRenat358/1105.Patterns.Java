public class FactoryApp {
    public static void main(String[] args) {
        System.out.println("\n==============================");
        System.out.println("=== variants.Singleton ================\n");

        Store store = new GroceryStore();
        store.saleGood();

        StoreFactory groceryStoreFactory = new GroceryStoreFactory();
        Store storeGrocery001 = groceryStoreFactory.createStore();
        storeGrocery001.saleGood();








        StoreFactory storeFactoryGrocery2 = new GroceryStoreFactory();
        Store storeGrocery002 = storeFactoryGrocery2.createStore();


        System.out.println("\n==============================");
        System.out.println("==============================\n");

    }


}
