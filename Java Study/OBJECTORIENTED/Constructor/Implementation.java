package OBJECTORIENTED.Constructor;

class Employe {
    String name;
    String depart;
    int salary;
    String cast;

    // constructor
    /*
     * point 0 -> The constructer is a special method in the java
     * point 1 -> The constructor has same name as class name.
     * point 2 -> The constructor has no return type. even void
     * point 3 -> The constructor has use to insilize the object during its creation
     * point 4 -> The constructor is automatically called when the object of class
     *  is created
     */

    // constructer 1
    public Employe(String name, String depart) {
        this.name = name;
        this.depart = depart;
    }

    // construcer overloaded
    public Employe(String name, String depart, int salary) {
        this.name = name;
        this.depart = depart;
        this.salary = salary;
    }

    public Employe(String name, String depart, int salary, String cast) {
        this.name = name;
        this.depart = depart;
        this.salary = salary;
        this.cast = cast;
    }

    // method
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    // method overloading
    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void printdetails() {
        System.out.println("name: " + name + " department: " + depart + " salary: " + salary + " cast: " + cast);
    }

}

public class Implementation {
    public static void main(String[] args) {

        Employe e1 = new Employe("Vishal", "CSE"); // object 1
        e1.printdetails();

        Employe e2 = new Employe("Viraj", "ISe", 100000); // object 2
        e2.printdetails();

        Employe e3 = new Employe("Deepak", "ISe", 98600, "Rajput"); // object 3
        e3.printdetails();

    }
}
