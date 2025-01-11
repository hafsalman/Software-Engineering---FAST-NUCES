//Hafsa Salman
//22K-5161
//Question no. 03

#include<iostream>
using namespace std;

int main ()
{
	cout << "Name: Hafsa Salman" << endl;
	cout << "Roll no. 22K-5161" << endl;
	cout << "Question no. 03" << endl;
	
	int arr[5] = {10, 20, 30, 40, 50};
	int *ptr = arr;
	
	cout << "Array: \n";
	for (int i=0; i<5; i++)
	{
		cout << arr[i] << "\t";
	}
	
	ptr = arr;
	
	for (int i=0; i<5; i++)
	{
		*ptr *=2;
		
		ptr++;
	}
	
	cout << "\n\nArray after increment: \n";
	for (int i=0; i<5; i++)
	{
		cout << arr[i] << "\t";
	}
}