import java.util.Scanner;

public class Asg1 {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        try{
            a=sc.nextInt();
            
            a=a*a;
            System.out.println("Square is"+a);


        }catch(Exception e){
            if (e instanceof NumberFormatException){
                System.out.println(" Entered input is not a valid format for an integer");
            }
        }
    }
    
}
