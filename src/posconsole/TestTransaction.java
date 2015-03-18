/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posconsole;

import java.math.BigDecimal;

/**
 *
 * @author Flagg
 */
public class TestTransaction {
    public static void main(String[] args) {
        Transaction testTransaction = new Transaction();
        System.out.println("Change:$"+ testTransaction.payByCash(BigDecimal.valueOf(10.00), BigDecimal.valueOf(4.01)));
        
    }
}
