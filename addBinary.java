class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder result = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int numA = i >= 0 ? a.charAt(i) - '0' : 0;
            int numB = j >= 0 ? b.charAt(j) - '0' : 0;

            int sum = numA + numB + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        return result.toString();
    }
}
