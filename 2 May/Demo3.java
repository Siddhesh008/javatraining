import java.util.ArrayList;
class Student implements Cloneable{
    ArrayList<String> ar;
    Student(){
        ar=new ArrayList<>();
    }
    Student(ArrayList<String> t){
        ar=t;
    }

    void loaddata(){
        ar.add("A");
        ar.add("b");
        ar.add("c");
        ar.add("d");
    }

    void show(){
        for (String s : ar) {
            System.out.println(s);
            
        }
    }

    protected Object clone() throws CloneNotSupportedException{
        ArrayList<String> ar2;
        ar2=new ArrayList<>();
        for (String s : ar2) {
            ar2.add(s);
            
        }
        Student obj=new Student(ar2);
        return obj;

    }
}

public class Demo3 {
    public static void main(String[] args) throws Exception {
        Student s1=new Student();
        s1.loaddata();
        s1.show();

        Student s2=(Student)s1.clone();
        s2.show();
        s2.ar.remove("c");
        


    }
    
}
