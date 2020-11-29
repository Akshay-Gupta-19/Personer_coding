
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onetomanyjpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author akggupta
 */
@Entity
@Table(name="Employee_data")
public class Employee {
    @Id
    int empId;
    String empName;

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", dept=" + dept.getDeptId() + '}';
    }
    @ManyToOne
    @JoinColumn(name="DEPTID")
    Department dept;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
}
