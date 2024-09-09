package BasicMathQuestion;
public class Countdigit22{
    public static void main(String[] args) {
        /*
         * Given a number n. Count the number of digits in n which evenly divide n.
         * Return an integer, total number of digits of n which divides n evenly.
         * 
         * Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a
         * remainder 0 when divided.
         * 
         * 
         * Examples :
         * 
         * Input: n = 12
         * Output: 2
         * Explanation: 1, 2 when both divide 12 leaves remainder 0.
         * Input: n = 2446
         * Output: 1
         * Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do
         * not.
         * Input: n = 23
         * Output: 0
         * Explanation: 2 and 3, none of them divide 23 evenly.
         * 
         */

         /*
          *  10 %10 = 0
             50%10 = 5

             12%10 = 2
             12/10 = 1.2-> integer m sotre 1
             1%10 = 1
          */

          int n= 23672377;

          int count1 = (int) Math.log10(n)+1;
          System.out.println(count1);




          int count=0;
          int original = n;
          while(n>0)
          {
            int rem= n%10;
            if(rem>0 && original%rem==0)
            {
                count++;
            }
            n= n/10;
            count++;

          }
          System.out.println(count);

          

    }
}
