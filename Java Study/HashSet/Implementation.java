package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

import loops.forloop;

public class Implementation {
    public static void main(String[] args) {

        /*
         * Basic implementation 
         */
        // HashSet<Integer> set = new HashSet<>();
        // set.add(10);
        // System.out.println(set);
        // set.add(10);
        // System.out.println(set);
        // // set.add(9);
        // // System.out.println(set.isEmpty());
        // // System.out.println(set.contains(11));
        // // System.out.println(set.size());
        // // set.clear();
        // // System.out.println(set);

        int arr[] = {1,2,4,5,6,5,7,7,6,2,2,1,1,1,6,7,42,3,3};
        HashSet <Integer> set = new HashSet<>();

        // for(int i=0;i<arr.length;i++)
        // {
        //     set.add(arr[i]);
        // }
        // System.out.println(set);


        // first repatative element 

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
            }
            else{
                    ans.add(arr[i]);
                    break;
            }
        }
        System.out.println(ans);
        


        

    }
}
