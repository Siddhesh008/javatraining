class Person{
    String name;
    void Name(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    
}

class Employee extends Person{
    double salary;
    int year;
    String ins;

    Employee(String name,double salary,int year,String ins){
        this.salary=salary;
        this.year=year;
        this.ins=ins;
    }
    double getSalary(){
        return salary;
    }
    int getYear(){
        return year;
    }
    String getIns(){
        return ins;
    }

}

public class TestEmployee {
    public static void main(String args[]){
        Employee emp=new Employee("XYZ",35000,2022,"dskhf454s");
            System.out.println(emp);
        
    }
    
}
