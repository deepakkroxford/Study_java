package String;

import java.util.*;

public class Q3ReverseEachWord {
    public static void main(String[] args) {
        String s = "geeks quiz practice code";
        StringBuilder sb = new StringBuilder();
        // StringBuilder ans = new StringBuilder();
        // for(int i=0;i<s.length();i++)
        // {
        // if(s.charAt(i)!=' ')
        // {
        // sb.append(s.charAt(i));
        // }
        // else if(sb.length()>0)
        // {
        // ans.append(sb.reverse());
        // ans.append(' ');
        // sb = new StringBuilder();
        // }

        // }
        // if(sb.length()>0)
        // {
        // ans.append(sb.reverse());
        // }
        // System.out.println(ans);
        

        // Second way to solve the pronlem using stack
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ' ') {
                while (!st.isEmpty()) {
                    sb.append(st.pop());

                }
                sb.append(" ");
            }

        }
        while(st.size()>0)
        {
            sb.append(st.pop());
        }
        System.out.println(sb);

    }
}
