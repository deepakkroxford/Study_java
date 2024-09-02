import java.util.ArrayList;

class Student{
    String name;
    int id;
    String branch;

   public Student(String name, int id, String branch)
    {
        this.name=name;
        this.id=id;
        this.branch = branch;
    }
    
    public String toString()
    {
        return name+" "+id+" "+branch;
    }

}
class arraylistcoll{
    public static void main(String[] args) {
        
        //array use
       // int arr[] = new int [10];  //fix size 
        ArrayList<Integer> ans  = new ArrayList<>();
        ans.add(23);
        ans.add(233);
        ans.add(232);
        ans.add(231);
        ans.add(2356);
        ans.add(89);

        for (Integer integer : ans) {
            System.out.print(" "+integer);
        }
        System.out.println();
        System.out.println(ans);

        ArrayList<Student> stu  = new ArrayList<>();
         stu.add(new Student("Prakash ", 1, "Ise"));
         stu.add(new Student("Aman ", 2, "mse"));
         stu.add(new Student("Ashish ", 3, "cse"));
         stu.add(new Student("Deepak", 4, "pse"));
         System.out.println(stu);
         

         //after remove 
         stu.remove(0);
         System.out.println(stu);
         System.out.println(stu.size());
         stu.addFirst(new Student("harshit", 4, "ise"));
         System.out.println(stu);
         stu.addFirst(new Student("abhishekr", 5, "ise"));
         System.out.println(stu);
            
         
            
         }



    }
