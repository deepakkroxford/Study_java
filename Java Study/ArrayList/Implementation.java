package ArrayList;
import java.util.Arrays;

import Arrays.Q4missingArrray;

import java.util.ArrayList;

public class Implementation {
    public static void main(String[] args) {
        int arr[] = new int [10]; //
        int len = arr.length;
        System.out.println(len);

        // int is primitive data type
        //Integer is object

        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add(67);
        ans.add(90);
        ans.add(45);
        ans.add(78);
        ans.add(67);
        ans.add(33);
        ans.add(45);
        System.out.println(ans);
        System.out.println(ans.get(3));
        System.out.println(ans.remove(0));
        System.out.println(ans.isEmpty());
        ans.add(3, 10000);
        
        System.out.println(ans);
    
        System.out.println(ans);
        System.out.println(ans.size());


        //by the help of package we can do this by importing them 
        Q4missingArrray b1 = new Q4missingArrray();
        int arr1 [] ={1,2,4,5};
        System.out.println("the output is "+b1.missingNumber(arr1.length+1, arr1));

    
        




        
    }
}
