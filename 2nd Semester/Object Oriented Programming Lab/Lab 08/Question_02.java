//Hafsa Salman
//22K-5161
//Question no. 02

public class Question_02
{
    public static void main(String[] args)
    {
        System.out.println("Hafsa Salman");
        System.out.println("22K-5161");
        System.out.println("Question no. 02");
        System.out.println();

        System.out.println("Total Marks per subject: 100");

        a A = new a(90, 45, 75);

        System.out.println("Student A Marks: ");
        System.out.println("Subject 01: 90");
        System.out.println("Subject 02: 45");
        System.out.println("Subject 03: 75");
        System.out.println("Percentage of Student A: " + A.getPercentage());
        System.out.println();

        b B = new b(80, 60, 75, 55);

        System.out.println("Student B Marks: ");
        System.out.println("Subject 01: 80");
        System.out.println("Subject 02: 60");
        System.out.println("Subject 03: 75");
        System.out.println("Subject 04: 55");
        System.out.println("Percentage of Subject B: " + B.getPercentage());
        System.out.println();
    }
}

abstract class Marks
{
    abstract public double getPercentage();
}

class a extends Marks
{
    protected double sub_1;
    protected double sub_2;
    protected double sub_3;

    public a (double sub_1, double sub_2, double sub_3)
    {
        this.sub_1 = sub_1;
        this.sub_2 = sub_2;
        this.sub_3 = sub_3;
    }

    @Override
    public double getPercentage()
    {
        return (((sub_1 + sub_2 + sub_3)/300) * 100);
    }
}

class b extends Marks
{
    protected double sub_1;
    protected double sub_2;
    protected double sub_3;
    protected double sub_4;

    public b (double sub_1, double sub_2, double sub_3, double sub_4)
    {
        this.sub_1 = sub_1;
        this.sub_2 = sub_2;
        this.sub_3 = sub_3;
        this.sub_4 = sub_4;
    }

    @Override
    public double getPercentage()
    {
        return (((sub_1 + sub_2 + sub_3 + sub_4)/400) * 100);
    }
}