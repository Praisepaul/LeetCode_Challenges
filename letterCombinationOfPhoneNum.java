class Solution {
    public void combinations(String s, String res, List<String> l){
        String keypad[] = {",","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(s.length() == 0){
            l.add(res);
            return;
        }

        String key = keypad[s.charAt(0) - '1'];

        for(int i = 0; i < key.length(); i++){
            combinations(s.substring(1), res + key.charAt(i), l);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> l = new ArrayList<>();
        if(digits.length() == 0)
            return l;
        combinations(digits,"", l);
        return l;
       
    }
}