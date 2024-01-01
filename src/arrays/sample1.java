package arrays;

import java.util.Arrays;

public class sample1
{
public static void main(String[] args) 
{
String ar[]=new String [5];
ar[0]="pooja";
ar[1]="anuradha";
ar[2]="patil";
ar[3]="ramakant";
ar[4]="jignesh";

System.out.println(ar.length);
for(int i=0;i<=5;i++)
{
	System.out.println(ar[i]);
}
System.out.println(ar.length);
System.out.println(ar.hashCode());
Arrays.sort(ar);
for(int i=0;i<=5;i++)
{
	System.out.println(ar[i]);
}

}

}
