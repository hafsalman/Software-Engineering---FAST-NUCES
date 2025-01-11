//Hafsa Salman
//22K-5161
//Question no. 03

public class Question_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Question no. 03");
        System.out.println();

        Car car = new Car();

        car.Display();
    }
}

class Vehicle
{
    private int speed;
    private String color;
    private int wheels;

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getWheels()
    {
        return wheels;
    }

    public void setWheels(int wheels)
    {
        this.wheels = wheels;
    }

    public Vehicle()
    {
        this.speed = 0;
        this.color = "White";
        this.wheels = 4;
    }
    public Vehicle (int speed, String color,int wheels)
    {
        this.speed = speed;
        this.color = color;
        this.wheels = wheels;
    }
}

class MotorVehicle extends Vehicle
{
    private String licenseplate;

    public void setLicenseplate(String licenseplate)
    {
        this.licenseplate = licenseplate;
    }

    public String getLicenseplate()
    {
        return licenseplate;
    }

    public MotorVehicle()
    {
        super();
    }

    public MotorVehicle(String licenseplate)
    {
        this.licenseplate = "ABC-123";
    }

    public MotorVehicle(int speed, String color, int wheels, String licenseplate)
    {
        super(speed, color, wheels);
        this.licenseplate = licenseplate;
    }
}

class Car extends MotorVehicle
{
    private int door;

    public int getDoor()
    {
        return door;
    }

    public void setDoor(int door)
    {
        this.door = door;
    }

    public Car()
    {
        super();
    }

    public void Display()
    {
        System.out.println("Speed: " + getSpeed());
        System.out.println("Colour: " + getColor());
        System.out.println("No. of wheels: " + getWheels());
        System.out.println("License Plate: " + getLicenseplate());
        System.out.println("No. of doors: " + door);
    }
}