package BasicMathQuestion;

public class prime {
    public static void main(String[] args) {
        int n = 36;
        int count = 0;
         
        if(n==1 || n==0)
        {
            System.out.println("Neither prime");
        }


            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
        

        if (count == 2) {
            System.out.println("it is the prime number "+n);
        } else {
            System.out.println("not is prime");
        }
    }
}
