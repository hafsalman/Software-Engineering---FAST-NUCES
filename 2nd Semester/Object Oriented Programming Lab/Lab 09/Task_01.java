//Hafsa Salman
//22K-5161
//Task no. 01

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 01");
        System.out.println();

        Person P = new Person();

        System.out.println("Salary: " + P.getSalary());
    }
}

class Job
{
    private String role;
    private int ID;
    private double salary;

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}

class Person
{
    private Job J = new Job();

    public Person ()
    {
        J.setRole("Software Engineer");
        J.setID(123);
        J.setSalary(55000.25);
    }

    public double getSalary()
    {
        return J.getSalary();
    }
}