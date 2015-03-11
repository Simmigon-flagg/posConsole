
package posconsole;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ArrayListTest {
    private static Order Order;

    public static void main(String[] args) {

        Object[] my = new Object[10];
        my[0] = (new Order("212121212", null, BigDecimal.ZERO, null));
        my[1] = (new Order("343434", null, BigDecimal.ZERO, null));
        for (int i = 0; i < my.length; i++) {
            System.out.println(my[i]);
            
        }
        
        
    }
}
