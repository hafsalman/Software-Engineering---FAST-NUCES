//Hafsa Salman
//Roll no. 22K-5161
//Task 02

public class Task_02
{
    public static void main (String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 02");
        System.out.print("\n");

        Lang lang_1 = new Lang();

        lang_1.print();

        Lang lang_2 = new Lang("C");

        lang_2.print();
    }
}

class Lang
{
    String language;

    //Default Constructor
    public Lang ()
    {
        language = "Java";
    }

    //Parametrized Constructor
    public Lang (String language)
    {
        this.language = language;
    }

    void print()
    {
        System.out.println("Langauge Name: " + language);
    }
}