import java.util.ArrayList;
import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        //O(n) 
        //O(n2)
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(!set.contains(arr[i]))
        //     {
        //         set.add(arr[i]);
        //     }
        // }
        // System.out.println(set);

        // HashSet<Integer> set = new HashSet<>();
        // set.add(3);
        // set.add(34);
        // set.add(32);
        // set.add(38);
        // set.add(33);
        // set.add(33);
        // set.add(3);
        // set.add(245);
        // System.out.println(set);

        int arr[] = {1,2,3,4,4,5,6,6,77,7,8};
        ArrayList<Integer> ans = new ArrayList<>();


        HashSet<Integer> set = new HashSet<>(); 
        //question duplicate

        for(int i=0;i<arr.length;i++)
        {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
            }
            else{
                ans.add(arr[i]);
                break;
            }
        }
        System.out.println(ans);
        




    }
}
