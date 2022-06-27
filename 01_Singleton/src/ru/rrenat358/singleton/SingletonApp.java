package ru.rrenat358.singleton;

public class SingletonApp {

    public static void main(String[] args) {
        System.out.println("Start Singleton App");
        System.out.println("==============================\n");

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);



        System.out.println("\n==============================");
        System.out.println("Singleton App is Done!");
    }
}
