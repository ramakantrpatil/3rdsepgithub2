package arrays;

import java.util.Arrays;

public class example5 
{
public static void main(String[] args)
{
String a[]=new String [5];
a[0]="pooja";
a[1]="ramakant";
a[2]="jignesh";
a[3]="anj";
a[4]="ok";
Arrays.sort(a);
for(int i=0;i<=a.length-1;i++)
{
	System.out.println(a[i]);
}

}
}
