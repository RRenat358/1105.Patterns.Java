public class TalkingState implements State {

    public static final TalkingState TALKING_STATE = new TalkingState();

    private TalkingState() {

    }

    @Override
    public void updateState(Phone phone) {
        phone.setState(WaitingState.WAITING_STATE);
    }

    @Override
    public String toString() {
        return "TALKING_STATE";
    }
}
