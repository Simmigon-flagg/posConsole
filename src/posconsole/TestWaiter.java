
package posconsole;

/**
 *
 * @author Flagg
 */
public class TestWaiter {
    public static void main(String[] args){
        Waiter myWaiter0 = new Waiter("Jovy", "Cortez", "1221");
        Waiter myWaiter1 = new Waiter("joselle", "Fern", "3221");
        myWaiter1.setWaiterId("2323");
        System.out.println(myWaiter0);
                System.out.println(myWaiter1.getFirstName());
        
    }
    
}
