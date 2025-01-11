//Hafsa Salman
//22K-5161
//Question no. 04

public class Question_04 
{
	public static void main(String[] args) 
	{
		System.out.println("Name: Hafsa Salman");
		System.out.println("Roll no. 22K-5161");
		System.out.println("Question no. 04");
		System.out.println();
		
		Car C = new Car();
		
		C.startEngine();
		C.stopEngine();
		
		Motorcycle M = new Motorcycle();
		
		M.startEngine();
		M.stopEngine();
		
	}
}

abstract class Vehicle
{
	abstract public void startEngine();
	abstract public void stopEngine();
}

class Car extends Vehicle
{
	public Car()
	{
		
	}

	@Override
	public void startEngine() 
	{
		System.out.println("Car's engine starting...");
	}

	@Override
	public void stopEngine() 
	{
		System.out.println("Car's engine stopping...");
	}
}

class Motorcycle extends Vehicle
{
	public Motorcycle()
	{
		
	}

	@Override
	public void startEngine() 
	{
		System.out.println("Motorcycle's engine starting...");
	}

	@Override
	public void stopEngine() 
	{
		System.out.println("Motorcycle's engine stopping...");
	}
	
}