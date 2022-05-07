import java.io.*;
public class Demo2 {
    public static void main(String[] args)throws Exception {
        FileOutputStream fout;
        fout=new FileOutputStream("D:\\java training\\files\\t3.txt");
        DataOutputStream dout;
        dout=new DataOutputStream(fout);
        dout.writeInt(101);
        dout.writeBoolean(true);
        dout.writeDouble(1.2);
        dout.close();
        
    }
    
}
