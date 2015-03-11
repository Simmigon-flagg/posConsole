/**
 * Make changes to fit the project
 */
package posconsole;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Order {

    
    private static String orderNumber;
    private static String itemName;
    private static BigDecimal itemPrice;
    private static String note;
//    private String []itemArray;
//    private BigDecimal [] priceArray;
    private static BigDecimal subtotal;

    public Order(String orderNumber, String itemName, BigDecimal itemPrice, String note) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.orderNumber = orderNumber;
        this.note = note;
    
       
    }
    
    public static String getOrder() {
        return  orderNumber +" "+itemName+" " + itemPrice+" "+ note+" subttotal" +  subtotal;
        
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String order) {
        this.orderNumber = order;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public BigDecimal calculateTotal(BigDecimal itemPrice) {
        return itemPrice;
    }

    @Override
    public String toString() {
        return "Order number:\t" + orderNumber +"\n"
                + itemName + "\t$"  +itemPrice 
                + "\nnote\t" + note
                + "\nSubtotal\t" + getSubtotal()+"\n";
    }

    public BigDecimal getSubtotal() {
        return getItemPrice();
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

}
