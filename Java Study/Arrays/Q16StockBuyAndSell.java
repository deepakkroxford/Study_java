package Arrays;

import operator.arothmatic;

public class Q16StockBuyAndSell {
    public static void main(String[] args) {
        int arr[] = { 7,6,4,3,1 };

        int maxprofit = 0;
        for (int i = 0; i < arr.length; i++) {
            int sellingprice = arr[i];
            for (int j = 0; j <i; j++) {

                if(Math.abs(sellingprice-arr[j])>maxprofit)
                {
                    maxprofit = sellingprice-arr[j];
                }
            }
        }
        if(maxprofit<0)
        {
            maxprofit=0;
        }
        System.out.println(maxprofit);


        //Now we will solve using the O(n) time complexity

        int bestbuy = arr[0];
        int maximumprofit =0;
        for(int i=1;i<arr.length;i++)
        {
            if(bestbuy<arr[i-1])
            {
                
            }
            else{
                bestbuy = Math.min(arr[i], bestbuy);
            }
        }

    }
}
