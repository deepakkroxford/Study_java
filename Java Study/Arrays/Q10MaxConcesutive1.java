package Arrays;

public class Q10MaxConcesutive1 {
    public static void main(String[] args) {
        /*
         * Given a binary array nums, return the maximum number of consecutive 1's in
         * the array.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,1,0,1,1,1]
         * Output: 3
         * Explanation: The first two digits or the last three digits are consecutive
         * 1s. The maximum number of consecutive 1s is 3.
         * Example 2:
         * 
         * Input: nums = [1,0,1,1,0,1]
         * Output: 2
         * 
         * 
         */

        int arr[] = { 1, 1, 0, 1, 1, 1 };
        int maxone = 0;
        int current = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                current++;

                if (current > maxone) {
                    maxone = current;
                }
            } else {
                current = 0;
            }
        }
        System.out.println(maxone);
    }
}
