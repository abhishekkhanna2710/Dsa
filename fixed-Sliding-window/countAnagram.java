import java.util.HashMap;

public class countAnagram {
    public static boolean compare(HashMap<Character, Integer> pMap, HashMap<Character, Integer> sMap) {
        for (char sch : sMap.keySet()) {
            if (pMap.getOrDefault(sch, 0) != sMap.get(sch)) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        // using sliding wiondow
        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();

        // store the value of both string into a hashMap
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < p.length(); i++) {
            char ch = s.charAt(i);
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        int i = 0;
        int j = p.length();
        int count = 0;
        String ans = "";

        while (j < s.length()) {
            if (compare(pMap, sMap) == true) {
                count++;
                ans += i + " ";
            }

            // for acquring the next value
            char cha = s.charAt(j);
            sMap.put(cha, sMap.getOrDefault(cha, 0) + 1);

            // for release the previous value
            char chr = s.charAt(i);
            if (sMap.get(chr) == 1) {
                sMap.remove(chr);
            } else {
                sMap.put(chr, sMap.get(chr) - 1);
            }
            i++;
            j++;
        }

        if (compare(pMap, sMap) == true) {
            count++;
            ans += i + " ";
        }

        System.out.println(count);
        System.out.println(ans);

    }
}
