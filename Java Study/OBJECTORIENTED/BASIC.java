package OBJECTORIENTED;

class Student {

    // attribute
    // instance variable
    String name = "aman";
    int roll;
    int marks;
    String color;
    int age;

    public void dancing() {

        System.out.println("the student is dancing is " + name);
    }

    public void printdetail() {
        System.out.println("The name of the student -->" + name);
        System.out.println("The roll no of the student-->" + roll);
        System.out.println("the marks of the student is -->" + marks);
        System.out.println("the color choice of the student is -->" + color);
        System.out.println("the age of the student --> " + age);
    }

}

public class BASIC {
    public static void main(String[] args) {

        // this is how we create the object of the student class
        Student s1 = new Student();
        s1.name="RIYA";
        s1.roll = 32;
        s1.marks = 21;
        s1.color = "Black";
        s1.age = 27;

        // System.out.println(s1.name);
        // System.out.println(s1.roll);
        // System.out.println(s1.marks);
        // System.out.println(s1.color);
        // System.out.println(s1.age);
        s1.printdetail();
        s1.dancing();

        System.out.println();

        Student s2 = new Student();
        s2.name ="Vishal";
        s2.roll = 73;
        s2.marks = 24;
        s2.color = "Gray";
        s2.age = 22;
        // System.out.println(s2.name);
        // System.out.println(s2.roll);
        // System.out.println(s2.marks);
        // System.out.println(s2.color);
        // System.out.println(s2.age);
        s2.printdetail();
        //s2.dancing();

    }
}
