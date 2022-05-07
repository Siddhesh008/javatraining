import java.util.ArrayList;
import java.util.Iterator;

class Employee{
    int id;
    String name;
    String adr;
    double salary;

    Employee(int id,String name, String adr, double salary){
        this.id=id;
        this.name=name;
        this.adr=adr;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }
}
public  class Asg4{
    public static void main(String[] args) {
        int id=1;
        ArrayList<Employee> ar;
        ar=new ArrayList<>();
        ar.add(new Employee(1,"abc","ind",25000));
        ar.add(new Employee(2,"xyz","AWB",45200));
        Iterator<Employee> it= ar.iterator();
        while(it.hasNext()){
            Employee emp=it.next();
            if(emp.getId()==id){
                System.out.println(emp);
            }
            //System.out.println(it.next());
        }

    }
}