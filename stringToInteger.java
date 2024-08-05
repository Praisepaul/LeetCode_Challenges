class Solution {
    public int myAtoi(String s) {
        int index = 0, sign = 1, total = 0;
        int n = s.length();

        // Step 1: Ignore leading whitespaces
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        // Step 2: Check for '+' or '-'
        if (index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = (s.charAt(index++) == '-') ? -1 : 1;
        }

        // Step 3: Read digits until a non-digit character is encountered
        while (index < n && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index++) - '0';

            // Step 4: Check for overflow
            if (total > Integer.MAX_VALUE / 10 || (total == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // Update total
            total = total * 10 + digit;
        }

        // Apply sign to the result
        return total * sign;
    }
}
