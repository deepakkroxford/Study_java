package SwitchStatement;

import java.util.Scanner;

public class implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the month");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("febuaray");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;

            default:
                System.out.println("it is not valids");
                break;
        }

    }
}
