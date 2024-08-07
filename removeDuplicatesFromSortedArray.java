class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0; // Initialize a pointer to keep track of the unique elements
        
        for (int i = 0; i < n; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i]; // Copy unique element to the current position
                 // Move the unique elements pointer
            }
        }
        
        return j+1;//j now represents the new length of the array without duplicates
    }
}
