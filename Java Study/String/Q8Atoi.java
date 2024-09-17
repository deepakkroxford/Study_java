package String;

class Atoi {
    public static int atoi(String s) {
        int ans = 0;
        int sign = 1;
        int i = 0;
        if (Character.isLetter(s.charAt(i))) {
            return ans;
        }
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        for (; i < s.length(); i++) {
           if(Character.isDigit(s.charAt(i))){
             ans  = ans *10 + (int) (s.charAt(i)-'0');}
             else{
                return -1;
             }
        }
        return ans*sign;
    }
}

public class Q8Atoi {
    public static void main(String[] args) {
        /*
         * Implement Atoi
         * Difficulty: MediumAccuracy: 32.58%Submissions: 215K+Points: 4
         * Given a string s, the objective is to convert it into integer format without
         * utilizing any built-in functions. If the conversion is not feasible, the
         * function should return -1.
         * 
         * Note: Conversion is feasible only if all characters in the string are numeric
         * or if its first character is '-' and rest are numeric.
         * 
         * Examples:
         * 
         * Input: s = "-123"
         * Output: -123
         * Explanation: It is possible to convert -123 into an integer so we returned in
         * the form of an integer
         * Input: s = "21a"
         * Output: -1
         * Explanation: The output is -1 as, due to the inclusion of 'a', the given
         * string cannot be converted to an integer.
         * 
         * Expected Time Complexity: O( |s| ),
         * Expected Auxiliary Space: O(1)
         * 
         */

         String s = "123a";
         System.out.println(Atoi.atoi(s));
    }
}
