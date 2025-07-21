import java.util.Scanner;
public class arearect
{
    public static void main(String args[])
    {
        int L,B;
        double Area;
        System.out.println("Program to find the area of rectangle");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length");
        L=s.nextInt();
        System.out.println("Enter the breadth");
        B=s.nextInt();
        Area=L*B;
        System.out.println("The area of rectangle is"+Area);
    }
}