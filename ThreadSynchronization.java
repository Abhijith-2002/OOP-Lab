class Printer
{
    synchronized void print(char ch)
    {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.println(ch);
            }
        }
    }
}
class Star extends Thread
{
    Printer printer;
    Star(Printer printer)
    {
        this.printer = printer;
    }
    public void run()
    {
        printer.print('*');
    }
}
class Hash extends Thread
{
    Printer printer;
    Hash(Printer printer)
    {
        this.printer = printer;
    }
    public void run()
    {
        printer.print('#');
    }
}
class ThreadSynchronization
{
    public static void main(String[] args)
    {
        Printer printer = new Printer();
        Star star = new Star(printer);
        Hash hash = new Hash(printer);
        star.start();
        hash.start();
    }
}