/**Make changes to fit the project
 */
package posconsole;

import java.math.BigDecimal;

public class Order {

    private String itemName;
    private BigDecimal itemPrice;
    private String note;
    private String order;

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

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
      @Override
    public String toString() {
        return "Order{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", note=" + note + ", order=" + order + '}';
    }

}
