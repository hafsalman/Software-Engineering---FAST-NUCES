//Hafsa Salman
//22K-5161
//Question no. 04

#include<iostream>
using namespace std;

void swapUsingPointers (int *ptr_1, int *ptr_2, int temp)
{
	temp = *ptr_1;
	*ptr_1 = *ptr_2;
	*ptr_2 = temp;
}

int main ()
{
	cout << "Name: Hafsa Salman" << endl;
	cout << "Roll no. 22K-5161" << endl;
	cout << "Question no. 04" << endl;
	
	int num_1 = 5, num_2 = 6;
	
	cout << "Original numbers: \nNumber 01: " << num_1 << "\nNumber 02: " << num_2 << endl;
	
	int temp;
	
	swapUsingPointers (&num_1, &num_2, temp);
	
	cout << "\nAfter swapping: \nNumber 01: " << num_1 << "\nNumber 02: " << num_2 << endl;
}