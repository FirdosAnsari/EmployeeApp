package com.itvedant.app.factory;

import com.itvedant.app.dao.EmployeeDao;
import com.itvedant.app.dao.EmployeeDaoImpl;

public class EmployeeDaoFactory {
	private static EmployeeDao employeeDao;
	   static {
	       employeeDao = new EmployeeDaoImpl();
	   }


	   public static EmployeeDao getEmployeeDao() {
	       return employeeDao;
	   }

}
