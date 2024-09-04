package BasicMathQuestion;

public class factorial {
    public static void main(String[] args) {
        int n =5;
        int Product = 1;

        for(int i=1;i<=n;i++)
        {
            Product = Product*i;
        }
        System.out.println("the factorial of n is -->"+Product);
    }
}
