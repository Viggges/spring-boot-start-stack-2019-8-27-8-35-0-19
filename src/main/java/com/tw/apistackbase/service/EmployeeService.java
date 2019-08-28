package com.tw.apistackbase.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tw.apistackbase.model.Employee;
@Service
public class EmployeeService {
	private List<Employee> employeesList;

	public EmployeeService() {
		employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee("dotaÀ¥¿¨", "ÄÐ", 20, "001"));
		employeesList.add(new Employee("dotaÐ¡Ð¡", "ÄÐ", 5, "002"));
		employeesList.add(new Employee("dota¸«Íõ", "ÄÐ", 5, "003"));
		employeesList.add(new Employee("dota½£Ê¥", "ÄÐ", 5, "004"));
		employeesList.add(new Employee("dotaÂ·Î÷·¨", "ÄÐ", 5, "005"));
		employeesList.add(new Employee("dota¾ÞâÉÕº½´", "ÄÐ", 5, "006"));
	}

	public List<Employee> getEmployeesList() {
		return employeesList;
	}

	public void setEmployeesList(List<Employee> employeesList) {
		this.employeesList = employeesList;
	}

	public Employee pickEmployeeById(String id) {

		for (Employee employee : employeesList) {
			if (id.equals(employee.getId())) {
				return employee;
			}
		}
		return null;
	}

	public List<Employee> selectEmployeeByName(String name) {
		List<Employee> emList = new ArrayList<Employee>();
		for (Employee employee : employeesList) {
			if (employee.getName().contains(name)) {
				emList.add(employee);
			}
		}
		return emList;
	}

	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		this.employeesList.add(employee);
	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		for (Employee employeeTemp : employeesList) {
			if (employee.getId().equals(employeeTemp.getId())) {
				employeesList.remove(employeeTemp);
				employeesList.add(employee);
			}
		}
	}

	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		this.employeesList.remove(employee);
	}

}
