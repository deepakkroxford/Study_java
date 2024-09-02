package BasicMathQuestion;

public class gcd{
    public static void main(String[] args) {
        int a =9;
        int b = 12 ;

        while(a!=b)
        {
            if(a==0)
            {
                System.out.println(b);
                break;
            }
            if(a>b)
            {
                a=a-b;
            }
            if(b>a)
            {
                b=b-a;
            }
        }
        System.out.println(a);
    }
}