import java.util.ArrayList;
import java.util.List;

public class CommandApp {

    public static void main(String[] args) {

        System.out.println("\n==============================");
        System.out.println("=== Command ==================\n");

        //Создание требуемых объектов
        RemoteControl remoteControl = new RemoteControl();

        MusicBox musicBox = new MusicBox();
        MusicBoxTurnOn musicBoxTurnOn = new MusicBoxTurnOn(musicBox);
        MusicBoxTurnOff musicBoxTurnOff = new MusicBoxTurnOff(musicBox);
        MusicBoxMakeLoud musicBoxMakeLoud = new MusicBoxMakeLoud(musicBox);

        remoteControl.addCommand(0, musicBoxTurnOn);
        remoteControl.addCommand(1, musicBoxMakeLoud);
        remoteControl.addCommand(2, musicBoxTurnOff);

        Light light = new Light();
        LightTurnOn lightTurnOn = new LightTurnOn(light);
        LightTurnOff lightTurnOff = new LightTurnOff(light);

        remoteControl.addCommand(3, lightTurnOn);
        remoteControl.addCommand(4, lightTurnOff);

        List commands = new ArrayList<>();
        commands.add(musicBoxTurnOn);
        commands.add(musicBoxMakeLoud);
        commands.add(musicBoxTurnOff);

        CommandSequence commandSequence = new CommandSequence(commands);
        remoteControl.addCommand(5, commandSequence);


        // Использование объектов

        remoteControl.pressButton(3);
        remoteControl.pressButton(0);
        remoteControl.pressButton(1);
        remoteControl.pressButton(4);

        System.out.println("---------------");
        remoteControl.pressButton(3);


        System.out.println("\n=== END ======================");
        System.out.println("==============================\n");


    }


}

