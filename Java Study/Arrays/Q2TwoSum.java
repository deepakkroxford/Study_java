package Arrays;

import java.util.HashMap;

public class Q2TwoSum {
    public static void main(String[] args) {
        /*
         * Given an array of integers nums and an integer target, return indices of the
         * two numbers such that they add up to target.
         * 
         * You may assume that each input would have exactly one solution, and you may
         * not use the same element twice.
         * 
         * You can return the answer in any order.
         * 
         * Example 1:
         * 
         * Input: nums = [2,7,11,15], target = 9
         * Output: [0,1]
         * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         * Example 2:
         * 
         * Input: nums = [3,2,4], target = 6
         * Output: [1,2]
         * Example 3:
         * 
         * Input: nums = [3,3], target = 6
         * Output: [0,1]
         * 
         */

         int nums [] = {2,7,11,15};
         int target = 9;
         HashMap<Integer,Integer> map = new HashMap<>();
         
        int ans [] = new int [2];

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                ans[0] = map.get(target-nums[i]);
                ans[1] = i;
                break;
            }
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i], i);
            }

        }

        for (int i : ans) {
            System.out.print(" "+i);
        }
         

    }
}
