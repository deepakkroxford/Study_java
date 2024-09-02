package BasicMathQuestion;

public class reverse{
    public static void main(String[] args) {
        
       int n = 12345;
       
       int rev = 0;
       while(n!=0)
       {
           int rem = n%10;
           rev = rem+rev*10;
           n=n/10;
       }
       System.out.println(" the number is reversed "+rev);

    }
}