class Employee
{
    String name;
    int age;
    String phoneNumber;
    String address;
    long salary;
    void printSalary()
    {
        System.out.println("Salary : "+salary);
    }
}
class Officer extends Employee
{
    String department;
    String specialization;
}
class Manager extends Employee
{
    String department;
    String specialization;
}
class Office
{
    public static void main(String[] args)
    {
        Officer officer = new Officer();
        officer.department = "IT";
        officer.specialization = "AI-ML";
        officer.name = "John Doe";
        officer.age = 21;
        officer.phoneNumber = "735-604-3126";
        officer.salary = 100000;
        Manager manager = new Manager();
        manager.department = "Marketing";
        manager.specialization = "Outreach";
        manager.name = "Jane Smith";
        manager.age = 21;
        manager.phoneNumber = "672-784-1090";
        manager.salary = 100000;
        System.out.println("OFFICER");
        System.out.println("Name :"+officer.name);
        System.out.println("Age :"+officer.age);
        System.out.println("Department :"+officer.department);
        System.out.println("Specialization :"+officer.specialization);
        System.out.println("Contact :"+officer.phoneNumber);
        System.out.println("MANAGER");
        System.out.println("Name :"+manager.name);
        System.out.println("Age :"+manager.age);
        System.out.println("Department :"+manager.department);
        System.out.println("Specialization :"+manager.specialization);
        System.out.println("Contact :"+manager.phoneNumber);
    }
}