//Hafsa Salman
//22K-5161
//Question_07

public class Question_07 
{
	public static void main(String[] args) 
	{
		System.out.println("Name: Hafsa Salman");
		System.out.println("Roll no. 22K-5161");
		System.out.println("Question no. 07");
		System.out.println();
		
		Max M =new Max();
		
		System.out.println("Maximum number out of 2: " + M.Maximum(5, 9));
		System.out.println("Maximum number out of 3: " + M.Maximum(8, 3, 5));
	}
}

class Max
{
	public Max()
	{
		
	}
	
	int Maximum (int a, int b)
	{
		if (a > b)
		{
			return a;
		}
		
		else 
		{
			return b;
		}
	}
	
	int Maximum (int a, int b, int c)
	{
		if (a > b || a > c)
		{
			return a;
		}
		
		else if (b > a || b > c)
		{
			return b;
		}
		
		else
		{
			return c;
		}
	}
}