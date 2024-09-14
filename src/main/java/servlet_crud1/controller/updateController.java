package servlet_crud1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet_crud1.dao.EmployeeDao;
import servlet_crud1.dto.Employee;

@WebServlet("/update")
public class updateController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("eid");
		int id1 = Integer.parseInt(id);
		String name = req.getParameter("ename");
		String posi = req.getParameter("pos");
		String sal1 = req.getParameter("sal");
		double sal = Double.parseDouble(sal1);

		Employee employee = new Employee();
		employee.setEmp_id(id1);
		employee.setE_name(name);
		employee.setPosition(posi);
		employee.setSalary(sal);

		EmployeeDao dao = new EmployeeDao();
		String msg = dao.updateEmployee(employee);
		System.out.println("data updated");
		
		List<Employee> list=dao.fetchallEmp();
		req.setAttribute("o", list);
		RequestDispatcher dispatcher=req.getRequestDispatcher("fetchall.jsp");
		dispatcher.forward(req, res);
		
	}

}
