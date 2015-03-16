/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posconsole;

/**
 *
 * @author Jovy
 */
import java.math.BigDecimal;
import java.util.ArrayList;

public class TestReceipt {

    public static void main(String[] args) {
        ArrayList<Order> orderList = new ArrayList<>();
         Database dbMenuLoad = new Database();
        Object[][] menu =dbMenuLoad.LoadMenu();
       orderList.add(new Order(menu[0][0].toString(), BigDecimal.valueOf((double)menu[0][1]), ""));
         orderList.add(new Order("Beef Stew", BigDecimal.valueOf(8.99), "**no drinks**"));
       //orderList.add(new Order("Kids Meal", BigDecimal.valueOf(4.99), "**no onions**"));
        //Order mOrder;
        //mOrder = new Order();
        /**
         * public Receipt(String orderNumber, BigDecimal tax, BigDecimal
         * stateTax, String itemName, BigDecimal itemPrice, String note)
         */

        Receipt myReceipt = new Receipt();
// System.out.println(myReceipt+"\n"+myReceipt.getTotal(mOrder));
        myReceipt.setOrderList(orderList);
        
        //Just the object that gets the toString() method. This is done by java
        //System.out.println(orderList);
        //This is the tostring() we made but we don't call it to string we call it
        //getReceipt();
        System.out.println("=========================================");
       
         System.out.println("=========================================");
        System.out.println("from test: "+myReceipt.getReceipt());

    }
}
