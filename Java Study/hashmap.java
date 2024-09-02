import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5,5,5,6,7,7,8,8,89,9,9,9,1,1};

        /*
            key       Value
             1         3
             2         1
             3         2
             4         1
             5         3
             6         1
             7         2
             8         2
             9         2
         */ 
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.println(map.size());
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i], 1);
            }

            else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        System.out.println(map.entrySet());
        System.out.println(map.values());


    }
}
