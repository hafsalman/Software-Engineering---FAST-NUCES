//Hafsa Salman
//22K-5161
//Question no. 02

import java.util.Scanner;

public class Question_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("22K-5161");
        System.out.println("Question no. 02");
        System.out.println();

        Manager man = new Manager();

        man.InputInformation();
        man.c_input();
        man.m_input();
        man.displayInformation();
        man.c_display();
        man.m_display();
    }
}

class Person
{
    public Person()
    {
        System.out.println("I am a person.");
    }

    protected String name;
    protected int age;
    protected String nation;
    protected String address;
    protected String CNIC;

    public void InputInformation()
    {
        Scanner s = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter name: ");
        name = s.nextLine();

        System.out.print("Enter age: ");
        age = s.nextInt();

        s.nextLine();

        System.out.print("Enter nationality: ");
        nation = s.nextLine();

        System.out.print("Enter address: ");
        address = s.nextLine();

        System.out.print("Enter CNIC: ");
        CNIC = s.nextLine();

        while (CNIC.length() != 13 || CNIC.contains("-") || CNIC.contains("*") || CNIC.contains("a")
        || CNIC.contains("b") || CNIC.contains("c") || CNIC.contains("d") || CNIC.contains("e") || CNIC.contains("f")
        || CNIC.contains("g") || CNIC.contains("h") || CNIC.contains("i") || CNIC.contains("j") || CNIC.contains("k")
        || CNIC.contains("l") || CNIC.contains("m") || CNIC.contains("n") || CNIC.contains("o") || CNIC.contains("p")
        || CNIC.contains("q") || CNIC.contains("r") || CNIC.contains("s") || CNIC.contains("t") || CNIC.contains("u")
        || CNIC.contains("v") || CNIC.contains("w") || CNIC.contains("x") || CNIC.contains("y") || CNIC.contains("z")
        || CNIC.contains("A") || CNIC.contains("B") || CNIC.contains("C") || CNIC.contains("D") || CNIC.contains("E")
        || CNIC.contains("F") || CNIC.contains("G") || CNIC.contains("H") || CNIC.contains("I") || CNIC.contains("J")
        || CNIC.contains("K") || CNIC.contains("L") || CNIC.contains("M") || CNIC.contains("N") || CNIC.contains("O")
        || CNIC.contains("P") || CNIC.contains("Q") || CNIC.contains("R") || CNIC.contains("S") || CNIC.contains("T")
        || CNIC.contains("U") || CNIC.contains("V") || CNIC.contains("W") || CNIC.contains("X") || CNIC.contains("Y")
        || CNIC.contains("Z"))
        {
            System.out.println("Invalid Inout!");
            System.out.print("Enter again: ");
            CNIC = s.nextLine();
        }
    }

    public void displayInformation()
    {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nation);
        System.out.println("Address: " + address);
        System.out.println("CNIC: " + CNIC);
    }
}

class Employee extends Person
{
    public Employee()
    {
        System.out.println("I am an employee.");
    }

    protected String c_name;
    protected String c_location;
    protected int years;

    public void c_input()
    {
        Scanner s = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter Company's name: ");
        c_name = s.nextLine();

        System.out.print("Enter Company's location: ");
        c_location = s.nextLine();

        System.out.print("Enter no. of years you have worked: ");
        years = s.nextInt();
    }

    public void c_display()
    {
        System.out.println();
        System.out.println("Company's Name: " + c_name);
        System.out.println("Company's Location: " + c_location);
        System.out.println("No. of years you have worked: " + years);
    }
}

class Manager extends Employee
{
    public Manager()
    {
        System.out.println("I am a manager.");
    }

    protected String [] emp = new String [5];

    public void m_input()
    {
        Scanner s = new Scanner(System.in);
        System.out.println();

        System.out.println("Enter the name of the employees who are working under the manager: ");
        for (int i=0; i<5; i++)
        {
            System.out.print("Employee " + (i+1) + ": ");
            emp[i] = s.nextLine();
        }
    }

    public void m_display()
    {
        System.out.println();

        System.out.println("Employees that work under Manager");
        for (int i=0; i<5; i++)
        {
            System.out.println("Employee " + (i+1) + ": " + emp[i]);
        }
    }
}