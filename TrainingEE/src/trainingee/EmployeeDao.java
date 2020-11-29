package trainingee;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;
import javax.persistence.Query;
/**
 *
 * @author akggupta
 */
public class EmployeeDao {
  EntityManagerFactory emf=Persistence.createEntityManagerFactory("TrainingEEPU");
  public void addNewEmployee(Employee e){
        EntityManager entityManager=emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(e);
        entityManager.getTransaction().commit();
        System.out.println("Object Persisted in the database");
    }
  public Employee readById(int empId){
      EntityManager entityManager=emf.createEntityManager();
      Employee emp=entityManager.find(Employee.class, empId);
      return emp;
  }
  public List<Employee> readAllEmp(){
      String jpql="Select emp from Employee as emp";
      EntityManager em=emf.createEntityManager();
      Query query=em.createQuery(jpql);
      List<Employee> empList=query.getResultList();
      return empList;
  }
}
class Main{
    public static void main(String[] args) {
        EmployeeDao edao=new EmployeeDao();
        //edao.addNewEmployee(randomEmp());
       /* System.out.println("Enter id to search");
        Scanner sc=new Scanner(System.in);
        int sid=sc.nextInt();
        Employee e=edao.readById(sid);
        if(e!=null)System.out.println(e);
        else System.out.println("Employee not found");
        */
       
        List<Employee> empList=edao.readAllEmp();
        empList.forEach(a->System.out.println(a));
    }
    
    static Employee randomEmp(){
        Employee e1=new Employee();
        e1.setEmpId(107);
        e1.setEmpName("kapil");
        e1.setAddress("indore");
        return e1;
    }
}