class Solution {
    public boolean isPalindrome(int x) {
        int y = 0;
        int z = x;
     while(x > 0){
         int rem = x % 10;
         x = x / 10;
         y = y * 10 + rem;
     }   
     if(z == y){
         return true;
     }
     return false;
    }
}