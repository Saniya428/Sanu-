import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double r,a,c;
        System.out.println("Enter the radius of the circle");
        r=s.nextDouble();
        a=3.14*r*r;
        c=2*3.14*r;
        System.out.println("The area of circle is:"+a);
        System.out.println("The circumference of circle is"+c);
        
    }
}