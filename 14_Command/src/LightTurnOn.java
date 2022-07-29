/**
 * Включить свет
 */

public class LightTurnOn implements Command {

    private Light light;


    public LightTurnOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
