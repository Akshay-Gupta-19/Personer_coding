/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onetomanyjpa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author akggupta
 */
class Dao{
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToManyJPAPU");
   
    public void addDepartment(Department dept){
    EntityManager entityManager=emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dept);
        entityManager.getTransaction().commit();
        System.out.println("Department Object Persisted in the database");
    }
    public void printAllEmp(){
        EntityManager entityManager = emf.createEntityManager();
        String sjpa="select emp from Employee as emp";
        Query q=entityManager.createQuery(sjpa);
        List<Employee> eList=q.getResultList();
        eList.forEach(a->System.out.println(a));
    }
    public void printAllDept(){
        EntityManager entityManager = emf.createEntityManager();
        String sjpa="select dept from Department as dept";
        Query q=entityManager.createQuery(sjpa);
        List<Department> dList=q.getResultList();
        dList.forEach(a->System.out.println(a));
    }
    public void addEmployee(Employee emp,int dept){
        EntityManager em=emf.createEntityManager();
        
        Department d=em.find(Department.class, dept);
        emp.setDept(d);
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
        System.out.println("Employee persisted");
    }

}
public class OneToManyJPA {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
         Dao edao=new Dao();
       //edao.addDepartment(randomDept());
       //edao.addEmployee(randomEmp(), 1);
       edao.printAllEmp();
       edao.printAllDept();
    }
    static Employee randomEmp(){
        Employee e1=new Employee();
        e1.setEmpId(102);
        e1.setEmpName("kapil");
        return e1;
    }
    static Department randomDept(){
        Department d1=new Department();
        d1.setDeptId(2);
        d1.setDeptName("PE");
        return d1;
    }
}
  