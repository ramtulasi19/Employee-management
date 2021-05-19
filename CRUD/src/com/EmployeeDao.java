package com;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeDao {
	public boolean addEmployee(Employee e){
		boolean result=false;
		
		try {
			Connection cn=DBUtil.getConnection();
			PreparedStatement ps=cn.prepareStatement("insert into EMPLOYEE_1429518 values(?,?,?,?)");
			ps.setInt(1, e.getEmpId());
			ps.setString(2, e.getName());
			ps.setInt(3, e.getAge());
			ps.setDouble(4, e.getSalary());
			int t=ps.executeUpdate();
			System.out.println(t);
			if(t>0)
				result=true;
			DBUtil.closeConnection(cn);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
		return result;
	}
	public ArrayList<Employee> getAllEmployees(){
		ArrayList<Employee> empList=new ArrayList<Employee>();
		try {
			Connection cn=DBUtil.getConnection();
			PreparedStatement ps=cn.prepareStatement("select * from EMPLOYEE_1429518");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Employee e=new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4));
				empList.add(e);
			}
			cn.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return empList;
	}
	public boolean updateEmployeeSalary(Employee e,double amount){
		boolean result=false;
		try {
			Connection cn=DBUtil.getConnection();
			PreparedStatement ps=cn.prepareStatement("update EMPLOYEE_1429518 set salary=? where empid=?");
			ps.setDouble(1, amount);
			ps.setInt(2, e.getEmpId());
			int i=ps.executeUpdate();
			if(i>0)
				result=true;
			cn.close();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		return result;
	}
	public int getAllEmployeeCount(double amount){
		int count=0;
		try {
			Connection cn=DBUtil.getConnection();
			PreparedStatement ps=cn.prepareStatement("select count(empId) from EMPLOYEE_1429518 where salary>?");
			ps.setDouble(1, amount);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
				count=rs.getInt(1);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}
	public boolean deleteEmployee(int empid){
		boolean result=false;
		try {
			Connection cn=DBUtil.getConnection();
			PreparedStatement ps=cn.prepareStatement("delete from EMPLOYEE_1429518 where empId=?");
			ps.setInt(1, empid);
			int i=ps.executeUpdate();
			if(i>0){
				return true;
			}
		}catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
			
	}
	public Employee searchEmployee(int empid){
		Employee e=new Employee();
		try {
			Connection cn=DBUtil.getConnection();
			PreparedStatement ps=cn.prepareStatement("select * from EMPLOYEE_1429518 where empId=?");
			ps.setInt(1, empid);
			
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				
				e=new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4));
			}
			cn.close();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		return e;
	}
	public boolean updateEmployee(Employee e){
		boolean result=false;
		try {
			Connection cn=DBUtil.getConnection();
			PreparedStatement ps=cn.prepareStatement("update EMPLOYEE_1429518 set name=?,age=?,salary=? where empid=?");
			ps.setString(1,e.getName());
			ps.setInt(2, e.getAge());
			ps.setDouble(3,e.getSalary());
			ps.setInt(4, e.getEmpId());
			int i=ps.executeUpdate();
			System.out.println(e.getEmpId());
			if(i>0)
			{	result=true;
				System.out.println("hi");
			}cn.close();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		System.out.println(result);
		return result;
	}
}
