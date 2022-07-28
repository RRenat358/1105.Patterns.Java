public class WaitingState implements State {

    public static final WaitingState WAITING_STATE = new WaitingState();

    private WaitingState() {
    }

    @Override
    public void updateState(Phone phone) {
        phone.setState(EnteringNumberState.ENTERING_NUMBER_STATE);
    }

    @Override
    public String toString() {
        return "WAITING_STATE";
    }
}
