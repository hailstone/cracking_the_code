package chapter_one;


import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static boolean isStringUnique(String s) {
        if (s == null) {
            return true;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int value : map.values()) {
            if (value > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isStringUnique("abc"));
    }
}

