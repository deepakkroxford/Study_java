package String;

public class StringMethod {
    public static void main(String[] args) {
        String s ="riya kumari";
          
        //Method 1: This method is use to find the length of the string 
        System.out.println(s.length());

        //Method 2: toUpperCase method
        s= s.toUpperCase();
        System.out.println(s);

        //Method 3: toLowerCase method
        s=s.toLowerCase();
        System.out.println(s);

        //Method 4: Trim() method  is used to remove the leading and trailing space from the string 
        String x ="   Deepak    ";
        System.out.println(x.trim());

        //Method 5: Substring Method -> it return the substring from the start and end index.
        String s1 ="My Name is Deepak Kumar Singh";
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5, 9));

        //Method 6: Replace method is used to replace the specific cahracter in the string
        String name = "Amamn";
       // System.out.println(name.replace('m', 'x'));
        System.out.println(name.replace("Ama", "Xyz"));


        //Method 7: Equals method 
        String stu = "Riya Kumari";
        String student = "Riya kumari";

        System.out.println(stu.equals(student)); //false beacuse it is case sensitive 
        System.out.println(stu.equalsIgnoreCase(student)); // true it does not check uppercase and lowercase

        //Method 8: Split Method // important
        String x1 ="I am good Boy";
        String arr[] = x1.split(" ");
        System.out.println(arr[3]);

        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        
        












    }
}

