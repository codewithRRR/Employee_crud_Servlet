package servlet_crud1.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet_crud1.dao.EmployeeDao;
import servlet_crud1.dto.Employee;

@WebServlet("/insert")
public class EmployeeController implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String e_id = req.getParameter("eid");
		int id = Integer.parseInt(e_id);
		String name = req.getParameter("ename");
		String pos_n = req.getParameter("pos");
		String sal1 = req.getParameter("sal");
		double e_sal = Double.parseDouble(sal1);

		System.out.println(id + " " + name + " " + pos_n + " " + e_sal);
		res.getWriter().print("Data Received");
		Employee employee = new Employee();
		employee.setEmp_id(id);
		employee.setE_name(name);
		employee.setPosition(pos_n);
		employee.setSalary(e_sal);

		EmployeeDao dao = new EmployeeDao();
		dao.addEmployee(employee);
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
