abstract class Account{
    abstract void calculateInterest();

    // public static Account calculateInterest(String string) {
    //     return null;
    }


class Saving extends Account{

    @Override
    void calculateInterest() {
        System.out.println("calculate interest of saving");
    }
    
}
class Loan extends Account{
    void calculateInterest(){

    
    System.out.println("calculate interest of loan");
}
}

class AccountFactory{
    static Account getAccount(String type){
    Account obj=null;
    if(type.equalsIgnoreCase("saving")){
        obj=new Saving();
    }
    else
    {
        obj=new Loan();
    }
    return obj;
}
}

public class Demo2 {
    public static void main(String[] args) {
        Account ob1=AccountFactory.getAccount("loan");
        Account ob2=AccountFactory.getAccount("saving");
        ob1.calculateInterest();
        ob2.calculateInterest();
    }
    
}
