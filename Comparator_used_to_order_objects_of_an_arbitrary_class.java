package oopconcepts;

import java.util.*;

public class Comparator_used_to_order_objects_of_an_arbitrary_class {

    public static void main(String[] args) {
        Employee a[] = new Employee[5];
        a[0] = new Employee("Kirk", "Douglas");
        a[1] = new Employee("Mel", "Brooks");
        a[2] = new Employee("Jane", "Fonda");
        a[3] = new Employee("Henry", "Fonda");
        a[4] = new Employee("Michael", "Douglas");

        // Use .sort() method with Comparable class.
        Arrays.sort(a, new EmployeeSort());

        // Print out the sorted Employees
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

// EmployeeSort.java
class EmployeeSort implements Comparator<Employee> {

    // Implement the Comparator interface
    @Override
    public int compare(Employee valueA, Employee valueB) {
        if (valueA.lastName.compareTo(valueB.lastName) != 0) {
            // If lastNames are different, compare lastName
            return valueA.lastName.compareTo(valueB.lastName);
        } else {
            // If lastNames are the same, compare firstName
            return valueA.firstName.compareTo(valueB.firstName);
        }
    }
}

class Employeee {

    String firstName;
    String lastName;

    // Constructor sets firstName and lastName
    public Employeee(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    // User-friendly output when printed.
    public String toString() {
        return "( " + lastName + ", " + firstName + " )";
    }
}

/**
 * /**
 * The Comparator interface is used to order objects of an arbitrary class. 
 * It is not to be confused with the Comparable interface, 
 * which is implemented by the class to be sorted. 
 * The Comparator interface is implemented in a separate class.
 */