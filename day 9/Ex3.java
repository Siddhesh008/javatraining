class Person{
    String name;
    void Name(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }

}
class Student extends Person{
    int rollno;
    void  Rollno(int rollno){
        this.rollno=rollno;

    }

}
class Teacher extends Person{
    double salary;
    String subject;

}
class CollegeStudents extends Student{
    int year;
    String major;

}



public class Ex3 {
    
}
