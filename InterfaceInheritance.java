interface addition
{
    public void add(double x,double y);
}
interface substraction
{
    public void sub(double x,double y);
}
interface multiplication
{
    public void mul(double x,double y);
}
interface division
{
    public void div(double x,double y);
}
interface calculator extends addition,substraction,multiplication,division
{
    public void displayResult(double result);
}
public class InterfaceInheritance implements calculator
{
    public void add(double x,double y)
    {
        double result = x+y;
        displayResult(result);
    }
    public void sub(double x,double y)
    {
        double result = x-y;
        displayResult(result);
    }
    public void mul(double x,double y)
    {
        double result = x*y;
        displayResult(result);
    }
    public void div(double x,double y)
    {
        double result = x/y;
        displayResult(result);
    }
    public void displayResult(double result)
    {
        System.out.println("Result : "+result);
    }
    public static void main(String[] args)
    {
        InterfaceInheritance interfaceInheritance = new InterfaceInheritance();
        interfaceInheritance.add(40,50);
        interfaceInheritance.sub(50,40);
        interfaceInheritance.mul(10,20);
        interfaceInheritance.div(40,5);
    }
}