

import java.util.Scanner;


public class Powof{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Nth number=");
        int n=sc.nextInt();
        int pow=1;
        int j=315;


for(int i=2;i<=j;i++)
{
while(j%i==0)
{
System.out.println(i);
j=j/i;
}
}


        if(n>=0 && n<31)
        {System.out.println("2^0="+pow);
            for(int i=1;i<=n;i++)
            {
                pow=pow*2;
            System.out.println("2^"+i+"="+pow);
            }
            
        }
        else
        {
            System.out.println(n+"overflow of int so invalid input");
            
        }
        if(n<31 && n>=0)
        {
        if(pow%4==0 && pow/100!=0)
        {
            System.out.println(pow+" is leap year");
        }
        else 
        {
            System.out.println(pow+" is not leap year");
        }
        }
    }
}
