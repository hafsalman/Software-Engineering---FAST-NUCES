//Hafsa Salman
//22K-5161
//Question no. 06

public class Question_06
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Question no. 06");
        System.out.println();

        Rectangle rec = new Rectangle(10, 12);

        rec.area();
        rec.perimeter();

        System.out.println();

        Square squ = new Square(5);

        squ.s_area();
        squ.s_perimeter();
    }
}

class Rectangle
{
    int length;
    int width;

    public Rectangle (int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public void area ()
    {
        int area;

        area = length * width;

        System.out.println("Area of rectangle: " + area);
    }

    public void perimeter()
    {
        int peri;

        peri = 2 * (length + width);

        System.out.println("Perimeter of rectangle: " + peri);
    }
}

class Square extends Rectangle
{

    protected int side;

    public Square(int side)
    {
        super(side, side);
        this.side = side;
    }

    public void s_area()
    {
        int sarea;

        sarea = side * side;

        System.out.println("Area of square: " + sarea);
    }

    public void s_perimeter()
    {
        int speri;

        speri = 4 * side;

        System.out.println("Perimeter of square: " + speri);
    }
}