/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package assign;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username:");
        String un=sc.next();
        System.out.println("Enter password");
        String pwd=sc.next();
        Employee emp=new Employee();
        emp.setId(777);
        emp.setName("qwert");
        Empimpl obj;
        obj=new Empimpl();
        do {
            System.out.println(" 1.Insert Value \n  2.Delete\n  3.select\n  4.update\n   5.getinfo\n  6.exit\n ");
            int ch=sc.nextInt();

            if(ch==1){
                
                obj.insert(emp);
            }
            else if(ch==2){
                obj.delete(emp);
            }
            else if(ch==3){
                obj.select(emp);
            }
            else if(ch==4){
                obj.update(emp);
            }
            else if(ch==5){
                obj.getEmployee(40);
            }
            else if(ch==6){
                System.exit(9);
            }
            
        } while (true);
       
    }
}
