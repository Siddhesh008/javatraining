import java.io.*;
public class Demo4 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile ob;
        ob=new RandomAccessFile("D:\\java training\\files\\t8.txt","rw");
        ob.seek(2);
        //ob.seek(0);
        int x;
        do{
            x=ob.read();
            if(x!=-1){
                System.out.println((char)x);

            }
        }while(x!=-1);
        ob.close();
        System.out.println();
        
    }
    
}
