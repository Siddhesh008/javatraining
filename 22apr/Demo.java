import java.io.*;
public class Demo{
    public static void main(String[] args)throws Exception {
        FileInputStream f1;
        f1=new FileInputStream("D:\\java training\\files\\t1.txt");
        BufferedInputStream bin;
        bin=new BufferedInputStream(f1);

        FileOutputStream fout;
        
        fout=new FileOutputStream("D:\\java training\\files\\t2.txt");
        BufferedOutputStream bout;
        bout=new BufferedOutputStream(fout);

        int x;
        System.out.println(f1.available());
        do{
            x=bin.read();
            if(x!=1){
                bout.write(x);
            }

            }while(x!=1);
            bin.close();
            bout.close();
            System.out.println("Filw Copied");
        }
    }
