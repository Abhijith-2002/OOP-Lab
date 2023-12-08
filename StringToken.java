import java.io.*;
import java.util.*;
class StringToken
{
    public static void main(String[] args)
    {
        int num;
        int sum = 0;
        System.out.println("Enter the numbers seperated by a space gap : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreTokens())
        {
            String temp = st.nextToken();
            num = Integer.parseInt(temp);
            System.out.println(num);
            sum += num;
        }
        System.out.println("Sum : "+sum);
        sc.close();
    }
}