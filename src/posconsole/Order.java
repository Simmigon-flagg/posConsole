/**
 * Make changes to fit the project
 */
package posconsole;

import java.math.BigDecimal;


public class Order {

    private String itemName;
    private BigDecimal itemPrice;
    private String note;

    public Order(String itemName, BigDecimal itemPrice, String note) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.note = note;
    }
 public Order() {
     
 }
    public String getOrder() {
        return itemName + " " + itemPrice + " " + note;

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return itemName + "\t$" + itemPrice
                + "\nnote\t" + note;//subtotal and order number moved to receipt class

    }

}
