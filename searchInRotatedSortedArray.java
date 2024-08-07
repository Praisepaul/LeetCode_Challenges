class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    // If target is in the left half, search in the left half
                    end = mid - 1;
                } else {
                    // If target is not in the left half, search in the right half
                    start = mid + 1;
                }
            } else {
                // If the left half is not sorted, the right half must be sorted
                if (target > nums[mid] && target <= nums[end]) {
                    // If target is in the right half, search in the right half
                    start = mid + 1;
                } else {
                    // If target is not in the right half, search in the left half
                    end = mid - 1;
                }
            }
        }

        return -1; // If target is not found
    }
}
