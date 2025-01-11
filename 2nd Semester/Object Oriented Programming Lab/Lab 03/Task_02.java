//Hafsa Salman
//22K-5161
//Task no. 02

import java.util.Objects;
import java.util.Scanner;

public class Task_02
{

    public static void main (String[] args)
    {
        System.out.println("Roll no. 22K-5161");
        System.out.println("Name: Hafsa Salman");
        System.out.println("Task no. 02");

        Item item_01 = new Item();
        item_01.item_name = "Pencil";
        item_01.item_id = 125;
        item_01.setPrice(12.36);
        item_01.setStock(5);

        Item item_02 = new Item();
        item_02.item_name = "Pen";
        item_02.item_id = 256;
        item_02.setPrice(15.63);
        item_02.setStock(10);

        Item item_03 = new Item();
        item_03.item_name = "Highlighter";
        item_03.item_id = 896;
        item_03.setPrice(20.49);
        item_03.setStock(60);

        Scanner s = new Scanner(System.in);

        String name;
        int id, choice;
        int quan;

        System.out.print("Enter '1' if you want to enter Item Name or '2' if you want to enter Item ID: ");
        choice = s.nextInt();

        s.nextLine();

        if (choice == 1)
        {
            System.out.print("Enter Item Name: ");
            name = s.nextLine();

            if (Objects.equals(name, item_01.item_name))
            {
                System.out.print("Item Found.");

                item_01.GetInfo();

                System.out.print("Enter quantity you want to purchase: ");
                quan = s.nextInt();

                item_01.quantity(quan);
            }

            if (Objects.equals(name, item_02.item_name))
            {
                System.out.print("Item Found.");

                item_02.GetInfo();

                System.out.print("Enter quantity you want to purchase: ");
                quan = s.nextInt();

                item_02.quantity(quan);
            }

            if (Objects.equals(name, item_03.item_name))
            {
                System.out.print("Item Found.");

                item_03.GetInfo();

                System.out.print("Enter quantity you want to purchase: ");
                quan = s.nextInt();

                item_03.quantity(quan);
            }
        }

        else if (choice == 2)
        {
            System.out.print("Enter Item ID: ");
            id = s.nextInt();


            if (id == item_01.item_id)
            {
                System.out.print("Item Found.");

                item_01.GetInfo();

                System.out.print("Enter quantity you want to purchase: ");
                quan = s.nextInt();

                item_01.quantity(quan);
            }

            else if (id == item_02.item_id)
            {
                System.out.print("Item Found.");

                item_02.GetInfo();

                System.out.print("Enter quantity you want to purchase: ");
                quan = s.nextInt();

                item_02.quantity(quan);
            }

            else if (id == item_03.item_id)
            {
                System.out.print("Item Found.");

                item_03.GetInfo();

                System.out.print("Enter quantity you want to purchase: ");
                quan = s.nextInt();

                item_03.quantity(quan);
            }
        }

    }
}

class Item
{
    public String item_name;
    public int item_id;
    private double price;
    private int stock;

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public void GetInfo()
    {
        System.out.println("\n");
        System.out.println("Item Name: " + item_name);
        System.out.println("Item ID: " + item_id);
    }

    public void quantity(int quan)
    {
        int remain;
        double bill;

        if (quan > getStock())
        {
            System.out.println("You can not purchase more than items than available in the stock.");
        }

        else
        {
            bill = quan * getPrice();

            System.out.println("Your bill: " + getPrice());
        }
    }
}