import java.util.Scanner;
public class negativearraysize
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        try{
            int arr[]=new int[size];
            System.out.println("Array created");
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println("Exception:"+e+"\nArray cannot be negative");
        }
        finally{
            System.out.println("Program execution is completed");
        }
    }
}