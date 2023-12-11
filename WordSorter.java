import java.util.*;
import java.io.*;
class WordSorter
{
    public static void main(String[] args) throws IOException,FileNotFoundException
    {
        String filename = args[0];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line : ");
        String line = sc.nextLine();
        List<String> words = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(line," ");
        while(st.hasMoreTokens())
        {
            words.add(st.nextToken());
        }
        Collections.sort(words);
        FileWriter writer = new FileWriter(filename);
        for (String word : words) {
            writer.write(word+"\n");
        }
        sc.close();
        writer.close();
    }
}