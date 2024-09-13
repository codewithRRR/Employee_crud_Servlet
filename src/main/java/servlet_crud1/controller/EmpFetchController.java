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

@WebServlet("/fetchId")
public class EmpFetchController implements Servlet {

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

		EmployeeDao dao = new EmployeeDao();
		Employee employee = dao.fetchbyEmp(id);
		System.out.println(employee);
		res.getWriter().print("Data Received");

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
