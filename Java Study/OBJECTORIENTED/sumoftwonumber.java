package OBJECTORIENTED;
class Sum{

    // public void sumoftwonum(int a, int b)
    // {
    //     // System.out.println("the sum of a and b  --> "+(a+b));
    // }

    public int sumoftwo(int a,int b)
    {
        int res = a+b;
        return res;
    }
}
public class sumoftwonumber {
    public static void main(String[] args) {

        //normal way
        // int a=10;
        // int b =20;
        // System.out.println("the sum of two number is -->"+(a+b));

        //using method
        Sum sum1 = new Sum();
        System.out.println(sum1.sumoftwo(22, 34));

    }
}
