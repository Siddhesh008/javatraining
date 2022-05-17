import java.sql.*;
import java.util.*;

public class DBApp{
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Scanner sc=new Scanner(System.in);
        Connection con;
        String uname;
        String pass;
        System.out.println("ENter Username");
        uname=sc.next();
        System.out.println("Enter password");
        pass=sc.next();
        con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", uname, pass);
        System.out.println("Connection done");


        System.out.println("1.Insert value\n 2.Update table\n 3.create table");

        
    }
}