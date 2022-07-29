/**
 * Выключить свет
 */

public class LightTurnOff implements Command{

    private Light light;


    public LightTurnOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
