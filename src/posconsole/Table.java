/**Make changes to fit the project
 */
package posconsole;

import java.math.BigDecimal;

public class Table extends Order {


    String tableId;
    String partyNumber;
    boolean occupied;
    Order order;

    public Table(String tableId, String partyNumber, boolean occupied, Order order) {
        this.tableId = tableId;
        this.partyNumber = partyNumber;
        this.occupied = occupied;
        this.order = order;
    }

    public String getTableId() {
        
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getPartyNumber() {
        return partyNumber;
    }

    public void setPartyNumber(String partyNumber) {
        this.partyNumber = partyNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getItemName() {
        return getItemName();
    }

    public void setItemName(String itemName) {
        this.setItemName(itemName);
    }

    public BigDecimal getItemPrice() {
        return getItemPrice();
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.setItemPrice(itemPrice);
    }

    public String getNote() {
        return getNote();
    }

    public void setNote(String note) {
        this.setNote(note);
    }
        @Override
    public String toString() {
        return "Table{" + "tableId=" + tableId + ", partyNumber=" + partyNumber + ", occupied=" + occupied + ", order=" + order + '}';
    }


}
