/**Make changes to fit the project
 */
package posconsole;

import java.math.BigDecimal;

public class Order {

    private String itemName;
    private BigDecimal itemPrice;
    private String note;
    private String orderNumber;

    public Order(String itemName, BigDecimal itemPrice, String note, String orderNumber) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.note = note;
        this.orderNumber = orderNumber;
    }
    public Order() {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.note = note;
        this.orderNumber = orderNumber;
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

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String order) {
        this.orderNumber = order;
    }
    
    public BigDecimal calculateTotal(BigDecimal itemPrice){
        return itemPrice;
    }
    
      @Override
    public String toString() {
        return "Order{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", note=" + note + ", order=" + orderNumber + '}';
    }

}
