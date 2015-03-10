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
      Receipt myReceipt = new Receipt(BigDecimal.ONE, BigDecimal.ZERO, "434343", "fries", BigDecimal.valueOf(6), "salty");
       // System.out.println(myReceipt+"\n"+myReceipt.getTotal(mOrder));
        
      System.out.println(myReceipt);
    }
}

