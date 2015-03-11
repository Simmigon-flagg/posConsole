/**
 * Make changes to fit the project
 */
package posconsole;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Order {

    
    private  String orderNumber;
    private  String itemName;
    private  BigDecimal itemPrice;
    private  String note;
    private  BigDecimal subtotal;
    private  ArrayList<BigDecimal> itemPriceList;

    public Order(String orderNumber, String itemName, BigDecimal itemPrice, String note, ArrayList<BigDecimal> itemPriceList) {
        this.orderNumber = orderNumber;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.note = note;
        this.itemPriceList = itemPriceList;
    }
   
    
    
    
    
    public  String getOrder() {
        return  orderNumber +" "+itemName+" " + itemPriceList+" "+ note+" subttotal"+ getSubtotal();
        
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
                + "\nnote\t" + note;//removed subtotal
                
    }

    public BigDecimal getSubtotal() {
        return getItemPrice();
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public ArrayList<BigDecimal> getItemPriceList() {
        return itemPriceList;
    }

    public void setItemPriceList(ArrayList<BigDecimal> itemPriceList) {
        this.itemPriceList = itemPriceList;
    }

}
