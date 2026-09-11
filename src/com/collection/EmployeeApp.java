package com.collection;

public class EmployeeApp {

	public static void main(String[] args) {

		EmployeeOperation empOp = new EmployeeOperation();

		// Adding some Employees
		empOp.addEmployee(new Employee(1, "Raj", "Dev", 78000, "IT", "raj@mail.com", "111111xxxx", "Pune"));
		empOp.addEmployee(new Employee(2, "Ravi", "Tester", 40000, "IT", "ravi@mail.com", "222222xxxx", "Mumbai"));
		empOp.addEmployee(new Employee(3, "Akshay", "Teacher", 10000, "Teaching", "akshay@mail.com", "333333xxxx", "Satara"));
		empOp.addEmployee(new Employee(4, "Rani", "HR", 28000, "HR", "rani@mail.com", "444444xxxx", "Goa"));
		empOp.addEmployee(new Employee(5, "Ramesh", "Analyst", 88000, "IT", "ramesh@mail.com", "555555xxxx", "Delhi"));

		System.out.println("All Employees: " + empOp.getAllEmployees());
		System.out.println("\nEmployee by ID 2: " + empOp.getEmployeeById(2));
		System.out.println("\nEmployee by Name Raj: " + empOp.getEmployeeByName("Raj"));
		System.out.println("\nEmployee in IT Dept: " + empOp.getEmployeeByDepartment("IT"));
		System.out.println("\nEmployee in Pune: " + empOp.getEmployeeByCity("Pune"));
		System.out.println("\nEmployee Salary between 10k-50k: " + empOp.getEmployeeBySalaryRange(10000, 50000));
		System.out.println("\nHighest Salary: " + empOp.getHighestSalaryEmployee());
		System.out.println("\nSecond Highest Salary: " + empOp.getSecondHighestSalaryEmployee());
		System.out.println("\nAverage Salary: " + empOp.getAverageSalary());
		System.out.println("\nCount By Department: " + empOp.countByDepartment());
		System.out.println("\nCount By Role: " + empOp.countByRole());
		System.out.println("\nSoreted Employees By Salary: " + empOp.sortEmployeesBySalary());
	}
}
