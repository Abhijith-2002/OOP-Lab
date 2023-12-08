import java.io.*;
import java.util.*;
class RandomNumbers extends Thread
{
    int randomNumber;
    public void run()
    {
        Random random = new Random();
        for(int i=0;i<10;i++)
        {
            randomNumber = random.nextInt(100);
            if(randomNumber%2==0)
            {
                SquareThread squareThread = new SquareThread(randomNumber);
                squareThread.start();
            }
            else
            {
                CubeThread cubeThread = new CubeThread(randomNumber);
                cubeThread.start();
            }
        }
        try
        {       
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
class SquareThread extends Thread
{
    int randomNumber;
    SquareThread(int randomNumber)
    {
        this.randomNumber = randomNumber;
    }
    public void run()
    {
        System.out.println("The square of "+randomNumber+" is "+(randomNumber*randomNumber));
    }
}
class CubeThread extends Thread
{
    int randomNumber;
    CubeThread(int randomNumber)
    {
        this.randomNumber = randomNumber;
    }
    public void run()
    {
        System.out.println("The cube of "+randomNumber+" is "+(randomNumber*randomNumber*randomNumber));
    }
}
class Multithreading
{
    public static void main(String[] args)
    {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.start();
    }
}