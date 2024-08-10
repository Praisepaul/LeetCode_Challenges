class Solution {
    public int mySqrt(int x) {
        long r = x;
        if(x == 0){
            return 0;
        }
        else{
            while(r * r > x){
        r = (r + x / r) / 2;
            }
        }
        return (int) r;
    }
}