package Strings;

import java.util.HashMap;
import java.util.Map;

public class duplicateString {

    public static void printDups(String str, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), 1);
            else
                map.put(str.charAt(i),
                        map.getOrDefault(str.charAt(i), 1) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = "hbfehddddddbfrjbf";
        int n = str.length();
        printDups(str, n);
    }
}
// tc = 0(n)
// sc = 0(k)