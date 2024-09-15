package ArrayList;

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

        




        
    }
}
