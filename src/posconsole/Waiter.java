/**Make changes to fit the project
 */
package posconsole;

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
