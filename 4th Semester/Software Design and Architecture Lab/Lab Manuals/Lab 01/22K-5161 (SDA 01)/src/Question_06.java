//Hafsa Salman
//22K-5161
//Question_06

public class Question_06 
{
	public static void main(String[] args) 
	{
		System.out.println("Name: Hafsa Salman");
		System.out.println("Roll no. 22K-5161");
		System.out.println("Question no. 06");
		System.out.println();
		
		System.out.println("Number: " + Add.show(5));
		System.out.println("Sum of 2 numbers: " + Add.show(5, 10));
	}
}

class Add
{
	static int show (int a)
	{
		return a;
	}
	
	static int show (int a, int b)
	{
		int sum;
		
		System.out.println();
		System.out.println("Numbers: " + a + " and "  + b);
		sum = a + b;
		
		return sum;
	}
}