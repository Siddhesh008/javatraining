import java.io.*;
public class As1 {
    public static void main(String[] args) throws Exception {
        FileReader fin;
        fin=new FileReader("D:\\java training\\files\\t5.txt");
        FileWriter fout;
        fout=new FileWriter("D:\\java training\\files\\t7.txt");
        fin.close();
        fout.close();
    }
    
}
