package arrays;

public class sample6
{
public static void main(String[] args)
{
int a[][]=	new int [2][3];
a[0][0]=14;
a[0][1]=96;
a[0][2]=42;
a[1][0]=85;
a[1][1]=43;
a[1][2]=6;
System.out.println(a.length);




for(int i=0;i<=1;i++)
{
	for(int j=0;j<=2;j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
	
}
}