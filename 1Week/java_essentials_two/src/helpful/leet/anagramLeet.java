import java.util.HashMap;
import java.util.Map;

public static void main(String []) {
    System.out.println(isAnagram(s,t));
}

// <https://docs.oracle.com/javase/8/docs/api/java/util/Map.html>
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMapDict = new HashMap<>();
        Map<Character, Integer> tMapDict = new HashMap<>();
        for (int i = 0; i < s.length() ; i++) {
            // add s[i] to the mapDict sMapDict
            sMapDict.put(s.charAt(i), sMapDict.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length() ; i++) {
            tMapDict.put(t.charAt(i), tMapDict.getOrDefault(t.charAt(i), 0) +1);
            // add t[i] to the mapDict tMapDict
        }
        if (tMapDict.equals(sMapDict)) {
            return true;
        }
        return false;

    }
}

class SolutionPro {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0 ; i < s.length() ; i++) {
            store[s.charAt(i) -'a']++;
            store[t.charAt(i) -'a']--;
        }

        for (int n : store) if (n !=0) return false;

        return true;
    }
}