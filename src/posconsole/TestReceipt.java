/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package posconsole;

import java.math.BigDecimal;

/**
 *
 * @author Jovy
 */
public class TestReceipt {
    public static void main(String[] args) {
   //  Order mOrder = new Order("re", "fires", BigDecimal, null)
      Receipt myReceipt = new Receipt(BigDecimal.ONE, BigDecimal.TEN, BigDecimal.ONE, BigDecimal.ZERO, null, null, BigDecimal.ZERO, null, null);
       // System.out.println(myReceipt+"\n"+myReceipt.getTotal(mOrder));
        
      System.out.println(myReceipt);
    }
}
