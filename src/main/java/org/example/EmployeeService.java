package org.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employeeList = new ArrayList<>();

    public Employee getEmployeeDetails(int empld) {
        for (Employee employee : employeeList) {
            if (employee.getEmpld() == empld) {
                return employee;
            }
        }
        return null;
    }

    public boolean isEmployeePresent(int empld) {
        for (Employee employee : employeeList) {
            if (employee.getEmpld() == empld) {
                return true;
            }
        }
        return false;
    }

    public Employee addEmployee(Employee newEmployee) {
        if (!isEmployeePresent(newEmployee.getEmpld())) {
            employeeList.add(newEmployee);
            return newEmployee;
        }
        return null;
    }

    public List<Employee> getEmployeesByDesignation(String designation) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getDesignation().equals(designation)) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<Employee> getEmployeesByDepartment(int deptid) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getDeptid() == deptid) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<Employee> deleteEmployee(int empld) {
        employeeList.removeIf(employee -> employee.getEmpld() == empld);
        return employeeList;
    }

    public void addEmployeeToEmployeeList(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
