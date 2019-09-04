import java.util.Scanner;

class Array2d{
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {

System.out.println("enter row of array");
int r = sc.nextInt();
System.out.println("enter column of array");
int c = sc.nextInt();
int[][] a= new int[r][c];
double[][] d= new double[r][c];
boolean[][] b =new boolean[r][c];
System.out.println("enter element of array in integer");

for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j] = sc.nextInt();
}
}
System.out.println("enter element of array in double");

for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
d[i][j] = sc.nextDouble();
}
}
System.out.println("enter boolean value in array");

for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
b[i][j] = sc.nextBoolean();
}
}




System.out.println("integer array ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}

System.out.println("double array ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(d[i][j]+" ");
}
System.out.println();
}

System.out.println("boolean array ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
  if(b[i][j])
      {
       System.out.print("1 ");
      }
    else
     System.out.print("0 ");
}
System.out.println();
}


}
}
