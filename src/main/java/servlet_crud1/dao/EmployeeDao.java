package servlet_crud1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {
			return employee;
		} else {
			return null;
		}
	}

	public List<Employee> fetchallEmp() {
		Query query = entityManager.createQuery("select a from Employee a ");
		List<Employee> list = query.getResultList();
		if (list.isEmpty()) {
			return null;
		} else {
			return list;
		}
	}

	public String deleteEmp(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			return "Data is Deleted";
		} else {
			return "No data is present";
		}

	}

	public String updateEmployee(Employee em) {
		entityTransaction.begin();
		entityManager.merge(em);
		entityTransaction.commit();
		return "Data is updated";

	}
}
//createEntityManagerFactory is static method
//createEntityManager abstract method
//getTransaction abstract method