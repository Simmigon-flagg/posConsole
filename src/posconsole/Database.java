/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package posconsole;

import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Jovy
 */
public class Database  {
 Connection dbconn = null;

    public Database() {
    }
 
    public static Connection ConnecttoDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection dbconn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Jovy\\Documents\\GitHub\\posConsole\\POSConsoleDatabase.sqlite");
            System.out.println("Connected!");
            
            return dbconn;
        }catch(Exception e){
            System.out.println("Not Connected!");
            JOptionPane.showMessageDialog(null, e);
            
        }
        return null;
    }
  public void SearchItem(){
      ConnecttoDB();
     Connection conn = null;
     ResultSet rs = null;
     Statement dbStatement = null;
     try{
         dbStatement=conn.createStatement();
         rs = dbStatement.executeQuery("SELECT * FROM Order;");
         
         while(rs.next()){
            String itemNameDB = rs.getString("itemNameDB");
             System.out.println(itemNameDB);
         }
         
         
     }catch(Exception e){
         
         System.out.println("No Records");
     }
 }
    
}
