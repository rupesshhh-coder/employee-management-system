package com.collection;

public class Employee {
	private int id;
	private String name;
	private String role;
	private double salary;
	private String department;
	private String email;
	private String phone;
	private String city;

	public Employee() {

	}

	public Employee(int id, String name, String role, double salary, String department, String email, String phone,
			String city) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.department = department;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("\nEmployee [ID=%d, Name=%s, Role=%s, Salary=%.2f, Dept=%s, Email=%s, Phone=%s, City=%s]",
				id, name, role, salary, department, email, phone, city);
	}
}
