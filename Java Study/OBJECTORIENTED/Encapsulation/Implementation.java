package OBJECTORIENTED.Encapsulation;

class Employee {
    /*
     * these are the instance variable and for achiving the encapsulation we have to
     * make the instance
     * varible as the private
     */
    private String name;
    private String depart;
    private int age;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setdepart(String depart) {
        this.depart = depart;
    }

    public String getdepart() {
        return depart;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getage() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

}

public class Implementation {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setName("riya");
        e1.setdepart("ise");
        e1.setAge(23);
        e1.setSalary(90000);

        System.out.println(e1.getName());
        System.out.println(e1.getdepart());
        System.out.println(e1.getage());
        System.out.println(e1.getSalary());

    }
}
