package BasicMathQuestion;

public class FibnacciSeries {
    public static void main(String[] args) {
        /*
         * The Fibonacci numbers are the numbers in the following integer sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
         */
        int n=10; //it means that we have to find the fibnacci series till 10
         int a =0;
         int b =1;
         System.out.println(a);
         System.out.println(b);

         int c;
         for(int i =2;i<=n;i++)
         {
             c=a+b;
             a=b;
             b=c;
             System.out.println(c);
         }


        
    }
}
