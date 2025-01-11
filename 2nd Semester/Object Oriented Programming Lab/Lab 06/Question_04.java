//Hafsa Salman
//22K-5161
//Question no. 04

import java.util.Arrays;

public class Question_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Question no. 04");
        System.out.println();

        Teacher T_1 = new Teacher("Math_1 teacher");
        Teacher T_2 = new Teacher("Math_2 teacher");
        Teacher T_3 = new Teacher("Science teacher");

        Department D_1 = new Department("MATH", 3);
        D_1.AddTeacher(T_1);
        D_1.AddTeacher(T_2);

        Department D_2 = new Department("SCIENCE", 1);
        D_2.AddTeacher(T_3);

        School S_1 = new School("XYZ", 2);
        S_1.AddDepartment(D_1);
        S_1.AddDepartment(D_2);

        System.out.println("School: " + S_1.getS_name());
        Department[] dep = S_1.getDep();
        for (int i=0; i< dep.length; i++)
        {
            Department department = dep[i];
            System.out.println("Department: " + department.getD_name());
            Teacher[] teach = department.getTeach();
            for(int j=0; j< teach.length; j++)
            {
                Teacher teacher = teach[j];
                System.out.println("Teacher: " + teacher.getT_name());
            }

            System.out.println();
        }
    }
}

class Teacher
{
    private String t_name;

    public String getT_name()
    {
        return t_name;
    }

    public Teacher(String t_name)
    {
        this.t_name = t_name;
    }
}

class Department
{
    private String d_name;
    private Teacher[] teach;
    private int count;
    private int max;

    public String getD_name()
    {
        return d_name;
    }

    public Teacher[] getTeach()
    {
        return Arrays.copyOf(teach, count);
    }

    public Department(String d_name, int max)
    {
        this.d_name = d_name;
        this.max = max;
        this.teach = new Teacher[max];
        this.count = 0;
    }

    public void AddTeacher(Teacher teacher)
    {
        if (count < max)
        {
            this.teach[count] = teacher;

            count++;
        }
    }
}

class School
{
    private String s_name;
    private Department[] dep;
    private int d_count;
    private int d_max;

    public String getS_name()
    {
        return s_name;
    }

    public Department[] getDep()
    {
        return dep;
    }

    public School(String s_name, int d_max)
    {
        this.s_name = s_name;
        this.d_max = d_max;
        this.dep = new Department[d_max];
        this.d_count = 0;
    }

    public void AddDepartment(Department department)
    {
        if (d_count < d_max)
        {
            dep[d_count] = department;

            d_count++;
        }
    }
}