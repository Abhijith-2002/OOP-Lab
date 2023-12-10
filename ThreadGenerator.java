import java.util.*;
import java.io.*;
import java.math.*;
class RandomGenerator extends Thread
{
    Random rd = new Random();
    public void run()
    {
        for(int i=0;i<=100;i++)
        {
            int n = rd.nextInt(20);
            System.out.println(n);
            Prime p = new Prime(n);
            p.start();
            Factorial f = new Factorial(n);
            f.start();
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
class Prime extends Thread
{
    int n;
    boolean flag=true;
    Prime(int n)
    {
        this.n = n;
    }
    public void run()
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                flag = false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}
class Factorial extends Thread
{
    int n;
    Factorial(int n)
    {
        this.n = n;
    }
    public void run()
    {
        long factorial = 1;
        for(int i=1;i<=n;i++)
        {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
class ThreadGenerator
{
    public static void main(String[] args)
    {
        RandomGenerator rg = new RandomGenerator();
        rg.start();
    }
}