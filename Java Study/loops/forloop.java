package loops;

public class forloop {
    public static void main(String[] args) {
        
        //print even number
    

     int count=0;
        for(int i=0 ;i<=100;i++)
        {
          
                  if(i%2==0)
                {
                    System.out.println(i);
                    count++;
                   
                }
                if(count == 10 )
                {
                    break;
                }
        }
        
        System.out.println(count);
        
        // int i=100;
        // while(i!=0)
        // {
        //     System.out.println(i);
            
        // }

        
    }
}
