package servlet_crud1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import servlet_crud1.dto.Employee;

public class EmployeeDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void addEmployee(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

	public Employee fetchbyEmp(int id) {
		Employee employee=entityManager.find(Employee.class, id);
		if(employee!=null)
		{
			return employee;
		}
		else
		{
			return null;
		}
}
}
//createEntityManagerFactory is static method
//createEntityManager abstract method
//getTransaction abstract method