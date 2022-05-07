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
public class Demo5 {
    public static void main(String[] args)throws Exception {
        
        FileInputStream fin;
        fin=new FileInputStream("D:\\java training\\files\\stinfo.txt");
        ObjectInputStream in;
        in=new ObjectInputStream(fin);
        Student st3=(Student)in.readObject();
        System.out.println(st3.getId());
        System.out.println(st3.getName());
    }
    
}
