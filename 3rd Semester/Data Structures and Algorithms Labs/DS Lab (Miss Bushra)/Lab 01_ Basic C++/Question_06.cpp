//Hafsa Salman
//22K-5161
//Question no. 06

#include<iostream>
using namespace std;

void transpose (int arr_1[3][3], int arr_2[3][3])
{
	cout << "\nPrinting the transpose of Array 01: " << endl;
	
	for (int i=0; i<3; i++)
	{
		for (int j=0; j<3; j++)
		{
			cout << arr_1[j][i] << "\t";
		}
		
		cout << "\n";
	}
	
	cout << "\nPrinting the transpose of Array 02: " << endl;
	
	for (int i=0; i<3; i++)
	{
		for (int j=0; j<3; j++)
		{
			cout << arr_2[j][i] << "\t";
		}
		
		cout << "\n";
	}
}

void sumMatrices(int arr_1[3][3], int arr_2[3][3], int arr_3[3][3])
{
	cout << "\nPrinting the array after addition: " << endl;
	for (int i=0; i<3; i++)
	{
		for (int j=0; j<3; j++)
		{
			arr_3[i][j] = arr_1[i][j] + arr_2[i][j];
			cout << arr_3[i][j] << "\t";
		}
			
		cout << "\n";
	}
}

void dimensions()
{
	int r, c;
	
	cout << "Enter Dimensions: ";
	cout << "\nEnter rows: ";
	cin >> r;
	
	cout << "Enter columns: ";
	cin >> c;
	
	if (r <= 0 && c <= 0)
	{
		cout << "Invalid dimensions! \n Dimensions can not be less than or equals to 0.";
	}
	
	else
	{
		int arr[r][c];
		
		cout << "\nEnter the elements for Array: " << endl;
		
		for (int i=0; i<r; i++)
		{
			for (int j=0; j<c; j++)
			{
				cout << "Enter element " << (i+1) << " x " << (j+1) << ": ";
				cin >> arr[i][j];
			}
		}
		
		cout << "\nPrinting Array: " << endl;
		
		for (int i=0; i<r; i++)
		{
			for (int j=0; j<c; j++)
			{
				cout << arr[i][j] << "\t";
			}
		
			cout << "\n";
		}
	}
}

int main ()
{
	cout << "Name: Hafsa Salman" << endl;
	cout << "Roll no. 22K-5161" << endl;
	cout << "Question no. 06" << endl;
	
	int arr_1[3][3], arr_2[3][3], arr_3[3][3];
	
	cout << "\nEnter the elements for Array 01: " << endl;
	
	for (int i=0; i<3; i++)
	{
		for (int j=0; j<3; j++)
		{
			cout << "Enter element " << (i+1) << " x " << (j+1) << ": ";
			cin >> arr_1[i][j];
		}
	}
	
	cout << "\nPrinting Array 01: " << endl;
	
	for (int i=0; i<3; i++)
	{
		for (int j=0; j<3; j++)
		{
			cout << arr_1[i][j] << "\t";
		}
		
		cout << "\n";
	}
	
	cout << "\nEnter the elements for Array 02: " << endl;
	
	for (int i=0; i<3; i++)
	{
		for (int j=0; j<3; j++)
		{
			cout << "Enter element " << (i+1) << " x " << (j+1) << ": ";
			cin >> arr_2[i][j];
		}
	}
	
	cout << "\nPrinting Array 02: " << endl;
	
	for (int i=0; i<3; i++)
	{
		for (int j=0; j<3; j++)
		{
			cout << arr_2[i][j] << "\t";
		}
		
		cout << "\n";
	}
	
	int choice;
	
	cout << "\nEnter \n1. for transpose \n2. for sum of the matrices \n3. for entering dimensions";
	cout << "\nEnter choice: ";
	cin >> choice;
	
	switch (choice)
	{
		case 1:
		{
			transpose(arr_1, arr_2);
		}
		
		break;
		
		case 2:
		{
			sumMatrices(arr_1, arr_2, arr_3);
		}
		
		break;
		
		case 3:
		{
			dimensions();
		}
		
		break;
		
		default:
		{
			cout << "Invalid input!";
		}
		
		break;
	}
}