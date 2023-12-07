import java.util.*;
public class DigitSum
{
    public static void main(String[] args)
    {
        int i,r;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer : ");
        i = sc.nextInt();
        while(i>0)
        {
            r = i%10;
            sum += r;
            i /= 10;
        }
        System.out.println("Sum of Digits : "+sum);
    }
}