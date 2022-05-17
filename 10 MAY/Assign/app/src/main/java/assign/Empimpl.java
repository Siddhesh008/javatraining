package assign;
import java.sql.*;

public class Empimpl implements Empint {

    @Override
    public void save(Employee emp) {
        String sql="";
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("driver loaded");
            Connection con;
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "pleasure");
            System.out.println("Connection done");
            Statement stmt;
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Record updated");
            con.close();



        } catch (Exception e) {
            
        }
    }

    @Override
    public void update(Employee emp) {
        String sql;
        String name=emp.getName();
        int id=emp.getId();
        sql="update Employee set name='"+name+"' where id="+id;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("driver loaded");
            Connection con;
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "pleasure");
            System.out.println("Connection done");
            Statement stmt;
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Record updated");
            con.close();
            
        } catch (Exception e) {
            
        }
        
    }

    @Override
    public void delete(Employee emp) {
        int id=emp.getId();
        String sql;
        String name=emp.getName();
        sql="delete from Employee where id="+id;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("driver loaded");
            Connection con;
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "pleasure");
            System.out.println("Connection done");
            Statement stmt;
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Record deleted");
            con.close();
            
        } catch (Exception e) {
           
        }
       
        
    }

    @Override
    public void insert(Employee emp) {
        String sql="";
        String name=emp.getName();
        int id=emp.getId();
        sql="insert into employee values("+id+",'"+name+"')";
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("driver loaded");
            Connection con;
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "pleasure");
            System.out.println("Connection done");
            Statement stmt;
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Record inserted");
            con.close();
            
        } catch (Exception e) {
          
        }
    }

    @Override
    public void create(Employee emp) {
        String sql="";
        sql="create table ";
        
    }

    @Override
    public void select(Employee emp) {
    }
        
    @Override
    public Employee getEmployee(int id) {
        String sql="";
        sql="select * from Employee where id="+id;
        Employee emp=null;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("driver loaded");
            Connection con;
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "pleasure");
            System.out.println("Connection done");
            Statement stmt;
            stmt=con.createStatement();
            ResultSet rs;
            rs=stmt.executeQuery(sql);
            int count=1;
            while(rs.next()){
                System.out.println(rs.getString(2));
                emp=new Employee();
                emp.setId(rs.getInt(1));
                count++;
            }
            
            System.out.println("Table view");
            con.close();
            
        } catch (Exception e) {
            
        }
        return emp;
    }

        
    
    
}
