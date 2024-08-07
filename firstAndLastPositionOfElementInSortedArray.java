class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target == nums[mid]){
                int first = mid;
                int last = mid;
                while(first > 0 && nums[first - 1] == target){
                    first--;
                }
                while(last < nums.length - 1 && nums[last + 1] == target){
                    last++;
                }
                return new int[] {first, last};
            }
            else{
                start = mid + 1;
            }
        }
        return new int[] {-1, -1};
    }
}