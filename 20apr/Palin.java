import java.util.*;
class Palin{
    public static void main(String[] args) {
        String ori;
        String rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter string");
        ori=sc.next();
        int len=ori.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+ori.charAt(i);
        }
            if(ori.equals(rev)){
                System.out.println("Entered String is palindrome");

            }
            else{
                System.out.println("ENterd string is not palindrome");
            }
        

    }
}