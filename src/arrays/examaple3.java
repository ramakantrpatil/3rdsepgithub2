package arrays;

import java.util.Arrays;

public class examaple3
{
public static void main(String[] args)
{
int a[]=new  int[5];	
a[0]=10;
a[1]=69;
a[2]=94;
a[3]=25;
a[4]=14;
System.out.println(a.length);
Arrays.sort(a);
for(int i=0;i<=a.length-1;i++)
{
	System.out.println(a[i]);
}
System.out.println("=============");
for(int j=a.length-1;j>=0;j--)
{
	System.out.println(a[j]);
}
}
}
