import java.sql.*;
import java.util.*;
public class Demo{
    public static void main(String[] args) throws Exception{
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Scanner sc=new Scanner(System.in);
        Connection con;
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","pleasure");
        System.out.println("Connection done");

        Statement st;
        st=con.createStatement();
        String sql;
        int id;
        id=sc.nextInt();
        String name;
        name=sc.next(); 
        sql="insert into employee values("+id+",'"+name+"')";
        st.executeUpdate(sql);
        System.out.println("record inserted");
        con.close();
    }
}