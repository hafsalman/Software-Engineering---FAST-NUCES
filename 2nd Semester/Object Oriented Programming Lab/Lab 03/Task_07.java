//Hafsa Salman
//22K-5161
//Task no. 07

import java.util.Scanner;

public class Task_07
{
    public static void main (String[] args)
    {
        System.out.println("Roll no. 22K-5161");
        System.out.println("Name: Hafsa Salman");
        System.out.println("Task no. 07");
        System.out.println("\n");

        String name, phone;
        int num;
        double salary;

        Manager[] man = new Manager[3];

        Scanner s = new Scanner(System.in);

        for (int i=0; i<3; i++)
        {
            System.out.println("Employee " + (i+1) + ":");

            System.out.print("Enter Employee Number: ");
            num = s.nextInt();

            s.nextLine();

            System.out.print("Enter Employee Name: ");
            name = s.nextLine();

            System.out.print("Enter Employee Phone Number: ");
            phone = s.nextLine();

            System.out.print("Enter Employee Salary: ");
            salary = s.nextDouble();

            System.out.println("\n");

            man[i] = new Manager(num, name, phone, salary);
        }

        System.out.println("Printing Employee Details: ");
        System.out.println("\n");
        for (int i=0; i<3; i++)
        {
            System.out.println("Employee Number: " + man[i].getEmp_num());
            System.out.println("Employee Name: " + man[i].getEmp_name());
            System.out.println("Employee Phone: " + man[i].getEmp_phone());
            System.out.println("Employee Salary: " + man[i].getEmp_salary());
            System.out.println("\n");
        }

        Manager highest =man[0];

        for (int i=1; i<3; i++)
        {
            if(man[i].getEmp_salary() > highest.getEmp_salary())
            {
                highest = man[i];
            }
        }

        System.out.println("\n");
        System.out.println("Employee with the highest salary: ");
        System.out.println("Employee Number: " + highest.getEmp_num());
        System.out.println("Employee Name: " + highest.getEmp_name());
        System.out.println("Employee Phone: " + highest.getEmp_phone());
        System.out.println("Employee Salary: " + highest.getEmp_salary());
    }
}

class Manager
{
    private int emp_num;
    private String emp_name;
    private String emp_phone;
    private double emp_salary;

    public Manager (int emp_num, String emp_name, String emp_phone, double emp_salary)
    {
        this.emp_num = emp_num;
        this.emp_name = emp_name;
        this.emp_phone= emp_phone;
        this.emp_salary = emp_salary;
    }

    public int getEmp_num()
    {
        return emp_num;
    }

    public void setEmp_num(int emp_num)
    {
        this.emp_num = emp_num;
    }

    public String getEmp_name()
    {
        return emp_name;
    }

    public void setEmp_name(String emp_name)
    {
        this.emp_name = emp_name;
    }

    public String getEmp_phone()
    {
        return emp_phone;
    }

    public void setEmp_phone(String emp_phone)
    {
        this.emp_phone = emp_phone;
    }

    public double getEmp_salary()
    {
        return emp_salary;
    }

    public void setEmp_salary(double emp_salary)
    {
        this.emp_salary = emp_salary;
    }
}