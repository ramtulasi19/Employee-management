package com;

public class Employee {
	private int empId;
	private String name;
	private int age;
	private double salary;
	public Employee(int empId, String name, int age, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age
				+ ", salary=" + salary + "]";
	}
	
}
