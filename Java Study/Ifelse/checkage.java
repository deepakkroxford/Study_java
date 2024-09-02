package Ifelse;

import java.util.Scanner;

public class checkage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of age");
        int age =sc.nextInt();

        if(age<18)
        {
            System.out.println("you are minor");
        }
        else if(age>=18 && age<60)
        {
            System.out.println("aligible for driving");
        }
        else 
        {
            System.out.println("you are senior citizen");
        }
      
        

    }
}
