package Arrays;

public class Q18MaximumSubarrayK {
    public static void main(String[] args) {
        int arr[] ={1,12,-5,-6,50,3};
        int k=4;
        int sum =0;
        for(int i=0;i<k;i++)
        {
            sum =sum+arr[i];
        }

        int max =0;
        int currentsum=sum;
        for(int i=k;i<arr.length;i++)
        {
            currentsum=currentsum-arr[i-k]+arr[i];
            max = Math.max(max, currentsum);
        }
        System.out.println(max/k);

        
    }
}
