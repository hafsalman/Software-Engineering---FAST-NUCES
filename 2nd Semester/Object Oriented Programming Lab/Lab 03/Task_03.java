//Hafsa Salman
//22K-5161
//Task 03

public class Task_03
{
    public static void main (String[] args)
    {
        System.out.println("Roll no. 22K-5161");
        System.out.println("Name: Hafsa Salman");
        System.out.println("Task no. 03");
        System.out.println("\n");

        Book demo = new Book("Great Expectations", "Charles Dickens", 79.75);

        System.out.println(demo.toString());
    }
}

class Book
{
    private String title;
    private String author;
    private Double price;

    public Book (String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public Double getPrice()
    {
        return price;
    }

    public String toString()
    {
        System.out.println("Book Details:");
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: " + price;
    }
}