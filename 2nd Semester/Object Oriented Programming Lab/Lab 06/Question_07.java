//Hafsa Salman
//22K-5161
//Question no. 07

public class Question_07
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Question no. 07");

        Category_01 cat_01 = new Category_01(101, "JAVA How to program", "Paul Deiiti", 97801,
        56.23, "JAVA");

        Category_01 cat_02 = new Category_01(106, "Let us C", "Yashavant Kanetkar", 97881,
        26.32, "C");

        Category_01 cat_03 = new Category_01(632, "C++ Primer", "Stanley B. Lippman", 97885,
        98.23, "C++");

        cat_01.Display();
        cat_02.Display();
        cat_03.Display();
    }
}

class Books
{
    protected int ID;
    protected String name;
    protected String author;
    protected int ISBN;
    protected double price;

    public Books(int ID, String name, String author, int ISBN, double price)
    {
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }
}

class Category_01 extends Books
{
    protected String category;

    public Category_01(int ID, String name, String author, int ISBN, double price, String category)
    {
        super(ID, name, author, ISBN, price);
        this.category = category;
    }

    public void Display()
    {
        System.out.println();
        System.out.println("Book ID: " + ID);
        System.out.println("Book Name: " + name);
        System.out.println("Book Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }
}