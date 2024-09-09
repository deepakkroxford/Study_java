package Arrays;
import java.util.*;
public class Q1MajorityElement {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        HashMap <Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int x = nums.length/2;
         
        // 1 way to itterate the HashMap
        // for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
        //     if(entry.getValue()>x)
        //     {
        //         System.out.println(entry.getValue());
        //         break;
        //     }
          
            
        // }

        // Second Way to itterate the map 
        for (var e : map.entrySet()) {
            if(e.getValue()>x)
            {
                System.out.println("the majority element in the array is --->>> "+e.getKey());
                break;
            }
        }
        
    }
}
