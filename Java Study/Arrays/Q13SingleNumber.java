package Arrays;

import java.util.HashMap;

public class Q13SingleNumber {
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};

        /*
         * first way using the HashMap 
         */
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i], 1);
            }
            else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        int singleNumber=0;

        for(var e: map.entrySet())
        {
            if(e.getValue()==1)
            {
                singleNumber=e.getKey();
                break;
            }
        }
        System.out.println("the single number is using hashmap -->"+singleNumber);


        /*
         * Second way using the xor operation
         */

         int sum =0;
         for(int i=0;i<arr.length;i++)
         {
            sum = sum^ arr[i];
         }
         System.out.println("the single number is using the xor  ----> "+sum);

    }
}
