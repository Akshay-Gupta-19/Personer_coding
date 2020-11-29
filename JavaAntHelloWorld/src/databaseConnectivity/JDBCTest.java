package databaseConnectivity;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class MysqlCon {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javatrain", "root", "8600723121");
           Statement stmt = con.createStatement();
           Scanner sc=new Scanner(System.in);
            System.out.println("Enter id");
            int id=sc.nextInt();
            System.out.println("Enter name");
            String name=sc.next();
            System.out.println("Enter city");
            String city=sc.next();
           String insertingQ="insert into employees values(?,?,?)";
           PreparedStatement st=con.prepareStatement(insertingQ);
           st.setInt(1, id);
           st.setString(2, name);
           st.setString(3, city);
           int up=st.executeUpdate();
            System.out.println(up+"record updated");
           
           ResultSet rs = stmt.executeQuery("select * from employees;");
            
           while (rs.next()) {
                int eid=rs.getInt("employeId");
                String ename=rs.getString("Name");
                String ecity=rs.getString("City");
                System.out.println("Eid"+eid+"Ename"+ename+"City"+ecity);
           }
            
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlCon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MysqlCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
//101 akshay bombay