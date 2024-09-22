package OBJECTORIENTED.StatickeyWord;

class Student {
   static String Hod;
    String name;
    String sub;
    int roll;
    int marks;

    public  void  printdetails() {
        System.out.println(
                " Hod-->" + Hod + " name-->" +name + " sub-->" + sub + " roll-->" + roll + " marks-->" + marks);
    }

}

public class implementaiton {
    public static void main(String[] args) {
        Student s1 = new Student();

       Student.Hod="Deepak Kumar Singh"; // it change the value of all objects
       // s1.Hod = "Kangnavalii";
        s1.name = "Vishal";
        s1.sub = "compiler-design";
        s1.roll = 33;
        s1.marks = 90;
        s1.printdetails();

        Student s2 = new Student();
        //s2.Hod = "Kangnava";
        s2.name = "Deepak";
        s2.sub = "compiler-design";
        s2.roll = 33;
        s2.marks = 90;
        s2.printdetails();

        Student s3 = new Student();
        //s3.Hod = "Kangnava";
        s3.name = "Riya";
        s3.sub = "OS";
        s3.roll = 33;
        s3.marks = 90;
        s3.printdetails();

    }
}
