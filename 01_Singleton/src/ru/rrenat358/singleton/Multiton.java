package ru.rrenat358.singleton;

import java.util.HashMap;
import java.util.Map;

public class Multiton {

    private static Map instances = new HashMap<>();

    private static Multiton multitonInstance = null;

    public static Multiton getInstance(String key) {
        multitonInstance = (Multiton) instances.get(key);
        if (multitonInstance == null) {
            multitonInstance = new Multiton();
            instances.put(key, multitonInstance);
        }
        return multitonInstance;
    }
}
