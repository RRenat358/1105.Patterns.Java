public class StoreFactoryFood implements StoreFactory {

    @Override
    public Store createStore() {
        return new StoreFood();
    }

}
