//Hafsa Salman
//22K-5161
//Question no. 05

#include<iostream>
using namespace std;

int main ()
{
	cout << "Name: Hafsa Salman" << endl;
	cout << "Roll no. 22K-5161" << endl;
	cout << "Question no. 05" << endl;
	
	int n = 42;
	int *ptr;
	
	ptr = &n;
	
	cout << "Number: " << n << endl;
	cout << "*ptr stored address: " << ptr << endl;
	cout << "*ptr value: " << *ptr << endl;
}