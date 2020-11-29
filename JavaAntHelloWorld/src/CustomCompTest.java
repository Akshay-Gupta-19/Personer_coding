
import java.util.*;

enum gen {
    M, F
};

class Emp implements Comparable<Emp> {
    int empId;
    String EmpName;
    int age;
    gen EmpGen;

    public Emp(int empId, String EmpName, int age, gen gt) {
        this.empId = empId;
        this.EmpName = EmpName;
        this.age = age;
        this.EmpGen = gt;
    }

    @Override
    public int compareTo(Emp e1) {
        return e1.age - this.age;
    }

    @Override
    public String toString() {
        return "Emp{" + "empId=" + empId + ", EmpName=" + EmpName + ", age=" + age + ", EmpGen=" + EmpGen + "\n}";
    }

}

public class CustomCompTest {

    public static void main(String[] args) {
        Emp e1 = new Emp(101, "akshay", 23, gen.M);
        Emp e2 = new Emp(102, "ram", 26, gen.M);
        Emp e3 = new Emp(103, "shyam", 46, gen.M);
        Emp e4 = new Emp(104, "swapnil", 16, gen.M);
        Emp e5 = new Emp(105, "amit", 59, gen.M);
        ArrayList<Emp> al = new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);
         Collections.sort(al, (Emp ec1, Emp ec2) -> {
             return ec1.empId - ec2.empId;
        });
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
