import java.io.*;
class ReadWriteFile
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fileReader = new FileReader("input.txt");
            FileWriter fileWriter = new FileWriter("output.txt");
            int c;
            while((c=fileReader.read())!=-1)
            {
                fileWriter.write(c);
            }
            fileWriter.close();
            fileReader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}