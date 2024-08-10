class Solution {
    public int[] plusOne(int[] digits) {
        // Initialize a carry variable to add 1 to the least significant digit.
        int carry = 1;

        // Iterate through the digits in reverse order.
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            // Update the current digit with the sum.
            digits[i] = sum % 10;
            // Update the carry for the next iteration.
            carry = sum / 10;
        }

        // If there's still a carry after the loop, it means we need to add an additional digit.
        if (carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            // Copy the remaining digits.
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        } else {
            return digits;
        }
    }
}
