package OBJECTORIENTED.Abstraction;
//abstract class
abstract class Vishal
{

    //this is the abstract method in the abstract class 
    abstract public void dance();

    //this is the normal method in the abstract class
    public void fast()
    {
        System.out.println("i run fast");
    }
   // abstract public static void song();

}

//normal class
class Riya extends Vishal{

    public void song()
    {
        System.out.println("i love hindi song");
    }
    @Override
    public void dance ()
    {
        System.out.println("i am dancing");
    }
}
public class Implementation {
    public static void main(String[] args) {

        /*
         * Defination: Abstraction is a fundamental concept in the object oriented
         * programming language.
         * The main focus on hiding the complex implementation detail and showing the
         * essential features.
         * 
         * 
         * keyword: to achieve the abstraction in the java we have to method and class;
         * 
         * abstract keyword is used to create the abstract class.
         * abstract keyword is used to create the abstract method.
         * 
         *  //normal method --> concrete method
         *  public void sum(int a, int b)
         * {
         *     system.println(a+b);
         * }
         * 
         * //abstract method 
         *  abstract public void sum(int a , int b);
         * 
         * //important points  about abstrct class 
         * 1. in the abstract class we can declare the both method abstract and the concrecte method .
         * 2. we can not create the object of the abstract class;
         * 3. Abstract classes has constructer
         * 4.abstract method can not be static because if we make the static it belong to the class we can not override those methods.
         */


         //normal class object we can create
         Riya r = new Riya();
         r.dance();
         r.fast();

         //it will give the complile time error we can not create the object of the abstract class
        //  Vishal v = new Vishal();

    }
}
