/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package posconsole;
import java.sql.*;
/**
 *
 * @author Jovy
 */
public class TestDatabase {
    
    Connection conn = null;
    public static void main(String[] args) {
        Database dbconn = new Database();
     //  Connection ConnecttoDB = dbconn.ConnecttoDB();
        System.out.println(dbconn.LoadMenu());
       
        
    }
    
}
