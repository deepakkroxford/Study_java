package BasicMathQuestion;

public class gcd{
    public static void main(String[] args) {
        int a =11;
        int b = 13 ;

        int ogr1 = a;
        int org2 = b;
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

        int lcm =(ogr1*org2)/a;
        System.out.println(lcm);


    }
}