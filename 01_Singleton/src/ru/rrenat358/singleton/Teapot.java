package ru.rrenat358.singleton;

public class Teapot {
    private float volume;

    public Teapot(float volume) {
        this.volume = volume;
    }

    public String makeTea() {
        return "Thebteapot with " + addWater(volume);
    }

    private String addWater(float volume) {
        WaterSpring instance = WaterSpring.getInstance();
        return instance.getWater(volume);
    }


}
