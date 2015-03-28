/**
 * Make changes to fit the project
 */
package posconsole;

/**
 *
 * @author Jovy
 */
import java.math.BigDecimal;
public class Order {

    private String itemName;
    private BigDecimal itemPrice;
    

    public Order(String itemName, BigDecimal itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        
    }
 public Order() {
     
 }
    public String getOrder() {
        return itemName + " " + itemPrice;

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

    

    @Override
    public String toString() {
        return itemName + "\t$" + itemPrice;//subtotal and order number moved to receipt class

    }

}
