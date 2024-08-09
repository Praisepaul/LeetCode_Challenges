class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0){
            return 0;
        }
        String[] m = s.split(" ");
        String longest = m[m.length - 1];
        return longest.length();
    }
}