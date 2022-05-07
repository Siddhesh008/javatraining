import java.util.*;
class Rev
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[3];
System.out.println("enter elements");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("The values stored into array are");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
System.out.println("The values stored in reverse are");
for(int i=arr.length-1;i>=0;i--)
{
System.out.println(arr[i]);
}
}
}