import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        if(s.length() == 0 || s == null){
            return count;
        }
        else{
       int i = 0;
       Map<Character, Integer> m = new HashMap<>();
       for(int j = 0; j < s.length(); j++){
           char current = s.charAt(j);
           if(m.containsKey(current)){
               i = Math.max(i, m.get(current) + 1);
           }
           m.put(current,j );
           count = Math.max(count, j - i + 1);
       }
        }
return count;
    }
}