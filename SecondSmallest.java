import java.util.*;
import java.io.*;
public class SecondSmallest
{
    public static void main(String[] args)
    {
        int[] a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter the terms : ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        int i =0;
        while(a[i]==a[0])
        {
            i++;
        }
        System.out.println("Second Smallest : "+a[i]);
    }
}