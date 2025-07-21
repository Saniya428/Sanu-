class factorial
{
    public static void main(String args[])
    {
        System.out.println("Program to find the factorial of 10 numbers");
        int Fact,n,i;
        for(n=1;n<=10;n ++)
        {
            Fact=1;
            i=n;
            while(i>0)
            {
                Fact*=i;
                i--;
            }
            System.out.println("Factorial of "+n+"="+Fact);
        }
    }
}