package String;

import java.util.*;

public class StringMethod {
    public static void main(String[] args) {
        String s = "riya kumari";

        // Method 1: This method is use to find the length of the string
        System.out.println(s.length());

        // Method 2: toUpperCase method
        s = s.toUpperCase();
        System.out.println(s);

        // Method 3: toLowerCase method
        s = s.toLowerCase();
        System.out.println(s);

        // Method 4: Trim() method is used to remove the leading and trailing space from
        // the string
        String x = "   Deepak    ";
        System.out.println(x.trim());

        // Method 5: Substring Method -> it return the substring from the start and end
        // index.
        String s1 = "My Name is Deepak Kumar Singh";
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5, 9));

        // Method 6: Replace method is used to replace the specific cahracter in the
        // string
        String name = "Amamn";
        // System.out.println(name.replace('m', 'x'));
        System.out.println(name.replace("Ama", "Xyz"));

        // Method 7: Equals method
        String stu = "Riya Kumari";
        String student = "Riya kumari";

        System.out.println(stu.equals(student)); // false beacuse it is case sensitive
        System.out.println(stu.equalsIgnoreCase(student)); // true it does not check uppercase and lowercase

        // Method 8: Split Method // important
        // String x1 ="I am good Boy";
        // String arr[] = x1.split(" ");
        // System.out.println(arr[3]);

        // for(int i =0;i<arr.length;i++)
        // {
        // System.out.println(arr[i]);
        // }

        // Method -8 CharAt() -- method
        String xy = "12AmanSingh126:,";
        System.out.println(xy.charAt(5)); // n -> output
        ArrayList<Character> ch = new ArrayList<>();
        ArrayList<Character> al = new ArrayList<>();
        for (int i = 0; i < xy.length(); i++) {
            if (Character.isDigit(xy.charAt(i))) {
                ch.add(xy.charAt(i));
            }
            if (Character.isAlphabetic(xy.charAt(i))) {
                al.add(xy.charAt(i));
            }
        }
        System.out.println(ch);
        System.out.println(al);

        // Mehtod -9 Character.isDigit(xy.charAt(i)) it check the value is numeric or
        // not

        String z = "harshit";
        System.out.println(z.startsWith("ha"));// true
        System.out.println(z.endsWith("i")); // false

        // Concatinate
        String v0 = "Vishal";
        String v1 = "Singh";
        String v2 = "Rajput";
        String s3 = v0 + " " + v1 + " " + v2;
        System.out.println(s3);


        // Method 10- IndexOf() - it will give the index of the character if the given
        // character is repeated so it return the first character index ,
        //if the character not found then it will return the value -1;
        String str = "Deepak";
        System.out.println(str.indexOf('e'));
        System.out.println('x');

        // Method 11- Compareto() method - it return the three value 0,1,-1
        String str1 = "bbc";
        String str2 = "bbc";
        System.out.println(str2.compareTo(str1)); // it give the value -1;
        /*
         * it check the string lexographically and compare them if the both string is
         * same then return the value 0
         * if the given string is less then the other string so it return the -1;
         * if the given string is greater than other string so it return the value +1;
         */

        // Method 12 - Contains Method -> this method return the boolean value and it
        // takes the input as String we can not pass the character

        String str3 = "Data Structure";
        System.out.println(str3.contains("Data")); //true
        System.out.println(str3.contains("aman")); //false

        //Method 13 - Concat Method
        String str4 = "Hello";
        String str5="World";
        String xx = str4.concat(str5); 
        System.out.println(xx);
        System.out.println(str4.concat(" "+str5));

    }
}
