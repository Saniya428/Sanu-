import java.util.Scanner;
public class xory
{
    public static void main(String args[])
    {
        int x,y;
        System.out.println("Porgram to check the greatest number");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of X");
        x=s.nextInt();
        System.out.println("Enter the value of Y");
        y=s.nextInt();
        if(x>y)
        {
            System.out.println("X is greater than Y");
        }else{
            System.out.println("Y is greater than X");
        }
        
    }
}