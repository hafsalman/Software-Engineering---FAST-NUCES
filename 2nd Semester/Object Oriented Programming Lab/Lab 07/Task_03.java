//Hafsa Salman
//22K-5161
//Task no. 03

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 03");
        System.out.println();

        Robot R = new Robot(3, 5, "N");
        R.Display();

        MovingRobot M = new MovingRobot(2, 4, "E");
        M.Dis();
        M.move(10);
        M.Dis();
    }
}

class Robot
{
    int x;
    int y;
    String direction;

    public Robot (int x, int y, String direction)
    {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void Display()
    {
        System.out.println("Displaying initial position of the robot: ");
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Direction: " + direction);
    }
}

class MovingRobot extends  Robot
{

    public MovingRobot(int x, int y, String direction)
    {
        super(x, y, direction);
    }

    public void move (int step)
    {
        if (direction == "N")
        {
            y = y + step;
        }

        else if (direction == "E")
        {
            x = x + step;
        }

        else if (direction == "W")
        {
            x = x - step;
        }

        else if (direction == "S")
        {
            y = y - step;
        }

        else
        {
            System.out.println("Wrong input!");
        }
    }

    public void Dis()
    {
        System.out.println();
        System.out.println("Updated position of the robot: ");
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Direction: " + direction);
    }
}