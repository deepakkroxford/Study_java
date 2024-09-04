package SortingAlgorithm;

public class BubbleSort{
    public static void main(String[] args) {
        int arr[] = { 23, 13, 45, 89, 11, 6, 9, 78};

        /*
         * in the bubble sort we put the largest element the left of the array
         * we check the each adjacent side do the swapping 
         */

        for(int i=0;i<arr.length-1;i++) //n-1;
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
        
    }
}
