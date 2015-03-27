package posconsole;

import java.sql.*;
import java.util.ArrayList;
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
            Connection dbconn = DriverManager.getConnection("jdbc:sqlite:POSConsoleDatabase.sqlite");
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
        Object[][] loadedMenu = null;
        ResultSet rs = null;
        Statement dbStatement = null;

        String itemPrice = null;
        try {

            dbStatement = ConnecttoDB().createStatement();
            rs = dbStatement.executeQuery("SELECT COUNT(*) FROM MenuDB; ");
            //Columns in sql starts from 1
            int numberOfRows = rs.getInt(1);

            loadedMenu = new Object[numberOfRows][2];

            rs = dbStatement.executeQuery("SELECT itemNameDB, itemPriceDB FROM Menu;");
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
     * Pre: You need to enter the employee Id. The employeeId has to to in the
     * database Post: This return a person's name that matches the Id in the
     * database
     */
    public String Login(int EmployeeIdNumber) {
        // ConnecttoDB();
        ResultSet rs = null;
        Statement dbStatement = null;

        String EmployeeFirstName = null;
        try {
            System.out.println(" try");
            dbStatement = ConnecttoDB().createStatement();

            rs = dbStatement.executeQuery("SELECT firstName FROM employeeDB WHERE empId = " + EmployeeIdNumber + ";");

            while (rs.next()) {

                EmployeeFirstName = rs.getString("firstName");

            }

        } catch (Exception e) {

            System.out.println(e);
        }
        return EmployeeFirstName;

    }

    public boolean isEmployee(int empId) {
        ResultSet rs = null;
        Statement dbStatement = null;
        boolean employeeExists = false;
        try {

            dbStatement = ConnecttoDB().createStatement();

            rs = dbStatement.executeQuery("SELECT empId FROM employeeDB WHERE empId = " + empId + ";");

            while (rs.next()) {

                int empIdInput = rs.getInt("empId");
                employeeExists = true;
            }

        } catch (Exception e) {

            System.out.println(e);
        }
        return employeeExists;

    }
    // SELECT empId, firstName FROM employeeDB where empId=1
// Query to check if person is clocked in
    // check user ID from database
    // isclock in Method , is clock out method, checkEmp
    //Select ID From EmpId
    //save validated empID input to a global variable

    public void Clockin(int empId, String time) {
        ResultSet rs = null;
        Statement dbStatement = null;

        try {

            dbStatement = ConnecttoDB().createStatement();
            if (!isClockedIn(empId)) {
                dbStatement.executeUpdate("INSERT INTO TimeCard (empId, ClockIn)\n"
                        + "VALUES (" + empId + ",\"" + time + "\");");
                System.out.println("True");

            } else {
                System.out.println("false");
                dbStatement.executeUpdate("UPDATE TimeCard "
                        + "SET ClockOut =\"" + time + "\" WHERE empId in (" + empId +")");
            }
            

            /* while (rs.next()) {

             int empIdInput = rs.getInt("empId");
             employeeExists = true;
             }
             */
        } catch (Exception e) {

            System.out.println(e);
        }

//Select empID from TimeCard where empID =variablename
        //if empID= variable is null, insert empId, clockin = date/time
    }

    public boolean isClockedIn(int empId) {
        ResultSet rs = null;
        Statement dbStatement = null;
        boolean employeeExists = false;
        try {

            dbStatement = ConnecttoDB().createStatement();

            rs = dbStatement.executeQuery("SELECT empId FROM TimeCard WHERE empId = " + empId + ";");

            while (rs.next()) {

                int empIdInput = rs.getInt("empId");
                employeeExists = true;
            }

        } catch (Exception e) {

            System.out.println(e);
        }
        return employeeExists;

    }

    public void ClockOut(int empId, String Clockout) {
        ResultSet rs = null;
        Statement dbStatement = null;

        try {

            dbStatement = ConnecttoDB().createStatement();

            //   dbStatement.executeUpdate("INSERT INTO TimeCard (empId, ClockIn)\n"
            //      + "VALUES (" + empId + ",\"" + Clockin + "\");");

            /* while (rs.next()) {

             int empIdInput = rs.getInt("empId");
             employeeExists = true;
             }
             */
        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public void insertOrdertoDB(ArrayList<Order> orderList) {
        //Insert into OrderDB  where itemNameDB = orderList.getItemName
        // and itemPriceDB = orderList.getItemPrice
    }

    public Object[][] ViewAllOrders() {

        // ConnecttoDB();
        //Coming from an array of elements
        Object[][] AllOrders = null;
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

        String Test = null;
        try {
            dbStatement = ConnecttoDB().createStatement();
            /**
             * We need to first finalize what the Database will look You may
             * need to look this up online. We need a Column or row for TAX We
             * need a Column or row for Total We need a Column or row for
             * subTotal
             */
            rs = dbStatement.executeQuery("INSERT INTO SalesReport (  );");
            //We might not need this either.
            while (rs.next()) {

                Test = rs.getString("Test");

            }

        } catch (Exception e) {

            System.out.println(e);
        }

    }

}
