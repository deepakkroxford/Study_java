package Arrays;

import loops.forloop;

public class Q11MaxConsecutiveIII {
    public static void main(String[] args) {
        /*
         * Given a binary array nums and an integer k, return the maximum number of
         * consecutive 1's in the array if you can flip at most k 0's.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
         * Output: 6
         * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
         * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
         * Example 2:
         * 
         * Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
         * Output: 10
         * Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
         * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
         * 
         */

         int arr[] ={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
         int k =3;
         int maxone = 0;
         int count =0;
         int j=0;

         for(int i=0;i<arr.length;i++)
         {
            if(arr[i]==0)
            {
                count++;
            }
            while(count>k)
            {
                if(arr[j]==0)
                {
                    count--;
                }
                j++;
            }
            maxone = Math.max(maxone, i-j+1);

         }

         System.out.println("the maximum consecutive one"+maxone);
    }
}
