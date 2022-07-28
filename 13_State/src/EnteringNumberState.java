

public class EnteringNumberState implements State {

    public static final EnteringNumberState ENTERING_NUMBER_STATE = new EnteringNumberState();

    private EnteringNumberState() {

    }

    @Override
    public void updateState(Phone phone) {
        phone.setState(DialingState.DIALING_STATE);
    }

    @Override
    public String toString() {
        return "ENTERING_NUMBER_STATE ";
    }


}
