import java.util.Scanner;
class funover
{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double A,double B)
    {
        return A+B;
    }
    public static void main(String args[])
    {
        int a,b;
        double A,B;
        funover sum=new funover();
        Scanner add=new Scanner(System.in);
        System.out.println("Enter two integer numbers");
        a=add.nextInt();
        b=add.nextInt();
        System.out.println("Sum of two integers="+sum.add(a,b));
        System.out.println("Enter two float values");
        A=add.nextDouble();
        B=add.nextDouble();
        System.out.println("Sum of two float values"+sum.add(A,B));
        System.out.println("Sum of two default integer numbers="+sum.add(20,30));
        System.out.println("Sum of two float numbers="+sum.add(20.5,30.1));
    }
}