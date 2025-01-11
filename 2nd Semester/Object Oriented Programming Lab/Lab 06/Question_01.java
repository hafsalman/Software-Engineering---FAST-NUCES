//Hafsa Salman
//22K-5161
//Question 01

public class Question_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Question nO. 01");

        JavaCourse Java = new JavaCourse("OOP", 1002, "CS Lab 01", 3, "Sir Shafique");
        Java.print();
    }
}

class Course
{
    protected String name;
    protected int code;
    protected String venue;
    protected int hours;

    public Course (String name, int code, String venue, int hours)
    {
        this.name = name;
        this.code = code;
        this.venue = venue;
        this.hours = hours;
    }
}

class JavaCourse extends Course
{
    private String teach_name;

    public JavaCourse(String name, int code, String venue, int hours, String teach_name)
    {
        super(name, code, venue, hours);
        this.teach_name = teach_name;
    }

    public void print ()
    {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Class Venue: " + venue);
        System.out.println("Credit hours: " + hours);
        System.out.println("Teacher's Name: " + teach_name);
    }
}