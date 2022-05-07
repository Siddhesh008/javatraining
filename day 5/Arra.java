import java.util.*;
class Arra
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
System.out.println("Enter array elements");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Your array is");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}
