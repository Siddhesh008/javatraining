class Test implements Runnable{
    Thread t;
    Test(String n);
    @Override
    public void run() {
      try{
        for(int i=0;i<5;i++){
            System.out.println("child thread"+t.getName()+":"+i);
            Thread.sleep(500);
        }
    catch(Exception e){

    }
        
      }
        
    }
    t=new Thread(this);
    t.setName(n);
    t.start(); 
}
public class Demo3 {
    public static void main(String[] args) {
        Test t1=new Test("A");
        Test t2=new Test("b");
        Test t3=new Test("c");
        System.out.println("child thread"+t1.t.isAlive());
        System.out.println("child thread"+t2.t.isAlive());
        System.out.println("child thread"+t3.t.isAlive());
        try{
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }catch(Exception e){

        }
        System.out.println("child thread"+t1.t.isAlive());
        System.out.println("child thread"+t2.t.isAlive());
        System.out.println("child thread"+t3.t.isAlive());
    }
}
           