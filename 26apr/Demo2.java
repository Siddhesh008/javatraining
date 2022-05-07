class Test implements Runnable{
    Thread t;
    Test(String n){
        t=new Thread(this);
        t.setName(n);
        t.start();
    }
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("child thread"+t.getName()+":"+i);
                Thread.sleep(500);
            }
        }catch(Exception e){

        }

    }
}
public class Demo2 {
    public static void main(String[] args) {
        Test t1=new Test("A");
        Test t2=new Test("b");
        Test t3=new Test("c");
        try{
            for(int i=0;i<5;i++){
                System.out.println("main thread"+i);
                Thread.sleep(1500);
            }
        }catch(InterruptedException e){

        }
    }
}
