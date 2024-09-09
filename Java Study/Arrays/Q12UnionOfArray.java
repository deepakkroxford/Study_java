package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Q12UnionOfArray {
    public static void main(String[] args) {
        /*
         * Given two sorted arrays of size n and m respectively, find their union. The
         * Union of two arrays can be defined as the common and distinct elements in the
         * two arrays. Return the elements in sorted order.
         * 
         * Example 1:
         * 
         * Input:
         * n = 5, arr1[] = {1, 2, 3, 4, 5}
         * m = 5, arr2 [] = {1, 2, 3, 6, 7}
         * Output:
         * 1 2 3 4 5 6 7
         * Explanation:
         * Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
         * Example 2:
         * 
         * Input:
         * n = 5, arr1[] = {2, 2, 3, 4, 5}
         * m = 5, arr2[] = {1, 1, 2, 3, 4}
         * Output:
         * 1 2 3 4 5
         * Explanation:
         * Distinct elements including both the arrays are: 1 2 3 4 5.
         * Example 3:
         * 
         * Input:
         * n = 5, arr1[] = {1, 1, 1, 1, 1}
         * m = 5, arr2[] = {2, 2, 2, 2, 2}
         * Output:
         * 1 2
         * Explanation:
         * Distinct elements including both the arrays are: 1 2.
         * Your Task:
         * You do not need to read input or print anything. Complete the function
         * findUnion() that takes two arrays arr1[], arr2[], and their size n and m as
         * input parameters and returns a list containing the union of the two arrays.
         * 
         * Expected Time Complexity: O(n+m).
         * Expected Auxiliary Space: O(n+m).
         * 
         * 
         */

         int arr1[]= {1, 2, 3, 4, 5};
         int arr2[] = {1, 2, 3, 6, 7};

        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<arr1.length;i++)
        {
            if(!set.contains(arr1[i]))
            {
                set.add(arr1[i]);
                ans.add(arr1[i]);
            }
            
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(!set.contains(arr2[i]))
            {
                set.add(arr2[i]);
                ans.add(arr2[i]);
            }
        }
        
        Collections.sort(ans);
        System.out.println(ans);
    }
}
