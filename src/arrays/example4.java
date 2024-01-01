package arrays;

import java.util.Arrays;

public class example4 
{
public static void main(String[] args) 
{
 int a []=new int[5];	
 a[0]=69;
 a[1]=41;
 a[2]=78;
 a[3]=100;
 a[4]=31;
 Arrays.sort(a);
 for(int i=0;i<=a.length-1;i++)
 {
	 System.out.println(a[i]);
 }
 System.out.println("===================");
 for(int j=4;j>=0;j--)
 {
	 System.out.println(a[j]);
 }
}
}
