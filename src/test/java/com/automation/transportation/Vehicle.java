package com.automation.transportation;

public class Vehicle {
    //syntax of a class <access modifier> class <class Name>

    //instance variable

    // state of a class
    //syntax of a variable - <data type> <variable name>
     int numberOfWheels=4;
     String brandName;
     double price;

     //behavior
    //syntax of a method <access modifier> <static/non-static> <return type> <method name> <parameter> <method body>

   public void start(){
    //body of a method
    }
   public void speed(){
       System.out.println("speed limit is :100");
   }

   public static void consumeGas(){
       System.out.println(" 20 mpg");
   }

    public static void main(String[] args) {
      //create an object of a class
      //syntax of creating an object of a class className <nameOfObject> = new className();
      Vehicle car = new Vehicle();
        System.out.println(car.numberOfWheels);
        car.speed();

    }

}
