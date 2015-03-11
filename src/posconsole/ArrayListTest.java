
package posconsole;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ArrayListTest {
    private static Order Order;

    public static void main(String[] args) {

        ArrayList<Receipt> receiptArr;
        receiptArr = new ArrayList<>();

        receiptArr.add(new Receipt(BigDecimal.valueOf(3.00), BigDecimal.valueOf(6),"burger", "fries", BigDecimal.ZERO, null));
        receiptArr.add(new Receipt(BigDecimal.valueOf(2.00), BigDecimal.valueOf(6),"salad", "fries", BigDecimal.ZERO, null));
        System.out.println(receiptArr);   
    }
}
