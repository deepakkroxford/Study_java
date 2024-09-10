package Arrays;
import java.util.*;
public class Q14ArrayDuplicate {
    public static void main(String[] args) {
        /*
         * Difficulty: EasyAccuracy: 18.95%Submissions: 749K+Points: 2
         * Given an array arr of size n which contains elements in range from 0 to n-1,
         * you need to find all the elements occurring more than once in the given
         * array. Return the answer in ascending order. If no such element is found,
         * return list containing [-1].
         * 
         * Examples:
         * 
         * Input: n = 4, arr[] = [0,3,1,2]
         * Output: -1
         * Explanation: There is no repeating element in the array. Therefore output is
         * -1.
         * Input: n = 5, arr[] = [2,3,1,2,3]
         * Output: 2 3
         * Explanation: 2 and 3 occur more than once in the given array.
         * Expected Time Complexity: O(n).
         * Expected Auxiliary Space: O(n).
         * 
         * Constraints:
         * 
         * 1 <= n <= 105
         * 0 <= arr[i] <= 105, for each valid i
         * 
         */

         int arr[] ={0,3,1,2};
         HashSet <Integer> set = new HashSet<>();
         ArrayList<Integer> ans = new ArrayList<>();

         for(int i=0;i<arr.length;i++)
         {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
            }
            else{
                ans.add(arr[i]);
            }
         }

         if(ans.isEmpty()) //
         {
            ans.add(-1);
            System.out.println(ans);
         }
         else{
            Collections.sort(ans);
            System.out.println(ans);
         }


    }
}
