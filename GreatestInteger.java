import java.io.*;
import java.util.*;
public class GreatestInteger
{
    public static void main(String[] args)
    {
        int i,n,k;
        int max = 0;
        System.out.println("Enter the number of terms : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the terms : ");
        for(i=0;i<n;i++)
        {
            k = sc.nextInt();
            if(k>max)
            {
                max = k;
            }
        }
        System.out.println("Greatest Integer : "+max);
    }
}