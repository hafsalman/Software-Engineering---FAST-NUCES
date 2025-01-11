//Hafsa Salman
//22K-5161
//Task no. 02

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 02");
        System.out.println();

        Person P = new Person("ABC", "abc@gmail.com", "123456789");
        System.out.println(P.toString());
        System.out.println();

        Student S = new Student("Hafsa Salman", "hafsa@gmail.com", "123456789", 123, "SE",
                3.5);
        System.out.println(S.toString());
        System.out.println();

        Faculty F = new Faculty("XYZ", "xyz@gmail.com", "123456789", 123, "SE",
                "Professor");
        System.out.println(F.toString());
        System.out.println();

        Staff s = new Staff("LMN", "lmn@gmail.com", "123456789", 456,
                "Electrician", 35000);
        System.out.println(s.toString());
    }
}

class Person
{
    String name;
    String email;
    String phone;

    public Person(String name, String email, String phone)
    {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String toString()
    {
        return ("Person: \n" + "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone);
    }
}

class Student extends Person
{
    int ID;
    String major;
    private double GPA;

    public double getGPA()
    {
        return GPA;
    }

    public Student(String name, String email, String phone, int ID, String major, double GPA)
    {
        super(name, email, phone);
        this.ID = ID;
        this.major = major;
        this.GPA = GPA;
    }

    public String toString()
    {
        return ("Student: \n" + "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone +
                "\nID: " + ID + "\nMajor: " + major + "\nGPA: " + GPA);
    }
}

class Faculty extends Person
{
    int f_ID;
    String dep;
    String rank;

    public String getRank()
    {
        return rank;
    }

    public Faculty(String name, String email, String phone, int f_ID, String dep, String rank)
    {
        super(name, email, phone);
        this.f_ID = f_ID;
        this.dep = dep;
        this.rank = rank;
    }

    public String toString()
    {
        return ("Faculty: \n" + "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone +
                "\nID: " + f_ID + "\nDepartment: " + dep + "\nRank: " + rank);
    }
}

class Staff extends Person
{
    int s_ID;
    String title;
    double salary;

    public double getSalary()
    {
        return salary;
    }

    public Staff (String name, String email, String phone, int s_ID, String title, double salary)
    {
        super(name, email, phone);
        this.s_ID = s_ID;
        this.title = title;
        this.salary = salary;
    }

    public String toString()
    {
        return ("Staff: \n" + "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone +
                "\nID: " + s_ID + "\nTitle: " + title + "\nSalary: " + salary);
    }
}