import java.io.*;
import java.util.Scanner;
public class Asg2 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        // System.out.println("ENter file path");
        // String fp=sc.next();
        // FileReader fin=new FileReader(fp);
        // File[] arr;
        // arr=fp.listFiles();
        // for (File s : arr) {
        //     System.out.println(s.getName());
            File f1;
            String fp;
            
            System.out.println("ENter file path");
             fp=sc.next();
             f1=new File(fp);
            
             File[] arr1;
             arr1=f1.listFiles();
             for (File f3 : arr1) {
                 if(f3.isFile()){
                     System.out.println("File:"+f3.getName());
                 }
                 else if(f3.isDirectory()){
                     System.out.println("Dir:"+f3.getName());
                 }
                }

        

        
    }

    
}
