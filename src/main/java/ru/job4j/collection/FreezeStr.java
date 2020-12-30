package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        Map<Character, Integer> first = compCharMap(left);
        Map<Character, Integer> second = compCharMap(right);
        return first.equals(second);
    }

    public static Map<Character, Integer> compCharMap(String str) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
        return charMap;
    }
}

