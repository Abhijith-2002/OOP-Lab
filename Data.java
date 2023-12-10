import java.io.*;
import java.util.*;
class Data 
{
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        FileReader reader1 = new FileReader("file1.txt");
        FileWriter writer = new FileWriter("file3.txt");
        BufferedReader breader1 = new BufferedReader(reader1);
        String line1;
        String line2;
        while((line1 = breader1.readLine())!=null)
        {
            String[] words1 = line1.split(" ");
            FileReader reader2 = new FileReader("file2.txt");
            BufferedReader breader2 = new BufferedReader(reader2);
            while((line2 = breader2.readLine())!=null)
            {
                String[] words2 = line2.split(" ");
                if(words1[0].equals(words2[0]))
                {
                    writer.write(words1[0]+" "+words1[1]+" "+words2[1]);
                    writer.write("\n");
                }
            }
            breader2.close();
        }
        writer.close();
        breader1.close();
    }
}