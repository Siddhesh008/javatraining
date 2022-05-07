class Test<T,V>{
    T i;
    V j;
    Test(T x, V y){
        i=x;
        j=y;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
        System.out.println(j);
        System.out.println(j.getClass().getName());
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Test<String,Integer> ob1=new Test("Hello",100);
        ob1.show();
    }
    
}
