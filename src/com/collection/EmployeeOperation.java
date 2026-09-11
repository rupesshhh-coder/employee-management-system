package com.collection;

import java.util.*;

public class EmployeeOperation {

	private List<Employee> empList = new ArrayList<>();

	// 1. Add Employees
	public void addEmployee(Employee e) {
		empList.add(e);
	}

	// 2. Update Employees by ID
	public void updateEmployee(int id, String newName, String newRole, double newSalary) {
		for (Employee e : empList) {
			if (e.getId() == id) {
				e.setName(newName);
				e.setRole(newRole);
				e.setSalary(newSalary);
			}
		}
	}

	// 3. Delete Employees by ID
	public void deleteEmployee(int id) {
		Iterator<Employee> it = empList.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			if (e.getId() == id) {
				it.remove();
				break;
			}
		}
	}

	// 4. Get All Employees
	public List<Employee> getAllEmployees() {
		return empList;
	}

	// 5. Get Employees by Id
	public Employee getEmployeeById(int id) {
		for (Employee e : empList) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	// 6. Get Employees by Name
	public Employee getEmployeeByName(String name) {
		for (Employee e : empList) {
			if (e.getName().equalsIgnoreCase(name)) {
				return e;
			}
		}
		return null;
	}

	// 7. Get Employees by Role
	public List<Employee> getEmployeeByRole(String role) {
		List<Employee> result = new ArrayList<>();
		for (Employee e : empList) {
			if (e.getRole().equalsIgnoreCase(role)) {
				result.add(e);
			}
		}
		return result;
	}

	// 8. Get Employees by Department
	public List<Employee> getEmployeeByDepartment(String dept) {
		List<Employee> result = new ArrayList<>();
		for (Employee e : empList) {
			if (e.getDepartment().equalsIgnoreCase(dept)) {
				result.add(e);
			}
		}
		return result;
	}

	// 9. Get Employees by City
	public List<Employee> getEmployeeByCity(String city) {
		List<Employee> result = new ArrayList<>();
		for (Employee e : empList) {
			if (e.getCity().equalsIgnoreCase(city)) {
				result.add(e);
			}
		}
		return result;
	}

	// 10. Get Employees by Salary Range
	public List<Employee> getEmployeeBySalaryRange(double min, double max) {
		List<Employee> result = new ArrayList<>();
		for (Employee e : empList) {
			if (e.getSalary() >= min && e.getSalary() <= max) {
				result.add(e);
			}
		}
		return result;
	}

	// 11. Get Highest Salary
	public Employee getHighestSalaryEmployee() {
		if (empList.isEmpty())
			return null;

		Employee max = empList.get(0);
		for (Employee e : empList) {
			if (e.getSalary() > max.getSalary()) {
				max = e;
			}
		}
		return max;
	}

	// 12. Get Second Highest Salary
	public Employee getSecondHighestSalaryEmployee() {
		if (empList.size() < 2)
			return null;

		Employee first = null;
		Employee second = null;

		for (Employee e : empList) {
			if (first == null || e.getSalary() > first.getSalary()) {
				second = first;
				first = e;
			}
		}
		return second;
	}

	// 13. Get Average Salary
	public double getAverageSalary() {
		if (empList.isEmpty())
			return 0;

		double sum = 0;

		for (Employee e : empList) {
			sum += e.getSalary();
		}
		return sum / empList.size();
	}

	// 14. Count Employees by Department
	public Map<String, Integer> countByDepartment() {
		Map<String, Integer> map = new HashMap<>();

		for (Employee e : empList) {
			String dept = e.getDepartment();
			if (map.containsKey(dept)) {
				map.put(dept, map.get(dept) + 1);
			} else {
				map.put(dept, 1);
			}
		}
		return map;
	}

	// 15. Count Employees by Role
	public Map<String, Integer> countByRole() {
		Map<String, Integer> map = new HashMap<>();

		for (Employee e : empList) {
			String role = e.getRole();
			if (map.containsKey(role)) {
				map.put(role, map.get(role) + 1);
			} else {
				map.put(role, 1);
			}
		}
		return map;
	}

	// 16. Sort Employees by Salary
	public List<Employee> sortEmployeesBySalary() {
		List<Employee> sortedList = new ArrayList<>(empList);
		Collections.sort(sortedList, new Comparator<Employee>() {

			public int compare(Employee e1, Employee e2) {
				return Double.compare(e1.getSalary(), e2.getSalary());
			}
		});
		return sortedList;
	}
}
