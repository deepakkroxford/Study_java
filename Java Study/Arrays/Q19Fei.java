package Arrays;



public class Q19Fei {
    public static void main(String[] args) {
        int arr[] = {11,1,2,8,10,11,15,17};
        int target =18;

        /*
         * Brute Force O(n2)
         */
        int pair1=0;
        int pair2 = 0;
        
         for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                   
                    if(i>j)
                    {
                        pair1=arr[i];
                        pair2 =arr[j];
                        break;
                    }
                    
                }
            }

        }


        System.out.println("the pair is "+pair1+"  "+pair2);
    }
}
