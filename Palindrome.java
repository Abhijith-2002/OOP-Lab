import java.util.*;
import java.io.*;
public class Palindrome
{
    public static void main(String[] args)
    {
        int l;
        boolean flag = true;
        String str;
        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        l = str.length();
        for(int i=0;i<l;i++)
        {
            if(str.charAt(i)==str.charAt(l-1))
            {
                l--;
            }
            else
            {
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");

        }
        sc.close();
    }
}
