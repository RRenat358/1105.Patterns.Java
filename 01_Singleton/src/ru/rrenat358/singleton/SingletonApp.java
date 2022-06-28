package ru.rrenat358.singleton;


//video = 01:14:35



public class SingletonApp {

    public static void main(String[] args) {
        System.out.println("==============================\n");

        Singleton singleton1 = Singleton.getInstance();
        System.out.println("1 -- " + singleton1);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("2 -- " + singleton2);

        System.out.println("\n------------------------------");
        System.out.println("--- WaterSpring --------------");
        float someWater;
        WaterSpring waterSpring = WaterSpring.getInstance();

        someWater = 2.5f;
        System.out.println(waterSpring.getWater(someWater));
        someWater = 3.2f;
        System.out.println(waterSpring.getWater(someWater));

        System.out.println("------------------------------");
        System.out.println("--- Teapot -------------------");

        float waterForTeapot = 1.8f;
        Teapot teapot = new Teapot(waterForTeapot);
        System.out.println("3 -- " + teapot.makeTea());
        System.out.println("waterSpring" + waterSpring);


        System.out.println("\n==============================");
        System.out.println("=== Multiton ===================");
        Multiton multiton = Multiton.getInstance("1");
        System.out.println("multiton 1 -- " + multiton);

        Multiton multiton2 = Multiton.getInstance("2");
        System.out.println("multiton 2 -- " + multiton2);






        System.out.println("\n==============================");
    }
}
