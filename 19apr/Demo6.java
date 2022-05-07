class MyException extends Exception{
    @Override
    public String toString() {
        
        return "Enter non negative value of id";
    }

}
class Student{
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if(id<0){
            MyException ob;
            ob=new MyException();
            throw ob;
        }
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
public class Demo6 {
    public static void main(String[] args) {
        try{
            Student st=new Student();
            st.setId(100);
            st.setName("abc");
            System.out.println(st.getId());
            System.out.println(st.getName());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
