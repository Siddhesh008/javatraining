import java.io.*;
public class Asg2 {
    public static void main(String[] args) {
        FileInputStream f1;
        f1=new FileInputStream("D:\\java training\\21apr\\t1.txt");
        StringBuffer d1;
        d1=new StringBuffer();
        int x;
        System.out.println(f1.available());
        x=f1.read();
        System.out.print((char)x);
        f1.close();


    }
    
}
