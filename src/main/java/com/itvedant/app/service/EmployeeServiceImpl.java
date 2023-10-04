package com.itvedant.app.service;

import com.itvedant.app.beans.Employee;
import com.itvedant.app.dao.EmployeeDao;
import com.itvedant.app.factory.EmployeeDaoFactory;

public class EmployeeServiceImpl implements EmployeeService {
	@Override
	   public String addEmployee(Employee employee) {
	       EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
	       String status = employeeDao.add(employee);
	       return status;
	   }


	   @Override
	   public Employee searchEmployee(int eno) {
	       EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
	       Employee employee = employeeDao.search(eno);
	       return employee;
	   }


	   @Override
	   public String updateEmployee(Employee employee) {
	       EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
	       String status = employeeDao.update(employee);
	       return status;
	   }


	   @Override
	   public String deleteEmployee(int eno) {
	       EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
	       String status = employeeDao.delete(eno);
	       return status;
	   }


}
