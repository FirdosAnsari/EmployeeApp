package com.itvedant.app.service;

import com.itvedant.app.beans.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee);
	   public Employee searchEmployee(int eno);
	   public String updateEmployee(Employee employee);
	   public String deleteEmployee(int eno);
}
