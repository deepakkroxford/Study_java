package String;

import java.util.HashMap;

public class S {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String s = "suman singh";
        for(int i=0;i<s.length();i++)
        {
            // if(!map.containsKey(s.charAt(i)))
            // {
            //      map.put(s.charAt(i), 1);
            // }
            // else
            // {
            //     map.put(s.charAt(i), map.get(s.charAt(i))+1);
            // }
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        
        System.out.println(map.entrySet());
    }
}
