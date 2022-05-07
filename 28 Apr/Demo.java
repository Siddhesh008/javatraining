class Student{
    int id; String name;

}
class Test<T>{
    T i;
    Test(T x){
        i=x;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
    }
}
public class Demo{
    public static void main(String[] args) {
        Test<Integer> ob1=new Test<>(10);
        Test<String> ob2=new Test<>("Hello");
        ob1.show();
        ob2.show();
        Student st=new Student();
        Test<Student> ob3=new Test<>(st);
        ob3.show();
    }
}