package posconsole;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jovy
 */
public class Database {

    Connection dbconn = null;

    public static Connection ConnecttoDB() {
        try {
            //System.out.println("Connected!");
            Class.forName("org.sqlite.JDBC");
           // Connection dbconn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Jovy\\Documents\\GitHub\\posConsole\\POSConsoleDatabase.sqlite");
            Connection dbconn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Flagg\\Documents\\GitHub\\posConsole\\POSConsoleDatabase.sqlite");
            return dbconn;
        } catch (Exception e) {
            System.out.println("Not Connected!");
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
//This method loads the database itemName and itemPrice to an arraylist

    public Object[][] LoadMenu() {
        // ConnecttoDB();
        //Coming from an array of elements
        Object[][] loadedMenu = null ;
        ResultSet rs = null;
        Statement dbStatement = null;
        
        String itemPrice = null;
        try {
            
            dbStatement = ConnecttoDB().createStatement();
            rs = dbStatement.executeQuery("SELECT COUNT(*) FROM MenuDB; ");
            //Columns in sql starts from 1
            int numberOfRows = rs.getInt(1);
           
            loadedMenu = new Object[numberOfRows][2];

            rs = dbStatement.executeQuery("SELECT itemNameDB, itemPriceDB FROM MenuDB;");
            int i = 0;

            while (rs.next()) {
 
                loadedMenu[i][0] = rs.getString("itemNameDB");
                loadedMenu[i][1] = rs.getDouble("itemPriceDB");
               // System.out.println(i+" "+loadedMenu[i ][0]+" "+ loadedMenu[i][1]);
               i++;
            }
            return loadedMenu;
        } catch (Exception e) {

            System.out.println(e);
        }

       return loadedMenu;
    }       
    /**
     * Pre: You need to enter the employee Id. 
     * The employeeId has to to in the database
     * Post: This return a person's name that 
     * matches the Id in the database
     */
    
    public String Login(int EmployeeIdNumber) {
        // ConnecttoDB();
        ResultSet rs = null;
        Statement dbStatement = null;

       
        String EmployeeFirstName = null;
        try {
            System.out.println(" try");
            dbStatement = ConnecttoDB().createStatement();

            rs = dbStatement.executeQuery("SELECT firstName FROM employeeDB WHERE empId = "+ EmployeeIdNumber +";");

            while (rs.next()) {

                EmployeeFirstName = rs.getString("firstName");

            }

        } catch (Exception e) {

            System.out.println(e);
        }
        return EmployeeFirstName;

    }

   
    public void TimeCard(Employee empId, String Clockin, String Clockout) {

    }

    
    public Object[][] ViewAllOrders(){
    
        // ConnecttoDB();
        //Coming from an array of elements
        Object[][] AllOrders = null ;
        ResultSet rs = null;
        Statement dbStatement = null;
        
        String itemPrice = null;
        try {
            
            dbStatement = ConnecttoDB().createStatement();
            rs = dbStatement.executeQuery("SELECT COUNT(*) FROM OrderDB; ");
            //Columns in sql starts from 1
            int numberOfRows = rs.getInt(1);
           
            AllOrders = new Object[numberOfRows][2];

            rs = dbStatement.executeQuery("SELECT itemNameDB, itemPriceDB FROM OrderDB;");
            int i = 0;

            while (rs.next()) {
 
                AllOrders[i][0] = rs.getString("itemNameDB");
                AllOrders[i][1] = rs.getDouble("itemPriceDB");
               // System.out.println(i+" "+loadedMenu[i ][0]+" "+ loadedMenu[i][1]);
               i++;
            }
            return AllOrders;
        } catch (Exception e) {

            System.out.println(e);
        }

       return AllOrders;
    }       
    
    
    
    public void InsertSales() {
       
        ResultSet rs = null;
        Statement dbStatement = null;

        System.out.println("outside try");
        String Test = "";
        try {
            System.out.println(" try");
            dbStatement = ConnecttoDB().createStatement();

            rs = dbStatement.executeQuery("SELECT * FROM myTest;");

            while (rs.next()) {

                Test = rs.getString("Test");

            }
            //  return itemPriceDB;
        } catch (Exception e) {

            System.out.println(e);
        }

        // return itemPriceDB;
    }

}
