import StoreFactory.*;
import StoreFood.*;
import StoreWear.*;

public class FactoryApp {
    public static void main(String[] args) {
        System.out.println("\n==============================");
        System.out.println("=== Factory ==================\n");

        Store store = new StoreFood();
        store.saleGood();

        StoreFactory storeFactoryFood = new StoreFactoryFood();
        Store storeFood001 = storeFactoryFood.createStore();
        storeFood001.saleGood();


        StoreFactory storeFactoryWear = new StoreFactoryWear();
        Store storeWear001 = storeFactoryWear.createStore();
        storeWear001.saleGood();






        StoreFactory storeFactoryFood002 = new StoreFactoryFood();
        Store storeFood002 = storeFactoryFood002.createStore();
        storeFood002.saleGood();


        System.out.println("\n==============================");
        System.out.println("==============================\n");

    }


}
