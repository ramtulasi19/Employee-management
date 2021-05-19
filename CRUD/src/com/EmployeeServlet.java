package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		EmployeeMgmt mgm=new EmployeeMgmt();
		int eid=0;
		String action=request.getParameter("action");
		if("Create".equalsIgnoreCase(action)){
			String id=request.getParameter("id");
			int empId=Integer.parseInt(id);
			String name=request.getParameter("name");
			String ag=request.getParameter("age");
			int age=Integer.parseInt(ag);
			String sal=request.getParameter("salary");
			double salary=Double.parseDouble(sal);
			Employee e=new Employee(empId,name,age,salary);
			boolean result=mgm.addEmployee(e);
			RequestDispatcher rd=null;
			if(result==true){
				rd=request.getRequestDispatcher("success.html");
			}else{
				rd=request.getRequestDispatcher("failure.html");
			}
			rd.forward(request, response);
		}
		else if("List".equalsIgnoreCase(action)){
			ArrayList<Employee> elist=mgm.getAllEmployees();
			RequestDispatcher rd=request.getRequestDispatcher("list.jsp");
			request.setAttribute("List", elist);
			rd.forward(request, response);
		}
		else if("delete".equalsIgnoreCase(action)){
			String id=request.getParameter("id");
			int empId=Integer.parseInt(id);
			boolean result=mgm.deleteEmployee(empId);
			RequestDispatcher rd=null;
			if(result==true){
				rd=request.getRequestDispatcher("dsuccess.html");
			}else{
				rd=request.getRequestDispatcher("dfailure.html");
			}
			rd.forward(request, response);
		}
		
		else if("search".equalsIgnoreCase(action)){
			String id=request.getParameter("id");
			int empId=Integer.parseInt(id);
			eid=empId;
			Employee e=mgm.searchEmployee(empId);
			RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
			request.setAttribute("emp", e);
			rd.forward(request, response);
		}
		else if("update".equalsIgnoreCase(action)){
			String name=request.getParameter("name");
			String ag=request.getParameter("age");
			int age=Integer.parseInt(ag);
			String sal=request.getParameter("salary");
			double salary=Double.parseDouble(sal);
			Employee e=new Employee(eid,name,age,salary);
			boolean result=mgm.updateEmployee(e);
			RequestDispatcher rd=null;
			if(result==true){
				rd=request.getRequestDispatcher("usuccess.html");
			}else{
				rd=request.getRequestDispatcher("ufailure.html");
			}
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
