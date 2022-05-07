class Test implements Runnable{
    Thread t;
    Test(){
        t=new Thread(this);
        t.start();
    }
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Child Thread"+i);
                Thread.sleep(500);
            }
        }catch(Exception e){

        }
    }
}
public class Demo{
    public static void main(String[] args) {
        Test t1=new Test();
        try{
            for(int i=0;i<5;i++){
                System.out.println("Main thread"+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            
        }
    }
}