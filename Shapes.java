abstract class Shape
{
    abstract void noOfSides();
}
class Triangle extends Shapes
{
    void noOfSides()
    {
        System.out.println("No of Sides : 3");
    }
}
class Rectangle extends Shapes
{
    void noOfSides()
    {
        System.out.println("No of Sides : 4");
    }
}
class Hexagon extends Shapes
{
    void noOfSides()
    {
        System.out.println("No of Sides : 6");
    }
}
class Shapes
{
    public static void main(String[] args)
    {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Hexagon hexagon = new Hexagon();
        triangle.noOfSides();
        rectangle.noOfSides();
        hexagon.noOfSides();
    }
}