//Hafsa Salman
//22K-5161
//Task no. 06

public class Task_06
{
    public static void main (String[] args)
    {
        System.out.println("Roll no. 22K-5161");
        System.out.println("Name: Hafsa Salman");
        System.out.println("Task no. 06");

        Student student = new Student();

        student.name = "Hafsa Salman";
        student.age = 19;
        student.course = "OOP in JAVA";

        System.out.println("My name is " + student.name + ". I'm " + student.age + " years old. I am studying "
                + student.course + ".");

    }
}

class Student
{
    public String name;
    public int age;
    public String course;
}