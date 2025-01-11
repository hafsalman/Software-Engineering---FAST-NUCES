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

        Item I = new Item("Murder in the family", "Cara Hunter", 2023);
        System.out.println(I.toString());
        System.out.println();

        Book B = new Book("Thinking in JAVA", "Bruce Eckel", 1998,
                "Prentice Hall", 563);
        System.out.println(B.toString());
        System.out.println();

        Magazine M = new Magazine("Fast Monthly", "Students", 2023, "FAST"
        , 8956);
        System.out.println(M.toString());
        System.out.println();

        DVD D = new DVD("History", "Historians", 2006, "A.B Cannon", 65);
        System.out.println(D.toString());
    }
}

class Item
{
    String title;
    String author;
    int year;

    public int getYear()
    {
        return year;
    }

    public Item (String title, String author, int year)
    {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString()
    {
    return ("Item: \n" + "Title: " + title + "\nAuthor: " + author + "\nYear: " + year);
    }
}

class Book extends Item
{
    String publisher;
    int ISBN;

    public Book(String title, String author, int year, String publisher, int ISBN)
    {
        super(title, author, year);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    public String toString()
    {
        return("Book: \n" + "Title: " + title + "\nAuthor: " + author + "\nYear: " + year
        + "\nPublisher: " + publisher + "\nISBN: " + ISBN);
    }
}

class Magazine extends Item
{
    String publisher;
    int issueNumber;

    public Magazine(String title, String author, int year, String publisher, int issueNumber)
    {
        super(title, author, year);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    public String toString()
    {
        return("Magazine: \n" + "Title: " + title + "\nAuthor: " + author + "\nYear: " + year
                + "\nPublisher: " + publisher + "\nIssue Number: " + issueNumber);
    }
}

class DVD extends Item
{
    String director;
    int length;

    public DVD(String title, String author, int year, String director, int length)
    {
        super(title, author, year);
        this.director = director;
        this.length = length;
    }

    public String toString()
    {
        return("DVD: \n" + "Title: " + title + "\nAuthor: " + author + "\nYear: " + year
        + "\nDirector: " + director + "\nLength: " + length);
    }
}