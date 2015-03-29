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
    private int OrderNumber;
    

    public Order(String itemName, BigDecimal itemPrice, int OrderNumber) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.OrderNumber = OrderNumber;
        
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
    
    public int getOrderNumber(){
        return OrderNumber;
    }
    
    public void setOrderNumber(int OrderNumber){
        this.OrderNumber = OrderNumber;
    }

    

    @Override
    public String toString() {
        return itemName + "\t$" + itemPrice;//subtotal and order number moved to receipt class

    }

}
