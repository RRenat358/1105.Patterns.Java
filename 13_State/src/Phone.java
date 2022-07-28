

public class Phone {

    public static void main(String[] args) {
        Phone phone = new Phone();
        for (int i=0; i<15; i++) {
            System.out.println(phone.getState());
            phone.switchState();
        }
    }



    private State state = WaitingState.WAITING_STATE;

    public void switchState() {
        state.updateState(this);
    }

    public State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }



}
