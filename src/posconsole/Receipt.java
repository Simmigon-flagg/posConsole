/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posconsole;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;

/**
 *
 * @author Jovy
 */
public class Receipt extends Order {

    // Declare variable

    private String orderNumber;
    private BigDecimal subtotal;
    private BigDecimal tax;
    private BigDecimal stateTax;
    private BigDecimal total;
    private ArrayList<Order> orderList;
 //Pre:
    //Pro:
    public Receipt(String orderNumber, String itemName, BigDecimal itemPrice, String note) {
        super(itemName, itemPrice, note);
        this.orderNumber = orderNumber;
    }
 //Pre:
    //Pro:
    public Receipt() {
        super();
    }

    // This is the toString we made to see the tax.
     //Pre:
    //Pro:
    public String getReceipt() {
        return "Receipt\n"
                + "\n" + getOrderList()
                + "\nSubtotal\t$" + getSubtotal()
                + "\ntax\t$" + stateTax
                + "\ntotal\t$" + total
                + "\n\nTIP:\t$______________"
                + "\nTOTAL:\t$______________";
    }
 //Pre:
    //Pro:
    public BigDecimal getStateTax() {
        return this.stateTax;
    }
 //Pre:
    //Pro:
    public String getOrderNumber() {
        return orderNumber;
    }
 //Pre:
    //Pro:
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
 //Pre:
    //Pro:
    public BigDecimal getTotal() {
        return total;
    }
 //Pre:
    //Pro:
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
 //Pre:
    //Pro:
    public StringBuilder getOrderList() {
        StringBuilder listOfOrder = new StringBuilder();
        for (int i = 0; i < orderList.size(); i++) {
            listOfOrder.append(orderList.get(i)).append("\n");

        }
        return listOfOrder;

    }
 //Pre:
    //Pro:
    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    //Pre:
    //Pro:

    public BigDecimal getSubtotal() {
        subtotal = BigDecimal.valueOf(0.0);
        for (int i = 0; i < orderList.size(); i++) {
            subtotal = subtotal.add(orderList.get(i).getItemPrice());
        }
        return subtotal;
    }

    //Pre:
    //Pro:

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

}
