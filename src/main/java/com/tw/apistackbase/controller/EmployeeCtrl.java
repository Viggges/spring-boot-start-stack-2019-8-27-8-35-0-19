package com.tw.apistackbase.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeCtrl {
	List<Employee> employeeList = new ArrayList<Employee>();
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/")
	public ResponseEntity<List<Employee>> pickAllEmployee() {
		employeeList = employeeService.getEmployeesList();
		return ResponseEntity.ok(employeeList);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> pickEmployeeById(@PathVariable String id) {
		return ResponseEntity.ok(employeeService.pickEmployeeById(id));
	}

	@GetMapping()
	public ResponseEntity<List<Employee>> selectEmployeeByName(@RequestParam("name") String name) {
		employeeList = employeeService.selectEmployeeByName(name);
		return ResponseEntity.ok(employeeList);
	}

	@PostMapping()
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	@PutMapping()
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	@DeleteMapping()
	public ResponseEntity<Employee> deleteEmployee(@RequestBody Employee employee) {
		employeeService.deleteEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
