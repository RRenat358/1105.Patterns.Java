package StoreWear;

import StoreFactory.*;

public class StoreFactoryWear implements StoreFactory {


    @Override
    public Store createStore() {
        return new StoreWear();
    }
}
