/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posconsole;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 *
 * @author Jovy
 */
public class Receipt extends Order {

    // Declare variable
    @Override
    public String toString() {
        return "Receipt{" + "orderNumber=" + orderNumber + ", subtotal=" + subtotal + ", tax=" + tax + ", stateTax=" + stateTax + ", total=" + total + ", orderList=" + orderList + '}';
    }
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
                + "\ntax\t" + getTax() + "%"
                + "\ntotal\t$" + getTotal()
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
    //Pre:
    //Pro:
    public void setTotal() {

        this.total = getStateTax().multiply(getSubtotal());
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

    public BigDecimal getTax() {

        return BigDecimal.valueOf(0.065).multiply(BigDecimal.valueOf(100)).stripTrailingZeros();
    }

    public BigDecimal getTotal() {
        //return getSubtotal().add(getSubtotal().multiply(BigDecimal.valueOf(0.065)));
        return getSubtotal().add(getSubtotal().multiply(BigDecimal.valueOf(0.065)).setScale(2, RoundingMode.FLOOR));
    }

}
