import java.io.*;
public class Demo3 
{
    public static void main(String[] args) throws Exception {
        FileReader fin;
        fin=new FileReader("D:\\java training\\files\\t5.txt");
        BufferedReader bin;
        bin=new BufferedReader(fin);
        String s1="";
        while((s1=bin.readLine())!=null){
            System.out.println(s1);
        }
        bin.close();
        
    }
    
}
