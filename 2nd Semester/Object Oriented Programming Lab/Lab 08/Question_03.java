//Hafsa Salman
//22K-5161
//Question no. 03

public class Question_03
{
    public static void main(String[] args)
    {
        System.out.println("Hafsa Salman");
        System.out.println("22K-5161");
        System.out.println("Question no. 03");
        System.out.println();

        Cats C = new Cats();
        C.cats();

        Dogs D = new Dogs();
        D.dogs();
    }
}

abstract class Animals
{
    abstract public void cats();
    abstract public void dogs();
}

class Cats extends Animals
{
    @Override
    public void cats()
    {
        System.out.println("Cats meow.");
    }

    @Override
    public void dogs()
    {

    }
}

class Dogs extends Animals
{

    @Override
    public void cats()
    {

    }

    @Override
    public void dogs()
    {
        System.out.println("Dogs bark.");
    }
}