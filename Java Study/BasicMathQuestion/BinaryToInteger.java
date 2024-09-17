package BasicMathQuestion;

import java.util.Scanner;

public class BinaryToInteger {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n");
        int n = sc.nextInt();
        int ans=0;
        
        int power=0;
        while(n!=0)
        {
            int rem = n%10;
            ans = ans+ rem * (int) Math.pow(2,power);
            power++;
            n = n/10;
            
        }
        
        System.out.println(ans);
}
}
