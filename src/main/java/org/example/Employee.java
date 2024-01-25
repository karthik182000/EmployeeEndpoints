package org.example;

public class Employee {

    private int empld;
    private String empName;
    private String designation;
    private int deptid;

    public Employee(int empld, String empName, String designation, int deptid) {
        this.empld = empld;
        this.empName = empName;
        this.designation = designation;
        this.deptid = deptid;
    }

    public int getEmpld() {
        return empld;
    }

    public void setEmpld(int empld) {
        this.empld = empld;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }
}
