package String;

public class Q2ReverseWord {
    public static void main(String[] args) {
        /*
         * Given an input string s, reverse the order of the words.
         * 
         * A word is defined as a sequence of non-space characters. The words in s will
         * be separated by at least one space.
         * 
         * Return a string of the words in reverse order concatenated by a single space.
         * 
         * Note that s may contain leading or trailing spaces or multiple spaces between
         * two words. The returned string should only have a single space separating the
         * words. Do not include any extra spaces.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: s = "the sky is blue"
         * Output: "blue is sky the"
         * Example 2:
         * 
         * Input: s = "  hello world  "
         * Output: "world hello"
         * Explanation: Your reversed string should not contain leading or trailing
         * spaces.
         * Example 3:
         * 
         * Input: s = "a good   example"
         * Output: "example good a"
         * Explanation: You need to reduce multiple spaces between two words to a single
         * space in the reversed string.
         * 
         * 
         * Constraints:
         * 
         * 1 <= s.length <= 104
         * s contains English letters (upper-case and lower-case), digits, and spaces '
         * '.
         * There is at least one word in s.
         * 
         */


         //1st way to solve this problem 
        String s = "a good   example";

        String x[] = s.split(" +");
        
        StringBuilder sb= new StringBuilder();
        // for(int i=x.length-1;i>=0;i--)
        // {
        //     sb.append(x[i]);
        //     sb.append(" ");
        // }
        // System.out.println(sb.toString().trim());
        // sb = new StringBuilder();

        //2nd way to solve this problem

        
        s=s.trim();
        StringBuilder ans = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                sb.append(s.charAt(i));
            }
            else if(sb.length()>0){
                ans.append(sb.reverse());
                ans.append(' ');
                sb = new StringBuilder();
            }
        } 

        if(sb.length()>0)
        {
            ans.append(sb.reverse());
        }
        System.out.println(ans);



    }
}
