class Test<T extends Number>{
    T i;
    void set(T x){
        i=x;

    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
    }
}
public class Demo4 {
    public static void main(String[] args) {
        Test<Integer> t2=new Test<>();
        t2.set(100);
        t2.show();
    }
}
