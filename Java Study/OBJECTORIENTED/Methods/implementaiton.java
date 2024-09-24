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


    //we can overload the static method but we can not override the static method because the static 
    //method belong the class not the instance of the class 
    public static int su(int a, int b){
        return a+b;
    }
    public static int su(int a, int b, int c)
    {
        return a+b+c;
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
