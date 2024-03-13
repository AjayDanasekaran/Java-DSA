package com.jspy;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Integer.compare(emp1.getId(), emp2.getId());
    }
}
