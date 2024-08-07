class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // Found the target element.
            } else if (nums[mid] < target) {
                start = mid + 1; // Target is in the right half.
            } else {
                end = mid - 1; // Target is in the left half.
            }
        }

        return start; // Target not found, return the position where it should be inserted.
    }
}
