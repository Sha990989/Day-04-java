import java.util.*;
public class checkdivisor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if((n%i)==0)
            {
                if(i*i!=n)
                {
                    c+=1;
                }
            }
        }
    System.out.println(c);
    }
}