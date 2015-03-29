package posconsole;

import java.math.BigDecimal;

/**
 *
 * @author Jovy
 */
public class Transaction {

    /**
     * I Don't know how to format BigDecimals maybe we can watch a video on it
     * later.
     */

    public Object payByCash(BigDecimal cashPaid, BigDecimal totalAmount) {
        // change = Cash paid - total from the receipt
        BigDecimal change;
        return "Cash: $" + cashPaid.subtract(totalAmount);
    }

    public Object payByCreditCard(BigDecimal totalAmount) {

        return "Credit Card: $" + totalAmount;
    }
    
    public Object payByGiftCard(BigDecimal cashPaid, BigDecimal totalAmount) {
        return "Gift Card remining Balance: $" + cashPaid.subtract(totalAmount);
    }
    
}
