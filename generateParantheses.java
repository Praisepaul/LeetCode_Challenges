class Solution {
    static void generate(List<String> l, int open, int closed, String temp, int n){

        if(closed == open && closed == n){
            l.add(temp);
            return;
        }

        if(open < n){
            generate(l, open + 1, closed, temp + "(", n);
        }
        if(closed < open){
            generate(l, open, closed + 1, temp + ")", n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        
        generate(l, 0, 0, "", n);

        return l;
    }
}