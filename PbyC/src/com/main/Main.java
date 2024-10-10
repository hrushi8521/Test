package com.main;

import com.employee.Employee;
import com.manager.Manager;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.calSal(2000));
		Manager manager = new Manager();
		System.out.println(manager.calSal(20000, 5000));

	}

}
