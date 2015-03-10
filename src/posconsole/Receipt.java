/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posconsole;

import java.math.BigDecimal;

/**
 *
 * @author Jovy
 */
public class Receipt extends Order {

    private BigDecimal amountDue;
    private BigDecimal tax;
    private BigDecimal tip;

    private  String itemName;
    private  BigDecimal itemPrice;

    @Override
    public String toString() {

        return "Receipt{" + super.toString() + "amountDue=" + amountDue + ", tax=" + tax + ", tip=" + tip + ", itemName=" + itemName + ", itemPrice=" + itemPrice + '}';
    }

    public Receipt(Order order, BigDecimal amountDue, BigDecimal tax, BigDecimal tip, String itemName, BigDecimal itemPrice) {

        this.amountDue = amountDue;
        this.tax = tax;
        this.tip = tip;
        this.itemName = itemName;
        this.itemPrice = itemPrice;

    }

    
    
    public Receipt(Order order) {
        super.getItemName();
        super.getItemPrice();
//        this.amountDue = amountDue;
//        this.tax = tax;
//        this.tip = tip;

    }
    
    
    
    

    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTip() {
        return tip;
    }

    public void setTip(BigDecimal tip) {
        this.tip = tip;
    }
}
