package ArrayList;
import java.util.*;

import loops.forEachs;
public class Lists {
    public static void main(String[] args) {

        //this is how we create the list 
        //the type of the list is Integer
        List  <Integer>  ans = new ArrayList<>();
        //adding the value in the list 

        ans.add(20);
        ans.add(50);
        ans.add(280);
        ans.add(10);
        ans.add(30);
        ans.add(10);

        /*
         * it store the data in the order 
         * it can store the duplicte value 
         * the index will be start from 0
         */
        System.out.println(ans);


        //foreach loop 
        /*
         * it is the extended version of the for loop
         * 
         */
        // for(int x:ans)
        // {
        //     System.out.println(x);
        // }

        // how to get the value from the list

        System.out.println(ans.get(3)); // 10
       // System.out.println(ans.remove(0)); //20
        System.out.println(ans.contains(10)); // it check the value not the index  true or false
        System.out.println(ans.isEmpty()); // true or false
        ans.add(4,1000);
        
        System.out.println(ans.size());


        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,20);
        map.put(2,50);
        map.put(3,280);
        map.put(4,10);
        map.put(5,30);
        System.out.println("the size of the hashmap "+map.size());

    }
}
