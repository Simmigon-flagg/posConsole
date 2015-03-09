/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posconsole;

/**
 *
 * @author Flagg
 */
public class Waiter extends Employee{

    @Override
    public String toString() {
        return "Waiter{" + super.toString() +  "waiterId=" + waiterId + '}';
    }

   
    private boolean waiterId;
    public Waiter(String firstName, String LastName, String empId) {
        super(firstName, LastName, empId);
    }

    public boolean isWaiterId() {
        return waiterId;
    }

    public void setWaiterId(boolean waiterId) {
        this.waiterId = waiterId;
    }
    
}
