package OBJECTORIENTED.Constructor;

class Manager{
    String name;
     int salary;

   private Manager(){
        System.out.println("I am in the constructer");
    }

    public Manager(int salary)
    {
        this.salary=salary;
    }

    static{
        System.out.println("I am in the Static Block");
    }

    {
        System.out.println("I am in the Instace Block");
    }

    Manager m1 = new Manager();

    

}


public class orderOfExecution {
    public static void main(String[] args) {
        Manager m1 = new Manager(10000);
    
        
    }
}
