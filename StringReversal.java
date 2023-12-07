import java.util.*;
import java.io.*;
public class StringReversal
{
    public static void main(String[] args)
    {
        String w;
        String rev;
        int l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :  ");
        w = sc.nextLine();
        l = w.length();
        rev = new String();
        for(int i=l-1;i>=0;i--)
        {
            rev += w.charAt(i);
        }
        System.out.println(rev);
        sc.close();
    }
}