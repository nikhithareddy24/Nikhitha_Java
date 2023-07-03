package main.java.Interfaces.InstanceVariables;

// Sub class extending class
class Car extends Vehicle {
     int speed;

     public Car() { // constructor with no parameters
         speed = 45;
        milage = 60;
     }

     public Car(int speed) { //constructor with parameters
         this.speed = speed; // using the parameters
     }

     public static void main(String[] args)
     {
         Car c = new Car();
         System.out.println("Speed of Interfaces.Interfaces.InstanceVariables.Car: "+ c.speed + " Milage of Interfaces.Interfaces.InstanceVariables.Car: "+c.milage);
         Car c1 = new Car(50);
         System.out.println("Speed of Interfaces.Interfaces.InstanceVariables.Car is: "+c1.speed);

     }
 }
