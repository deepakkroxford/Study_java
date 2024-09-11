package String;

public class Q5RemoveCharacter {
    public static void main(String[] args) {
        /*
         * Given two strings string1 and string2, remove those characters from first
         * string(string1) which are present in second string(string2). Both the strings
         * are different and contain only lowercase characters.
         * NOTE: Size of first string is always greater than the size of second string(
         * |string1| > |string2|).
         * 
         * Example 1:
         * 
         * Input:
         * string1 = "computer"
         * string2 = "cat"
         * Output: "ompuer"
         * Explanation: After removing characters(c, a, t)
         * from string1 we get "ompuer".
         * Example 2:
         * 
         * Input:
         * string1 = "occurrence"
         * string2 = "car"
         * Output: "ouene"
         * Explanation: After removing characters
         * (c, a, r) from string1 we get "ouene".
         * 
         * 
         */

        String s1 = "computer";
        String s2 = "cat";

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            char c = s1.charAt(i);
            if(s2.indexOf(c)==-1)
            {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());


    }
}
