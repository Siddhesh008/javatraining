class A{
    A(){
        System.out.println("In A");
    }


}
class B extends A{
    B(){

        System.out.println("In B");

    }
}
class C extends B{
    C(){
        System.out.println("In C");
    }
}
public class DemoInheritence2 {
    public static void main(String args[]) {
        new C();

        
    }
    
}
