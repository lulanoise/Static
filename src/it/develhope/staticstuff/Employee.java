package it.develhope.staticstuff;
import java.lang.String;

/**
 * Class that represents an office employee
 * @author Batman
 */
public class Employee {
    public String name, surname, address;

    /**
     * Employee's constructor method
     * @param newEmployeeName String name of the new employee
     * @param newEmployeeSurname String surname of the new employee
     * @param newEmployeeAddress String address of the new employee
     */

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    /**
     * Get all the details regarding an employee
     *
     * @return a String with the employee's name, surname and address
     */

    public String getEmployeeDetails(){
        return "Name: " + this.name + " - Surname: " + this.surname + " - Address: " + this.address;
    }
}
