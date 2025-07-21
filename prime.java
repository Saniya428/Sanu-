import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int Prime=1;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                Prime=0;
            }
        }
        if(n<=1)
        {
            System.out.println(n+"is not a prime number");
        }else if(Prime==1)
        {
            System.out.println(n+"is a prime number");
        }else{
            System.out.println(n+"is not a prime number");
        }
    }
}