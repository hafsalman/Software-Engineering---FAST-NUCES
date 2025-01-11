//Hafsa Salman
//22K-5161
//Task no. 02

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 02");
        System.out.println();

        House H = new House();

        H.setH_type("Bungalow");

        H.Display();
    }
}

class House
{
    private String h_type;

    class Room
    {
        private String type;
        private int size;
        private double temp;

        public String getType()
        {
            return type;
        }

        public void setType(String type)
        {
            this.type = type;
        }

        public int getSize()
        {
            return size;
        }

        public void setSize(int size)
        {
            this.size = size;
        }

        public double getTemp()
        {
            return temp;
        }

        public void setTemp(double temp)
        {
            this.temp = temp;
        }
    }
    private Room R = new Room();

    public String getH_type()
    {
        return h_type;
    }

    public void setH_type(String h_type)
    {
        this.h_type = h_type;
    }

    public House ()
    {
        R.setType("Living Room");
        R.setSize(450);
        R.setTemp(25.5);
    }



    public void Display()
    {
        System.out.println("House Type: " + h_type);
        System.out.println("Room Type: " + R.getType());
        System.out.println("Room Size: " + R.getSize());
        System.out.println("Room Temperature: " + R.getTemp());
    }
}