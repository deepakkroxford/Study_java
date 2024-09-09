package Arrays;


import java.util.Arrays;

public class Q6secondLargestElement {
    public static void main(String[] args) {

        /*
         * Given an array arr, return the second largest distinct element from an array.
         * If the second largest element doesn't exist then return -1.
         * 
         * Examples:
         * 
         * Input: arr = [12, 35, 1, 10, 34, 1]
         * Output: 34
         * Explanation: The largest element of the array is 35 and the second largest
         * element is 34.
         * 
         * Input: arr = [10, 10]
         * Output: -1
         * 
         * Explanation: The largest element of the array is 10 and the second largest
         * element does not exist so answer is -1.
         * 
         * Expected Time Complexity: O(n)
         * Expected Auxiliary Space: O(1)
         * 
         */

         int arr[] ={12, 35,35, 1, 10, 34, 1};
         Arrays.sort(arr);
        //  for (int i : arr) {
        //     System.out.println(i);
        //  }

        /*
         * 1
1
10
12
34
35
35
         */
        int max = arr[arr.length-1];
        int secondLargestElement=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(max!=arr[i])
            {
                secondLargestElement=arr[i];
                break;
            }
        }
        System.out.println(secondLargestElement);
    }
}
