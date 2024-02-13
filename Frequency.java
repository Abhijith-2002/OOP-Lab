import java.util.*;
import java.io.*;
public class Frequency
{
    public static void main(String[] args)
    {
        int count;
        int l;
        String word;
        char c;
        System.out.println("Enter the word : ");
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        ArrayList<Character> tracker = new ArrayList<>();
        for(int i=0;i<word.length();i++)
        {
            if(!tracker.contains(word.charAt(i)))
            {
                count = 1;
                for(int j=i+1;j<word.length();j++)
                {
                    if(word.charAt(j)==word.charAt(i))
                    {
                        count++;
                    }
                }
                tracker.add(word.charAt(i));
                System.out.println(word.charAt(i)+" : "+count);
            }
        }
    }
}