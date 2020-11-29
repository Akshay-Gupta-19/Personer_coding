package trainingee;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity //mandatory
@Table(name="Employee")//optional
public class Employee {
        @Id
        private int empId;
        @Column(name="empName")//optional
        private String empName;
       private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", address=" + address + '}';
    }
        
        
}
