import java.io.*;
class Student implements Serializable{
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Demo4 {
    public static void main(String[] args)throws Exception {
        Student st;
        st=new Student();
        st.setId(123);
        st.setName("xys");
        FileOutputStream fout;
        fout=new FileOutputStream("D:\\java training\\files\\stinfo.txt");
        ObjectOutputStream out;
        out=new ObjectOutputStream(fout);
        out.writeObject(st);
        out.close();
        
    }
    
}
