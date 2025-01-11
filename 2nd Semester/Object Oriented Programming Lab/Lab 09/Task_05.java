//Hafsa Salman
//22K-5161
//Task no. 05

public class Task_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 05");
        System.out.println();

        Car C = new Car("Mehran", "4T");

        Car.Engine Eng = C.new Engine();

        C.getCarName();
        Eng.setEngine();
        Eng.getEngineType();
    }
}

class Car
{
    private String carName;
    String carType;

    public String getCarName()
    {
        return "Car Name: " + carName;
    }

    public Car (String carName, String carType)
    {
        this.carName = carName;
        this.carType = carType;
    }

    class Engine
    {
        String e_type;

        void setEngine()
        {
            if (carType == "4T")
            {
                if (carName == "Mehran")
                {
                    e_type = "Small";

                    System.out.println("Engine Type: " + e_type);
                }

                else
                {
                    e_type = "Bigger";

                    System.out.println("Engine Type: " + e_type);
                }
            }
        }

        public void getEngineType()
        {
            System.out.println(e_type);
        }
    }
}