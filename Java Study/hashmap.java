import java.util.HashMap;

public class hashmap {
      static public void main(String[] args) {
       

        /*
            key       Value
             1         1
             2         1
             3         2
             4         1
             5         3
             6         1
             7         2
             8         2
             9         3

         */ 

        int arr[] = {1,2,3,3,4,5,5,5,6,7,7,8,8,89,9,9,9,1,1};
        HashMap<Integer,Integer> map = new HashMap< >();
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


          
       
        


    }
}
