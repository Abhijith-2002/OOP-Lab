import java.io.*;
import java.util.*;
class Vehicle
{
    String make;
    String model;
    int year;
    String fuelType;
    Vehicle(String make,String model,int year,String fuelType)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    void maxSpeed()
    {
        System.out.println("The max speed is 0");
    }
    void distanceTravelled()
    {
        System.out.println("Distance Travelled : 0km");
    }
    void fuelEfficiency()
    {
        System.out.println("Fuel Efficiency : 0kmpl");
    }
}
class Car extends Vehicle
{
    Car(String make,String model,int year,String fuelType)
    {
        super(make,model,year,fuelType);
    }
    void maxSpeed()
    {
        System.out.println("The max speed of car is 120");
    }
    void distanceTravelled()
    {
        System.out.println("Distance Travelled : 1000km");
    }
    void fuelEfficiency()
    {
        System.out.println("Fuel Efficiency : 22kmpl");
    }
}
class Bike extends Vehicle
{
    Bike(String make,String model,int year,String fuelType)
    {
        super(make,model,year,fuelType);
    }
    void maxSpeed()
    {
        System.out.println("The max speed of bike is 100");
    }
    void distanceTravelled()
    {
        System.out.println("Distance Travelled : 2000km");
    }
    void fuelEfficiency()
    {
        System.out.println("Fuel Efficiency : 32kmpl");
    }
}
class Truck extends Vehicle
{
    Truck(String make,String model,int year,String fuelType)
    {
        super(make,model,year,fuelType);
    }
    void maxSpeed()
    {
        System.out.println("The max speed of truck is 80");
    }
    void distanceTravelled()
    {
        System.out.println("Distance Travelled : 8000km");
    }
    void fuelEfficiency()
    {
        System.out.println("Fuel Efficiency : 12kmpl");
    }
}
class VehicleData
{
    public static void main(String[] args)
    {
        System.out.println("Enter the make model year fuel-type : ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");
        String make = words[0];
        String model = words[1];
        int year = Integer.parseInt(words[2]);
        String fuelType = words[3];
        Vehicle vehicle;
        if(fuelType.equalsIgnoreCase("Electric"))
        {
            vehicle = new Car(make,model,year,fuelType);
        }
        else if(fuelType.equalsIgnoreCase("Petrol"))
        {
            vehicle = new Bike(make,model,year,fuelType);
        }
        else
        {
            vehicle = new Truck(make,model,year,fuelType);
        }
        vehicle.maxSpeed();
        vehicle.distanceTravelled();
        vehicle.fuelEfficiency();
        sc.close();
    }
}