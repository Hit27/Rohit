import java.util.Scanner;

class Factor{
public static void main(String args[])
{int a=Integer.parseInt(args [0]);
	int b=Integer.parseInt(args [1]);
	System.out.println(a+b);
Scanner s=new Scanner(System.in);
int n=s.nextInt();


for(int i=2;i<=n;i++)
{
while(n%i==0)
{
System.out.println(i);
n=n/i;
}
}
}
}
