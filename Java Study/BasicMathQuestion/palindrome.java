package BasicMathQuestion;

public class palindrome {
    public static void main(String[] args) {
        int number = 153;
        int original = number;


        int rev = 0;
        while (number!=0) {
            int rem = number%10;
            rev = rem + rev*10;
            number= number/10;
        }

        if(original == rev)
        {
            System.out.println("number is palindrome   "+rev);
        }
        else
        {
            System.out.println("number is not palindrome");
        }


    }
}
