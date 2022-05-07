class A{
    void show(){
        System.out.println("In base class");
    }


}
class B extends A{
    void disp(){

        System.out.println("In derived class");

    }
}

public class DemoInheritence {
    public static void main(String args[]){
        B ob=new B();
        ob.show();
        ob.disp();
    }
    
}
