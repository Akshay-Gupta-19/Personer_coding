/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onetomanyjpa;

/**
 *
 * @author akggupta
 */
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Department_data")
public class Department {
    @Id
    int deptId;
    @Column(name="Department_name",length = 20)
    String deptName;
    
    @OneToMany(mappedBy = "dept",fetch = FetchType.EAGER)
    List<Employee> empList;

    @Override
    public String toString() {
        return "Department{" + "deptId=" + deptId + ", deptName=" + deptName + ", empList=" + empList + '}';
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }
}
