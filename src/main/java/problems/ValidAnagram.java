package problems;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            map.put(cs, map.getOrDefault(cs, 0) + 1);
            map.put(ct, map.getOrDefault(ct, 0) - 1);
        }

        for (int i : map.values()) {
            if(i != 0) return false;
        }

        return true;
    }
}