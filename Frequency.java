import java.util.*;
import java.io.*;
public class Frequency
{
    public static void main(String[] args)
    {
        int count = 0;
        int l;
        String word;
        char c;
        System.out.println("Enter the word : ");
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        System.out.println("Enter the character : ");
        c = sc.nextLine().charAt(0);
        l = word.length();
        for(int i=0;i<l;i++)
        {
            if(word.charAt(i)==c)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}