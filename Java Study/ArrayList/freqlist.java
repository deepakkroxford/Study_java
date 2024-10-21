package ArrayList;

import java.util.*;

public class freqlist {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        // this is the input
        li.add(2);
        li.add(1);
        li.add(5);
        li.add(5);
        li.add(5);
        li.add(5);
        li.add(6);
        li.add(6);
        li.add(6);
        li.add(6);
        li.add(6);

        int len = li.size() / 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < li.size(); i++) {
            if (!map.containsKey(li.get(i))) {
                map.put(li.get(i), 1);
            } else {
                map.put(li.get(i), map.get(li.get(i)) + 1);
            }

            // map.put(li.get(i),map.getOrDefault(li.get(i), 0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        
        for (var e : map.entrySet()) {
            if (e.getValue() > len) {
                ans.add(e.getKey());
            }
        }

        System.out.println(ans);

    }
}
