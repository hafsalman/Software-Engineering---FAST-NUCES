//Hafsa Salman
//22K-5161
//Task no. 04

public class Task_04
{
    public static void main (String[] args)
    {
        System.out.println("Roll no. 22K-5161");
        System.out.println("Name: Hafsa Salman");
        System.out.println("Task no. 04");
        System.out.println("\n");

        Employee emp_1 = new Employee("Hafsa", "Salman", 5200.0);
        Employee emp_2 = new Employee("Alizah", "Basit", 9600.0);

        emp_1.GiveInfo();
        emp_1.YearlySalary();
        emp_1.Raise();

        System.out.println("\n");
        emp_2.GiveInfo();
        emp_2.YearlySalary();
        emp_2.Raise();
    }
}

class Employee
{
    private String first;
    private String last;
    private double monthly_salary;

    public Employee (String first, String last, double monthly_salary)
    {
        this.first = first;
        this.last = last;

        if (monthly_salary > 0)
        {
            this.monthly_salary = monthly_salary;
        }

        else
        {
            this.monthly_salary = 0.0;
        }
    }

    public String getFirst()
    {
        return first;
    }

    public String getLast()
    {
        return last;
    }

    public double getMonthly_salary()
    {
        return monthly_salary;
    }

    public void GiveInfo()
    {
        System.out.println("Employee First Name: " + getFirst());
        System.out.println("Employee Last Name: " + getLast());
        System.out.println("Employee Monthly Salary: " + getMonthly_salary());
    }

    public void YearlySalary()
    {
        double yearly = monthly_salary * 12;

        System.out.println("Employee Yearly Salary: " + yearly);
    }

    public void Raise()
    {
        double raise = monthly_salary  * 0.10;

        System.out.println("Employee Raise amount: " + raise);
    }
}