package HashSet;


import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the length of the string");
        int n = sc.nextInt();

        String str1 []= new String[n];
        System.out.println("enter the element");
        for(int i=0;i<str1.length;i++)
        {
            str1[i] = sc.nextLine();
        }
        System.out.println();

        System.out.println("output");

        for(int i=0;i<str1.length;i++)
        {
            System.out.println(str1[i]);
        }

        

        // String str[] ={"aman","vishal","riya","aman","vishal","harshit"};

        // HashSet<String> set = new HashSet<>();

        // for(int i=0;i<str.length;i++)
        // {
        //     set.add(str[i]);
        // }
        // System.out.println(set);


    }
}
