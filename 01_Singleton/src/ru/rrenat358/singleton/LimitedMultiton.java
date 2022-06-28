package ru.rrenat358.singleton;

import java.util.HashMap;
import java.util.Map;

public class LimitedMultiton {

    public enum CountInstance {
        ONE,
        TWO,
        TREE;
    }

    private static Map instances = new HashMap<>();

    private static LimitedMultiton limitedMultitonIntance = null;

    public static LimitedMultiton getInstance(Enum key) {
        limitedMultitonIntance = (LimitedMultiton) instances.get(key);
        if (limitedMultitonIntance == null) {
            limitedMultitonIntance = new LimitedMultiton();
            instances.put(key, limitedMultitonIntance);
        }
        return limitedMultitonIntance;
    }
}
