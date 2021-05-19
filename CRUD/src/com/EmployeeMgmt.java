package com;

import java.util.ArrayList;

public class EmployeeMgmt {
	EmployeeDao dao=new EmployeeDao();
	public boolean addEmployee(Employee e){
		return dao.addEmployee(e);
	}
	public ArrayList<Employee> getAllEmployees(){
		return dao.getAllEmployees();
	}
	public boolean updateEmployeeSalary(Employee e,double amount){
		return dao.updateEmployeeSalary(e, amount);
	}
	public int getAllEmployeeCount(double amount){
		return dao.getAllEmployeeCount(amount);
	}
	public boolean deleteEmployee(int empid){
		return dao.deleteEmployee(empid);
	}
	public Employee searchEmployee(int empid){
		return dao.searchEmployee(empid);
	}
	public boolean updateEmployee(Employee e){
		return dao.updateEmployee(e);
	}
}
