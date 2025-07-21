public class displaymonth
{
    public static void main(String args[])
    {
        int i;
        String []month={"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
        for(i=0;i<12;i++)
        {
            System.out.println((i+1)+"."+month[i]);
        }
    }
}