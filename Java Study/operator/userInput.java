package operator;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        // Scanner abc = new Scanner(System.in);

        // // System.out.println("enter the value of a");
        // // double a = abc.nextDouble();
        // // System.out.println("enter the value of b ");
        // // double b = abc.nextDouble();

        // // double c= a+b;
        // // System.out.println(c);

        // System.out.println("enter the name ");
        // String name = abc.nextLine();
        // System.out.println(name);


        //  String x = "Vishal kumar singh ";
        //  int a=10;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name ");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("enter the age ");
        int age = sc.nextInt();
        System.out.println(age);
        System.out.println("enter the salary ");
        double salary  = sc.nextDouble();

    }
}
