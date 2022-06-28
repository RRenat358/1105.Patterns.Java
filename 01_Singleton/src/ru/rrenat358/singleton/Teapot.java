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

        System.out.println("Teapot -- " + instance);
        return instance.getWater(volume);
    }


}
