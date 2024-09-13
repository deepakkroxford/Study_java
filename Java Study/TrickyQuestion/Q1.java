package TrickyQuestion;

public class Q1 {
    public static void main(String[] args) {

        // Q1
        int a = 10;
        int b = 20;

        System.out.println("Sum is: " + a + b);
        System.out.println("Sum is: " + (a + b));

        System.out.println(10 * 10 + "Hello");
        System.out.println("Hello" + 10 * 10);

        System.out.println();

        // Q2 ->
        String s1 = null;
        System.out.println(s1 + "test");
        System.out.println("test" + null);

        // Q3->
        int x = 5;
        int y = 2;
        double result = x / y;
        System.out.println(result);
        /*
         * Explanation:
         * 
         * • x / y is integer division because both x and y are integers. The division
         * of two integers results in an integer, so 5 / 2 results in 2. Then, 2 is
         * implicitly converted to double when assigned to result, so result becomes
         * 2.0.
         * 
         */

        // Q4
        char c1 = 'A';
        char c2 = 'B';
        System.out.println(c1 + c2);
        System.out.println(c1 + "" + c2);
        /*
         * Explanation:
         * 
         * • System.out.println(c1 + c2);:
         * • The characters c1 and c2 are converted to their ASCII values ('A' is 65 and
         * 'B' is 66), and then the values are added together (65 + 66 = 131).
         * • System.out.println(c1 + "" + c2);:
         * • Here, the empty string "" causes both characters to be treated as strings,
         * resulting in "AB".
         * 
         */

        // Q5
        int a1 = 10;
        int b1 = ++a;
        System.out.println(a1 + " " + b1);

        int x1 = 10;
        int y1 = x1++;
        System.out.println(x1 + " " + y1);

        /*
         * Explanation:
         * 
         * • int b = ++a;:
         * • Pre-increment (++a) increments a first and then assigns the value to b. So,
         * both a and b become 11.
         * • int y = x++;:
         * • Post-increment (x++) assigns the value of x to y first, and then increments
         * x. So, x becomes 11, but y remains 10.
         */

         //Q6
         

    }
}
