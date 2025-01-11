//Hafsa Salman
//22K-5161
//Question no. 02

#include<iostream>
using namespace std;

int main ()
{
	cout << "Name: Hafsa Salman" << endl;
	cout << "Roll no. 22K-5161" << endl;
	cout << "Question no. 02" << endl;
	
	int size;
	
	cout << "\nEnter the size of array: ";
	cin >> size;
	
	int arr[size];
	
	cout << "\nEnter array: \n";
	for (int i=0; i<size; i++)
	{
		cout <<"Element "  << (i+1) << ": ";
		cin >> arr[i];
	}
	
	cout << "Printing array: " << endl;
	for (int i=0; i<size; i++)
	{
		cout << arr[i] << "\t";
	}
	
	int choice;
	
	cout << "\n\nEnter \n1. To add number in array \n2. To delete a number from array";
	cout << "\nEnter choice: ";
	cin >> choice;
	
	switch (choice)
	{
		case 1:
		{
			int num, pos;
			
			cout << "\nEnter number: ";
			cin >> num;
			
			cout << "\nEnter position: ";
			cin >> pos;
			
			if (pos < 0 || pos > size)
			{
				cout << "Invalid position!";
			}
			
			else
			{
				for (int i=size; i>=pos; i--)
				{
					arr[i] = arr[i-1];
					arr[i] = num;
					size++;
				}
				
				cout << "After adding the number: \n";
				for (int i=0; i<size; i++)
				{
					cout << arr[i] << "\t";
				}
			}
		}
		
		break;
		
		case 2:
		{
			int del;
			
			cout << "\nEnter array index you want to delete: ";
			cin >> del;
			
			if (del < 0 || del > size)
			{
				cout << "Invalid position!";
			}
			
			else
			{
				for (int i=del; i<size-1; i++)
				{
					arr[i] = arr[i+1];
				}
				
				cout << "After deleting the number: \n";
				for (int i=0; i<size-1; i++)
				{
					cout << arr[i] << "\t";
				}
			}
		}
		
		break;
		
		default:
		{
			cout << "Invalid input!";
		}
		
		break; 
	}
}