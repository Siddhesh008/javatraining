import java.util.*;

public class Demo7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        int i=0;
        String ch;
        do{
            System.out.println("Enter number");
            arr[i]=sc.nextInt();
            i++;
            System.out.println("Do you want to continue(y/n");
            ch=sc.next();
        }while(ch.equals("y"));

        //searching

        int x;
        System.out.println("ENter number to search");
        x=sc.nextInt();
        for(i=0;i<arr.length;i++){
            if(x==arr[i]){
                System.out.println("found");
                break;
            }
        }
    }
}
