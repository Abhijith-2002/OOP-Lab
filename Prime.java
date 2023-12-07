import java.util.*;
import java.io.*;
public class Prime
{
    public static void main(String[] args)
    {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer : ");
        int n = sc.nextInt();
        for(int i=2;i<=n/2;i++)
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
        sc.close();
    }
}
