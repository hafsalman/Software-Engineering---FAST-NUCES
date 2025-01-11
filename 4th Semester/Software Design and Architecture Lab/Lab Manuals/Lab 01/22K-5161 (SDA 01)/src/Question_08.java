//Hafsa Salman
//22K-5161
//Question_08

public class Question_08 
{
	public static void main(String[] args) 
	{
		System.out.println("Name: Hafsa Salman");
		System.out.println("Roll no. 22K-5161");
		System.out.println("Question no. 08");
		System.out.println();
		
		CarbonFootPrint B = new Building(4);
		CarbonFootPrint C = new Cars(100, 0.1);
		CarbonFootPrint Bi = new Bicycle(50.2);
		
		System.out.println("Building Carbon Footprint: " + B.getCarbonFootPrint() + " units");
		System.out.println("Car Carbon Footprint: " + C.getCarbonFootPrint() + " units");
		System.out.println("Bicycle Carbon Footprint: " + Bi.getCarbonFootPrint() + " units");
	}

}

abstract class CarbonFootPrint
{
	abstract double getCarbonFootPrint();
}

class Building extends CarbonFootPrint
{
	public int burners;
	
	public Building (int burners)
	{
		this.burners = burners;
	}

	@Override
	double getCarbonFootPrint() 
	{
		return (burners * 22.14);
	}
}

class Cars extends CarbonFootPrint
{
	double distance;
	double fuel;
	
	public Cars(double distance, double fuel)
	{
		this.distance = distance;
		this.fuel = fuel;
	}

	@Override
	double getCarbonFootPrint() 
	{
		return (distance * fuel * 22.14);
	}
}

class Bicycle extends CarbonFootPrint
{
	double travellingDistance;
	double fuel;
	
	public Bicycle (double travellingDistance)
	{
		this.travellingDistance = travellingDistance;
		this.fuel = 0;
	}

	@Override
	double getCarbonFootPrint() 
	{
		return (travellingDistance * fuel * 22.14);
	}
	
}