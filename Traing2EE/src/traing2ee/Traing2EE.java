/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traing2ee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
class EmployeeDao {
  EntityManagerFactory emf=Persistence.createEntityManagerFactory("Training2EEPU");
  public void addNewEmployee(Employee e){
        EntityManager entityManager=emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(e);
        entityManager.getTransaction().commit();
        System.out.println("Object Persisted in the database");
    }
  
}



public class Traing2EE{
    public static void main(String[] args) {
        Employee e1=new Employee();     
        e1.setId(102);
        e1.setName("vikas");
        e1.setAddresss("bombay");
        EmployeeDao edao=new EmployeeDao();
        edao.addNewEmployee(e1);
    }
}