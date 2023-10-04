package com.itvedant.app.factory;

import com.itvedant.app.service.EmployeeService;
import com.itvedant.app.service.EmployeeServiceImpl;

public class EmployeeServiceFactory {
	private static EmployeeService employeeService;
	   static{
	       employeeService = new EmployeeServiceImpl();
	   }


	   public static EmployeeService getEmployeeService() {
	       return employeeService;
	   }

}
