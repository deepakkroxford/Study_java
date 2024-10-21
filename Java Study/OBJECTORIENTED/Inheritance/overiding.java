package OBJECTORIENTED.Inheritance;

//Parent class 
class karnataka {

    String state;
  
    public void song()
    {
        System.out.println("kandadd song");
    }

}

//child class
class Bihar extends karnataka {

    @Override
    public void song()
    {
        System.out.println("Bojpuri song ");
    }


}

public class overiding {
    public static void main(String[] args) {
        /*
         * Defination :
         * Method overiding-> when we give the implememtaion of parent class method in the 
         * child class  so that proccess is called as Method Overriding.
         */
    }
}
