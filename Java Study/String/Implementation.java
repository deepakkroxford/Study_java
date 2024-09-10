package String;

public class Implementation {
    public static void main(String[] args) {

        // 1st way to create the string
        String s0 = "Vishal Kumar Singh";
        String s1 = "Vishal Kumar Singh";

        System.out.println(s0);
        System.out.println(s1);

        // it will return the true because the value of the memory address is same and
        // value of string is also same
        System.out.println(s0 == s1);

        // // 2nd way to create the string

        String s2 = new String("Vishal Kumar Singh");

        // it will return the false value because address of memory is not same
        System.out.println(s1 == s2);

        String s3 = new String("Vishal Kumar Singh");

        // it will return the false value because address of memory is not same
        System.out.println(s2 == s3);

         // it will return the true beacause it check the value not the address of the
        // memory is same or not
        System.out.println(s0.equals(s3));


        //






    }
}
