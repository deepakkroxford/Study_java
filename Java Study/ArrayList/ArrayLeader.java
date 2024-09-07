package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeader {
    public static void main(String[] args) {
        int arr[] ={16,17,4,3,5,2};
        int n = arr.length;
         ArrayList<Integer> ans = new ArrayList<>();
        
        int currentLeader = arr[n-1];
        ans.add(arr[n-1]);
        
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>=currentLeader)
            {
                currentLeader=arr[i];
                ans.add(arr[i]);
            }
        
        }
        
        /*
         2 5 17
        */
        Collections.reverse(ans);
        System.out.println(ans);

    }
}
