package ru.rrenat358.singleton;

public class WaterSpring {

    private static WaterSpring instance = null;

    private static String kindOfWater = " = литров чистой воды";

    public static WaterSpring getInstance() {
        if (instance == null) {
            instance = new WaterSpring();
        }
        return instance;
    }

    public String getWater(float liter) {
        return (liter + kindOfWater);
    }

}
