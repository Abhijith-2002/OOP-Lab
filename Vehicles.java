import java.io.*;
import java.util.*;
abstract class Vehicle
{
    int wheels;
    int year;
    abstract int calcFuelUsage(int distance);
    void display()
    {
        System.out.println("Name of class : "+this.getClass().getSimpleName());
        System.out.println("Number of wheels : "+wheels);
        System.out.println("Year of manufacture : "+year);
    }
}
class Car extends Vehicle
{
    final int maxSpeed;
    final int mileage;
    Car(int wheels,int year,int maxSpeed,int mileage)
    {
        this.wheels = wheels;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
    }
    int calcFuelUsage(int distance)
    {
        return distance/mileage;
    }
}
class Bike extends Vehicle
{
    final int maxSpeed;
    final int mileage;
    Bike(int wheels,int year,int maxSpeed,int mileage)
    {
        this.wheels = wheels;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
    }
    int calcFuelUsage(int distance)
    {
        return distance/mileage;
    }
}
class Vehicles
{
    public static void main(String[] args) throws IOException,FileNotFoundException
    {
        String filename =args[0];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the wheels-year-maxspeed-mileage");
        String line = sc.nextLine();
        String[] words = line.split(" ");
        int wheels = Integer.parseInt(words[0]);
        int year = Integer.parseInt(words[1]);
        int maxSpeed = Integer.parseInt(words[2]);
        int mileage = Integer.parseInt(words[3]);
        FileWriter writer = new FileWriter(filename);
        if(wheels==4)
        {
            Car car = new Car(wheels,year,maxSpeed,mileage);
            car.display();
            System.out.println("Enter the distance convered : ");
            int distance = sc.nextInt();
            writer.write("Total Fuel Consumption : "+car.calcFuelUsage(distance));
        }
        else
        {
            Bike bike = new Bike(wheels,year,maxSpeed,mileage);
            bike.display();
            System.out.println("Enter the distance convered : ");
            int distance = sc.nextInt();
            writer.write("Total Fuel Consumption : "+bike.calcFuelUsage(distance));
        }
        sc.close();
        writer.close();
    }
}