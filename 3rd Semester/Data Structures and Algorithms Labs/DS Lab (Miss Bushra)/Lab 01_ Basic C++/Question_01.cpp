//Hafsa Salman
//22K-5161
//Question no. 01

#include<iostream>
using namespace std;

int main()
{
	cout << "Name: Hafsa Salman" << endl;
	cout << "Roll no. 22K-5161" << endl;
	cout << "Question no. 01" << endl;
	
	int r, c;
	
	cout << "\nEnter the numbers of rows: ";
	cin >> r;
	
	cout << "EnNter the numbers of columns: ";
	cin >> c;
	
	int arr_1[r][c], arr_2[r][c];
	
	cout << "\nEnter the elements for Array 01: " << endl;
	
	for (int i=0; i<r; i++)
	{
		for (int j=0; j<c; j++)
		{
			cout << "Enter element " << (i+1) << " x " << (j+1) << ": ";
			cin >> arr_1[i][j];
		}
	}
	
	cout << "\nPrinting Array 01: " << endl;
	
	for (int i=0; i<r; i++)
	{
		for (int j=0; j<c; j++)
		{
			cout << arr_1[i][j] << "\t";
		}
		
		cout << "\n";
	}
	
	cout << "\nEnter the elements for Array 02: " << endl;
	
	for (int i=0; i<r; i++)
	{
		for (int j=0; j<c; j++)
		{
			cout << "Enter element " << (i+1) << " x " << (j+1) << ": ";
			cin >> arr_2[i][j];
		}
	}
	
	cout << "\nPrinting Array 02: " << endl;
	
	for (int i=0; i<r; i++)
	{
		for (int j=0; j<c; j++)
		{
			cout << arr_2[i][j] << "\t";
		}
		
		cout << "\n";
	}
	
	int choice;
	
	cout << "\nEnter \n1. for addition \n2. for subtraction" << endl;
	cout << "Enter choice: ";
	cin >> choice;
	
	int arr_3[r][c];
	
	switch (choice)
	{
		case 1:
		{
			cout << "\nPrinting the array after addition: " << endl;
			for (int i=0; i<r; i++)
			{
				for (int j=0; j<c; j++)
				{
					arr_3[i][j] = arr_1[i][j] + arr_2[i][j];
					cout << arr_3[i][j] << "\t";
				}
			
				cout << "\n";
			}
		}
		
		break;
		
		case 2:
		{
			cout << "\nPrinting the array after subtraction: " << endl;
			for (int i=0; i<r; i++)
			{
				for (int j=0; j<c; j++)
				{
					arr_3[i][j] = arr_1[i][j] - arr_2[i][j];
					cout << arr_3[i][j] << "\t";
				}
			
				cout << "\n";
			}
		}
		
		break;
		
		default:
		{
			cout << "Invalid input!";
		}
	}
}