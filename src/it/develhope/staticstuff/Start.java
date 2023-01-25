package it.develhope.staticstuff;

/**
 * Tester class with main method.
 * @author Batman
 */
public class Start {
    
    /**
     * Main method from where the Java program starts.
     * @param args for all the parameters from command line
     */
    public static void main(String[] args) {
        // create two new Employees
        Employee employee1 = new Employee("Harry","Potter","4 Privet Drive");
        Employee employee2 = new Employee("Ron","Weasley","The Burrow");

        // create their new 2 Badges
       Badge badge1 = new Badge(employee1);
       Badge badge2 = new Badge(employee2);

        // show to the user the 2 employees' badge details
        badge1.showBadgeDetails();
        System.out.println();
        badge2.showBadgeDetails();

    }

}
