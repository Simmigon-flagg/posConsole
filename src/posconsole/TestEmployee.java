
package posconsole;

public class TestEmployee {
    public static void main (String[]args){   
    Employee employee1 = new Employee("Simmigon", "Flagg", "1234");
        System.out.println(employee1);
    
    Employee employee2 = new Employee("Jonah", "Cortez", "2345");
        System.out.println("Employee Name: " + employee2.getFirstName()+ " "+employee2.getLastName());
}
}
