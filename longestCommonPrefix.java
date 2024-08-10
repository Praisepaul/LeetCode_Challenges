import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                sb.append(s1.charAt(idx));
                idx++;
            }
            else{
                break;
            }
        }
        String res = sb.toString();
        return res;
    } 
}