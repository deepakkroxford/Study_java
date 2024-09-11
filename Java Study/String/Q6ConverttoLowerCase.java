package String;

public class Q6ConverttoLowerCase {
    public static void main(String[] args) {
        /*
         * s = "ABCddE"
         * Output: "abcdde"
         * Explanation: A, B, C and E are converted to a, b, c and e thus all uppercase
         * characters of the string converted to lowercase letter.
         */
        String s = "ABCddE";
        System.out.println(s.toLowerCase());

       
        //other way to do this withoutBuiltIn methods
        StringBuilder sb = new StringBuilder();
        String s1 = "LMNOppQQ";
        for(int i=0;i<s1.length();i++)
        {
            char c = s1.charAt(i);
            if(c>=65 && c<=90)
            {
               c= (char) (c+32);
            }
            sb.append(c);

        }
        System.out.println(sb);
        sb= new StringBuilder();

        //third way is
        String s2 = "LMNOppQQ";
        for(int i=0;i<s2.length();i++)
        {
            char c = s2.charAt(i);
            if(c>='A' && c<='Z')
            {
               c= (char)(c+32);
            }
            sb.append(c);

        }
        System.out.println(sb);


    }
}
