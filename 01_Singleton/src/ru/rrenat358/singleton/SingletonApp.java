package ru.rrenat358.singleton;

public class SingletonApp {

    public static void main(String[] args) {
        System.out.println("Start Singleton App");
        System.out.println("==============================\n");

        Singleton singleton1 = Singleton.getInstance();
        System.out.println("1 -- " + singleton1);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("2 -- " + singleton2);

        System.out.println("------------------------------");
        System.out.println("--- WaterSpring --------------");
        WaterSpring waterSpring = WaterSpring.getInstance();
        float someWater = 2.5f;
        System.out.println(waterSpring.getWater(someWater));



        System.out.println("\n==============================");
        System.out.println("Singleton App is Done!");
    }
}
