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
public class TryThisDatabase {

    Connection dbconn = null;

    public static Connection ConnecttoDB() {
        try {
            System.out.println("Connected!");
            Class.forName("org.sqlite.JDBC");
            Connection dbconn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Jovy\\Documents\\GitHub\\posConsole\\POSConsoleDatabase.sqlite");
            //Connection dbconn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Flagg\\Documents\\GitHub\\posConsole\\POSConsoleDatabase.sqlite");
            return dbconn;
        } catch (Exception e) {
            System.out.println("Not Connected!");
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public String SearchItem() {
        // ConnecttoDB();
        ResultSet rs = null;
        Statement dbStatement = null;

        System.out.println("outside try");
        String itemPriceDB = "";
        try {
            System.out.println(" try");
            dbStatement = ConnecttoDB().createStatement();

            rs = dbStatement.executeQuery("SELECT * FROM myTest;");

            while (rs.next()) {

                itemPriceDB = rs.getString("Test");

            }
            return itemPriceDB;
        } catch (Exception e) {

            System.out.println(e);
        }

        return itemPriceDB;
    }

    //This Does Not Work
    public void Login() {
        // ConnecttoDB();
        ResultSet rs = null;
        Statement dbStatement = null;

        System.out.println("outside try");
        String itemPriceDB = "";
        try {
            System.out.println(" try");
            dbStatement = ConnecttoDB().createStatement();

            rs = dbStatement.executeQuery("SELECT * FROM myTest;");

            while (rs.next()) {

                itemPriceDB = rs.getString("Test");

            }

        } catch (Exception e) {

            System.out.println(e);
        }

    }

    //This is just a few sentences

    public void TimeCard(Employee empId, String Clockin, String Clockout) {

    }

    public void InsertSales() {
        // ConnecttoDB();
        ResultSet rs = null;
        Statement dbStatement = null;

        System.out.println("outside try");
        String itemPriceDB = "";
        try {
            System.out.println(" try");
            dbStatement = ConnecttoDB().createStatement();

            rs = dbStatement.executeQuery("SELECT * FROM myTest;");

            while (rs.next()) {

                itemPriceDB = rs.getString("Test");

            }
            //  return itemPriceDB;
        } catch (Exception e) {

            System.out.println(e);
        }

        // return itemPriceDB;
    }

}
