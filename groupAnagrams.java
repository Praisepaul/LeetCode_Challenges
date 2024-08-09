import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for(String str : strs){
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String sorted = new String(s);

            if(!m.containsKey(sorted)){
                m.put(sorted, new ArrayList<>());
            }
            m.get(sorted).add(str);
        }
        return new ArrayList<>(m.values());
    }
}