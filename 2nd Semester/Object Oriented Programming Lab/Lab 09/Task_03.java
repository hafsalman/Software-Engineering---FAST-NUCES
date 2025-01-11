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

        CPU cpu = new CPU();

        CPU.Processor P = cpu.new Processor();

        System.out.println("Processor Cache: " + P.getCache());

        CPU.RAM ram = cpu.new RAM();

        System.out.println("RAM Clock Speed: " + ram.getClockSpeed());

    }
}

class CPU
{
    double price;

    class Processor
    {
        double cores;
        String manufacturer;

        public double getCache()
        {
            return 4.2;
        }
    }

    protected class RAM
    {
        double memory;
        String manufacturer;

        public double getClockSpeed()
        {
            return 5.3;
        }
    }

}