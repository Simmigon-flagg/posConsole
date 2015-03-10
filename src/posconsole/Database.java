/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package posconsole;

import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jovy
 */
public class Database  {
  private String query;
  private String openDB;
  private String closeDB;
  Connection connectDB = null;
  private String readFromDB;
  private String writeToDB;

    @Override
    public String toString() {
        return "Database{" + "query=" + query + ", openDB=" + openDB + ", closeDB=" + closeDB + ", connectDB=" + connectDB + ", readFromDB=" + readFromDB + ", writeToDB=" + writeToDB + '}';
    }
 
  
  
  public static Connection DatabaseConnection(){
      try{
            Class.forName("org.sqlite.JDBC");
            Connection connectDB = DriverManager.getConnection("jdbc:sqlite:POSConsoleDatabase.sqlite");
            System.out.println("We are Connected!!!");
            JOptionPane.showMessageDialog(null, connectDB);
            
            return connectDB;
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
        return null;
    
  }
  
  
    
}
