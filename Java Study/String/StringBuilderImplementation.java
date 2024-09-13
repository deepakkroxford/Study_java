package String;

public class StringBuilderImplementation {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(" the capacity of stringbuilder is "+sb.capacity()); // the default cappacity of stringBuilder is 16

        StringBuilder s = new StringBuilder("Deepak");
        System.out.println(s.capacity()); // now the capacity of stringbuilder is increases to 22;

        /*
         * Imagine you have a long piece of string, and you want to keep adding more
         * strings to it. If you use a regular string in Java, every time you add
         * something, a new string is created, and the old one is discarded. This
         * process is slow and inefficient, especially if you’re doing it many times.
         * 
         * StringBuilder is like having a special tool that allows you to keep adding to
         * your string without making a new one every time. It’s faster and more
         * efficient because it modifies the existing string instead of creating new
         * ones.
         * 
         * In short, StringBuilder is used when you need to build or modify a string
         * many times in your code, making your program faster and more
         * memory-efficient.
         * 
         */

         /*
          * Method in StringBuilder
          */
          StringBuilder str = new StringBuilder();
          str.append("Hello");
          str.append("vishal");
          str.append("boss");
          
        //   str.insert(2, 'x');
        //   System.out.println(str);
        //   str.deleteCharAt(0);
        //   System.out.println(str);
        //   str.delete(0, 3);
        //   System.out.println(str);

        str.append(" world");
        System.out.println(str);
        System.out.println( str.reverse());
        



        //How to get each cahracter in the string 

        String x ="VisHal";
        
        for(int i=0;i<x.length();i++)
        {
            System.out.println(x.charAt(i));
        }

        System.out.println(x);

    }
}
