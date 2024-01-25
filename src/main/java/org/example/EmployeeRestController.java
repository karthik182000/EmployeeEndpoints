package org.example;

import org.example.Employee;
import org.example.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{empld}")
    public Employee getEmployeeDetails(@PathVariable int empld) {
        return employeeService.getEmployeeDetails(empld);
    }

    @GetMapping("/exists/{empld}")
    public boolean isEmployeePresent(@PathVariable int empld) {
        return employeeService.isEmployeePresent(empld);
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee newEmployee) {
        return employeeService.addEmployee(newEmployee);
    }

    @GetMapping("/designation/{designation}")
    public List<Employee> getEmployeesByDesignation(@PathVariable String designation) {
        return employeeService.getEmployeesByDesignation(designation);
    }

    @GetMapping("/department/{deptid}")
    public List<Employee> getEmployeesByDepartment(@PathVariable int deptid) {
        return employeeService.getEmployeesByDepartment(deptid);
    }

    @DeleteMapping("/delete/{empld}")
    public List<Employee> deleteEmployee(@PathVariable int empld) {
        return employeeService.deleteEmployee(empld);
    }

    @PostMapping("/addEmployee")
    public void addEmployeeToEmployeeList(@RequestBody Employee employee) {
        employeeService.addEmployeeToEmployeeList(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getEmployeeList();
    }
}
