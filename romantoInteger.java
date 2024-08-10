import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) {
        int num = 0;
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (m.containsKey(c)) {
                int current = m.get(c);
                int next = (i + 1 < s.length()) ? m.get(s.charAt(i + 1)) : 0;

                if (next > current) {
                    num -= current;
                } else {
                    num += current;
                }
            }
        }
        return num;
    }
}
