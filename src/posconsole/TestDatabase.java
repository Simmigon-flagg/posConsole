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
        //Connection ConnecttoDB = dbconn.ConnecttoDB();  
        //This is the waiter Id which returns the waiter name
        
        System.out.println("Employee id: " + dbconn.Login(1));        

    }

}
