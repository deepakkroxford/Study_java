package String;

import java.util.HashMap;

public class Q9_SecondMostRepeated {
    public static void main(String[] args) {
        String arr[] = { "aaa", "bbb", "ccc", "bbb", "aaa", "aaa" };
        HashMap<String, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(map.entrySet()); /// [aaa=3, ccc=1, bbb=2]

        int max = Integer.MIN_VALUE;

        // we are finding the maximum value
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > max) {
                max = map.get(arr[i]);
            }
        }


        // second value

        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int ele = map.get(arr[i]); 
            if (max > ele && ele > second) {
                second = ele;
            }
        }

        String ans = "";  //not second largest only one in the array 
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == second) {
                ans = ans + arr[i];
                break;
            }
        }

        System.out.println(ans);

    }
}
