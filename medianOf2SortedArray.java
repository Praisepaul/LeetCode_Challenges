class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int m = nums1.length;
        int n = nums2.length;

        int imin = 0, imax = m;
        int halfLen = (m + n + 1) / 2;
        double maxLeft, minRight;

        while (imin <= imax) {
            int i = (imin + imax) / 2;
            int j = halfLen - i;

            if (i < m && nums2[j - 1] > nums1[i]) {
                // Adjust the search range in nums1 to the right
                imin = i + 1;
            } else if (i > 0 && nums1[i - 1] > nums2[j]) {
                // Adjust the search range in nums1 to the left
                imax = i - 1;
            } else {
                // Found the correct partition
                if (i == 0) maxLeft = nums2[j - 1];
                else if (j == 0) maxLeft = nums1[i - 1];
                else maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);

                if ((m + n) % 2 == 1) {
                    // Odd total length, return the max element of the left partition
                    return maxLeft;
                }

                if (i == m) minRight = nums2[j];
                else if (j == n) minRight = nums1[i];
                else minRight = Math.min(nums1[i], nums2[j]);

                // Even total length, return the average of max left and min right
                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0; // In case the input arrays are not sorted.
    }
}
