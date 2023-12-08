import java.io.*;
class FileHandling
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("filename.txt");
            if(file.createNewFile())
            {
                System.out.println("File created : "+file.getName());
            }
            else
            {
                System.out.println("File already exists !");
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            FileWriter fileWriter = new FileWriter("filename.txt");
            fileWriter.write("File-Handling Example");
            fileWriter.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}