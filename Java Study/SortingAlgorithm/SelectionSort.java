package SortingAlgorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]= {23, 13, 45, 89, 11, 6, 9, 78};
        

        /*
         * we have to find the smallest element first and move that smallest element to the right side of the array 
         * 
         */

         for(int i=0;i<arr.length-1;i++)
         {
            int min = i;

            for(int j=i+1;j<arr.length;j++)
            {
                    if(arr[min]>arr[j])
                    {
                        min=j;
                    }
            }

            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]= temp;
         }


         for(int i=0;i<arr.length;i++)
         {
             System.out.println(arr[i]);
         }
    }

}
