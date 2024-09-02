package BasicMathQuestion;

public class printAllDivisor {
   public static void main(String[] args) {
    int n =36;

    // normal approach

    // for(int i=1;i<=n;i++)
    // {
    //     if(n%i==0)
    //     {
    //         System.out.println(i);
    //     }
    // }

    //optimized approach
    for(int i=1;i<=Math.sqrt(n);i++)
    {
        if(n%i==0)
        {
            System.out.println(i);

            if(n/i!=i)
            {
                System.out.println(n/i);
            }
        
        }
    }
   }

}
