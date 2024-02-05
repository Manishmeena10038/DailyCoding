class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int i = 0;
        int sign = 1;

        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        long result = 0;

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            
            result = result * 10 + digit;
            i++;
            if (result > (Integer.MAX_VALUE ) ){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

        }
        

        return (int)result * sign;
    }
}