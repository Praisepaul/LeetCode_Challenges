class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int newSize = 0; // Initialize a new size variable
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[newSize] = nums[i]; // Move non-'val' elements to the beginning
                newSize++;
            }
        }
        
        return newSize;
    }
}
