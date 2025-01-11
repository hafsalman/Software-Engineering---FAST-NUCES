//Hafsa Salman
//22K-5161
//Task no. 01

public class Task_01
{
    public static void main (String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("task no. 01");
        System.out.println("\n");

        CartItem Pencil = new CartItem("Pencil", 5, 10);
        CartItem Ruler = new CartItem("Ruler", 10, 7);
        CartItem Rubber = new CartItem("rubber", 7, 15);

        Pencil.DisplayCartItemDetails();
        Pencil.CalculateTotalPrice();

        Ruler.DisplayCartItemDetails();
        Ruler.CalculateTotalPrice();

        Rubber.DisplayCartItemDetails();
        Rubber.CalculateTotalPrice();
    }
}

class CartItem
{
    String name;
    double price;
    int quantity;

    public CartItem (String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void DisplayCartItemDetails()
    {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    void CalculateTotalPrice()
    {
        double total_price;

        total_price = quantity * price;
        System.out.println("Total Price: " + total_price);
        System.out.println("\n");
    }
}