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
