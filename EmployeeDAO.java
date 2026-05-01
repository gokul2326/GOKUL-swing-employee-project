package empmanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	public static void addEmployee(String name,String dept,double salary){
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO employees(name,department,salary) VALUES(?,?,?)");
            ps.setString(1,name);
            ps.setString(2,dept);
            ps.setDouble(3,salary);
            ps.executeUpdate();
        }catch(Exception e){e.printStackTrace();}
    }

    public static List<String[]> getAllEmployees(){
        List<String[]> list = new ArrayList<>();
        try{
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM employees");
            while(rs.next()){
                list.add(new String[]{
                    String.valueOf(rs.getInt(1)),
                    rs.getString(2),
                    rs.getString(3),
                    String.valueOf(rs.getDouble(4))
                });
            }
        }catch(Exception e){e.printStackTrace();}
        return list;
    }

    public static void deleteEmployee(int id){
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM employees WHERE emp_id=?");
            ps.setInt(1,id);
            ps.executeUpdate();
        }catch(Exception e){e.printStackTrace();}
    }

}
