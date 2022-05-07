import java.util.ArrayList;
class Employee implements Cloneable{
    ArrayList<String> ar;
    Employee(){
        ar=new ArrayList<>();
    }
    Employee(ArrayList<String> t){
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
        Employee obj=new Employee(ar2);
        return obj;

    }
}

public class Asg3 {
    public static void main(String[] args) throws Exception {
        Employee emp1=new Employee();
        emp1.loaddata();
        emp1.show();

        Employee emp2=(Employee)emp1.clone();
        emp2.show();
        emp2.ar.remove("c");
        


    }
    
}
