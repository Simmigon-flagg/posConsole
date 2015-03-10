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
       Order my = new Order("fhamburger", BigDecimal.valueOf(1), "no", "22");
      ///  Order = new Order();
        Receipt myReceipt = new Receipt(my, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(.50), "so", BigDecimal.valueOf(677676)); 
        System.out.println(myReceipt);
    }
}

