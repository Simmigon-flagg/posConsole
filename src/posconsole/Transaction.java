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
public class Transaction {
    private BigDecimal change;
    Receipt r = new Receipt();
    
   public BigDecimal payByCash(BigDecimal cashPaid, BigDecimal totalAmount){
       // change = Cash paid - total from the receipt
       return change;
   }
    //payByCreditCard(){
        
    //}
    //payByGiftCard(){
        
    //}
}