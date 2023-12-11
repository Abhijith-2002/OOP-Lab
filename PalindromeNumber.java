import java.io.*;
import java.util.*;
class PalindromeNumber
{
    public static void main(String[] args) throws IOException,FileNotFoundException
    {
        String filename = args[0];
        System.out.println("Enter the numbers seperated by spaces");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line," ");
        List<String> words = new ArrayList<>();
        FileWriter writer = new FileWriter(filename);
        while(st.hasMoreTokens())
        {
            words.add(st.nextToken());
        }
        for(String word : words)
        {
            boolean flag = true;
            int l = word.length();
            for(int i=0;i<l;i++)
            {
                if(word.charAt(i)!=(word.charAt(l-i-1)))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                writer.write(word+"\n");
                System.out.println(word);
                int sum = 0;
                for(int i=0;i<l;i++)
                {
                    int n = Character.getNumericValue(word.charAt(i));
                    sum+=n;
                }
                System.out.println("Sum : "+sum);
            }
        }
        sc.close();
        writer.close();
    }
}