import java.util.*;
import java.io.*;
public class MatrixMultiplication
{
    public static void main(String[] args)
    {
        int m,n,o,p;
        int[][] a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows of first matrix : ");
        m = sc.nextInt();
        System.out.println("Enter the no of cols of first matrix : ");
        n = sc.nextInt();
        a = new int[m][n];
        System.out.println("Enter the no of rows of second matrix : ");
        o = sc.nextInt();
        System.out.println("Enter the no of cols of second matrix : ");
        p = sc.nextInt();
        b = new int[o][p];
        System.out.println("Enter the elements of first matrix : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix : ");
        for(int i=0;i<o;i++)
        {
            for(int j=0;j<p;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        c = new int[m][p];
        if(n==o)
        {
            System.out.println("Resultant Matrix : ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<p;j++)
                {
                    for(int k=0;k<n;k++)
                    {
                        c[i][j] += a[i][k]*b[k][j];
                    }
                }
            }
        }
        else
        {
            System.out.println("Not Compatible");
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<p;j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }

    }
}