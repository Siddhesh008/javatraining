 interface LibraryUser{
    
   public void registerAccount();
    public void requestBook();
        
    
}
class KidUsers implements LibraryUser{
    private int age;
    private String bookType;
    void setAge(int age){
        this.age=age;
    }
    void setBooktype(String booktype){
        this.bookType=booktype;
    }

    @Override
    public void registerAccount() {
        if (age<12){
            System.out.println("You have Successfully registered as a kids account");

        }
        else{
            System.out.println("Age must be less than 12 to register as kids account");
        }
        
        
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Kids")){
            System.out.println("Book issued Successfully. Please return book within 10 days");
        }
        else{
            System.out.println("You aer allowed to take only kids books");
        }
        
        
    }
    
}
class AdultUser implements LibraryUser{
    private int age;
    private String booktype;
    public void setAge(int age) {
        this.age = age;
    }
    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }
    @Override
    public void registerAccount() {
       
        if (age>12){
            System.out.println("You have successfully registered under an Adult Account");


    
        }
        else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
        
        
    }

    @Override
    public void requestBook() {
        if(booktype.equals("fiction")){
            System.out.println("Book Issued successfully, please return the book within 7 days");

        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
        
    }
    
}

public class LibraryInterfaceDemo{
    public static void main(String[] args) {
        KidUsers kidUsers=new KidUsers();
        kidUsers.setAge(10);
        kidUsers.setBooktype("kids");
        kidUsers.registerAccount();
        kidUsers.requestBook();

        AdultUser adultUser=new AdultUser();
        adultUser.setAge(5);
        adultUser.setBooktype("fiction");
        adultUser.registerAccount();
        adultUser.requestBook();

    }

}