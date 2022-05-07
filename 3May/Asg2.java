abstract class Library{
    abstract void issued();

    // public static Account calculateInterest(String string) {
    //     return null;
    }


class Fiction extends Library{

    @Override
    void issued() {
        System.out.println("Fiction book issued");
    }
    
}
class Lifestyle extends Library{
    void issued(){

    
    System.out.println("Lifestyle book issued");
}
}

class LibFactory{
    static Library getBook(String type){
    Library obj=null;
    if(type.equalsIgnoreCase("FIction")){
        obj=new Fiction();
    }
    else
    {
        obj=new Lifestyle();
    }
    return obj;
}
}

public class Asg2 {
    public static void main(String[] args) {
        Library ob1=LibFactory.getBook("Fiction");
        Library ob2=LibFactory.getBook("Lifestyle");
        ob1.issued();
        ob2.issued();
    }
    
}
