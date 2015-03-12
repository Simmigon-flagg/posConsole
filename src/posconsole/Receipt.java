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

    private BigDecimal tax;
    private BigDecimal stateTax;

    private BigDecimal tip;
    private BigDecimal total;

    //table number
    //
    public Receipt(BigDecimal tax, BigDecimal stateTax, BigDecimal tip, BigDecimal total, String orderNumber, String itemName, BigDecimal itemPrice, String note, ArrayList<BigDecimal> itemPriceList) {
        super(orderNumber, itemName, itemPrice, note, itemPriceList);
        this.tax = tax;
        this.stateTax = stateTax;
        this.tip = tip;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Receipt\n"
                + "\n" + super.toString()
                + "\ntax\t" + getTax()
                + "\ntip\t" + tip
                + "\ntotal\t" + getTotal(this);
    }

    
    // This is the toString we made to see the tax.
    public String getReceipt() {
        return "Receipt\n"
                + "\n" + super.toString()
                + "\ntax\t$" + getStateTax()
                + "\ntip\t$" + tip
                + "\ntotal\t$" + getTotal(this);
    }

    public BigDecimal getTax() {
        return getStateTax().multiply(getSubtotal());

    }

    public BigDecimal getTip() {
        return tip;
    }

    public void setTip(BigDecimal tip) {
        this.tip = tip;
    }

    public BigDecimal getTotal(Order o) {
        //get tax a + get sub total 

        return getTax().add(o.getSubtotal());
    }

    public BigDecimal getStateTax() {
        return this.stateTax = BigDecimal.valueOf(0.07);
    }

    public void setStateTax(BigDecimal stateTax) {
        this.stateTax = stateTax;
    }

}
