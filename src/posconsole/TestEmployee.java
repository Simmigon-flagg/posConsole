package posconsole;

/**
 *
 * @author Jovy
 */
public class TestEmployee {
    public static void main (String[]args){   
    
    Employee employee = new Employee("Jonah", "Cortez", "2345");
        System.out.println("Employee Name: " + employee.getFirstName()+ " "+employee.getLastName());
}
}
