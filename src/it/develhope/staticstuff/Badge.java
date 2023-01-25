package it.develhope.staticstuff;

/**
 * Class that represents an office badge
 * @author Batman
 */
public class Badge {
    private static int totalNumberOfEmployees;          // private static variable (property shared across different objects)
    private final String badgeIdCode;
    public Employee employee;                        // each employee's personal badge id code
                                                        // each badge is associated to an Employee


    /**
     * Static method that creates the badge number just by adding 1 to the static badgeNumber
     */

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
              // use the summation operator to add 1 to the badgeNumber
    }

    /**
     * Method that generates the identifier for each Badge
     * @return a String containing name and surname of the employee between two codes
     */
    private String generateBadgeIdCode(){
        return "XYZ" + employee.name + employee.surname + "ZYX";
    }
    /**
     * Method that prints all the employee details and the relative badgeNumber
     */
    public void showBadgeDetails(){
        System.out.println("Total number of employees tracked by the badges: "+ totalNumberOfEmployees);
        System.out.println("Employee details: " + employee.getEmployeeDetails());
        System.out.println("Badge Id Code: " + this.badgeIdCode);

    }

    /**
     * Badge's constructor method
     * @param employeeThatNeedsBadge it's the Employee object that will need to be associated to the Badge
     */
    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }

}
