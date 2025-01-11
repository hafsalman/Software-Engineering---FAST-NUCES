
public class Question_01 
{
	public static void main(String[] args) 
	{
		System.out.println("Name: Hafsa Salman");
		System.out.println("Roll no. 22K-5161");
		System.out.println("Question no. 01");
		System.out.println();
		
		Vehicles C = new Vehicles("ABC", 'E', 0);
		
		System.out.println("Starting point:");
		System.out.println("Direction of car: " + C.getDirection() + "\nPosition of car: " + C.getPosition());
		System.out.println();
		
		C.move();
		System.out.println("After moving right:");
		System.out.println("Direction of car: " + C.getDirection() + "\nPosition of car: " + C.getPosition());
		System.out.println();
		
		C.turn('W');		
		System.out.println("After moving towards 'W':");
		System.out.println("Direction of car: " + C.getDirection() + "\nPosition of car: " + C.getPosition());
		System.out.println();
		
		C.movee(10);
		System.out.println("After moving 10 units:");
		System.out.println("Direction of car: " + C.getDirection() + "\nPosition of car: " + C.getPosition());
		System.out.println();
	}

}

class Vehicles
{
	String name;
	char direction;
	int pos;
	
	public Vehicles (String name, char direction, int pos)
	{
		this.name = name;
		this.direction = direction;
		this.pos = pos;
	}
	
	public void move()
	{
		switch (direction)
		{
			case 'E':
			{
				direction = 'S';
			}
			
			break;
			
			case 'S':
			{
				direction = 'W';
			}
			
			break;
			
			case 'W':
			{
				direction = 'N';
			}
			
			break;
			
			case 'N':
			{
				direction = 'E';
			}
			
			break;
			
			default:
			{
				System.out.println("Invalid Direction!");
			}
			
			break;
		}
	}
	
	 public void turn(char path)
	 {
		 if (path == 'E' || path == 'W' || path == 'N' || path == 'S')
		 {
			 direction = path;
		 }
		 
		 else
		 {
			 System.out.println("Invalid direction!");
		 }
	 }
	 
	 public void movee(int distance)
	 {
		 pos += direction;
	 }
	 
	 public char getDirection()
	 {
		 return direction;
	 }
	 
	 public int getPosition()
	 {
		 return pos;
	 }
}