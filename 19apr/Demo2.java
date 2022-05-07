import java.util.*;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter  2 numbers");
        try{
            a=sc.nextInt();
            b=sc.nextInt();
            c=a/b;
            System.out.println("Divisoin is"+c);

        }catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        }catch(InputMismatchException e){
            System.out.println("pls enter vslid input");
        }
    }
    
}
