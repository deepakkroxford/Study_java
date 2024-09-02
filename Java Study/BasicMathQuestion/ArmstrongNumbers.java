package BasicMathQuestion;

/**
 * ArmstrongNumbers
 */
public class ArmstrongNumbers {

    public static void main(String[] args) {
        
        int num = 169;   // 1*1*1 + 5*5*5 + 3*3*3;= 1+125+27 = 153;
        int original = num;
        int sum=0;
        while (num>0) {
            int rem = num%10;
            sum = sum+(rem*rem*rem);
            num = num/10;  
        }

        System.out.println(sum==original); //true false

        if(sum==original)
        {
            System.out.println(original+" is an Armstrong Number");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
}