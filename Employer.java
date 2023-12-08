class Employee
{
    void display()
    {
        System.out.println("Name of class is Employee");
    }
    void calcSalary()
    {
        System.out.println("Salary of Employee is 10000");
    }
}
class Engineer extends Employee
{
    void calcSalary()
    {
        System.out.println("Salary of Employee is 20000");
    }
}
class Employer
{
    public static void main(String[] args)
    {
        Engineer engineer = new Engineer();
        engineer.display();
        engineer.calcSalary();
    }
}
