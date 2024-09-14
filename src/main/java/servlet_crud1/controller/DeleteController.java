package servlet_crud1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import servlet_crud1.dao.EmployeeDao;
import servlet_crud1.dto.Employee;

public class DeleteController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id1 = req.getParameter("sid");
		int id = Integer.parseInt(id1);

		EmployeeDao dao = new EmployeeDao();
		String msg = dao.deleteEmp(id);
		System.out.println(msg);

		List<Employee> list = dao.fetchallEmp();
		req.setAttribute("o", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("fetchall.jsp");
		dispatcher.forward(req, res);

	}

}
