
package posconsole;

import java.math.BigDecimal;

public class TestOrder {
    public static void main(String[] args) {
        Order myOrder = new Order();
        //System.out.println(myOrder.toString());
        myOrder.setItemName("Burger");
        System.out.println(myOrder.getItemName());
         myOrder.setItemName("Steak");
        System.out.println(myOrder.getItemName());
        
        Order myOrder1 = new Order("Hotdog", BigDecimal.valueOf(5), "notes", "01");
        System.out.println(myOrder1);
    }   
}
