package OBJECTORIENTED.Inheritance;

//parent class
class Vehicle {
    double price;
    double milage;
    String color;

    public void drives() {
        System.out.println("reparing Vechile");
    }

    
}

// child class
// extend keyword is used to inherit the property of the parent class
class Car extends Vehicle {

    String fueltype;
    boolean sunroof;
    String brand;

   
}




public class implementation {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.fueltype = "diesel";
        c1.sunroof = false;
        c1.brand = "BMW";
        c1.milage = 15;
        c1.price = 4500000;
        c1.color = "white";






    }
}
