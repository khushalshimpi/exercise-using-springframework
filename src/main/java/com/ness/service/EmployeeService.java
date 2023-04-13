package com.ness.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ness.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void printAllEmployees() {
        Map<Integer, String> employeeMap = employeeRepository.getAllEmployees();
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public String getEmployeeNameById(Integer id) {
        return employeeRepository.getEmployeeNameById(id);
    }
}