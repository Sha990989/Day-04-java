import java.util.*;
class oddnum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n<=100)
{
if((n&1)!=0)
{
System.out.println(n);
}
n++;
}
}
}