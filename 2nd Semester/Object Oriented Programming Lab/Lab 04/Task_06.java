//Hafsa Salman
//22K-5161
//Task 06

import java.util.Scanner;

public class Task_06
{
    public static void main (String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 06");
        System.out.print("\n");

        Car car = new Car("Toyota", 1200000, "White", 56);

        car.print();

        car.GetPriceAfterUse(car.price_new, car.odometer);

        Scanner s = new Scanner(System.in);

        float travelledDistance;

        System.out.print("\n");

        System.out.print("Enter Travelled Distance: ");
        travelledDistance = s.nextFloat();

        car.UpdateMillage (car.odometer, travelledDistance);
    }
}

class Car
{
    String brand_name;
    float price_new;
    String color;
    float odometer;

    public Car(String brand_name, float price_new, String color, float odometer)
    {
        this.brand_name = brand_name;
        this.price_new = price_new;
        this.color = color;
        this.odometer = odometer;
    }

    void GetPriceAfterUse(float price_new, float odometer)
    {
        float used;

        used = price_new * (1 - (odometer/600000));

        System.out.println("\n");
        System.out.println("Price of the car after getting used: " + used);
    }

    void print()
    {
        System.out.println("Brand Name: " + brand_name);
        System.out.println("Price when the car was new: " + price_new);
        System.out.println("Color: " + color);
        System.out.println("Odometer: " + odometer);
    }

    void UpdateMillage (float odometer, float travelledDistance)
    {
        odometer = odometer + travelledDistance;

        System.out.print("\n");
        System.out.println("Updated  Millage: " + odometer);
    }
}