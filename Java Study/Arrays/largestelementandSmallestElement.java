package Arrays;

public class largestelementandSmallestElement {
    public static void main(String[] args) {
        /*
         * Given an array, arr. The task is to find the largest element in it.
         * 
         * Examples:
         * 
         * Input: arr = [1, 8, 7, 56, 90]
         * Output: 90
         * Explanation: The largest element of the given array is 90.
         * 
         * Input: arr = [5, 5, 5, 5]
         * Output: 5
         * 
         * Explanation: The largest element of the given array is 5.
         * Input: arr = [10]
         * Output: 10
         * 
         * Explanation: There is only one element which is the largest.
         * Expected Time Complexity: O(n)
         * Expected Space Complexity: O(1)
         */


         int arr[] ={-1,-2,-3,-4,-5,-89};

        //  int max= Integer.MIN_VALUE;

         int min = Integer.MAX_VALUE;

         for(int i=0;i<arr.length;i++)
         {
            if(arr[i]<min)
            {
                min =arr[i];
            }
         }
         System.out.println(min);


    }
}
