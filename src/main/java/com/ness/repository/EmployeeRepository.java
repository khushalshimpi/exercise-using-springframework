// EmployeeRepository.java
package com.ness.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    private Map<Integer, String> employeeMap = new HashMap<>();

    public EmployeeRepository() {
        // add some sample employee data
        employeeMap.put(1, "Khushal");
        employeeMap.put(2, "Raj");
        employeeMap.put(3, "Soham");
    }

    public Map<Integer, String> getAllEmployees() {
        return employeeMap;
    }

    public String getEmployeeNameById(Integer id) {
        return employeeMap.get(id);
    }
}