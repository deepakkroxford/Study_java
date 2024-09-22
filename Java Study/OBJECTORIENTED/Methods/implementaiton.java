package OBJECTORIENTED.Methods;
class meth{
    
    //sum of two number 
    // public static int addtwonumber(int a, int b)
    // {
    //     return a+b;
    // }


    //method 1
    public void sum (int a,int b)
    {
        System.out.println(a+b);
    }

    //method 2 
    public void sum(int a,int  b, int c)
    {
        System.out.println(a+b+c);
    }




}
public class implementaiton {
    public static void main(String[] args)
    {

        meth s1 = new meth();
        s1.sum(1,2);
        s1.sum(1, 2, 3);




       //   System.out.println(meth.addtwonumber(21, 32));
    }
}
