/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa;

import java.sql.*;

/**
 *
 * @author hammadashraf2083
 */
public class DAO {

    Connection con = null;

    void Connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/GPA";
            con = DriverManager.getConnection(url, "root", "");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    int insert(REG s) {
        int res = 0;
        try {
            Connection();
            String qry = "insert into log   values (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(qry);
            pst.setInt(1, s.rollno);
            pst.setString(2, s.name);

            pst.setString(3, s.degree);
             pst.setString(4, s.username);
            pst.setString(5, s.password);
           

            res = pst.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    
    ResultSet log(REG s)
    {
         ResultSet rs = null;
        try
        {
        Connection();
       String query ="Select * FROM log where username=? AND password=?";
       PreparedStatement pst = con.prepareStatement(query);
       pst.setString(1,s.username);
       pst.setString(2, s.password);
       rs= pst.executeQuery();
       
        }
        
        
        catch (Exception ex) {
            System.out.println(ex.toString());
        }
        
        
        
      ;
        return rs;
    }
   int insertgpa(sgpa s)
   {
     int res = 0; 
     try{
        Connection();
            String qry = "insert into sgpa values (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(qry);
       pst.setInt(1, s.marks);
        pst.setInt(2, s.cr);
        pst.setString(3, s.subject);
        pst.setInt(4, s.rollno);
        pst.setInt(6,s.semester);
        pst.setDouble(5,s.gradepoints);
        
     
        res=pst.executeUpdate();
        
     }
          catch (Exception ex) {
            System.out.println(ex.toString());
        }
     
     
        return res;
       
   }
       
    ResultSet sgpa(REG s)
    {
         ResultSet rs = null;
        try
        {
        Connection();

       String query ="Select rollno=?,sum(marks),sum(gradepoints) sgpa group by rollno ";
       PreparedStatement pst = con.prepareStatement(query);
       pst.setInt(1, s.rollno);
       rs= pst.executeQuery();
       
        }
        
        
        catch (Exception ex) {
            System.out.println(ex.toString());
        }
        
        
        
      ;
        return rs;
    }

 
   
    
    

}
