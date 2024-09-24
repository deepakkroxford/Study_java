package OBJECTORIENTED.Inheritance;

//parent class 
class Vehicle {
    double price;
    double milage;
    String color;

    public void drives() {
        System.out.println("reparing Vechile");
    }
    public void display()
    {
        System.out.println(price+" "+milage+" "+color);
    }



}

//child class 
class Car extends Vehicle {

    
    String fueltype;
    boolean sunroof;
    String brand;
    public void drive() {
        System.out.println("reparing car");
    }


}





public class implementation {
    public static void main(String[] args) {
        
    }
}
