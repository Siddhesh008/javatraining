package jcp;
import java.sql.*;
public class stImpl implements stInt {

    @Override
    public void insert(Student st) {
       String sql;
       int id=st.getId();
       String name=st.getName();
       sql="insert into employee values("+id+" ,'"+name+"')";
       try {
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection con;
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "pleasure");
        System.out.println("Connection done");
        Statement stmt;
        stmt=con.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("record inserted");
        con.close();
       } catch (Exception e) {
           //TODO: handle exception
       }
        
    }

    @Override
    public void update(Student st) {
        String sql="";
        int id=st.getId();
        String name=st.getName();
        sql="update employee set name='"+name+"' where id="+id+"";
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection con;
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "pleasure");
            System.out.println("Connection done");
            Statement stmt;
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record updated");
            con.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Override
    public void delete(Student st) {
        String sql="";
        int id=st.getId();
        //String name=st.getName();
        sql="delete from employee where id="+id+"";
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection con;
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "pleasure");
            System.out.println("Connection done");
            Statement stmt;
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record deleted");
            con.close();
            
        } catch (Exception e) {
            //TODO: handle exception
        }

        
    }

    @Override
    public void select(Student st) {
       String sql;
       sql="select * from employee";
       try {
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection con;
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "pleasure");
        System.out.println("Connection done");
        Statement stmt;
        stmt=con.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("table view");
        con.close();
       } catch (Exception e) {
           //TODO: handle exception
       }

        
    }

    @Override
    public Student getStud(int id) {
        String sql;
        sql="select * from employee where id="+id;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection con;
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "pleasure");
            System.out.println("Connection done");
            Statement stmt;
            stmt=con.createStatement();
            ResultSet rs;
            rs=stmt.executeQuery(sql);
            int 

           
            con.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        return null;
    }

    public Student save(Student st){

    }
    

    
}
