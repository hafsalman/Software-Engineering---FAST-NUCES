//Hafsa Salman
//22K-5161
//Task no. 04

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 04");
        System.out.println();

        Vehicle v = new Vehicle("Swift", 1300, 2015)
        {
            @Override
            public void Display()
            {
                super.Display();

                Vehicle.Owner own = new Owner("Hafsa Salman", 123456789, 03001234567);

                System.out.println("Owner's Name: " + own.getO_name());
                System.out.println("CNIC: " + own.getCNIC());
            }
        };

        v.Display();
    }
}

class Vehicle
{
    private String name;
    private int CC;
    private int model;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getCC()
    {
        return CC;
    }

    public void setCC(int CC)
    {
        this.CC = CC;
    }

    public int getModel()
    {
        return model;
    }

    public void setModel(int model)
    {
        this.model = model;
    }

    public Vehicle (String name, int CC, int model)
    {
        this.name = name;
        this.CC = CC;
        this.model = model;
    }

    public void Display()
    {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Engine CC: " + CC);
        System.out.println("Model: " + model);
    }

    static class Owner
    {
        private String o_name;
        private int CNIC;
        private int phone;

        public String getO_name()
        {
            return o_name;
        }

        public void setO_name(String o_name)
        {
            this.o_name = o_name;
        }

        public int getCNIC()
        {
            return CNIC;
        }

        public void setCNIC(int CNIC)
        {
            this.CNIC = CNIC;
        }

        public int getPhone()
        {
            return phone;
        }

        public void setPhone(int phone)
        {
            this.phone = phone;
        }

        public Owner (String o_name, int CNIC, int phone)
        {
            this.o_name = o_name;
            this.CNIC = CNIC;
            this.phone = phone;
        }
    }
}